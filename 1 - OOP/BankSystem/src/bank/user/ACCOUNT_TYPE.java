package bank.user;

public enum ACCOUNT_TYPE {
    SAVINGS(1),
    STUDENT(2),
    LOAN(3),
    FIXED_DEPOSIT(4);

    public final int account_type;

    private ACCOUNT_TYPE(int type) {
        this.account_type = type;
    }
}
