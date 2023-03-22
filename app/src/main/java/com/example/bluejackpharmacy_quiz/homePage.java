package com.example.bluejackpharmacy_quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.Vector;

public class homePage extends AppCompatActivity {

    Vector<medicine> medicines;

    static int[] imageList = {
            R.drawable.bisolvon, R.drawable.tolakangin, R.drawable.decolgen, R.drawable.panadol
    };

    RecyclerView medicinesRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        medicines = new Vector<>();
        medicines.add(new medicine("Decolgen", "Darya Varia Laboratoria", "Rp5.000,00", imageList[2]));
        medicines.add(new medicine("Tolak Angin Cair", "Sido Muncul", "Rp20.000,00", imageList[1]));
        medicines.add(new medicine("Bisolvon", "Aventis Pharma", "Rp18.000,00", imageList[0]));
        medicines.add(new medicine("Panadol", "Sterling","Rp8.000,00", imageList[3]));

        medicinesRV = findViewById(R.id.medicinesRV);

        medicineAdapter adapter = new medicineAdapter(medicines, this);
        medicinesRV.setAdapter(adapter);

        medicinesRV.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menuhomepage, menu);

        return true;
    }
}