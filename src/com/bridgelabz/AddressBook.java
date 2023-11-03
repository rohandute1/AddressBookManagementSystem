package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    Contact person = new Contact();
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

        System.out.println(person);
    }
    public static void main(String[] args){
        System.out.println("Welcome to address book management system.");
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
    }
}
