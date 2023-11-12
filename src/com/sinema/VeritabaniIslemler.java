package com.sinema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


// MYSQL İŞLEMLERİ İÇİN FONKSİYONLARI SAKLADIĞIMIZ CLASS
// UYGULAMA AÇILDIĞI ZAMAN VERİTABANI BAĞLANTISI BAŞARISIZ OLURSA GERİ BİLDİRİM VERİR VE UYGULAMAYI KAPATIR...

public class VeritabaniIslemler {

    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

//  YETKİLİ İŞLEMLERİ
    public ArrayList<Yetkili> yetkiliGetir() {

        ArrayList<Yetkili> cikti = new ArrayList<Yetkili>();

        try {
            statement = con.createStatement();
            String sorgu = "Select * From yetkililer";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int id = rs.getInt("id");
                String ad = rs.getString("username");
                String pass = rs.getString("password");
                String kimlik = rs.getString("kimlikno");
                String dogum = rs.getString("dogumyeri");

                cikti.add(new Yetkili(id, ad, pass, kimlik, dogum));

            }
            return cikti;

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }

    }

    public void yetkiliEkle(String ad, String sifre, String kimlik, String dogum) {

        String sorgu = "Insert Into yetkililer (username,password,kimlikno,dogumyeri) VALUES(?,?,?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, sifre);
            preparedStatement.setString(3, kimlik);
            preparedStatement.setString(4, dogum);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void yetkiliSil(int id) {

        String sorgu = "Delete from yetkililer where id = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void yetkiliGuncelle(int id, String yeni_ad, String yeni_sifre, String yeni_kimlik, String yeni_dogum) {
        String sorgu = "Update yetkililer set username = ? , password = ? , kimlikno = ? , dogumyeri = ? where id = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, yeni_ad);
            preparedStatement.setString(2, yeni_sifre);
            preparedStatement.setString(3, yeni_kimlik);
            preparedStatement.setString(4, yeni_dogum);

            preparedStatement.setInt(5, id);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//  BİLET YÖNETİMİ
    public void biletGuncelle(int id, String ad, String soyad, String tcno, String koltuklar, String filmadi, String tarih, String saat, String salon, int tutar) {
        String sorgu = "Update biletler set ad = ? , soyad = ? , tcno = ? , koltuklar = ? , filmadi = ? , tarih = ? , saat = ? , salon = ? , tutar = ? where id = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, tcno);
            preparedStatement.setString(4, koltuklar);
            preparedStatement.setString(5, filmadi);
            preparedStatement.setString(6, tarih);
            preparedStatement.setString(7, saat);
            preparedStatement.setString(8, salon);
            preparedStatement.setInt(9, tutar);
            preparedStatement.setInt(10, id);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void biletSil(int id) {
        String sorgu = "Delete From biletler where id = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void biletSil(String filmadi, String filmtarih, String filmsaat) {
        String sorgu = "Delete From biletler where filmadi = ? and tarih = ? and saat = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, filmadi);
            preparedStatement.setString(2, filmtarih);
            preparedStatement.setString(3, filmsaat);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Bilet> biletGetir() {

        ArrayList<Bilet> cikti = new ArrayList<Bilet>();

        try {
            statement = con.createStatement();
            String sorgu = "Select * From biletler";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String tcno = rs.getString("tcno");
                String koltuklar = rs.getString("koltuklar");
                String filmadi = rs.getString("filmadi");
                String tarih = rs.getString("tarih");
                String saat = rs.getString("saat");
                String salon = rs.getString("salon");
                int tutar = rs.getInt("tutar");

                cikti.add(new Bilet(id, ad, soyad, tcno, koltuklar, filmadi, tarih, saat, salon, tutar));

            }
            return cikti;

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }

    }

    public void biletEkle(String ad, String soyad, String tcno, String koltuklar, int tutar, String filmadi, String tarih, String saat, String salon) {
        String sorgu = "Insert Into biletler (ad,soyad,tcno,koltuklar,filmadi,tarih,saat,salon,tutar) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, tcno);
            preparedStatement.setString(4, koltuklar);
            preparedStatement.setString(5, filmadi);
            preparedStatement.setString(6, tarih);
            preparedStatement.setString(7, saat);
            preparedStatement.setString(8, salon);
            preparedStatement.setInt(9, tutar);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//  SALON KOLTUK DURUM YÖNETİM
    public boolean koltukDolumu(String filmadi, String salonadi, String tarih, String saat, String koltuk) {
        String sorgu = "Select * From koltukdurum where saat = '" + saat + "' and tarih = '" + tarih + "' and filmadi = '" + filmadi + "' and salonadi = '" + salonadi + "' and koltukno = '" + koltuk + "'";
        boolean sonuc = false;
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
            if (rs.next()) {
                if (rs.getString("durum").equals("true")) {
                    sonuc = true;
                } else {
                    sonuc = false;
                }
                return sonuc;
            }
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sonuc;

    }

    public String tarihAl(String filmAdi) {
        String sorgu = "Select * From filmlist where filmadi = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, filmAdi);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return rs.getString("tarih");
            }
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
            return "HATA";
        }
        return "HATA";

    }

    public String saatAl(String filmAdi) {
        String sorgu = "Select * From filmlist where filmadi = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, filmAdi);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return rs.getString("saat");
            }
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
            return "HATA";
        }
        return "HATA";

    }

    public String salonAl(String filmAdi) {
        String sorgu = "Select * From filmlist where filmadi = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, filmAdi);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return rs.getString("salon");
            }
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
            return "HATA";
        }
        return "HATA";

    }

    public void koltukGuncelle(String filmadi, String koltuk, String salonadi, String tarih, String saat, String durum) {
        String sorgu = "Update koltukdurum set durum = '" + durum + "' where filmadi = '" + filmadi + "' and saat = '" + saat + "' and tarih = '" + tarih + "' and koltukno = '" + koltuk + "' and salonadi = '" + salonadi + "'";
        try {
            statement = con.createStatement();
            statement.executeUpdate(sorgu);

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void koltukEkle(String filmadi, String koltuk, String salonadi, String tarih, String saat, String durum) {
        String sorgu = "Insert Into koltukdurum (filmadi,salonadi,tarih,saat,koltukno,durum) VALUES(?,?,?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, filmadi);
            preparedStatement.setString(2, salonadi);
            preparedStatement.setString(3, tarih);
            preparedStatement.setString(4, saat);
            preparedStatement.setString(5, koltuk);
            preparedStatement.setString(6, durum);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void koltukSil(String filmadi, String salonadi, String tarih, String saat) {
        String sorgu = "Delete from koltukdurum where saat = '" + saat + "' and tarih = '" + tarih + "' and filmadi = '" + filmadi + "' and salonadi = '" + salonadi + "'";

        try {
            statement = con.createStatement();
            statement.executeUpdate(sorgu);

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//  SALON YÖNETİMİ
    public void salonSil(int id) {

        String sorgu = "Delete from salonlist where id = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void salonGuncelle(int id, String yeni_salonadi, String yeni_koltuksay, String yeni_ekranboy) {
        String sorgu = "Update salonlist set salonadi = ? , koltuksayi = ? , ekranboyut = ? where id = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, yeni_salonadi);
            preparedStatement.setString(2, yeni_koltuksay);
            preparedStatement.setString(3, yeni_ekranboy);
            preparedStatement.setInt(4, id);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<SinemaSalon> salonGetir() {

        ArrayList<SinemaSalon> cikti = new ArrayList<SinemaSalon>();

        try {
            statement = con.createStatement();
            String sorgu = "Select * From salonlist";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int id = rs.getInt("id");
                String salonad = rs.getString("salonadi");
                String koltuksay = rs.getString("koltuksayi");
                String ekranboy = rs.getString("ekranboyut");

                cikti.add(new SinemaSalon(id, salonad, koltuksay, ekranboy));

            }
            return cikti;

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }

    }

    public void salonEkle(String salonadi, String koltuksayi, String ekranboy) {

        String sorgu = "Insert Into salonlist (salonadi,koltuksayi,ekranboyut) VALUES(?,?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, salonadi);
            preparedStatement.setString(2, koltuksayi);
            preparedStatement.setString(3, ekranboy);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String salonveriAra(String ad) {
        String sorgu = "Select * From salonlist where salonadi = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, ad);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                String sonuc = rs.getString("koltuksayi");
                String sonuc2 = rs.getString("ekranboyut");
                return "Salon Bilgileri : Koltuk Sayısı : " + sonuc + " Ekran Boyutu : " + sonuc2;
            } else {
                return "Tanımsız";
            }
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
            return "deneme ";

        }
    }

    public String salonKoltuk(String ad) {
        String sorgu = "Select * From salonlist where salonadi = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, ad);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                String sonuc = rs.getString("koltuksayi");
                return sonuc;
            } else {
                return "Tanımsız";
            }
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
            return "HATA ";

        }
    }

//   FİLM YÖNETİMİ
    public void filmSil(int id) {

        String sorgu = "Delete from filmlist where id = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void filmGuncelle(int id, String yeni_ad, String yeni_tarih, String yeni_saat, String yeni_salon) {
        String sorgu = "Update filmlist set filmadi = ? , tarih = ? , saat = ? , salon = ? where id = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, yeni_ad);
            preparedStatement.setString(2, yeni_tarih);

            preparedStatement.setString(3, yeni_saat);
            preparedStatement.setString(4, yeni_salon);

            preparedStatement.setInt(5, id);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Film> filmGetir() {

        ArrayList<Film> cikti = new ArrayList<Film>();

        try {
            statement = con.createStatement();
            String sorgu = "Select * From filmlist";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int id = rs.getInt("id");
                String ad = rs.getString("filmadi");
                String tarih = rs.getString("tarih");
                String saat = rs.getString("saat");
                String salon = rs.getString("salon");

                cikti.add(new Film(id, ad, tarih, saat, salon));

            }
            return cikti;

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }

    }

    public void filmEkle(String ad, String tarih, String saat, String salon) {

        String sorgu = "Insert Into filmlist (filmadi,tarih,saat,salon) VALUES(?,?,?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, tarih);
            preparedStatement.setString(3, saat);
            preparedStatement.setString(4, salon);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//   LOGİN 
    public String sifreGetir(String kimlikno) {
        try {
            statement = con.createStatement();
            String sorgu = "Select * From yetkililer where kimlikno = '" + kimlikno + "'";
            ResultSet rs = statement.executeQuery(sorgu);
            if (rs.next()) {
                String pass = rs.getString("password");
                return pass;
            } else {
                return "Sistem yöneticinize başvurun!";
            }

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
            return "Sistem yöneticinize başvurun!";

        }
    }

    public boolean dogrulamaYap(String kullanici, String kimlikno, String dgyeri) {
        String sorgu = "Select * From yetkililer where username = ? and kimlikno = ? and dogumyeri = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullanici);
            preparedStatement.setString(2, kimlikno);
            preparedStatement.setString(3, dgyeri);
            ResultSet rs = preparedStatement.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean girisYap(String kullanici_adi, String parola) {
        String sorgu = "Select * From yetkililer where username = ? and password = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, kullanici_adi);
            preparedStatement.setString(2, parola);

            ResultSet rs = preparedStatement.executeQuery();

            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

//  VERİ TABANI SIFIRLAMA
    public void veritabaniSifirla() {
        String yetkililer = "CREATE TABLE `sinemaotomasyon`.`yetkililer` (\n"
                + "  `id` INT NOT NULL AUTO_INCREMENT,\n"
                + "  `username` VARCHAR(45) NOT NULL,\n"
                + "  `password` VARCHAR(45) NOT NULL,\n"
                + "  `kimlikno` VARCHAR(45) NOT NULL,\n"
                + "  `dogumyeri` VARCHAR(45) NOT NULL,\n"
                + "  PRIMARY KEY (`id`));";
        String filmlist = "CREATE TABLE `sinemaotomasyon`.`filmlist` (\n"
                + "  `id` INT NOT NULL AUTO_INCREMENT,\n"
                + "  `filmadi` VARCHAR(45) NOT NULL,\n"
                + "  `tarih` VARCHAR(45) NOT NULL,\n"
                + "  `saat` VARCHAR(45) NOT NULL,\n"
                + "  `salon` VARCHAR(45) NOT NULL,\n"
                + "  PRIMARY KEY (`id`));";
        String salonlist = "CREATE TABLE `sinemaotomasyon`.`salonlist` (\n"
                + "  `id` INT NOT NULL AUTO_INCREMENT,\n"
                + "  `salonadi` VARCHAR(45) NOT NULL,\n"
                + "  `koltuksayi` VARCHAR(45) NOT NULL,\n"
                + "  `ekranboyut` VARCHAR(45) NOT NULL,\n"
                + "  PRIMARY KEY (`id`));";
        String koltukdurum = "CREATE TABLE `sinemaotomasyon`.`koltukdurum` (\n"
                + "  `id` INT NOT NULL AUTO_INCREMENT,\n"
                + "  `filmadi` VARCHAR(45) NOT NULL,\n"
                + "  `salonadi` VARCHAR(45) NOT NULL,\n"
                + "  `tarih` VARCHAR(45) NOT NULL,\n"
                + "  `saat` VARCHAR(45) NOT NULL,\n"
                + "  `koltukno` VARCHAR(45) NOT NULL,\n"
                + "  `durum` VARCHAR(45) NOT NULL,\n"
                + "  PRIMARY KEY (`id`));";
        String biletler = "CREATE TABLE `sinemaotomasyon`.`biletler` (\n"
                + "  `id` INT NOT NULL AUTO_INCREMENT,\n"
                + "  `ad` VARCHAR(45) NOT NULL,\n"
                + "  `soyad` VARCHAR(45) NOT NULL,\n"
                + "  `tcno` VARCHAR(45) NOT NULL,\n"
                + "  `koltuklar` VARCHAR(45) NOT NULL,\n"
                + "  `filmadi` VARCHAR(45) NOT NULL,\n"
                + "  `tarih` VARCHAR(45) NOT NULL,\n"
                + "  `saat` VARCHAR(45) NOT NULL,\n"
                + "  `salon` VARCHAR(45) NOT NULL,\n"
                + "  `tutar` INT NOT NULL,\n"
                + "  PRIMARY KEY (`id`))";

        String yetkililersil = "DROP TABLE `sinemaotomasyon`.`yetkililer`";
        String filmlistsil = "DROP TABLE `sinemaotomasyon`.`filmlist`";
        String salonlistsil = "DROP TABLE `sinemaotomasyon`.`salonlist`";
        String koltukdurumsil = "DROP TABLE `sinemaotomasyon`.`koltukdurum`";
        String biletlersil = "DROP TABLE `sinemaotomasyon`.`biletler`";
        String yetkiliekle = "INSERT INTO `sinemaotomasyon`.`yetkililer` (`username`, `password`, `kimlikno`, `dogumyeri`) VALUES ('admin', 'admin', '', '')";

        // YETKİLİLER
        try {
            statement = con.createStatement();
            statement.executeUpdate(yetkililersil);
            statement.executeUpdate(yetkililer);
            statement.executeUpdate(yetkiliekle);
        } catch (SQLException ex) {
            try {
                statement = con.createStatement();
                statement.executeUpdate(yetkililer);
                statement.executeUpdate(yetkiliekle);
            } catch (SQLException ex1) {
                Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

        //FİLMLİST
        try {
            statement = con.createStatement();
            statement.executeUpdate(filmlistsil);
            statement.executeUpdate(filmlist);
        } catch (SQLException ex) {
            try {
                statement = con.createStatement();
                statement.executeUpdate(filmlist);
            } catch (SQLException ex1) {
                Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

        //SALONLİST
        try {
            statement = con.createStatement();
            statement.executeUpdate(salonlistsil);
            statement.executeUpdate(salonlist);
        } catch (SQLException ex) {
            try {
                statement = con.createStatement();
                statement.executeUpdate(salonlist);
            } catch (SQLException ex1) {
                Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

        //KOLTUKDURUM 
        try {
            statement = con.createStatement();
            statement.executeUpdate(koltukdurumsil);
            statement.executeUpdate(koltukdurum);
        } catch (SQLException ex) {
            try {
                statement = con.createStatement();
                statement.executeUpdate(koltukdurum);
            } catch (SQLException ex1) {
                Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

        //BİLETLER
        try {
            statement = con.createStatement();
            statement.executeUpdate(biletlersil);
            statement.executeUpdate(biletler);
        } catch (SQLException ex) {
            try {
                statement = con.createStatement();
                statement.executeUpdate(biletler);
            } catch (SQLException ex1) {
                Logger.getLogger(VeritabaniIslemler.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

    }

//   BAĞLANTI
    public VeritabaniIslemler() {

        //  String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi + "?useUnicode=true&characterEncoding=utf8";
        // String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi + "?useSSL=false";
//        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi;
        String url = "jdbc:mysql://" + Database.host + ":"
                + Database.port + "/" + Database.db_ismi + "?useSSL=false&verifyServerCertificate=false";
        try {

            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }

        try {
            con = DriverManager.getConnection(url,Database.kullanici_adi,Database.parola);

        } catch (SQLException ex) {
                System.out.println("Bağlantı Başarısız...");
                JOptionPane.showMessageDialog(null, "Veritabanı başlatılamadı.", "Veritabanı Sistemi", 0);
                System.out.println(ex);
                System.exit(0);
                //ex.printStackTrace();
        }

    }
}
