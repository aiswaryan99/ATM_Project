package ATM;

import java.util.Scanner;

public class Withdraw {

    double balance;
    double amount;

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
                // Checking;
                WithDrawMethods.CheckingAcc();
                break;
            case 2:
                // Savings
                WithDrawMethods.SavingsAcc();
                break;
            case 3:
                // Money Market
                System.out.println("Cannot Withdraw from this account(s) !");
                break;
            case 4:
                // Main Menu Screen
                // MainMenu.menu();
            default:
                System.out.println("Wrong choice, please try again");
                options(clientNum);
        }
    }
}

