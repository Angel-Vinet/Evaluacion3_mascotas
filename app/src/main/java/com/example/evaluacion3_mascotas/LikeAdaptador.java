package com.example.evaluacion3_mascotas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LikeAdaptador extends RecyclerView.Adapter<LikeAdaptador.LikeAdaptadorViewHolder> {

    ArrayList<Mascota> mascotas;

    public LikeAdaptador(ArrayList<Mascota> mascotas){this.mascotas = mascotas; }

    @NonNull
    @Override
    public LikeAdaptadorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotaslike, parent, false);
        return new LikeAdaptadorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LikeAdaptadorViewHolder likeAdaptadorViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);
        likeAdaptadorViewHolder.imgMascotaLike.setImageResource(mascota.getFoto_mascota());
        likeAdaptadorViewHolder.tvNombreLike.setText(mascota.getNombre_mascota());
        likeAdaptadorViewHolder.tvLikeMascota.setText(mascota.getLike_mascota());
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class LikeAdaptadorViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgMascotaLike;
        private TextView tvNombreLike;
        private TextView tvLikeMascota;
        private ImageButton imgLikeMascota;

        public LikeAdaptadorViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMascotaLike = itemView.findViewById(R.id.imgMascotaLike);
            tvNombreLike = itemView.findViewById(R.id.tvNombreLike);
            tvLikeMascota = itemView.findViewById(R.id.tvLikeMascota);
            imgLikeMascota = itemView.findViewById(R.id.imgLikeMascota);
        }
    }
}
