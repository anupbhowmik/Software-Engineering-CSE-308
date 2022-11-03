package bank;

import bank.employee.Cashier;
import bank.employee.Employee;
import bank.employee.MD;
import bank.employee.Officer;
import bank.user.*;


import java.util.ArrayList;
import java.util.Objects;

public class Bank {

//    private static Bank instance = null;
//
//    public static Bank getInstance()
//    {
//        if (instance == null)
//            instance = new Bank();
//
//        return instance;
//    }

    private static double INTERNAL_FUND = 1000000;
    private static double INT_SAVINGS = .1;
    private static double INT_STUDENT = .05;
    private static double INT_FIXED_DEPOSIT = .15;
    private static double INT_LOAN = .1;
    private static int yearCount;

    private static ArrayList<Account> userList = new ArrayList<>();

    private ArrayList<Employee> empList = new ArrayList<>();

    private void initiateEmployees(){
        empList.add(new MD("MD"));
        empList.add(new Officer("O1"));
        empList.add(new Officer("O2"));
        empList.add(new Cashier("C1"));
        empList.add(new Cashier("C2"));
        empList.add(new Cashier("C3"));
        empList.add(new Cashier("C4"));
        empList.add(new Cashier("C5"));

    }


    public Bank() {
        initiateEmployees();
        System.out.println("Bank Created; ");
        for (int i = 0; i<empList.size(); i++){
            System.out.print(empList.get(i).getEmpName() + ", ");
            empList.get(i).lookup();
        }
        System.out.println("Created.");
        yearCount = 0;

    }

    public void addUser(String name, ACCOUNT_TYPE accountType, double amount) {
        if (findAccount(name)) {
            System.out.println("Account already exists for " + name);
            return;
        }
        if (accountType == ACCOUNT_TYPE.FIXED_DEPOSIT && amount < 100000) {
            System.out.println("A fixed deposit account must ensure the first deposit is at least 100,000$.");
        } else {
            Account newUser = null;
            switch (accountType){
                case STUDENT:  newUser = new StudentAcc(name, amount); break;
                case SAVINGS:  newUser = new SavingsAcc(name, amount); break;
                case FIXED_DEPOSIT:  newUser = new FDAcc(name, amount); break;
                case LOAN :  newUser = new LoanAcc(name, amount); break;
            }

            if (newUser == null){
                System.out.println("error creating account");
                return;
            }
            userList.add(newUser);
            System.out.println("Account created successfully for " + name);
        }
    }

    private boolean findAccount(String name) {
        for (Account user : userList) {
            if (Objects.equals(user.getUserName(), name))
                return true;
        }
        return false;
    }

    public static ArrayList<Account> getUserList() {
        return userList;
    }
//
//    private void printUserList(){
//        System.out.println("==================================");
//        for(int i = 0; i<userList.size(); i++){
//            System.out.println(userList.get(i).toString());
//        }
//        System.out.println("==================================");
//    }
    public static Account getUser(String name) {
//        printUserList();
        int userIdx = getUserIndex(name);
        if (userIdx == -1) {
            System.out.println("User Doesn't Exists");
            return null;
        }
        return userList.get(getUserIndex(name));
    }

    private static int getUserIndex(String name) {
        for (int i = 0; i < userList.size(); i++) {
            if (Objects.equals(userList.get(i).getUserName(), name))
                return i;
        }
        return -1;
    }

public Employee getEmp(String name) {
        int userIdx = getEmpIndex(name);
        if (userIdx == -1) {
            System.out.println("Employee Doesn't Exists");
            return null;
        }
        return empList.get(getEmpIndex(name));
    }

    private int getEmpIndex(String name) {
        for (int i = 0; i < empList.size(); i++) {
            if (Objects.equals(empList.get(i).getEmpName(), name))
                return i;
        }
        return -1;
    }

    public static double getInternalFund() {
        return INTERNAL_FUND;
    }

    private static boolean isBankRupt(double fundAmount){
        if(INTERNAL_FUND - fundAmount < 0)
            return true;
        return false;
    }
    public static void incrementInternalFund(double fundAmount) {
        INTERNAL_FUND += fundAmount;
    }
    public static boolean decrementInternalFund(double fundAmount) {
        if (isBankRupt(fundAmount)){
            System.out.println("No fund available in the bank to process this action");
            return false;
        }

        INTERNAL_FUND -= fundAmount;
        return true;
    }

    public static void setIntSavings(double pct) {
        INT_SAVINGS = pct;
    }

    public static void setIntFixedDeposit(double pct) {
        INT_FIXED_DEPOSIT = pct;
    }

    public static void setIntStudent(double pct) {
        INT_STUDENT = pct;
    }

    public static double getIntSavings() {
        return INT_SAVINGS;
    }

    public static double getIntFixedDeposit() {
        return INT_FIXED_DEPOSIT;
    }

    public static double getIntStudent() {
        return INT_STUDENT;
    }

    public static void setIntLoan(double pct) {
        INT_LOAN = pct;
    }

    public static double getIntLoan() {
        return INT_LOAN;
    }
}
