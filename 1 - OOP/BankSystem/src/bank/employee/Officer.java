package bank.employee;

public class Officer extends bank.employee.Employee {

    public Officer(String empName) {
        super(empName);
    }

    @Override
    public void changeInterestRate() {

        System.out.println("you do not have enough permission to do this");
    }

    @Override
    public void seeInternalFund() {
        System.out.println("You don’t have permission for this operation");

    }
}
