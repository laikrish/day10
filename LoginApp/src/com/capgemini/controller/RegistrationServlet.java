package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//HashMap to store user details.it must be instance variable
       private HashMap<String, String> users = new HashMap<>();
       
       private ServletContext context;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
    public void init(ServletConfig config) throws ServletException{
    	context=config.getServletContext();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		
		if(users.containsKey(username)) {
			out.println("<h3>user already exist.Please enter another user name</h3>");
			out.println("<br><br><a href='registration.html'>.Try again</a>");
		}
		else {
			users.put(username,password);
			out.println("<h3>Registration Successful.</h3>");
			out.println("<br><br><a href='login.html'>. Login Here</a>");
			context.setAttribute("usersData", users);
		}
		
		
	   out.close();
		
		
		
	}

}
