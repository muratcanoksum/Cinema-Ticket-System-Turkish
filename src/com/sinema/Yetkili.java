
package com.sinema;
public class Yetkili {
private int id;
private String ad;
private String password;
private String kimlik;
private String dogum;

// Yetkili bilgilerini sakladığımız bir class oluşturur.


    public Yetkili(int id, String ad, String password, String kimlik, String dogum) {
        this.id = id;
        this.ad = ad;
        this.password = password;
        this.kimlik = kimlik;
        this.dogum = dogum;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getKimlik() {
        return kimlik;
    }

    public void setKimlik(String kimlik) {
        this.kimlik = kimlik;
    }

    public String getDogum() {
        return dogum;
    }

    public void setDogum(String dogum) {
        this.dogum = dogum;
    }

}
