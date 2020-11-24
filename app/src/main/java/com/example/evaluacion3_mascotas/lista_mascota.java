package com.example.evaluacion3_mascotas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class lista_mascota extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_mascota);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascota =  findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascota.setLayoutManager(llm);
        InicializarMAscotas();
        InicializarAdaptador();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_star, menu);
          return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mStar:
                Intent intent = new Intent(lista_mascota.this, mascotas_like.class);
                //intent.putExtra("mascotas", mascotas);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void InicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
        listaMascota.setAdapter(adaptador);
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