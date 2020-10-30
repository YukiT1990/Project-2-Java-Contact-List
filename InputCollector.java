package miniproject2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class InputCollector {
    public static String getUserInput(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);

        // validate invalid type of input and menu options (out of range)
        try {
           String userInput = input.nextLine();
           if (userInput.matches("[0-9a-zA-Z]+(( |-)*[0-9a-zA-Z]*)*")) {
               return userInput;
           } else {
//               System.out.println("You should input at least one number or letter.");
               return "";
           }

        } catch (InputMismatchException exception) {
            System.out.println("Invalid input.");
            return "";
        }
    }
}
