package org.learn.jdbc.dao.impl;

import static org.learn.jdbc.datasource.JbdcDataSource.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.learn.jdbc.dao.EmployeeDao;
import org.learn.jdbc.domain.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private static final String INSERT = "INSERT INTO EMPLOYEE (ID,NAME) VALUES(?, ?)";

	public void insert(Employee employee) {
		Connection connection = getConnection();
		PreparedStatement preparedStatement = null;

		try {
			preparedStatement = connection.prepareStatement(INSERT);
			preparedStatement.setInt(1, employee.getId());
			preparedStatement.setString(2, employee.getNmae());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void update(Employee employee) {
		// TODO Auto-generated method stub

	}

	public Employee findByEmployeeId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void delet(Integer id) {
		// TODO Auto-generated method stub

	}

}
