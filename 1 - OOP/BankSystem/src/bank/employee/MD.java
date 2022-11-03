package bank.employee;

import bank.Bank;

import java.util.Scanner;

public class MD extends bank.employee.Employee {


    public MD(String empName) {
        super(empName);

    }

    @Override
    public void changeInterestRate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which interest rate you want to change?" +
                "\n1. SAVINGS" +
                "\n2. STUDENT" +
                "\n3. FIXED DEPOSIT" +
                "\n4. LOAN");

        int choice;
        choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                System.out.print("Enter new interest rate (in %):");
                Bank.setIntSavings(scanner.nextDouble() * 100);
                System.out.println("changed successfully");
                break;

            }
            case 2: {
                System.out.print("Enter new interest rate (in %):");
                Bank.setIntStudent(scanner.nextDouble() * 100);
                System.out.println("changed successfully");
                break;

            }
            case 3: {
                System.out.print("Enter new interest rate (in %):");
                Bank.setIntFixedDeposit(scanner.nextDouble() * 100);
                System.out.println("changed successfully");
                break;

            }
            case 4: {
                System.out.print("Enter new interest rate (in %):");
                Bank.setIntLoan(scanner.nextDouble() * 100);
                System.out.println("changed successfully");
                break;

            }
            default: {
                System.out.println("invalid input");
            }
        }

    }

    @Override
    public void seeInternalFund() {
        System.out.println("Internal fund: " + Bank.getInternalFund());
    }
}
