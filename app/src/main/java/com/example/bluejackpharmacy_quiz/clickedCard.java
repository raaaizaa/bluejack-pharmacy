package com.example.bluejackpharmacy_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class clickedCard extends AppCompatActivity {

    private Button addToCart, back;
    private EditText quantity;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicked_card);
        
        // Medicine Info:
        ImageView medicineIV = findViewById(R.id.medicineImage);
        TextView nameDetailsTV = findViewById(R.id.medicineNameDetails);
        TextView priceDetailsTV = findViewById(R.id.priceDetails);
        TextView manufacturerDetailsTV = findViewById(R.id.manufacturerDetails);
        TextView detailsTV = findViewById(R.id.details);

        Intent intent = getIntent();

        int defaultImage = intent.getIntExtra("DefaultImage", 0);
        String defaultName = intent.getStringExtra("DefaultText");
        String defaultPrice = intent.getStringExtra("DefaultPrice");
        String defaultManufacturer = intent.getStringExtra("DefaultManufacturer");
        String defaultDetails = intent.getStringExtra("DefaultDetails");

        medicineIV.setImageResource(defaultImage);
        nameDetailsTV.setText(defaultName);
        priceDetailsTV.setText(defaultPrice);
        manufacturerDetailsTV.setText(defaultManufacturer);
        detailsTV.setText(defaultDetails);
        
        // Button:
        addToCart = findViewById(R.id.addToCartButton);
        back = findViewById(R.id.backButton);
        quantity = findViewById(R.id.quantityField);
        
        addToCart.setOnClickListener(e ->{
            String inputtedQuantity = quantity.getText().toString();
            int finalInputtedQuantity = Integer.parseInt(inputtedQuantity);
            
            if(finalInputtedQuantity == 0){
                Toast.makeText(this, "Quantity must be more than 0!", Toast.LENGTH_SHORT).show();
            }else if(finalInputtedQuantity > 0){
                Toast.makeText(this, "Medicine has been added!", Toast.LENGTH_SHORT).show();
            }
            
        });
        
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToHomepage();
            }
        });

    }

    public void backToHomepage(){
        Intent intent = new Intent(this, homePage.class);
        startActivity(intent);
    }
}