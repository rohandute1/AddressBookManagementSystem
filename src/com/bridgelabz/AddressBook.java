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
    public void editContact(){
        System.out.println("Please enter the Name of which you want to edit :");
        String name = sc.next();
        if(name.equals(person.getFirstName())){
            System.out.println("Select option from below:");
            System.out.println("1.Change first name.\n2.Change last name\n3.Change address\n4.Change city\n5.Change state" +
                    "\n6.Change Phone number\n7.Change email");
            int condition = sc.nextInt();
            switch(condition){
                case 1:
                    person.setFirstName(sc.next());
                    break;
                case 2:
                    person.setLastName(sc.next());
                    break;
                case 3:
                    person.setAddress(sc.next());
                    break;
                case 4:
                    person.setCity(sc.next());
                    break;
                case 5:
                    person.setState(sc.next());
                    break;
                case 6:
                    person.setZip(sc.nextInt());
                    break;
                case 7:
                    person.setPhone(sc.nextInt());
                    break;
                case 8:
                    person.setEmail(sc.next());
                    break;
            }
        }
        System.out.println(person);
    }
    public static void main(String[] args){
        System.out.println("Welcome to address book management system.");
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.editContact();
    }
}
