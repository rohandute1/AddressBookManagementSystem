package com.bridgelabz;

public class AddressBook {
    public static void main(String[] args){
        System.out.println("Welcome to address book management system.");
        Contact cont = new Contact();
        cont.setFirstName("John");
        cont.setLastName("Cena");
        cont.setAddress("Home");
        cont.setCity("Pune");
        cont.setState("MH");
        cont.setZip(123456);
        cont.setPhone(123456790);
        cont.setEmail("abc1@gmail.com");

        System.out.println(cont.getFirstName());
        System.out.println(cont.getLastName());
        System.out.println(cont.getAddress());
        System.out.println(cont.getCity());
        System.out.println(cont.getState());
        System.out.println(cont.getZip());
        System.out.println(cont.getPhone());
        System.out.println(cont.getEmail());
    }
}
