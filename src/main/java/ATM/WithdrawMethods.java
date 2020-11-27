package ATM;

import java.util.Scanner;

class WithDrawMethods {

    static int sum;
    static int balance = 300;

    public static void CheckingAcc(int clientNum) {

        int checkingInt = Integer.parseInt(DataBase.readExcelFile(0, clientNum, 5));

        if (checkingInt > 1) {
            System.out.println("Which checking account do you want to withdraw from? ");
            System.out.println("Choose from the following:\n");

            for (int i = 1; i <= checkingInt; i++) {
                System.out.println(DataBase.readExcelFile(1, i, clientNum));
            }
            Scanner acc = new Scanner(System.in);
            int accN = acc.nextInt();
            accN = Integer.parseInt(DataBase.readExcelFile(1, 0, clientNum));

            System.out.println("Enter amount to withdraw!");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            sum = num;

            String accOne = DataBase.readExcelFile(1, clientNum, 2);
            String[] afterSplit = accOne.split("#");
            balance = Integer.parseInt(afterSplit[1]);

            if (num > 0 && num < balance) {
                balance = -sum;
                numBills(sum);
            } else if (num < 0) {
                System.out.println("Amount should be positive value!");
            } else {
                System.out.println("Entered Invalid Amount!");
            }

        }
    }

        public static void SavingsAcc(int clientNum) {

        int savingsInt = Integer.parseInt(DataBase.readExcelFile(0, clientNum, 5));
        if (savingsInt > 1) {
            System.out.println("Which savings account do you want to withdraw from? ");
            System.out.println("Choose from the following:\n");

            for (int i = 1; i <= savingsInt; i++) {
                System.out.println(DataBase.readExcelFile(1, i, clientNum));
            }
            System.out.println("Please enter the account to withdraw from.");
            Scanner scan = new Scanner(System.in);
            int accNum = scan.nextInt();
            String accOne = DataBase.readExcelFile(1, clientNum, 2);
            String[] afterSplit = accOne.split("#");
            if (accNum == Integer.parseInt(afterSplit[0])) {
                balance = Integer.parseInt(afterSplit[1]);
            }
            if (sum > 0) {
                balance = -sum;
                numBills(sum);
                System.out.println("Please collect your money !");
                DataBase.writeExcelFile(balance, 0, 1);
            }
        }
        if (sum > balance) {
            System.out.println("Insufficient Funds! Please enter another amount!");
        }

        int numW = Integer.parseInt(DataBase.readExcelFile(0, clientNum, 3));
        if (numW > 6)
            System.out.println("There will be a $2 fee for this withdraw! \nWill you like to continue?");
        System.out.println(" 1. Yes\n 2. No");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 2) {
            System.out.println("Back to Withdraw Menu");
        }
        if (choice == 1) {
            System.out.println("Would you like to pay the fee from same savings account: Press 1\n" +
                    "Different savings account? Press 2");
            System.out.println("Checking account: Press 3");
            Scanner scan1 = new Scanner(System.in);
            int option = scan1.nextInt();
            if (option == 1) {
                System.out.println("Enter amount to withdraw");
                Scanner scan2 = new Scanner(System.in);
                double num = scan2.nextInt();
                if (num > 0 && num < balance) {
                    balance = -sum;
                    numBills(sum);
                    balance = balance - 2;

                } else if (num < 0) {
                    System.out.println("Amount should be positive value!");
                } else {
                    System.out.println("Entered Invalid Amount!");
                }
                System.out.println("Please collect your money !");
                DataBase.writeExcelFile(balance, 0, 1);// update the balance value in excel
            }
            if (option == 2) {
                System.out.println("which savings account do you want the fee to be taken from?");
                System.out.println("Choose from the following:\n");

                for (int i = 1; i <= savingsInt; i++) {
                    System.out.println(DataBase.readExcelFile(1, i, clientNum));
                }
                Scanner scan = new Scanner(System.in);
                int accNum = scan.nextInt();
                String accOne = DataBase.readExcelFile(1, clientNum, 2);
                String[] afterSplit = accOne.split("#");
                if (accNum == Integer.parseInt(afterSplit[0])) {
                    balance = Integer.parseInt(afterSplit[1]);
                }
                if (sum > 0 && sum < balance) {
                    balance = -sum;
                    numBills(sum);
                    balance = balance - 2;
                    System.out.println("Please collect your money !");
                    DataBase.writeExcelFile(balance, 0, 1);// update the balance value in excel
                }
            }
            if (option == 3) {

                int checkingInt = Integer.parseInt(DataBase.readExcelFile(0, clientNum, 5));
                System.out.println("which savings account do you want the fee to be taken from?");
                System.out.println("Choose from the following:\n");
                for (int i = 1; i <= checkingInt; i++) {
                    System.out.println(DataBase.readExcelFile(1, i, clientNum));
                }
                System.out.println("Please enter the account to withdraw from.");
                Scanner scan = new Scanner(System.in);
                int accNum = scan.nextInt();
                String accOne = DataBase.readExcelFile(1, clientNum, 2);
                String[] afterSplit = accOne.split("#");
                if (accNum == Integer.parseInt(afterSplit[0])) {
                    balance = Integer.parseInt(afterSplit[1]);
                }
                balance = balance - 2;
                // update balance to excel sheet
            }
        } else {
            System.out.println("Main Menu");
            MainMenu.menu(clientNum);
            System.out.println("Would you like to do anything else?");
        }
    }



    public static void numBills (int sum) {
        System.out.println("""
                How would you like to have your bills? Choose from the following! \t
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
                int bills = sum / 5;
                System.out.println("You will be receiving " + bills + " bills!");
                break;
            case 2:
                bills = sum / 10;
                System.out.println("You will be receiving " + bills + " bills!");
                break;
            case 3:
                bills = sum / 20;
                System.out.println("You will be receiving " + bills + " bills!");
                break;
            case 4:
                bills = sum / 50;
                System.out.println("You will be receiving " + bills + " bills!");
                break;
            case 5:
                bills = sum / 100;
                System.out.println("You will be receiving " + bills + " bills!");
                break;
            default:
                System.out.println("Invalid entry! Please enter a correct option!");
        }
    }
}



