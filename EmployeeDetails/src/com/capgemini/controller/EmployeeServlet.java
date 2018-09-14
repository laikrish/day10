package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.domain.Employee;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

@WebServlet("/employeeDetails")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<Employee> employee = new ArrayList<>();

	public EmployeeServlet() {
		super();

	}

	@Override
	public void init(ServletConfig config) throws ServletException {

		employee.add(new Employee("krishna", 1234, 50000, "finance"));
		employee.add(new Employee("chaitanya", 1573, 5000, "sap"));
		employee.add(new Employee("veni", 12421, 52300, "java cloud"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String employeeid = request.getParameter("employeeNumber");
		long empid = Long.parseLong(employeeid);
		
		int count = 0;
		for (Employee e : employee)
			if (e.getEmployeeid() == empid) {
count=1;
				out.println("<table border='1'><tr><th>Employee Name</th><th>salary</th><th>department</th></tr>");

				out.println("<table border = '1'><tr><th>EmployeeId</th><th>EmployeeName</th><th>EmployeeSalary</th><th>Department</th></tr>");
				out.println("<tr><td>" +e.getEmployeeid()+"</td><td>"+e.getEmployeeName()+"</td><td>"+e.getSalary()+"</td><td>" +e.getDepartment());
				

			}
		out.println("</table>");
	
if(count==0)
{
	out.println("employee doesnot exist");
}
	}

	//out.close();
	// doGet(request, response);
}
