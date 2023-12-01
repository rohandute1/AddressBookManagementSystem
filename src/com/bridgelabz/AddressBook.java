package com.bridgelabz;

import java.util.*;

public class AddressBook {
    private String addressBookName;
    public static Scanner sc = new Scanner(System.in);
    Contact person = new Contact();
    static List<Contact> contactList = new ArrayList<>();
    public String getAddressBookName(){
        return addressBookName;
    }
    public void setAddressBookName(String addressBookName){
        this.addressBookName = addressBookName;
    }
    @Override
    public String toString(){
        return "AddressBook{" +
                "addressBookName='" + addressBookName + '\'' +
                ", contactArrayList=" + contactList +
                '}';
    }

    public void addContact(){
        //Method to add contacts to the addressbook
        Contact person = new Contact();
        System.out.println("Enter first name :");
        String firstName = sc.next();
        boolean isDuplicates = contactList.stream().anyMatch(contact -> contact.getFirstName().equals(firstName));   // To check for duplicate enteries
        if (isDuplicates) {
            System.out.println("Contact already exists please enter another name");
            return;
        }
        person.setFirstName(firstName);

        System.out.println("Enter last name :");
        String lastName = sc.next();
        person.setLastName(lastName);

        System.out.println("Enter address :");
        String address = sc.next();
        person.setAddress(address);

        System.out.println("Enter city :");
        String city = sc.next();
        person.setCity(city);

        System.out.println("Enter state :");
        String state = sc.next();
        person.setState(state);

        System.out.println("Enter zip :");
        int zip = sc.nextInt();
        person.setZip(zip);

        System.out.println("Enter phone number :");
        long phoneNumber = sc.nextLong();
        person.setPhone(phoneNumber);

        System.out.println("Enter email address :");
        String email = sc.next();
        person.setEmail(email);

        contactList.add(person);
//        System.out.println(contactList);
    }
    public void editContact(){
        //Method to edit contacts to the addressbook
        System.out.println("Please enter the Name of which you want to edit :");
        String name = sc.next();
        for (int i = 0;i<contactList.size();i++) {
            if (name.equals(person.getFirstName())) {
                System.out.println("Select option from below:");
                System.out.println("""
                        1.Change first name.
                        2.Change last name
                        3.Change address
                        4.Change city
                        5.Change state
                        6.Change zip code
                        7.Change Phone number
                        8.Change email""");
                int condition = sc.nextInt();
                switch (condition) {
                    case 1 -> {
                        System.out.println("Please enter the new first name");
                        contactList.get(i).setFirstName(sc.next());
                    }
                    case 2 -> {
                        System.out.println("Please enter the new last name");
                        contactList.get(i).setLastName(sc.next());
                    }
                    case 3 -> {
                        System.out.println("Please enter the new address");
                        contactList.get(i).setAddress(sc.next());
                    }
                    case 4 -> {
                        System.out.println("Please enter the new city name");
                        contactList.get(i).setCity(sc.next());
                    }
                    case 5 -> {
                        System.out.println("Please enter the new state name");
                        contactList.get(i).setState(sc.next());
                    }
                    case 6 -> {
                        System.out.println("Please enter the new zip code");
                        contactList.get(i).setZip(sc.nextInt());
                    }
                    case 7 -> {
                        System.out.println("Please enter the new phone number");
                        contactList.get(i).setPhone(sc.nextInt());
                    }
                    case 8 -> {
                        System.out.println("Please enter the new email address");
                        contactList.get(i).setEmail(sc.next());
                    }
                }
            }
        }
        System.out.println("!New edited contact!");
        System.out.println(contactList);
    }
    public void deleteContact(){
        //Method to delete contacts to the addressbook
        System.out.println("Please enter the name of which you wants to delete the contact :");
        String name = sc.next();
        for(int i = 0; i<contactList.size();i++) {
            if (name.equals(contactList.get(i).getFirstName())) {
                contactList.remove(i);
            }
        }
        System.out.println(contactList);
    }
    public void addMultipleContact(){
        //Method to add multiple contacts to the addressbook
        System.out.println("enter how many new contacts do you want to add to the address book :");
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            addContact();
            System.out.println(i+1+"Contact created successfully");
        }
        System.out.println(contactList);
    }
    public void addMultipleAddressBook(){
        //Method to add multiple addressbooks to the addressbook
        Map<String, AddressBook> addressBookMap = new HashMap<>();
        System.out.println("How many address books do you want to create?");
        int numOfAddressBooks = sc.nextInt();
        for (int i = 1; i <= numOfAddressBooks; i++){
            System.out.println("Enter " + i + " address book name");
            String addressBookName = sc.next();
            AddressBook addressBook = new AddressBook();
            addressBook.setAddressBookName(addressBookName);
            addressBook.addMultipleContact();
            addressBookMap.put(addressBookName, addressBook);
        }
    }
    public List<Contact> searchByCityName(String cityName) {
        //Method to search contacts using city name
        List<Contact> matchingContacts = new ArrayList<>();

        for (Contact contact : contactList) {
            if (contact.getCity().equalsIgnoreCase(cityName)) {
                matchingContacts.add(contact);
            }
        }
        return matchingContacts;
    }
    public List<Contact> searchByStateName(String stateName) {
        //Method to search contacts using state name
        List<Contact> matchingContacts = new ArrayList<>();

        for (Contact contact : contactList) {
            if (contact.getState().equalsIgnoreCase(stateName)) {
                matchingContacts.add(contact);
            }
        }
        return matchingContacts;
    }
    public long getCountByCity(String cityName) {
        return contactList.stream()
                .filter(contact -> contact.getCity().equalsIgnoreCase(cityName))
                .count();
    }

    public long getCountByState(String stateName) {
        return contactList.stream()
                .filter(contact -> contact.getState().equalsIgnoreCase(stateName))
                .count();
    }
    public static void main(String[] args){
        System.out.println("Welcome to address book management system.");
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        boolean continueExecution = true;
        while (continueExecution)
        {
            System.out.println("Please select the option:- ");
            System.out.println("""
                    1.Add contact
                    2.Edit above contact
                    3.Delete the contact
                    4.Add multiple contacts
                    5.Add multiple address books
                    6.Search person by city
                    7.Search person by state
                    8.Count by city name
                    9.Count by state name""");

            int option = sc.nextInt();
            switch(option){
                case 1 -> addressBook.addContact();
                case 2 -> addressBook.editContact();
                case 3 -> addressBook.deleteContact();
                case 4 -> addressBook.addMultipleContact();
                case 5 -> addressBook.addMultipleAddressBook();
                case 6 -> {
                    System.out.println("Enter city name:");
                    String cityNames = sc.next();
                    List<Contact> matchingContacts = addressBook.searchByCityName(cityNames);

                    if (!matchingContacts.isEmpty()) {
                        System.out.println("Contacts in " + cityNames + ":");
                        for (Contact contact : matchingContacts) {
                            System.out.println(contact);
                        }
                    } else {
                        System.out.println("No contacts found in " + cityNames);
                    }
                }
                case 7 -> {
                    System.out.println("Enter state name:");
                    String stateName = sc.next();
                    List<Contact> matchingContacts = addressBook.searchByStateName(stateName);

                    if (!matchingContacts.isEmpty()) {
                        System.out.println("Contacts in " + stateName + ":");
                        for (Contact contact : matchingContacts) {
                            System.out.println(contact);
                        }
                    } else {
                        System.out.println("No contacts found in " + stateName);
                    }
                }
                case 8 -> {
                    System.out.println("Enter city name:");
                    String cityNames = sc.next();
                    long countByCity = addressBook.getCountByCity(cityNames);

                    System.out.println("Number of contacts in " + cityNames + ": " + countByCity);
                }

                case 9 -> {
                    System.out.println("Enter state name:");
                    String stateName = sc.next();
                    long countByState = addressBook.getCountByState(stateName);

                    System.out.println("Number of contacts in " + stateName + ": " + countByState);
                }
                default -> System.out.println("Please enter correct option.");
            }
            System.out.println("Do you want to continue.(yes/no)");
            String userInput = sc.next();
            if (!Objects.equals(userInput, "yes"))
            {
                continueExecution = false;
            }
        }
    }
}