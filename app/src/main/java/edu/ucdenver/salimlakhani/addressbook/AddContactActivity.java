package edu.ucdenver.salimlakhani.addressbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import edu.ucdenver.salimlakhani.addressbook.databinding.ActivityAddContactBinding;

public class AddContactActivity extends AppCompatActivity {
    private ActivityAddContactBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_add_contact);
        binding = ActivityAddContactBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

    }

    public void clear(View view) {


    }

    public void mainMenu(View view) {
        Intent mainActivity = new Intent(this, MainActivity.class);
        startActivity(mainActivity);

    }

    public void saveContact(View view) {
        Intent viewContactActivity = new Intent(this, ViewContactActivity.class);
        String name = binding.nameTextInput.getText().toString();
        viewContactActivity.putExtra("name", name);

        viewContactActivity.putExtra("phone", binding.phoneTextInput.getText().toString());

        startActivity(viewContactActivity);

    }
}