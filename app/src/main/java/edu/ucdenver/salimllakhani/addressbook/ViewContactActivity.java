package edu.ucdenver.salimllakhani.addressbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import edu.ucdenver.salimllakhani.addressbook.databinding.ActivityViewContactBinding;

public class ViewContactActivity extends AppCompatActivity {

    private ActivityViewContactBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityViewContactBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        String name;

        Intent intent = getIntent();

        if (intent != null) {
            name = intent.getStringExtra("name");

            binding.nameTextView.setText(name);
        }
    }
}