package services;

import model.Employee;
import services.BranchService;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> employees;

    public EmployeeService() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public Employee getEmployeeById(String id) {
        for (Employee e : employees) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    public boolean updateEmployee(Employee updatedEmployee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(updatedEmployee.getId())) {
                employees.set(i, updatedEmployee);
                return true;
            }
        }
        return false;
    }

    public boolean removeEmployee(String id) {
        return employees.removeIf(e -> e.getId().equals(id));
    }

    public List<Employee> listAllEmployees() {
        // Return a new list to avoid external modification
        return new ArrayList<>(employees);
    }

    public List<Employee> getEmployeesByBranch(String branchId) {
    List<Employee> result = new ArrayList<>();
    for (Employee e : employees) {
        if (e.getBranch().equals(branchId)) {
            result.add(e);
        }
    }
    return result;
    }
}
