package com.example.evaluacion3_mascotas;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{

    ArrayList<Mascota> mascotas;
    Activity activity;

    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }


    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.imgMascota.setImageResource(mascota.getFoto_mascota());
        mascotaViewHolder.tvNombre.setText(mascota.getNombre_mascota());
        mascotaViewHolder.tvLike.setText(mascota.getLike_mascota());

        mascotaViewHolder.imgLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, "Les diste like a" + mascota.getNombre_mascota(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgMascota;
        private TextView tvNombre;
        private TextView tvLike;
        private ImageButton imgLike;

        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMascota =  itemView.findViewById(R.id.imgMascota);
            tvNombre =  itemView.findViewById(R.id.tvNombre);
            tvLike =  itemView.findViewById(R.id.tvLike);
            imgLike = itemView.findViewById(R.id.imgLike);
        }
    }
}
