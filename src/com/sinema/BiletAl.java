package com.sinema;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muratcan Öksüm & Emir Tuncer
 */
public class BiletAl extends javax.swing.JFrame {

    FilmYonetim filmliste = new FilmYonetim();
    DefaultTableModel model;


    /**
     * Creates new form BiletAl
     */
    public BiletAl() {
        initComponents();
        model = (DefaultTableModel) film_liste.getModel();
        filmGoruntule();
        hata_mesaj.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        film_liste = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        film_adi = new javax.swing.JTextField();
        film_tarih = new javax.swing.JTextField();
        film_saat = new javax.swing.JTextField();
        film_salon = new javax.swing.JTextField();
        film_bos_koltuk = new javax.swing.JTextField();
        koltuk_secim = new javax.swing.JButton();
        hata_mesaj = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Bilet Al");
        setIconImage(new ImageIcon("./src/com/sinema/images/icon.png").getImage());
        setLocation(new java.awt.Point(500, 150));
        setPreferredSize(new java.awt.Dimension(500, 550));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        film_liste.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Film İsmi", "Tarih ", "Saat", "Salon"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        film_liste.getTableHeader().setReorderingAllowed(false);
        film_liste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                film_listeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(film_liste);
        if (film_liste.getColumnModel().getColumnCount() > 0) {
            film_liste.getColumnModel().getColumn(0).setResizable(false);
            film_liste.getColumnModel().getColumn(0).setPreferredWidth(20);
            film_liste.getColumnModel().getColumn(1).setResizable(false);
            film_liste.getColumnModel().getColumn(2).setResizable(false);
            film_liste.getColumnModel().getColumn(3).setResizable(false);
            film_liste.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setText("Film Adı:");

        jLabel2.setText("Tarih:");

        jLabel3.setText("Saat:");

        jLabel4.setText("Salon:");

        jLabel5.setText("Boş Koltuk:");

        film_adi.setEditable(false);

        film_tarih.setEditable(false);

        film_saat.setEditable(false);

        film_salon.setEditable(false);

        film_bos_koltuk.setEditable(false);

        koltuk_secim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        koltuk_secim.setText("Koltuk Seçin");
        koltuk_secim.setToolTipText("");
        koltuk_secim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                koltuk_secimActionPerformed(evt);
            }
        });

        hata_mesaj.setForeground(new java.awt.Color(204, 0, 0));
        hata_mesaj.setText("jLabel6");

        jMenu1.setText("Seçenekler");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sinema/images/exit.png"))); // NOI18N
        jMenuItem1.setText("Çıkış");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(film_bos_koltuk, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(film_adi)
                                    .addComponent(film_tarih)
                                    .addComponent(film_saat)
                                    .addComponent(film_salon, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(koltuk_secim)
                        .addGap(57, 57, 57))))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(hata_mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(film_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(film_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(film_saat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(film_salon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(film_bos_koltuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(koltuk_secim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(hata_mesaj)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    VeritabaniIslemler islemler = new VeritabaniIslemler();
    public static String filmadi_gonder;
    public static String filmtarih_gonder;
    public static String filmsaat_gonder;
    public static String filmsalon_gonder;
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setVisible(false);
        AnaSayfa ans = new AnaSayfa();
        ans.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /* Tablo içerisinden seans seçimini kontrol eder. Seçim yapılmış ise
         KoltukSecim class'ından nesneyi oluşturup panel görünümünü açar.
    */
    
    private void koltuk_secimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_koltuk_secimActionPerformed
        if (film_liste.isColumnSelected(0) || film_liste.isColumnSelected(1) || film_liste.isColumnSelected(2) || film_liste.isColumnSelected(3) || film_liste.isColumnSelected(4)) {
            filmadi_gonder = bilgiGonder(film_liste.getSelectedRow(), 1);
            filmtarih_gonder = bilgiGonder(film_liste.getSelectedRow(), 2);
            filmsaat_gonder = bilgiGonder(film_liste.getSelectedRow(), 3);
            filmsalon_gonder = bilgiGonder(film_liste.getSelectedRow(), 4);
            if (film_adi.getText().equals("")) {
                hata_mesaj.setText("Lütfen seans seçiniz...");
            } else {
                KoltukSecim klt = new KoltukSecim();
                this.setVisible(false);
                klt.setVisible(true);
            }
        } else {
            hata_mesaj.setText("Lütfen seans seçiniz...");
        }
    }//GEN-LAST:event_koltuk_secimActionPerformed

    // Diğer class'ların bu ekranda yapılan seçim öğelerine erişmesi için bilgiyi string olarak geri dönderir.
    
    private String bilgiGonder(int secilisira, int col) {
        return model.getValueAt(secilisira, col).toString();
    }

    // Film listesi içerisinden seçilen seansın saatini ve tarihini kontrol eder
    // Ardından eğer saat ve tarih henüz gelmemiş ise bilgileri ekranda gösterir.
    // Tarih veya saat geçmiş ise bilgileri göstermez ve bi geribildirim gönderir.
    
    private void film_listeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_film_listeMouseClicked
        int selectedrow = film_liste.getSelectedRow();

        if (dogrulamaYap(model.getValueAt(selectedrow, 2).toString())) {
            film_adi.setText("");
            film_tarih.setText("");
            film_saat.setText("");
            film_salon.setText("");
            film_bos_koltuk.setText("");
            JOptionPane.showMessageDialog(null, "Seans başlamış lütfen gişeden bilet talep ediniz.", "Bilet Yönetim", 1);
        } else if (sureBasladimi(model.getValueAt(selectedrow, 3).toString(), model.getValueAt(selectedrow, 2).toString())) {
            film_adi.setText("");
            film_tarih.setText("");
            film_saat.setText("");
            film_salon.setText("");
            film_bos_koltuk.setText("");
            JOptionPane.showMessageDialog(null, "Seans başlamış lütfen gişeden bilet talep ediniz.", "Bilet Yönetim", 1);
        } else {
            film_adi.setText(model.getValueAt(selectedrow, 1).toString());
            film_tarih.setText(filmTarihAl(model.getValueAt(selectedrow, 2).toString()));
            film_saat.setText(model.getValueAt(selectedrow, 3).toString());
            film_salon.setText(model.getValueAt(selectedrow, 4).toString());
            film_bos_koltuk.setText(islemler.salonKoltuk(model.getValueAt(selectedrow, 4).toString()));
        }
    }//GEN-LAST:event_film_listeMouseClicked

    // film listesi içerisindeki tabloyu nesne oluşturulduğu anda veritabanı içindeki bilgiler ile doldurur.
    
    public void filmGoruntule() {

        model.setRowCount(0);

        ArrayList<Film> filmler = new ArrayList<Film>();

        filmler = islemler.filmGetir();

        if (filmler != null) {

            for (Film film : filmler) {
                Object[] eklenecek = {film.getId(), film.getFilm_adi(), film.getFilm_tarih(), film.getFilm_saat(), film.getFilm_salon()};

                model.addRow(eklenecek);

            }

        }

    }

    // veri tabanı içerisindeki tarih bilgisini stilini değiştirmek için ay kısmını int'dan String'e çevirir.
    
    public String filmTarihAl(String tarih) {
        String gun = tarih.substring(8, 10);
        String ays = tarih.substring(5, 7);
        String yıl = tarih.substring(0, 4);;
        String ay;
        switch (ays) {
            case "01":
                ay = "Ocak";
                break;
            case "02":
                ay = "Şubat";
                break;
            case "03":
                ay = "Mart";
                break;
            case "04":
                ay = "Nisan";
                break;
            case "05":
                ay = "Mayıs";
                break;
            case "06":
                ay = "Haziran";
                break;
            case "07":
                ay = "Temmuz";
                break;
            case "08":
                ay = "Ağustos";
                break;
            case "09":
                ay = "Eylül";
                break;
            case "10":
                ay = "Ekim";
                break;
            case "11":
                ay = "Kasım";
                break;
            case "12":
                ay = "Aralık";
                break;
            default:
                ay = "Ocak";
        }
        return gun + " " + ay + " " + yıl;
    }
    
    // anlık tarih verisine göre filmin tarihini kıyaslar ve bir boolean değer döndürür 
    
    public boolean dogrulamaYap(String tarih) {
        String today = LocalDate.now().toString();
        int todayyil = Integer.parseInt(today.substring(0, 4));
        int todayay = Integer.parseInt(today.substring(5, 7));
        int todaygun = Integer.parseInt(today.substring(8));

        int yil = Integer.parseInt(tarih.substring(0, 4));
        int ay = Integer.parseInt(tarih.substring(5, 7));
        int gun = Integer.parseInt(tarih.substring(8));

        if (yil == todayyil && ay == todayay && gun >= todaygun) {
            return false;
        }
        if (yil == todayyil && ay > todayay) {
            return false;
        }
        if (yil > todayyil) {
            return false;
        } else {
            return true;
        }
    }
 
    // filmin tarih durumu güncel ile aynı ise saat durumunu kıyaslar ve boolean değer döndürür
    
    public boolean sureBasladimi(String saat, String tarih) {
        String today = LocalTime.now().toString();
        int todaysaat = Integer.parseInt(today.substring(0, 2));
        int todaydakika = Integer.parseInt(today.substring(3, 5));

        int saatn = Integer.parseInt(saat.substring(0, 2));
        int dakikan = Integer.parseInt(saat.substring(3, 5));

        String todayt = LocalDate.now().toString();
        int todayyil = Integer.parseInt(todayt.substring(0, 4));
        int todayay = Integer.parseInt(todayt.substring(5, 7));
        int todaygun = Integer.parseInt(todayt.substring(8));

        int yil = Integer.parseInt(tarih.substring(0, 4));
        int ay = Integer.parseInt(tarih.substring(5, 7));
        int gun = Integer.parseInt(tarih.substring(8));

        if (todayay == ay && todaygun == gun && todayyil == yil) {
            if (saatn == todaysaat && dakikan > todaydakika) {
                return false;
            } else if (saatn > todaysaat) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BiletAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BiletAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BiletAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BiletAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BiletAl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField film_adi;
    private javax.swing.JTextField film_bos_koltuk;
    private javax.swing.JTable film_liste;
    private javax.swing.JTextField film_saat;
    private javax.swing.JTextField film_salon;
    private javax.swing.JTextField film_tarih;
    private javax.swing.JLabel hata_mesaj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton koltuk_secim;
    // End of variables declaration//GEN-END:variables
}