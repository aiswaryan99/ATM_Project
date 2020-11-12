package ATM;

import java.util.Scanner;

public class DepositMenu {

    /**
     * Create methods for Deposit Menu that will give the customer account options, deposit options and
     *  will print transaction history.
     */

    private int accounts;     //this might be incorrect I might need String type
    int balance = 0;

    public void depositMenu(){
        System.out.println("Choose which account to deposit?\n" +
                            "1. Checking account\n" +
                            "2. Savings account\n" +
                            "3. Money Market\n" +
                            "4. Back to MM\n" +
                            "5. Exit");
    }

    public void accountOptions(int account) {
        System.out.println("Which account to deposit?");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if(account>1) {
            switch(accounts) {                                   // if customer has more than one account he will choose
                case 1:
                    //Account #1
                    System.out.println("Please enter the amount");
                    break;
                case 2:
                    //Account #2
                    System.out.println("Please enter the amount $");
                    break;
                default:
                    //Entered invalid account number
                    System.out.println("You entered invalid account number, please try again");
                    break;
            }
        } else {
            System.out.println("Enter the amount");             // here I might need to link it to depositOption method
            depositOptions("cash", "check");         // if customer will deposit cash/check
        }
    }

    public void depositOptions(String cash, String check) {
        System.out.println("How do you want to deposit?");
        Scanner scan = new Scanner(System.in);
        String scanner = scan.nextLine();                  //Maybe I should create ArrayList
        String[] depositOptions = new String[1];           // I used string arr to store the deposit options so that way
        depositOptions[0]="Cash";                          // I can use it as option to the customer
        depositOptions[1]="Check";
        if(scanner==depositOptions[0]) {
            System.out.println("Please enter the amount");
        } else if(scanner==depositOptions[1]) {
            System.out.println("Please enter the check number");  // Here I think I need another option/code for check number
        }


    }

    public void cashDeposit(double amount) {
        System.out.println("Please enter the amount");
        Scanner scan = new Scanner(System.in);
        scan.nextInt();

        if(amount!=0) {
            balance+=amount;
            System.out.println("Amount $" + amount + "deposited successfully");
            System.out.println("Total balance" + balance);
        } else {
            System.out.println("Invalid amount entered" + amount);
        }
    }

    public void checkDeposit(double amount) {
        System.out.println("Please enter the check number");
        Scanner scan = new Scanner(System.in);
        scan.nextInt();

        if(amount!=0) {
            balance+=amount;
            System.out.println("Check deposited successfully");
            System.out.println("Total balance" + balance);
        } else {
            System.out.println("Invalid check number entered");
        }
    }

    public void printReceipt() {
        System.out.println("Do you want to print the transaction history?");
        Scanner scan = new Scanner(System.in);
        String msg = scan.nextLine();                             //I need input (not sure) boolean type or String type
    }




}
