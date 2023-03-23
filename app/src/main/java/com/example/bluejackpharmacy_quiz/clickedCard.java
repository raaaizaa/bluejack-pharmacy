package com.example.bluejackpharmacy_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class clickedCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicked_card);

        ImageView medicineIV = findViewById(R.id.medicineImage);
        TextView nameDetailsTV = findViewById(R.id.medicineNameDetails);
        TextView priceDetailsTV = findViewById(R.id.priceDetails);
        TextView manufacturerDetailsTV = findViewById(R.id.manufacturerDetails);
        TextView detailsTV = findViewById(R.id.details);

        Intent intent = getIntent();

        int defaultImage = intent.getIntExtra("Default Image", 0);
        String defaultName = intent.getStringExtra("Default Text");
        String defaultPrice = intent.getStringExtra("Default Price");
        String defaultManufacturer = intent.getStringExtra("Default Manufacturer");
        String defaultDetails = intent.getStringExtra("Default Details");

        medicineIV.setImageResource(defaultImage);
        nameDetailsTV.setText(defaultName);
        priceDetailsTV.setText(defaultPrice);
        manufacturerDetailsTV.setText(defaultManufacturer);
        detailsTV.setText(defaultDetails);

    }
}