package com.bridgelabz;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private int phone;
    private String email;

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String fName){
        this.firstName = fName;

    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lName){
        this.lastName = lName;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address1){
        this.address = address1;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city1){
        this.city = city1;
    }
    public String getState(){
        return state;
    }
    public void setState(String state1){
        this.state = state1;
    }
    public int getZip(){
        return zip;
    }
    public void setZip(int zip1){
        this.zip = zip1;
    }
    public int getPhone(){
        return phone;
    }
    public void setPhone(int phone1){
        this.phone = phone1;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email1){
        this.email = email1;
    }
}
