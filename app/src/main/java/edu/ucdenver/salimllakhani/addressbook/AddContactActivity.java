package edu.ucdenver.salimllakhani.addressbook;

import androidx.appcompat.app.AppCompatActivity;

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
}