package model;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmployeeAddServlet extends HttpServlet {
    private EmployeeService employeeService = new EmployeeService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Employee emp = new Employee();
        emp.setName(request.getParameter("name"));
        emp.setDepartment(request.getParameter("department"));
        emp.setSalary(Double.parseDouble(request.getParameter("salary")));

        boolean success = false;
		try {
			success = employeeService.addEmployee(emp);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        request.setAttribute("message", success ? "Employee added successfully." : "Failed to add employee.");
        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.forward(request, response);
    }
}
