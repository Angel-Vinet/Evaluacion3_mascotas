package com.example.evaluacion3_mascotas;

public class Mascota {
    private String nombre_mascota;
    private int foto_mascota;
    private String like_mascota;

    public Mascota() {
    }

    public Mascota(int foto_mascota, String nombre_mascota, String like_mascota) {
        this.nombre_mascota = nombre_mascota;
        this.foto_mascota = foto_mascota;
        this.like_mascota = like_mascota;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public int getFoto_mascota() {
        return foto_mascota;
    }

    public void setFoto_mascota(int foto_mascota) {
        this.foto_mascota = foto_mascota;
    }

    public String getLike_mascota() {
        return like_mascota;
    }

    public void setLike_mascota(String like_mascota) {
        this.like_mascota = like_mascota;
    }
}
