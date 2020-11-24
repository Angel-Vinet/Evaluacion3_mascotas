package com.example.evaluacion3_mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class mascotas_like extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotaLike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_like);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotaLike = findViewById(R.id.rvMascotaslike);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotaLike.setLayoutManager(llm);

        InicializarMAscotas();
        iniciarLikeAdaptador();

    }

    public void iniciarLikeAdaptador(){
        LikeAdaptador likeAdaptador = new LikeAdaptador(mascotas);
        listaMascotaLike.setAdapter(likeAdaptador);
    }
    public void InicializarMAscotas(){
        mascotas = new ArrayList<>();
        mascotas.add(new Mascota(R.drawable.mascota1, "Sadaharu", "2"));
        mascotas.add(new Mascota(R.drawable.mascota2, "Pelusa", "4"));
        mascotas.add(new Mascota(R.drawable.mascota3, "Arthur", "3"));
        mascotas.add(new Mascota(R.drawable.mascota4, "Gning", "1"));
        mascotas.add(new Mascota(R.drawable.mascota5, "Hamtaro", "5"));
    }
}