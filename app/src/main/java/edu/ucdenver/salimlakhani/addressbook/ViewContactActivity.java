package edu.ucdenver.salimlakhani.addressbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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

    protected void onResume () {
        super.onResume();

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String phone = intent.getStringExtra("phone");

        binding.nameTextView.setText(name);
        binding.phoneTextView.setText(phone);
    }

    public void mainMenu(View view) {
        //Toast.makeText(this, "You clicked on Main Menu Button", Toast.LENGTH_SHORT).show();
        Intent mainActivity = new Intent(this, MainActivity.class);
        startActivity(mainActivity);
    }
}