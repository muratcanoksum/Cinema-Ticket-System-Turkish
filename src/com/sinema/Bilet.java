package com.sinema;
  
// Bilet bilgilerini sakladığımız bir class oluşturur.

public class Bilet {

    private int id;
    private String ad;
    private String soyad;
    private String tcno;
    private String koltuklar;
    private String filmadi;
    private String filmtarih;
    private String filmsaat;
    private String filmsalon;
    private int tutar;

    public Bilet(int id, String ad, String soyad, String tcno, String koltuklar, String filmadi, String filmtarih, String filmsaat, String filmsalon, int tutar) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.tcno = tcno;
        this.koltuklar = koltuklar;
        this.filmadi = filmadi;
        this.filmtarih = filmtarih;
        this.filmsaat = filmsaat;
        this.filmsalon = filmsalon;
        this.tutar = tutar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTcno() {
        return tcno;
    }

    public void setTcno(String tcno) {
        this.tcno = tcno;
    }

    public String getKoltuklar() {
        return koltuklar;
    }

    public void setKoltuklar(String koltuklar) {
        this.koltuklar = koltuklar;
    }

    public String getFilmadi() {
        return filmadi;
    }

    public void setFilmadi(String filmadi) {
        this.filmadi = filmadi;
    }

    public String getFilmtarih() {
        return filmtarih;
    }

    public void setFilmtarih(String filmtarih) {
        this.filmtarih = filmtarih;
    }

    public String getFilmsaat() {
        return filmsaat;
    }

    public void setFilmsaat(String filmsaat) {
        this.filmsaat = filmsaat;
    }

    public String getFilmsalon() {
        return filmsalon;
    }

    public void setFilmsalon(String filmsalon) {
        this.filmsalon = filmsalon;
    }

    public int getTutar() {
        return tutar;
    }

    public void setTutar(int tutar) {
        this.tutar = tutar;
    }

}
