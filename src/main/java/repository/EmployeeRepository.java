package repository;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    private List<Employee> employees = new ArrayList<>();
    private int index = 0;

    public Employee save(Employee employee) {

        employees.add(employee);

        return employee;
    }

    public boolean update(long id, Employee employee) {

        employees.set((int) id, employee);

        return true;
    }

    public boolean delete(long id) {

        employees.remove((int) id);

        return true;
    }

    public boolean delete(String country) {
        return true;
    }

    public Employee findById(long id) {

        Employee result = null;

        for (Employee employee : employees) {
            if (employee.getId() == id) {
                result = employee;
            } else {
                System.out.println("Incorrect ID");
            }
        }

        return result;
    }

    public List<Employee> findAllByName(String name) {

        List<Employee> result = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                result.add(employee);
            }
        }

        return result;
    }

    public List<Employee> findAll() {
        return employees;
    }
}
