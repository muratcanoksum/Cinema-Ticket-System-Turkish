package com.sinema;

// Sinema Salonu bilgilerini sakladığımız bir class oluşturur.


public class SinemaSalon {
    private int id;
    private String Salon_Adi;
    private String Koltuk_Sayisi;
    private String Ekran_Boyutu;

    public SinemaSalon(int id, String Salon_Adi, String Koltuk_Sayisi, String Ekran_Boyutu) {
        this.id = id;
        this.Salon_Adi = Salon_Adi;
        this.Koltuk_Sayisi = Koltuk_Sayisi;
        this.Ekran_Boyutu = Ekran_Boyutu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSalon_Adi() {
        return Salon_Adi;
    }

    public void setSalon_Adi(String Salon_Adi) {
        this.Salon_Adi = Salon_Adi;
    }

    public String getKoltuk_Sayisi() {
        return Koltuk_Sayisi;
    }

    public void setKoltuk_Sayisi(String Koltuk_Sayisi) {
        this.Koltuk_Sayisi = Koltuk_Sayisi;
    }

    public String getEkran_Boyutu() {
        return Ekran_Boyutu;
    }

    public void setEkran_Boyutu(String Ekran_Boyutu) {
        this.Ekran_Boyutu = Ekran_Boyutu;
    }

  
}
