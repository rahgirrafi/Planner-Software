package org.openjfx.plannerfx;

public abstract class User {
    private String firstName;
    private String middleName;
    private String lastName;
    private  String FullName = firstName + " " + middleName + " " + lastName;

    private String email;
    private String phoneNumber;
    private String address;

    public User(){

    }

    public User(String firstName, String middleName, String lastName, String email, String phoneNumber, String address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }







}
