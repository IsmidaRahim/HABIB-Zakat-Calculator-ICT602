package com.example.habibzakatc;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        // Enable the Up button
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("About"); // Set the title for the page
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed(); // Navigate back to the MainActivity
        return true;
    }
}

