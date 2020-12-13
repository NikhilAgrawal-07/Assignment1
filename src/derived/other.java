package derived;

import base.bank;
import java.util.*;
import java.util.Random;

public class other extends bank {
    private int amountDeposit;
    private int amountWithdrawal;
    private int accountNo;
    private int initialAmount;
    private int num;
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();



    public other() {

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getAmountDeposit() {
        return amountDeposit;
    }

    public void setAmountDeposit(int amountDeposit) {
        this.amountDeposit = amountDeposit;
    }

    public int getAmountWithdrawal() {
        return amountWithdrawal;
    }

    public void setAmountWithdrawal(int amountWithdrawal) {
        this.amountWithdrawal = amountWithdrawal;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public static boolean isValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }
    public void createAccount(){
        System.out.println();
        System.out.print("Enter the name: ");
        setName(sc.nextLine());
        while(getName().isEmpty() == true){
            System.out.print("Name cannot be null: ");
            setName(sc.nextLine());
        }
        System.out.print("\nEnter email: ");
        setEmail(sc.nextLine());
        while(isValid(getEmail()) == false){
            System.out.print("Invalid email.\nRenter the email: ");
            setEmail(sc.nextLine());
        }
    }
    public void accountNo(){
        System.out.print("\nYour account number. ");
        setAccountNo(accountNo = rand.nextInt(999999999) + 100000000);
        System.out.println(accountNo);
    }

    public void firstDeposit(){
        System.out.print("\nEnter the Opening Amount: ");
        setAmountDeposit(sc.nextInt());
        while(amountDeposit < 1000){
            System.out.println("\nMinimum amount should be Rs. 1000");
            setAmountDeposit(sc.nextInt());
        }
        initialAmount = initialAmount + amountDeposit;
    }
    public void successfully(){
        super.successfully();
        System.out.println("Account number: " + accountNo);
        System.out.println("Total Amount: " + getAmountDeposit());
    }
    public void deposit(){

        System.out.print("\nEnter the amount u want to deposit: ");
        setAmountDeposit(sc.nextInt());
        initialAmount = initialAmount + amountDeposit;

    }
    public void printDeposit(){
        System.out.println("Rs." + amountDeposit +
                " has been successfully debited in your accountNo. "
                + accountNo);
        System.out.println("Balance: " + initialAmount);
    }

    public void withdrawal(){
        System.out.print("\nEnter the amount u want to withdraw: ");
        setAmountWithdrawal(sc.nextInt());
        initialAmount = initialAmount - getAmountWithdrawal();
    }
    public void printWithdraw(){
        System.out.println("Rs." + amountWithdrawal +
                " has been successfully credited from your accountNo. "
                + accountNo);
        System.out.println("Balance: " + initialAmount);
    }
    public void check(){

        System.out.print("\nEnter your Account number: ");
        setNum(sc.nextInt());
        while(num != accountNo){
            System.out.println("Invalid Account number.");
            System.out.print("Renter the Account number:");
            setNum(sc.nextInt());
        }
        System.out.print("\nFor deposit, press d " +
                "\nFor withdraw, press w " +
                "\nFor cancel, press c " +
                "\nTo know the account details, press ac ");
        System.out.print("\n\nEnter the Key: ");
    }

    public void instructions() {
        System.out.println("Instructions for transaction. ");
        System.out.print("\nFor deposit, press d " +
                "\nFor withdraw, press w " +
                "\nFor cancel, press c " +
                "\nTo know the account details, press ac " +
                "\nAfter entering account number.\n");
    }
    public void display(){
        super.display();
        System.out.println("Account number: " + accountNo);
        System.out.println("Total amount: " + initialAmount);
    }
}
