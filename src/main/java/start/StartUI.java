package start;

import model.Employee;

public class StartUI {
    public static void main(String[] args) {
        Employee employee = new Employee("Ilya", "Russia");
        System.out.println(employee.getCountry());
        System.out.println(employee.getName());
    }
}
