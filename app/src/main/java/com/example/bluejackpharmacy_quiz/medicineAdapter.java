package com.example.bluejackpharmacy_quiz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class medicineAdapter extends RecyclerView.Adapter<medicineAdapter.ViewHolder> {

    private Vector<medicine> medicines;
    private Context context;
    public medicineAdapter(Vector<medicine> medicines, Context context){
        this.medicines = medicines;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.medicine_card, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.nameTV.setText(medicines.get(position).getMedicineName());
        holder.manufacturerTV.setText(medicines.get(position).getManufacturer());
        holder.priceTV.setText(medicines.get(position).getPrice());
       holder.imageIV.setImageResource(medicines.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return medicines.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView nameTV, manufacturerTV, priceTV;
        ImageView imageIV;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTV = itemView.findViewById(R.id.namecard);
            manufacturerTV = itemView.findViewById(R.id.manufacturercard);
            priceTV = itemView.findViewById(R.id.pricecard);
            imageIV = itemView.findViewById(R.id.imageTemplate);
        }
    }
}
