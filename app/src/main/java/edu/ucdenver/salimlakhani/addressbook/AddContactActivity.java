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
        binding.nameTextInput.setText("");
        binding.phoneTextInput.setText("");
        binding.emailTextInput.setText("");
        binding.streetTextInput.setText("");
        binding.cityTextInput.setText("");
        binding.stateTextInput.setText("");
        binding.zipTextInput.setText("");
        binding.radioButtonBusiness.setChecked(true);
        binding.nameTextInput.requestFocus();

    }

    public void mainMenu(View view) {
        Intent mainMenu = new Intent(this, MainActivity.class);
        startActivity(mainMenu);
    }

    public void saveContact(View view) {
        Intent viewContactActivity = new Intent(this, ViewContactActivity.class);

        String name = binding.nameTextInput.getText().toString();
        viewContactActivity.putExtra("name", name);

        String phone = binding.phoneTextInput.getText().toString();
        viewContactActivity.putExtra("phone", phone);

        startActivity(viewContactActivity);

    }
}