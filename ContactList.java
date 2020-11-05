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

    public boolean canContactAdd(Contact newContact) {
        if (contacts.size() != 0) {
            for (Contact contact : contacts) {
                if ((contact.getName().equals(newContact.getName())) || contact.getMobile().equals(newContact.getMobile())) {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }

    public void addContact(Contact newContact) {
        // if contact doesn't exist
        // condition is checked by canContactAdd(Contact newContact)
        contacts.add(newContact);
    }

    // returns the index of the element in the ArrayList
    public int isContactThere(int index) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getIndexNumber() == index) {
                return i;
            }
        }
        return -1;
    }

    public void removeContact(int index) {
        // if contact exists
        // condition is checked by canContactAdd(Contact newContact)
        System.out.println("Successfully removed " + contacts.get(index).getName() + ".");
        contacts.remove(index);
    }
    public void updateContact(int index, Contact newContact) {
        // if contact exists
        contacts.set(index, newContact);

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
