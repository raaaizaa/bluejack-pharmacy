package com.example.bluejackpharmacy_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginPage extends AppCompatActivity {
    private Button goToRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        goToRegister = (Button) findViewById(R.id.goToRegisterButton);



        goToRegister.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openRegisterPage();
            }
        });
    }

    public void openRegisterPage(){
        Intent intent = new Intent(this, registerPage.class);
        startActivity(intent);
    }
}