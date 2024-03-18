package se.lexicon.lc;

import java.util.Arrays;

public class ContactData {
    // Fields

    // static final field names are declared in uppercase words separated by underscores
    private final static int MAX_SIZE = 100;
    private static String[] contacts = new String[0]; // [null, "Name,MobileNumber,Email"]


    public static boolean addContact(final String newContact) {
        if (contacts.length < MAX_SIZE && !isDuplicateMobileNumber(newContact)) {
            String[] newArray = Arrays.copyOf(contacts, contacts.length + 1);
            newArray[newArray.length - 1] = newContact;
            contacts = newArray;
            return true;
        }
        return false;
    }

    public static boolean isDuplicateMobileNumber(String newContact) {
        String[] newContactArray = newContact.split(",");
        String mobileNumber = newContactArray[1];
        for (String contact : contacts) {
            if (contact != null && contact.split(",")[1].equals(mobileNumber)) {
                return true;
            }
        }
        return false;
    }


    public static int size(){
        return contacts.length;
    }

    public static String[] getAllContacts(){
        return Arrays.copyOf(contacts, contacts.length);
    }

}
