package repository;

import model.Employee;
import org.junit.Assert;
import org.junit.Test;

public class MemEmployeeStoreTest {

    @Test
    public void whenSave() {
        MemEmployeeStore memEmployeeStore = new MemEmployeeStore();
        Employee employee = new Employee("Ilya", "Russia");
        memEmployeeStore.save(employee);
        Assert.assertNotNull(memEmployeeStore.findAll()[0]);
    }

    @Test
    public void whenFindById() {
        MemEmployeeStore memEmployeeStore = new MemEmployeeStore();
        Employee employee = new Employee("Ilya", "Russia");
        memEmployeeStore.save(employee);
        Employee result = memEmployeeStore.findById(employee.getId());
        Assert.assertNotNull(result);
    }
}