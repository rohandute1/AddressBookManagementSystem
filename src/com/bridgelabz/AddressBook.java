package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
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
        int phoneNumber = sc.nextInt();
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
                System.out.println("1.Change first name.\n2.Change last name\n3.Change address\n4.Change city\n5.Change state" +
                        "\n6.Change zip code\n7.Change Phone number\n8.Change email");
                int condition = sc.nextInt();
                switch (condition) {
                    case 1:
                        contactList.get(i).setFirstName(sc.next());
                        break;
                    case 2:
                        contactList.get(i).setLastName(sc.next());
                        break;
                    case 3:
                        contactList.get(i).setAddress(sc.next());
                        break;
                    case 4:
                        contactList.get(i).setCity(sc.next());
                        break;
                    case 5:
                        contactList.get(i).setState(sc.next());
                        break;
                    case 6:
                        contactList.get(i).setZip(sc.nextInt());
                        break;
                    case 7:
                        contactList.get(i).setPhone(sc.nextInt());
                        break;
                    case 8:
                        contactList.get(i).setEmail(sc.next());
                        break;
                }
            }
        }
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
    public static void main(String[] args){
        System.out.println("Welcome to address book management system.");
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.editContact();
        addressBook.deleteContact();
    }
}
