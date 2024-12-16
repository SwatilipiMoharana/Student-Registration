package com.nit.Student;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/Student")
public class Student extends  GenericServlet{


	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		pw.println("registration successful...");
		String Firstname=req.getParameter("fname");
		pw.println("<br> fname"+Firstname);
		String LastName=req.getParameter("lname");
		pw.println("<br> lname"+LastName);
		String Email=req.getParameter("email");
		pw.println("<br>email"+Email);
		String Address =req.getParameter("address");
		pw.println("<br> address"+Address);
		
		
		
	}

}
