package edu.ucdenver.salimlakhani.addressbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addContact(View view) {
        //Toast.makeText(this, "You clicked on Add Contact Button", Toast.LENGTH_SHORT).show();
        Intent addContactActivity = new Intent(this, AddContactActivity.class);
        startActivity(addContactActivity);
    }

    public void listContact(View view) {
        Toast.makeText(this, "You clicked on L:ist Contact Button", Toast.LENGTH_SHORT).show();
    }
}