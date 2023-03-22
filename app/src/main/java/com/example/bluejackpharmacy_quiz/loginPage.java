package com.example.bluejackpharmacy_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginPage extends AppCompatActivity {
    private Button goToRegister, login;
    private EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        email = findViewById(R.id.loginEmailField);
        password = findViewById(R.id.loginPasswordField);
        goToRegister = findViewById(R.id.goToRegisterButton);
        login = findViewById(R.id.loginButton);

        goToRegister.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openRegisterPage();
            }
        });

        login.setOnClickListener(e -> {
            String inputtedEmail = email.getText().toString();
            String inputtedPass = password.getText().toString();

            if(inputtedEmail.equals("") || inputtedPass.equals("")){
                Toast.makeText(this, "All fields must be filled!", Toast.LENGTH_SHORT).show();
            }else if(!Patterns.EMAIL_ADDRESS.matcher(inputtedEmail).matches()){
                Toast.makeText(this, "Email is not valid!", Toast.LENGTH_SHORT).show();
            }else if(!user.checkUser(inputtedEmail, inputtedPass)){
                Toast.makeText(this, "Account is not available!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Login Success!!!", Toast.LENGTH_SHORT).show();

                Intent intentHomepage = new Intent(this, homePage.class);
                startActivity(intentHomepage);
            }
        });

    }

    public void openRegisterPage(){
        Intent intent = new Intent(this, registerPage.class);
        startActivity(intent);
    }

}