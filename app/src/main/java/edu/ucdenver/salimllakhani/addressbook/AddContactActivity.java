package edu.ucdenver.salimllakhani.addressbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import edu.ucdenver.salimllakhani.addressbook.databinding.ActivityAddContactBinding;
import edu.ucdenver.salimllakhani.addressbook.databinding.ActivityViewContactBinding;

public class AddContactActivity extends AppCompatActivity {
    private ActivityAddContactBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddContactBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

    public void mainMenu (View v){
        Intent mainIntent = new Intent (this, MainActivity.class);
        startActivity(mainIntent);
    }

    public void clear (View v) {

    }

    public void saveContact (View v) {
        String name = binding.nameTextInput.getText().toString();


        Intent viewContactIntent = new Intent(this, ViewContactActivity.class);
        viewContactIntent.putExtra("name", name);
        startActivity(viewContactIntent);




    }
}