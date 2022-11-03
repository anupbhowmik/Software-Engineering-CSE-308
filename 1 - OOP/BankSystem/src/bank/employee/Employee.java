package bank.employee;

import bank.Bank;
import bank.user.Account;

public abstract class Employee {
    private String empName;

    public Employee(String empName) {
        this.empName = empName;
    }

    public void lookup(){
        // any employee can lookup
        for (Account user : Bank.getUserList()) {
            System.out.println("===============================================");
            System.out.println("Account info for: " + user.getUserName() + ": ");
            user.query();
            System.out.println("===============================================");
        }

    };

    public boolean loanPendingList() {
        int idx = 0;
        for (Account currUser : Bank.getUserList()) {
            if (currUser.isLoanReqPending()) {
                System.out.println(currUser.getUserName() + ": " + currUser.getLoanReqAmount());
                idx++;
            }
        }
        return idx != 0;
    }
    public void approveLoan(String userName) {

        Account currUser = Bank.getUser(userName);
        currUser.approveLoanReq();
    }


    public abstract void changeInterestRate();
    public abstract void seeInternalFund();

    public String getEmpName(){
        return empName;
    }

}
