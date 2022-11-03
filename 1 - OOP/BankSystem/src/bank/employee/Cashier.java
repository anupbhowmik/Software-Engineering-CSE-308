package bank.employee;

public class Cashier extends Employee {


    public Cashier(String empName) {
        super(empName);
    }

    @Override
    public void approveLoan(String userName) {
        System.out.println("you do not have enough permission to do this");

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
