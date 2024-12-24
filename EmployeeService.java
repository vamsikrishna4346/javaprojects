package model;

public class EmployeeService {
    private EmployeeDAO employeeDAO = new EmployeeDAO();

    public Employee getEmployeeById(int id) throws ClassNotFoundException {
        return employeeDAO.findById(id);
    }

    public boolean addEmployee(Employee emp) throws ClassNotFoundException {
        if (emp.getName() == null || emp.getName().isEmpty()) return false;
        if (emp.getDepartment() == null || emp.getDepartment().isEmpty()) return false;
        if (emp.getSalary() <= 0) return false;
        return employeeDAO.save(emp);
    }
}
