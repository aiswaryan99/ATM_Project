package ATM;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class WithDrawMethods extends Withdraw{

    public double CheckingAcc() {
        if(.equals(DataBase.readExcelFile(clientNum, 2)) > 1){
            System.out.println("Which checking account do you want to withdraw from? ");
        System.out.println("Choose from the following:\n" );
                for(int i=0;i <= DataBase.readExcelFile();i++){
                "Checking Account: " + DataBase.readExcelFile());
            // Display the other accounts
            }
        else {
            System.out.println("Enter amount to withdraw !");
            Scanner scan = new Scan(amount);
            double num = scan.amount;
            balance = -amount;
        }
        return balance;
        }
    }

    public void savingsAccountCheck() {
        if (DataBase.readExcel() > 1){
            System.out.println("Which account do you want to withdraw from? ");
            System.out.println("Choose from the following:\n" );
                for(int i=0;i<= DataBase.readExcel(0,2);i++){
                    System.out.println("Checking Account: ");

                  // Display the other accounts
                }
        else {
            if (numOfWithDraws < 6) {
                System.out.println("Enter amount to withdraw !");
                Scanner scan = new Scan(amount);
                double num = scan.amount;
                balance = -amount;
                numOfWithDraws++;
            } else {
                System.out.println("There will be a $2 fee for this withdraw! \nWill you like to continue?");
                System.out.println(" 1. Yes\n 2. No");
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                if(choice==1) {
                    System.out.println("Would you like to pay the fee from same savings account or different account?");
                }
                else {
                    System.out.println("Main Menu");
                    System.out.println("Would you like to do anything else?");
                    }
                }
            }
        }
    }
}
