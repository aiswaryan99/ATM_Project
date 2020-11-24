package ATM;

import java.util.Scanner;

public class InputValidation {

    public static String inputValidation() {

        Scanner sc = new Scanner(System.in);

        while (!sc.hasNext("[0-9]{4}")) {
            System.out.println("That's not a correct input!");
            sc.next();
        }
        return sc.next();
    }
}
