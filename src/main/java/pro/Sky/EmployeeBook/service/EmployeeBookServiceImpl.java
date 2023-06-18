package pro.Sky.EmployeeBook.service;

import org.springframework.stereotype.Service;
import pro.Sky.EmployeeBook.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeBookServiceImpl implements EmployeeBookService {
    private final List<Employee> employeeList;
    private int maxEmployees = 10;

    public EmployeeBookServiceImpl() {
        this.employeeList = new ArrayList<>();
        this.maxEmployees = maxEmployees;
    }


    public Employee addNewEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employeeList.add(employee);
        return employee;
    }

    public Employee removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);

        if (employeeList.contains(employee)) {
            employeeList.remove(employee);
            return employee;
        }
        return employee;
    }

    public Employee findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);

        if (employeeList.contains(employee)) {
            return employee;
        }
        return null;
    }
}