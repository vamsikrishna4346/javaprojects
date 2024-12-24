<!DOCTYPE html>
<html>
<head>
    <title>Add Employee</title>
</head>
<body>
    <h1>Add Employee</h1>
    <form action="EmployeeAddServlet" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>
        <label for="department">Department:</label>
        <input type="text" id="department" name="department" required><br>
        <label for="salary">Salary:</label>
        <input type="number" id="salary" name="salary" step="0.01" required><br>
        <button type="submit">Add</button>
    </form>
</body>
</html>
