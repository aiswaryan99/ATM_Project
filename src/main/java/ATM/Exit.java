package ATM;

public class Exit {

    public static void exit(int clientNum) {
        System.out.println("Thank you for being our client\n" +
                            "Would you like your receipt : Y/N");
        if (InputValidation.inputValidationStr().equalsIgnoreCase("Y")) {
            //call Transactions History by client number (clientNum)
            System.out.println( "Transactions History\n" +
                                "Balance - $423.323.2323,02\n" +
                                "today is monday 12/12/2012\n" +
                                "Have a nice day\n\n\n");
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WelcomeScreen.WelcomeScreen();
    }
}
