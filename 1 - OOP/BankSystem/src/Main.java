import bank.Bank;
import bank.employee.Employee;
import bank.user.ACCOUNT_TYPE;
import bank.user.Account;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Bank bank = new Bank();

    public static void main(String[] args) {

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Login as" +
                    "\n1. Employee" +
                    "\n2. User" +
                    "\n3. Increment year");
            int cmd = scanner.nextInt();
            if (cmd == 1) {
                // employee section
                while (true) {
                    Scanner empScanner = new Scanner(System.in);
                    System.out.println("Enter q to exit employee site");
                    System.out.print("====================Employee Login========================" +
                            "\nEnter your employee username:");
                    String userName = empScanner.nextLine();
                    if (Objects.equals(userName, "q"))
                        break;

                    if (bank.getEmp(userName) == null) {
                        break;
                    } else {
                        // the employee exists
                        Employee currEmp = bank.getEmp(userName);

                        while (true) {
                            System.out.println("Select an action:");
                            System.out.println("1. Lookup" +
                                    "\n2. Approve Loan" +
                                    "\n3. Change Interest Rate" +
                                    "\n4. See Internal Fund" +
                                    "\n5. Logout");

                            int action = empScanner.nextInt();
                            if (action == 5)
                                break;
                            switch (action) {
                                case 1 -> {
                                    System.out.println("User info lookup:");
                                    currEmp.lookup();
                                }
                                case 2 -> {
                                    System.out.println("Loan Pending List:");
                                    if (currEmp.loanPendingList()) {
                                        System.out.print("Approve req for:");
                                        empScanner.nextLine();
                                        String name = empScanner.nextLine();
                                        if (Bank.getUser(name) == null) {
                                            System.out.println("The user doesn't exist on the list");
                                        } else
                                            currEmp.approveLoan(name);
                                    } else
                                        System.out.println("No pending loans");

                                }
                                case 3 -> {
                                    System.out.println("Change interest rate:");
                                    currEmp.changeInterestRate();
                                }
                                case 4 -> {
                                    System.out.println("See Internal Fund:");
                                    currEmp.seeInternalFund();
                                }

                            }
                        }

                    }
                }
            } else if (cmd == 3){
                for (int i = 0; i<Bank.getUserList().size(); i++){
                    Account currUser = Bank.getUserList().get(i);
                    currUser.incrementYear();
                }
                System.out.println("1 year incremented");
            }
            else {
                // user section
                while (true) {

                    Scanner userScanner = new Scanner(System.in);
                    System.out.println("Enter q to exit user site");
                    System.out.print("====================User Login========================" +
                            "\nEnter your username:");
                    String userName = userScanner.nextLine();
                    if (Objects.equals(userName, "q"))
                        break;

                    if (Bank.getUser(userName) == null) {
                        System.out.println("Create a new account");
                        System.out.println("============Create Account===============");

                        System.out.println("Select account type:" +
                                "\n1. SAVINGS" +
                                "\n2. STUDENT" +
                                "\n3. FIXED DEPOSIT" +
                                "\n4. LOAN");
                        int accType = userScanner.nextInt();
                        ACCOUNT_TYPE acType;
                        System.out.println("Enter initial deposit: ");
                        double initAmount = userScanner.nextDouble();
                        acType = switch (accType) {
                            case 1 -> ACCOUNT_TYPE.SAVINGS;
                            case 2 -> ACCOUNT_TYPE.STUDENT;
                            case 3 -> ACCOUNT_TYPE.FIXED_DEPOSIT;
                            case 4 -> ACCOUNT_TYPE.LOAN;
                            default -> throw new IllegalStateException("Unexpected value: " + accType);
                        };

                        bank.addUser(userName, acType, initAmount);


                    } else {
                        // then the account exists
                        Account currUser = Bank.getUser(userName);
                        if (currUser == null)
                            continue;

                        System.out.println("Welcome, " + currUser.getUserName());
                        while (true) {
                            System.out.println("Select an action:");
                            System.out.println("1. Deposit" +
                                    "\n2. Withdraw" +
                                    "\n3. Request Loan" +
                                    "\n4. Query Deposit" +
                                    "\n5. Logout");

                            int action = userScanner.nextInt();
                            if (action == 5)
                                break;
                            switch (action) {
                                case 1 -> {
                                    System.out.print("Enter deposit:");
                                    double deposit = userScanner.nextDouble();
                                    currUser.deposit(deposit);
                                }
                                case 2 -> {
                                    System.out.print("Enter withdraw amount:");
                                    double withdraw = userScanner.nextDouble();
                                    currUser.withdraw(withdraw);
                                }
                                case 3 -> {
                                    if (currUser.isLoanReqPending()) {
                                        System.out.println("You already have a loan request pending.. wait for it to approve");
                                        System.out.println("Do you want additional 5% loan?" +
                                                "\n1. Yes" +
                                                "\n2. No");
                                        int additional = userScanner.nextInt();
                                        boolean reqAdditional = false;
                                        if (additional == 1) {
                                            reqAdditional = true;
                                            currUser.reqLoan(0, reqAdditional);
                                        }
                                        break;
                                    }
                                    System.out.print("Enter loan amount:");
                                    double reqLoan = userScanner.nextDouble();

                                    currUser.reqLoan(reqLoan, false);
                                }
                                case 4 -> {
                                    currUser.query();
                                }

                            }
                        }

                    }

                }
            }

        }
    }

}


