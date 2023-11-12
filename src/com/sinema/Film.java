package com.sinema;

// Film bilgilerini sakladığımız bir class oluşturur.


public class Film {

    private int id;
    private String film_adi;
    private String film_tarih;
    private String film_saat;
    private String film_salon;

    public Film(int id, String film_adi, String film_tarih, String film_saat, String film_salon) {
        this.id = id;
        this.film_adi = film_adi;
        this.film_tarih = film_tarih;
        this.film_saat = film_saat;
        this.film_salon = film_salon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilm_adi() {
        return film_adi;
    }

    public void setFilm_adi(String film_adi) {
        this.film_adi = film_adi;
    }

    public String getFilm_tarih() {
        return film_tarih;
    }

    public void setFilm_tarih(String film_tarih) {
        this.film_tarih = film_tarih;
    }

    public String getFilm_saat() {
        return film_saat;
    }

    public void setFilm_saat(String film_saat) {
        this.film_saat = film_saat;
    }

    public String getFilm_salon() {
        return film_salon;
    }

    public void setFilm_salon(String film_salon) {
        this.film_salon = film_salon;
    }

}
