package edu.ucdenver.salimllakhani.addressbook;

import androidx.appcompat.app.AppCompatActivity;

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
    }
}