package com.capgemini.bankapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.bankapp.model.Customer;
import com.capgemini.bankapp.service.CustomerService;
import com.capgemini.bankapp.service.impl.CustomerServiceImpl;


@WebServlet("/updatePassword")
public class UpdatePasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  private CustomerService customerService; 
   
    public UpdatePasswordController() {
        super();
        customerService = new CustomerServiceImpl();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		//String password = request.getParameter("password");
		String oldPassword = request.getParameter("oldPassword");
		String newPassword = request.getParameter("newPassword");
		String newPasswords = request.getParameter("newPasswords");
		Customer cust1=(Customer)session.getAttribute("Customer") ;
		Customer customer = new Customer(cust1.getCustomerId(), "", oldPassword,cust1.getEmail(), "",null, null);
		RequestDispatcher dispatcher = null;
		System.out.println(oldPassword);
		System.out.println(newPassword);
		System.out.println(newPasswords);
		customerService.updatePassword(customer, oldPassword, newPassword);
		if ((customer.getPassword().equals(oldPassword)) && (newPassword.equals(newPasswords))) {
			dispatcher = request.getRequestDispatcher("passwordchanged.jsp");
			dispatcher.forward(request, response);
		} else {
			dispatcher = request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
		}	
	}
}