package com.alcala.databasedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //define widget variables
    private EditText firstNameET, lastNameET;

    //define database handler
    MyDBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiate the MyDBHandler constructor
        dbHandler = new MyDBHandler(this);

        //get reference to the widget
        firstNameET = (EditText) findViewById(R.id.firstNameET);
        lastNameET = (EditText) findViewById(R.id.lastNameET);

        firstNameET.requestFocus();
    }

    //add a contact to the database
    public void addClick(View view) {
        Contacts contacts = new Contacts(firstNameET.getText().toString(), lastNameET.getText().toString());
        dbHandler.addContact(contacts);

        //clear the text field
        firstNameET.setText("");
        lastNameET.setText("");

        //request focus on the firstname
        firstNameET.requestFocus();
    }

    //delete a contact
    public void deleteClick(View view) {
        String firstName = firstNameET.getText().toString();
        String lastName = lastNameET.getText().toString();
        dbHandler.deleteContact(firstName, lastName);

        //clear the text field
        firstNameET.setText("");
        lastNameET.setText("");

        //request focus on the firstname
        firstNameET.requestFocus();
    }

    //show all contacts
    public void showAllClick(View view) {
        //open up a new screen
        Intent i = new Intent(this, DisplayListActivity.class);
        startActivity(i);
    }

    //delete all contacts
    public void deleteAllClick(View view) {
        dbHandler.deleteAllContacts();

        //clear the text field
        firstNameET.setText("");
        lastNameET.setText("");

        //request focus on the firstname
        firstNameET.requestFocus();
    }
}
