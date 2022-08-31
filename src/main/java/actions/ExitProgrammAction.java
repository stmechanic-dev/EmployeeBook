package actions;

import input.Input;
import service.EmployeeService;

public class ExitProgrammAction implements EmployeeAction {
    @Override
    public String name() {
        return "==== Exit programm ====";
    }

    @Override
    public boolean execute(Input input, EmployeeService employeeService) {
        return false;
    }
}
