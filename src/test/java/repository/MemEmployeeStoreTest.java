package repository;

import model.Employee;
import org.junit.Assert;
import org.junit.Test;

public class MemEmployeeStoreTest {

    @Test
    public void whenSave() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        Employee employee = new Employee("Ilya", "Russia");
        employeeRepository.save(employee);
        Assert.assertNotNull(employeeRepository.findAll());
    }

    @Test
    public void whenFindById() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        Employee employee = new Employee("Ilya", "Russia");
        employeeRepository.save(employee);
        Employee result = employeeRepository.findById(employee.getId());
        Assert.assertNotNull(result);
    }
}