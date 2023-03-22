package com.example.bluejackpharmacy_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class registerPage extends AppCompatActivity {
    private Button goToLogin, register;
    private EditText name, email, pass, confirmPass, phoneNumber;

    Integer id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        name = findViewById(R.id.registerNameField);
        email = findViewById(R.id.registerEmailField);
        pass = findViewById(R.id.registerPasswordField);
        confirmPass = findViewById(R.id.registerConfirmPasswordField);
        phoneNumber = findViewById(R.id.registerPhoneField);
        goToLogin = findViewById(R.id.goToLoginButton);
        register = findViewById(R.id.registerButton);

        goToLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLoginPage();
            }
        });

        register.setOnClickListener(e -> {
            String inputtedName = name.getText().toString();
            String inputtedEmail = email.getText().toString();
            String inputtedPass = pass.getText().toString();
            String inputtedConfirmPass = confirmPass.getText().toString();
            String inputtedPhone = phoneNumber.getText().toString();


            if(inputtedName.equals("") || inputtedEmail.equals("") || inputtedPass.equals("") || inputtedConfirmPass.equals("") || inputtedPhone.equals("")){
                Toast.makeText(this, "All fields must be filled!", Toast.LENGTH_SHORT).show();
            }else if(inputtedName.length() < 5){
                Toast.makeText(this, "Name length must be at least 5 characters!", Toast.LENGTH_SHORT).show();
            }else if(!Patterns.EMAIL_ADDRESS.matcher(inputtedEmail).matches()){
                Toast.makeText(this, "Enter a valid email address!", Toast.LENGTH_SHORT).show();
            }else if(!alphanumericValidator(inputtedPass)){
                Toast.makeText(this, "Password must be alphanumeric!", Toast.LENGTH_SHORT).show();
            }else if(!inputtedPass.equals(inputtedConfirmPass)){
                Toast.makeText(this, "Password doesn't match!", Toast.LENGTH_SHORT).show();
            }else if(!PhoneNumberUtils.isGlobalPhoneNumber(inputtedPhone)){
                Toast.makeText(this, "Your phone number is not a valid phone number!", Toast.LENGTH_SHORT).show();
            }else{
                id++;
                user.addUser(id, inputtedName, inputtedEmail, inputtedPass, inputtedPhone);
                Toast.makeText(this, "Success!!!", Toast.LENGTH_SHORT).show();

                openLoginPage();
            }
        });
    }

    public void openLoginPage(){
        Intent intent = new Intent(this, loginPage.class);
        startActivity(intent);
    }

    public static boolean alphanumericValidator(String string){
        String regex = "^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]+$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(string);

        return m.matches();
    }

}