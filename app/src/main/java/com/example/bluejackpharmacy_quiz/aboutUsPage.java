package com.example.bluejackpharmacy_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class aboutUsPage extends AppCompatActivity {

    private Button locate, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_page);

        locate = findViewById(R.id.locateButton);
        back = findViewById(R.id.backButton);

        locate.setOnClickListener(e ->{
            Toast.makeText(this, "Sorry this function currently not available!", Toast.LENGTH_SHORT).show();
        });

        back.setOnClickListener(e ->{
            Intent intent = new Intent(this, homePage.class);
            startActivity(intent);
        });
    }

}