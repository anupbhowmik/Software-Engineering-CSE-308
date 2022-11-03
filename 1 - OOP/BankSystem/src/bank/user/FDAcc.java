package bank.user;

import bank.Bank;

public class FDAcc extends Account{

    public FDAcc(String name, double initDeposit) {
        super(name, initDeposit, 0);
    }

    @Override
    public void deposit(double amount) {
        if (amount < 50000){
            System.out.println("The deposit amount must not be less than 50,000$");
        }
        else
            super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        if (yearPassed < 1){
            System.out.println("A fixed deposit account cannot withdraw if it has not reached a maturity period of one year.");
        } else
            super.withdraw(amount);
    }

    @Override
    public void reqLoan(double amount, boolean reqAdditional) {

        if (reqAdditional) {
            System.out.println("only loan account holders can apply for additional 5% of the current loan amount");

        } else if (loanBalance + amount > 10000) {
            System.out.println("max allowable loan is 100000$");
        } else
            super.reqLoan(amount, false);
    }

    @Override
    public void approveLoanReq() {
        if (Bank.decrementInternalFund(loanReqAmount)) {
            loanBalance += loanReqAmount;
            acBalance += loanBalance;
            loanReqAmount = 0;
            loanReqPending = false;
            System.out.println("Loan approved");
        }
    }

    @Override
    protected void addInterest() {
        double interest = acBalance * Bank.getIntFixedDeposit();

        if (Bank.decrementInternalFund(Bank.getIntFixedDeposit())) {
            acBalance += interest;
            System.out.println("Interest added to your balance");
            super.addInterest();
        }

    }
}
