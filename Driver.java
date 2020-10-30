package miniproject2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
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
                int userChoice = input.nextInt();
                switch(userChoice) {
                    case 1:
                        if (!contactsForThisUser.isContactEmpty()) {
                            contactsForThisUser.listContacts();
                        } else {
                            System.out.println("There is no contact yet.");
                        }
                        break;
                    case 2:
                        String nameInput = InputCollector.getUserInput("Enter name: ");
                        while (nameInput.equals("")) {
                            System.out.println("You must enter this field.");
                            nameInput = InputCollector.getUserInput("Enter name: ");
                        }
                        String mobileInput = InputCollector.getUserInput("Enter mobile: ");
                        while (mobileInput.equals("")) {
                            System.out.println("You must enter this field.");
                            mobileInput = InputCollector.getUserInput("Enter mobile: ");
                        }
                        String workInput = InputCollector.getUserInput("Enter work: ");
                        String homeInput = InputCollector.getUserInput("Enter home: ");
                        String cityInput = InputCollector.getUserInput("Enter city: ");

                        Contact contact = new Contact(index, nameInput, mobileInput, workInput, homeInput, cityInput);
                        contactsForThisUser.addContact(contact);

                        index += 1;
                        break;
                    case 3:
                        if (!contactsForThisUser.isContactEmpty()) {
                            contactsForThisUser.listContacts();
                            System.out.println("Enter the index of the contact to remove: ");
                            int indexToRemove = input.nextInt();
                            contactsForThisUser.removeContact(indexToRemove);
                        } else {
                            System.out.println("There is no contact yet.");
                        }
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
