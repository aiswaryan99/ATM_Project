package ATM;

import java.util.Scanner;

public class WithDrawMethods {

    public static void CheckingAcc() {
        if ((DataBase.readExcelFile(ClientNum, 1)) > 1) {
            System.out.println("Which checking account do you want to withdraw from? ");
            System.out.println("Choose from the following:\n");
            for (int i = 0; i <= DataBase.lengthOfList(); i++) {
                "Checking Account: " + DataBase.readExcelFile();
                // Display the other accounts
            }

        } else {
            System.out.println("Enter amount to withdraw !");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            if (num > 0 && num < balance) {
                balance = -amount;
                numBills();
            }
            else {
                System.out.println("Entered Invalid Amount!");
            }
        }
    }

    public static void SavingsAcc() {
        if (DataBase.readExcel(0, 2) > 1) {
            System.out.println("Which account do you want to withdraw from? ");
            System.out.println("Choose from the following:\n");
            for (int i = 0; i <= DataBase.readExcel(0, 2); i++) {
                System.out.println("Checking Account: ");
                // Display the other accounts
            }
            double balance;
            if (DataBase.readExcelFile() < 6) {
                System.out.println("Enter amount to withdraw !");
                Scanner scan = new Scanner(System.in);
                double amount = scan.nextDouble();
                if (amount > 0 && amount < balance) {
                    balance = -amount;
                    numBills();
                    System.out.println("Please collect your money !");
                    DataBase.writeExcelFile(balance, 0, 1);
                }
            } else {
                System.out.println("There will be a $2 fee for this withdraw! \nWill you like to continue?");
                System.out.println(" 1. Yes\n 2. No");
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("Would you like to pay the fee from same savings account: Press 1\n" +
                            "Different account? Press 2");
                    Scanner scan = new Scanner(System.in);
                    int option = scan.nextInt();
                    if (option == 1) {
                        System.out.println("Enter amount to withdraw");
                        Scanner scan1 = new Scanner(System.in);
                        double amount = scan1.nextDouble();
                        if (amount > 0 && amount < balance) {
                            balance = -amount;
                            numBills();
                            System.out.println("Please collect your money !");
                            DataBase.writeExcelFile(balance, 0, 1);
                        } else
                            for (int i = 0; i <= DataBase.lengthOfList(); i++) {
                                "Savings Account: " + DataBase.readExcelFile();
                                // Display the other accounts
                                System.out.println("Enter amount to withdraw: ");
                                Scanner scan2 = new Scanner(System.in);
                                amount = scan2.nextDouble();
                                if (amount > 0 && amount < balance) {
                                    balance = -amount;
                                    numBills();
                                    System.out.println("Please collect your money !");
                                    DataBase.writeExcelFile(balance, 0, 1);
                                }
                            }
                    } else {
                        System.out.println("Main Menu");
                        MainMenu.menu(clientNum);
                        System.out.println("Would you like to do anything else?");
                    }
                }
            }
        }
    }

    public static void numBills() {
        System.out.println("""
                How would you like to have your bills?\t
                1. 5's
                2. 10's
                3. 20's
                4. 50's
                5. 100's
                """);
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        switch (option) {
            case 1:
                int bills = amount / 5;
                System.out.println("You will be receiving" + bills + "bills!");
                break;
            case 2:
                bills = amount / 10;
                System.out.println("You will be receiving" + bills + "bills!");
                break;
            case 3:
                bills = amount / 20;
                System.out.println("You will be receiving" + bills + "bills!");
                break;
            case 4:
                bills = amount / 50;
                System.out.println("You will be receiving" + bills + "bills!");
                break;
            case 5:
                bills = amount / 100;
                System.out.println("You will be receiving" + bills + "bills!");
                break;
            default:
                System.out.println("Invalid entry! Please enter a correct option!");
        }
    }
}


