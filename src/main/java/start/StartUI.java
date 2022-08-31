package start;

import actions.*;
import input.ConsoleInput;
import input.Input;
import service.EmployeeService;

public class StartUI {

    public void init(Input input, EmployeeService employeeService, EmployeeAction[] employeeActions) {
        boolean isRunning  = true;

        while (isRunning) {
            showMenu(employeeActions);
            int select = (int) input.askLong("Select: ");
            if (select < 0 || select >= employeeActions.length) {
                System.out.println("Wrong input, you can select: 0 ... " + (employeeActions.length - 1));
                continue;
            }
            EmployeeAction action = employeeActions[select];
            isRunning = action.execute(input, employeeService);
        }
    }

    private void showMenu(EmployeeAction[] employeeActions) {
        System.out.println("Welcome. It is menu.");
        for (int i = 0; i < employeeActions.length; i++) {
            System.out.println(i + ". " + employeeActions[i].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        EmployeeService employeeService = new EmployeeService();

        EmployeeAction[] actions = {
                new CreateAction(),
                new FindAllAction(),
                new DeleteAction(),
                new ExitProgrammAction()
        };

        new StartUI().init(input, employeeService, actions);
    }
}
