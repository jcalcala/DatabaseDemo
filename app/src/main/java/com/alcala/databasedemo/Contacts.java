package com.alcala.databasedemo;

/**
 * Created by Admin on 7/12/2017.
 */

public class Contacts {
    //define variables for the columns
    private int _id;
    private String firstName;
    private String lastName;

    //default constructor
    public Contacts() {

    }

    //constructor
    public Contacts(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
