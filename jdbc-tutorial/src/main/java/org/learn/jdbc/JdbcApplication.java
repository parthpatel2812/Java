package org.learn.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;






public class JdbcApplication {
	
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost:3306/test_database?useUnicode="
			+ "true&useJDBCCompliantTimezoneShift=" 
			+ "true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	//static final String URL = "jdbc:mysql://localhost:3306/test_database";
	static final String USER_NAME = "root";
	static final String PASSWORD = "npp8140060700";
	
	
	public static void main(String[] args) {
		
		Connection connection =  null;
		Statement statement = null;
		PreparedStatement  preparedStatement = null;
		CallableStatement callableStatement = null;
		
		try {
			
			Class.forName(DRIVER);
		    connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

		    statement =  connection.createStatement();
		    
			/*
			 * String sqlCreateTable = "CREATE TABLE EMPLOYEE("
			 * +"ID INT NOT NULL PRIMARY KEY," +"NAME VARCHAR(100)" + ");";
			 */
		    
			/*
			 * String sqlInsert = "INSERT INTO EMPLOYEE" + "(ID, NAME) " +
			 * "VALUES(1002, 'Sherlock Homes')";
			 */
		    
//			/*
//			 * String sqlInsert = "INSERT INTO EMPLOYEE" + "(ID, NAME) " +
//			 * "VALUES(1003, 'Sherlock Homes')";
//			 * 
//			 * String sqlInsert2 = "INSERT INTO EMPLOYEE" + "(ID, NAME) " +
//			 * "VALUES(1004, 'Luke Bates')";
//			 */
		    
//		  String sqlPreparedInsert = "INSERT INTO EMPLOYEE (ID, NAME) VALUES(?,?)";
		    
		   //  String sqlUpdate = "UPDATE EMPLOYEE SET NAME = 'John Smith' WHERE ID = 1002 ";
		    
		    	String sqlQuery = "SELECT * FROM EMPLOYEE";
		    	
		   // 	String sqlDelete = "DELETE FROM EMPLOYEE WHERE ID =1001";
		    
		 //   statement.execute(sqlCreateTable);
		 //   statement.executeUpdate(sqlInsert);	
		 //   statement.executeUpdate(sqlUpdate);
		   // statement.executeUpdate(sqlDelete);
		    
		  //  	statement.executeQuery(sqlInsert);
		   // 	statement.executeQuery(sqlInsert2);
		    	
//		    	preparedStatement = connection.prepareStatement(sqlPreparedInsert);
//		    	preparedStatement.setInt(1, 1003);
//		    	preparedStatement.setString(2, "Adam Smith");
//		    	preparedStatement.executeUpdate();
		    	
//		     	preparedStatement.setInt(1, 1004);
//		    	preparedStatement.setString(2, "Richard Knox");
//		    	preparedStatement.executeUpdate();
		    	
		    	String sqlStoredProcedure = "{call our_test_procedure(?,?)}";
		    	callableStatement = connection.prepareCall(sqlStoredProcedure);
		    	callableStatement.setInt(1, 1005);
		    	callableStatement.setString(2, "Other Name");
		    	callableStatement.executeUpdate();    	
		    	
		   ResultSet resultSet = statement.executeQuery(sqlQuery);
			
			while(resultSet.next())
			{
				System.out.println( resultSet.getString("ID") + " " + resultSet.getString("NAME"));
			//	System.out.println(resultSet.getMetaData());
			}
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			if(statement != null)
			{
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(connection != null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
		
		
	

