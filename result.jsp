
<%@ page import="model.Employee" %>
<!DOCTYPE html>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <h1>Result</h1>

    <!-- Check if employee is found -->
    <%
        if (request.getAttribute("employee") != null) {
            Employee employee = (Employee) request.getAttribute("employee");
    %>
        <p>ID: <%= employee.getId() %></p>
        <p>Name: <%= employee.getName() %></p>
        <p>Department: <%= employee.getDepartment() %></p>
        <p>Salary: <%= employee.getSalary() %></p>
    <%
        } else if (request.getAttribute("message") != null) {
            String message = (String) request.getAttribute("message");
    %>
        <p><%= message %></p>
    <%
        }
    %>
</body>
</html>
