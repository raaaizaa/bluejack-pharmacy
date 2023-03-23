package com.example.bluejackpharmacy_quiz;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
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

        holder.nameTV.setOnClickListener(v ->{

            if(medicines.get(position).getMedicineName().equals("Bisolvon")){
                Intent intent = new Intent(context, clickedCard.class);
                intent.putExtra("DefaultImage", R.drawable.bisolvon);
                intent.putExtra("DefaultText", "Bisolvon");
                intent.putExtra("DefaultPrice", "Rp18.000,00");
                intent.putExtra("DefaultManufacturer", "Aventis Pharma");
                intent.putExtra("DefaultDetails", "BISOLVON TABLET mengandung Bromhexine, merupakan obat yang digunakan untuk mengurangi dan mengencerkan dahak yang ada di saluran pernapasan sehingga mudah untuk dikeluarkan.");
                context.startActivity(intent);
            }
            if(medicines.get(position).getMedicineName().equals("Decolgen")){
                Intent intent = new Intent(context, clickedCard.class);
                intent.putExtra("DefaultImage", R.drawable.decolgen);
                intent.putExtra("DefaultText", "Decolgen");
                intent.putExtra("DefaultPrice", "Rp5.000,00");
                intent.putExtra("DefaultManufacturer", "Darya Varia Laboratoria");
                intent.putExtra("DefaultDetails", "DECOLGEN merupakan obat flu dengan kandungan Paracetamol, Phenylpropanolamine HCl, dan Chlorpheniramine maleate. " +
                        "Paracetamol digunakan sebagai pereda demam dan sakit kepala. " +
                        "Phenylpropanolamine digunakan untuk mengobati gejala hidung tersumbat. " +
                        "Chlorpheniramine maleate bekerja sebagai antihistamin atau anti alergi sehingga obat ini digunakan untuk meredakan gejala flu seperti sakit kepala, demam, bersin-bersin dan hidung tersumbat.");
                context.startActivity(intent);
            }
            if(medicines.get(position).getMedicineName().equals("Panadol")){
                Intent intent = new Intent(context, clickedCard.class);
                intent.putExtra("DefaultImage", R.drawable.panadol);
                intent.putExtra("DefaultText", "Panadol");
                intent.putExtra("DefaultPrice", "Rp8.000,00");
                intent.putExtra("DefaultManufacturer", "Sterling");
                intent.putExtra("DefaultDetails", "PANADOL merupakan obat dengan kandungan Paracetamol yang dapat digunakan untuk meringankan rasa sakit pada sakit kepala, sakit gigi, sakit pada otot dan menurunkan demam. " +
                        "Paracetamol bekerja pada pusat pengatur suhu di hipotalamus untuk menurunkan suhu tubuh (antipiretik) serta menghambat sintesis prostaglandin sehingga dapat mengurangi nyeri ringan sampai sedang (analgesik).");
                context.startActivity(intent);
            }
            if(medicines.get(position).getMedicineName().equals("Tolak Angin Cair")){
                Intent intent = new Intent(context, clickedCard.class);
                intent.putExtra("DefaultImage", R.drawable.tolakangin);
                intent.putExtra("DefaultText", "Tolak Angin");
                intent.putExtra("DefaultPrice", "Rp20.000,00");
                intent.putExtra("DefaultManufacturer", "Sido Muncul");
                intent.putExtra("DefaultDetails", "TOLAK ANGIN CAIR PLUS MADU merupakan obat herbal terstandar yang mengandung kombinasi berbagai herbal alami yang dapat digunakan untuk membantu memelihara atau menjaga daya tahan tubuh dan meringankan gejala masuk angin.");
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return medicines.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView nameTV, manufacturerTV, priceTV;
        ImageView imageIV;
        LinearLayoutCompat parentLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTV = itemView.findViewById(R.id.namecard);
            manufacturerTV = itemView.findViewById(R.id.manufacturercard);
            priceTV = itemView.findViewById(R.id.pricecard);
            imageIV = itemView.findViewById(R.id.imageTemplate);
        }
    }
}
