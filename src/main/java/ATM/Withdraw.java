package ATM;

public class Withdraw {

    public static void menu(int clientNum) {

        System.out.println("\t-= Withdraw Menu =-\n" +
                "Choose from the following:\n" +
                "1. Deposit\n" +
                "2. Withdraw\n" +
                "3. Transfer\n" +
                "4. Balance\n" +
                "5. Exit");

        options(clientNum);
    }

    public static void options(int clientNum) {

    }

    public static void numOfAccounts(int clientNum) {

        if(DataBase.readExcelFile(clientNum) > 1) {

            // create method for 2 or more account
    }


    }
}
