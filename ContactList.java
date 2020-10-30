package miniproject2;

import java.util.ArrayList;

public class ContactList extends ArrayList{
    // constructor
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(Contact newContact) {
        contacts.add(newContact);
    }

//    public static int getSize() {
//        return contacts.size();
//    }


}
