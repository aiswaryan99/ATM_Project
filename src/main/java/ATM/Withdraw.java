package ATM;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class Withdraw {

    double amount;
    double balance;


    public static void menu(int clientNum) {

        System.out.println("\t-= Withdraw Menu =-\n" +
                "Choose from the following:\n" +
                "1. Checking\n" +
                "2. Savings\n" +
                "3. Money Market\n" +
                "4. Back to Main Menu\n");

        options(clientNum);
    }

    public static void options(int clientNum) {

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                CheckingAcc();
                break;
            case 2:
                // Savings
                break;
            case 3:
                // Money Market
                System.out.println("Cannot Withdraw from this account(s) !");
                break;
            default:
                System.out.println("Wrong choice, please try again");
                options(clientNum);
        }
    }

    public static void numOfAccounts(int clientNum) {

        if(DataBase.readExcelFile(clientNum) > 1) {

            // create method for 2 or more account
    }


    }
}
