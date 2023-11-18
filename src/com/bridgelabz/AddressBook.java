package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    Contact person = new Contact();
    List<Contact> contactList = new ArrayList<>();
    public void addContact(){
        System.out.println("Enter first name :");
        String firstName = sc.next();
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
        System.out.println(contactList);
    }
    public void editContact(){
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
        System.out.println("enter how many new contacts do you want to add to the address book :");
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            addContact();
            System.out.println(i+1+"Contact created successfully");
        }
        System.out.println(contactList);
    }
    public static void main(String[] args){
        System.out.println("Welcome to address book management system.");
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        System.out.println("Please enter the details of first contact.");
        addressBook.addContact();
        boolean continueExecution = true;
        while (continueExecution)
        {
            System.out.println("Please select the option:- ");
            System.out.println("1.Edit above contact\n2.Delete the contact\n3.Add multiple contacts");
            int option = sc.nextInt();
            switch(option){
                case 1 -> addressBook.editContact();
                case 2 -> addressBook.deleteContact();
                case 3 -> addressBook.addMultipleContact();
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
