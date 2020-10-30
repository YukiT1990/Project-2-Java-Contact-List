package miniproject2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
    public void displayMainMenu() {
        while (true) {
            String[] menu = new String[7];
            menu[0] = "+===  Contact  App  ===+";
            menu[1] = "| 1. List all Contacts |";
            menu[2] = "| 2. Add new Contact   |";
            menu[3] = "| 3. Remove Contact    |";
            menu[4] = "| 4. Update Contact    |";
            menu[5] = "| 5. Quit              |";
            menu[6] = "+======================+";
            for (int i = 0; i < menu.length; i++) {
                System.out.println(menu[i]);
            }

            Scanner input = new Scanner(System.in);

            try {
                System.out.println("Enter your option: ");
                int userchoice = input.nextInt();
                switch(userchoice) {
                    case 1:
                        break;
                    case 2:
                        System.out.println("Enter name: ");
                        System.out.println("Enter mobile: ");
                        System.out.println("Enter work: ");
                        System.out.println("Enter home: ");
                        System.out.println("Enter city: ");
                        System.out.println("Successfully added a new contact!");
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        System.out.println("Bye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid Input. Enter number between 1 and 5.");
                        break;
                }
            } catch (InputMismatchException exception) {
                System.out.println("This is not an integer.");
                System.out.println("Invalid Input. Enter number between 1 and 5.");
            }
        }
    }
}
