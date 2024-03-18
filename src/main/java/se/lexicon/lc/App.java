package se.lexicon.lc;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println(ContactData.size()); // 0
        boolean isAddedSimonContact = ContactData.addContact("Simon,987654321,simon@lexicon.se");
        System.out.println("isAddedSimonContact = " + isAddedSimonContact);
        System.out.println(ContactData.size()); // 1
        System.out.println(Arrays.toString(ContactData.getAllContacts()));
        boolean isAddedSimonContact2 = ContactData.addContact("Simon,987654321,simon@lexicon.se");
        System.out.println("isAddedSimonContact2 = " + isAddedSimonContact2); // false

        boolean isAddedNegarContact = ContactData.addContact("Negar,123456789,negar@lexicon.se");
        System.out.println("isAddedNegarContact = " + isAddedNegarContact); // true
        System.out.println(ContactData.size()); // 2

    }

}
