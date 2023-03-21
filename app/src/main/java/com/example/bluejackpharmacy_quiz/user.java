package com.example.bluejackpharmacy_quiz;

import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

public class user {
    private String name, email, password, phoneNumber;
    private Integer id;

    public static ArrayList<Integer> idArray = new ArrayList<Integer>();
    public static ArrayList<String> nameArray = new ArrayList<String>();
    public static ArrayList<String> emailArray = new ArrayList<String>();
    public static ArrayList<String> passArray = new ArrayList<String>();
    public static ArrayList<String> phoneArray = new ArrayList<String>();

    user(Integer id, String name, String email, String password, String phoneNumber){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public static void addUser(Integer id, String name, String email, String password, String phoneNumber){
        idArray.add(id);
        nameArray.add(name);
        emailArray.add(email);
        passArray.add(password);
        phoneArray.add(phoneNumber);

    }

    public static boolean checkUser(String email, String password){
        boolean b = false;

        // Dummy account admin agar proses debugging mudah
        if(email.equals("admin@gmail.com") && password.equals("admin123")){
            b = true;
        }else{
            for(int i = 0; i < emailArray.size(); i++){
                if(emailArray.get(i).equals(email) && passArray.get(i).equals(password)){
                    b = true;
                }
            }
        }

        return b;

    }
}
