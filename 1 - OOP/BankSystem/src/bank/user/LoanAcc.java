package bank.user;

import bank.Bank;

public class LoanAcc extends Account{

    public LoanAcc(String name, double initDeposit) {
        super(name, 0, initDeposit);
    }

    @Override
    public void deposit(double amount) {
        loanBalance -= amount;
        System.out.println(amount + " paid");
        query();
        Bank.incrementInternalFund(amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("A loan account cannot withdraw any amount from the account.");
    }

    @Override
    public void reqLoan(double amount, boolean reqAdditional) {

        super.reqLoan(amount, reqAdditional);
    }

    @Override
    public void approveLoanReq() {
        if (Bank.decrementInternalFund(loanReqAmount)) {
            loanBalance += loanReqAmount;
            loanReqAmount = 0;
            loanReqPending = false;
            System.out.println("Loan approved");
        }
    }

    @Override
    protected void addInterest() {
        double interest = acBalance * Bank.getIntLoan();

        if (Bank.decrementInternalFund(Bank.getIntLoan())) {
            loanBalance += interest;
            System.out.println("Loan added to your balance");
            super.addInterest();
        }

    }
}
