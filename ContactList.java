package miniproject2;

import java.util.ArrayList;

public class ContactList{
    private ArrayList<Contact> contacts;
    // constructor
    public ContactList() {
        this.contacts = new ArrayList<Contact>();
    }

    public boolean isContactEmpty() {
        if (contacts.size() == 0) {
            return true;
        }
        return false;
    }

    public void addContact(Contact newContact) {
        // if contact doesn't exist
//        for (Contact contact : contacts) {
//            if ((contact.getName().equals(newContact.getName())) || contact.getMobile().equals(newContact.getMobile())) {
//                System.out.println("The contact already exists.");
//            } else {
//                contacts.add(newContact);
//            }
//        }
        if (contacts.size() != 0) {
            for (Contact contact : contacts) {
                if(!(contact.getName().equals(newContact.getName())) &&  (!(contact.getMobile().equals(newContact.getMobile())))) {
                    contacts.add(newContact);
                } else {
                    System.out.println("The contact already exists.");
                }
            }
        } else {
            contacts.add(newContact);
            System.out.println("Successfully added a new contact!");
        }
    }

    public void removeContact(int index) {
        // if contact exists
        for (Contact contact : contacts) {
            if (contact.getIndexNumber() == index) {
                System.out.println("Successfully removed " + contact.getName() + ".");
                contacts.remove(contact);
                break;
            }
        }
    }
    public void updateContact(Contact newContact) {
        // if contact exists
    }
    public void listContacts() {
        for (Contact contact : contacts) {
            // print contact
            String listContact = "";
            if (contact.getWork().equals("") && contact.getHome().equals("") && contact.getCity().equals("")) {
                listContact = String.format("%d. <%s> (mobile=%s)",
                        contact.getIndexNumber(), contact.getName(), contact.getMobile());
            } else if (contact.getWork().equals("") && contact.getHome().equals("")) {
                listContact = String.format("%d. <%s> (mobile=%s, city=%s)",
                        contact.getIndexNumber(), contact.getName(), contact.getMobile(), contact.getCity());
            } else if (contact.getHome().equals("") && contact.getCity().equals("")) {
                listContact = String.format("%d. <%s> (mobile=%s, work=%s)",
                        contact.getIndexNumber(), contact.getName(), contact.getMobile(), contact.getWork());
            } else if (contact.getWork().equals("") && contact.getCity().equals("")) {
                listContact = String.format("%d. <%s> (mobile=%s, home=%s)",
                        contact.getIndexNumber(), contact.getName(), contact.getMobile(), contact.getHome());
            } else if (contact.getWork().equals("")) {
                listContact = String.format("%d. <%s> (mobile=%s, home=%s, city=%s)",
                        contact.getIndexNumber(), contact.getName(), contact.getMobile(), contact.getHome(), contact.getCity());
            } else if (contact.getHome().equals("")) {
                listContact = String.format("%d. <%s> (mobile=%s, work=%s, city=%s)",
                        contact.getIndexNumber(), contact.getName(), contact.getMobile(), contact.getWork(), contact.getCity());
            } else if (contact.getCity().equals("")) {
                listContact = String.format("%d. <%s> (mobile=%s, work=%s, home=%s)",
                        contact.getIndexNumber(), contact.getName(), contact.getMobile(), contact.getWork(), contact.getHome());
            } else {
                listContact = String.format("%d. <%s> (mobile=%s, work=%s, home=%s, city=%s)",
                        contact.getIndexNumber(), contact.getName(), contact.getMobile(), contact.getWork(), contact.getHome(), contact.getCity());
            }
            System.out.println(listContact);
        }
    }
}
