package be.intec.employeemanagment.Service;

import be.intec.employeemanagment.Model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    void deleteEmployeeById(Long id);
    boolean isEmailUnique(String email, Long idToExclude);
}
