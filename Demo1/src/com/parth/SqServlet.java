package com.parth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int k = 0;
		
		Cookie cookie[] = req.getCookies();
		
		for(Cookie c : cookie)
		{
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
	   
		k = k * k;
				  
		PrintWriter out = res.getWriter(); 
		out.println("Square is : " + k);
		
		
		
		/*
		 * HttpSession session = req.getSession(); int k =
		 * (int)session.getAttribute("k");
		 * 
		 * k = k * k;
		 * 
		 * PrintWriter out = res.getWriter(); out.println("Square is : " + k);
		 */
		  
		  
		  
		  // int k = Integer.parseInt(req.getParameter("k"));
		  
		 
		/*
		 * int i = Integer.parseInt(req.getParameter("num1")); int j =
		 * Integer.parseInt(req.getParameter("num2"));
		 * 
		 * PrintWriter out = res.getWriter(); out.println(i*j);
		 */
		System.out.println("Sq");
	}

}
