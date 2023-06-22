package edu.ucdenver.salimlakhani.addressbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import edu.ucdenver.salimlakhani.addressbook.databinding.ActivityAddContactBinding;
import edu.ucdenver.salimlakhani.addressbook.databinding.ActivityViewContactBinding;

public class ViewContactActivity extends AppCompatActivity {

    private ActivityViewContactBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_view_contact);
        binding = ActivityViewContactBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

    @Override
    protected void onResume () {
        super.onResume();

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String phone = intent.getStringExtra("phone");

        binding.nameTextView.setText(name);
        binding.phoneTextView.setText(phone);

    }
}