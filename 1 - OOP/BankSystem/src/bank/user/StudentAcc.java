package bank.user;

import bank.Bank;

public class StudentAcc extends Account{

    public StudentAcc(String name, double initDeposit) {
        super(name, initDeposit, 0);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 10000){
            System.out.println("A student account cannot withdraw more than 10,000$ in one transaction");
        }
        super.withdraw(amount);
    }

    @Override
    public void reqLoan(double amount, boolean reqAdditional) {

        if (reqAdditional) {
            System.out.println("Sorry, only loan account holders can apply for additional 5% of the current loan amount");


        } else if (loanBalance + amount > 1000) {
            System.out.println("max allowable loan is 1000$");
        } else
            super.reqLoan(amount, false);
    }

    @Override
    public void approveLoanReq() {
        if (Bank.decrementInternalFund(getLoanReqAmount())) {
            loanBalance += loanReqAmount;
            acBalance += loanBalance;
            loanReqAmount = 0;
            loanReqPending = false;
            System.out.println("Loan approved");
        }
    }

    @Override
    protected void addInterest() {
        double interest = acBalance * Bank.getIntStudent();

        if (Bank.decrementInternalFund(Bank.getIntStudent())) {
            acBalance += interest;
            System.out.println("Interest added to your balance");
            super.addInterest();
        }

    }
}
