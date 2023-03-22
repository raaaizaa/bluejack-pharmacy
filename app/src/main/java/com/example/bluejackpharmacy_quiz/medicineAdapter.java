package com.example.bluejackpharmacy_quiz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class medicineAdapter extends RecyclerView.Adapter<medicineAdapter.ViewHolder> {
    Vector<medicine> medicines;

    private Context context;

    public medicineAdapter(Vector <medicine> medicines, Context context){
        this.medicines = medicines;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){

//        View v = LayoutInflater.from(context).inflate(R.layout.)
    }

}
