package com.wallmart.ourapplication;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/not-welcome")
public class OurSecondServlet implements Servlet {

	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("servlet init method got called");
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("service method call");
		String ourMessage = "Hello from servlet";
		res.getOutputStream().write(ourMessage.getBytes());
		
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void destroy() {
		
		System.out.println("destroy method is called");
		
	}

}
