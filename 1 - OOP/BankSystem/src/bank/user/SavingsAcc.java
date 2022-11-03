package bank.user;

import bank.Bank;

public class SavingsAcc extends Account{

    public SavingsAcc(String name, double initDeposit) {
        super(name, initDeposit, 0);
    }

    @Override
    public void withdraw(double amount) {
        if (acBalance - amount < 1000){
            System.out.println("A savings account cannot withdraw if the withdrawal results in a deposit of less than 1,000$.");
        } else
            super.withdraw(amount);
    }

    @Override
    public void reqLoan(double amount, boolean reqAdditional) {

        if (reqAdditional) {
            System.out.println("only loan account holders can apply for additional 5% of the current loan amount");


        } else if (loanBalance + amount > 10000) {
            System.out.println("max allowable loan is 10000$");
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
        double interest = acBalance * Bank.getIntSavings();

        if (Bank.decrementInternalFund(Bank.getIntSavings())) {
            acBalance += interest;
            System.out.println("Interest added to your balance");
            super.addInterest();
        }

    }
}
