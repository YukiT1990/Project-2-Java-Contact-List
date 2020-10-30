package miniproject2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
//        MainMenu main1= new MainMenu();
//        main1.displayMainMenu();
        int index = 0;
        ContactList contactsForThisUser = new ContactList();

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
//                        for (int i = 0; i <; i++) {
//
//                        }
                        System.out.println(contactsForThisUser);
                        break;
                    case 2:
                        String nameInput = InputCollector.getUserInput("Enter name: ");
                        String mobileInput = InputCollector.getUserInput("Enter mobile: ");
                        String workInput = InputCollector.getUserInput("Enter work: ");
                        String homeInput = InputCollector.getUserInput("Enter home: ");
                        String cityInput = InputCollector.getUserInput("Enter city: ");

                        Contact contact = new Contact(index, nameInput, mobileInput, workInput, homeInput, cityInput);
                        contactsForThisUser.addContact(contact);
                        System.out.println("Successfully added a new contact!");
                        index += 1;
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
