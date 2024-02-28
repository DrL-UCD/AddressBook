package edu.ucdenver.salimllakhani.addressbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import edu.ucdenver.salimllakhani.addressbook.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

    }

    public void addContact(View view) {
        Toast.makeText(this, "You clicked on Add Contact Button", Toast.LENGTH_SHORT).show();
    }

    public void listContact(View view) {
        Toast.makeText(this, "You clicked on List Contact Button", Toast.LENGTH_SHORT).show();
    }
}