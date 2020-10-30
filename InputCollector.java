package miniproject2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCollector {
    public static String getUserInput(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        try {
           String userInput = input.nextLine();
           return userInput;
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input.");
            return null;
        }
    }
}
