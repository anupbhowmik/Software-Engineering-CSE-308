package bank.user;

import bank.Bank;

public abstract class Account {

    private static final double YEARLY_CHARGE = 500;
    private final String userName;
    protected double acBalance;
    protected double loanBalance;
    protected boolean loanReqPending;
    protected double loanReqAmount;
    protected int yearPassed;

    public Account(String name, double initDeposit, double loanReqAmount) {
        this.acBalance = initDeposit;
        this.loanBalance = loanReqAmount;
        this.loanReqPending = false;
        this.loanReqAmount = 0;
        userName = name;
        yearPassed = 0;
    }

    public void deposit(double amount) {

        // pay the debt first
        loanBalance -= amount;

        if (loanBalance < 0) {
            acBalance += loanBalance;
            loanBalance = 0;
        }
        System.out.println(amount + " deposited");
        query();
        Bank.incrementInternalFund(amount);
    }

    public void withdraw(double amount) {
        if (amount > acBalance) {
            System.out.println("Not enough balance");
            return;
        }
        acBalance -= amount;
        System.out.println(amount + "$ withdrawn");
        query();
        Bank.decrementInternalFund(amount);
    }

    public void reqLoan(double amount, boolean reqAdditional) {

        loanReqPending = true;
        if (reqAdditional)
            loanReqAmount += loanReqAmount * .05;
        else
            loanReqAmount = amount;
        System.out.println("Loan request successful, sent for approval");
    }

    public void query() {
        System.out.println("Current Balance: $" + acBalance + ", Loan: $" + loanBalance);
    }

    public String getUserName() {
        return userName;
    }

    public boolean isLoanReqPending() {
        return loanReqPending;
    }

    public double getLoanReqAmount() {
        return loanReqAmount;
    }

    public abstract void approveLoanReq();
        // todo: fix access modifier

    public void incrementYear() {
        yearPassed++;
        addInterest();
        deductServiceCharge();
    }

    protected void addInterest() {
        // will add interest every time it is called by the system according to specific time period of a particular user
        query();
    }

    private void deductServiceCharge() {
        // will deduct yearly service charge every time it is called by the system according to specific time period of a particular user

        if (acBalance < YEARLY_CHARGE) {
            System.out.println("Not enough balance for service charge");
        } else {
            acBalance -= YEARLY_CHARGE;
            System.out.println(YEARLY_CHARGE + "$ paid");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                " username= " + getUserName() +
                ", acBalance=" + acBalance +
                ", loanBalance=" + loanBalance +
                ", loanReqPending=" + loanReqPending +
                ", loanReqAmount=" + loanReqAmount +
                ", yearPassed=" + yearPassed +
                '}';
    }
}
