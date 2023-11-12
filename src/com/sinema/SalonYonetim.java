package com.sinema;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muratcan Öksüm & Emir Tuncer
 */
public class SalonYonetim extends javax.swing.JFrame {

    DefaultTableModel model;
    VeritabaniIslemler islemler = new VeritabaniIslemler();

    /**
     * Creates new form SalonYonetim
     */
    public SalonYonetim() {
        initComponents();
        model = (DefaultTableModel) salon_tablosu.getModel();
        salonGoruntule();
        hata_mesaj2.setForeground(new java.awt.Color(204, 0, 51));
        hata_mesaj2.setFont(new java.awt.Font("Segoe UI", 0, 12));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        salon_guncelle = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        salon_ekle = new javax.swing.JButton();
        salon_veriguncelle = new javax.swing.JButton();
        salon_sil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        salon_tablosu = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        salon_adi = new javax.swing.JTextField();
        ekran_boyut = new javax.swing.JTextField();
        koltuk_sayi = new javax.swing.JTextField();
        hata_mesaj2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Salon Yönetim");
        setIconImage(new ImageIcon("./src/com/sinema/images/icon.png").getImage());
        setLocation(new java.awt.Point(500, 150));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Salon Adı:");

        salon_guncelle.setText("Liste Güncelle");
        salon_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salon_guncelleActionPerformed(evt);
            }
        });

        jLabel2.setText("Ekran Boyutu:");

        jLabel4.setText("Koltuk Sayısı:");

        salon_ekle.setText("Salon Ekle");
        salon_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salon_ekleActionPerformed(evt);
            }
        });

        salon_veriguncelle.setText("Salon Güncelle");
        salon_veriguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salon_veriguncelleActionPerformed(evt);
            }
        });

        salon_sil.setText("Salon Sil");
        salon_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salon_silActionPerformed(evt);
            }
        });

        salon_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Salon Adı", "Koltuk Sayısı", "Ekran Boyutu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        salon_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salon_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(salon_tablosu);
        if (salon_tablosu.getColumnModel().getColumnCount() > 0) {
            salon_tablosu.getColumnModel().getColumn(0).setResizable(false);
            salon_tablosu.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SALON YÖNETİMİ");
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        koltuk_sayi.setEditable(false);
        koltuk_sayi.setText("25");

        jMenu1.setText("Seçenekler");

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sinema/images/exit.png"))); // NOI18N
        exit.setText("Çıkış");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel4)))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(salon_adi, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(koltuk_sayi)
                                    .addComponent(ekran_boyut))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(salon_veriguncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(salon_ekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(salon_sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(hata_mesaj2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salon_guncelle))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salon_ekle)
                        .addGap(10, 10, 10)
                        .addComponent(salon_veriguncelle)
                        .addGap(10, 10, 10)
                        .addComponent(salon_sil))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(salon_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(koltuk_sayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ekran_boyut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salon_guncelle)
                    .addComponent(hata_mesaj2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setVisible(false);
        FilmYonetim ytkek = new FilmYonetim();
        ytkek.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

// salon verilerini kontrol eder .

    private void salon_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salon_guncelleActionPerformed
        salonGoruntule();
        hata_mesaj2.setText("Liste Güncellendi ...");
    }//GEN-LAST:event_salon_guncelleActionPerformed

    // girilen bilgilere göre yeni bir salon verisi kaydeder.
    
    private void salon_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salon_ekleActionPerformed
        hata_mesaj2.setText("");

        String ad = salon_adi.getText();
        String koltuk = koltuk_sayi.getText();
        String ekranboy = ekran_boyut.getText();

        islemler.salonEkle(ad, koltuk, ekranboy);
        salonGoruntule();

        salon_adi.setText("");
        koltuk_sayi.setText("");
        ekran_boyut.setText("");
        hata_mesaj2.setText("Yeni Salon Başarıyla Eklendi...");
    }//GEN-LAST:event_salon_ekleActionPerformed

    // alınan textfieldlar ile seçilen id'ye ait veritabanı bilgilerini günceller.
    
    private void salon_veriguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salon_veriguncelleActionPerformed
        String ad = salon_adi.getText();
        String koltuk = koltuk_sayi.getText();
        String ekranboy = ekran_boyut.getText();

        int selectedrow = salon_tablosu.getSelectedRow();

        if (selectedrow == -1) {

            if (model.getRowCount() == 0) {
                hata_mesaj2.setText("Salon Tablosu şu anda boş. ");
            } else {
                hata_mesaj2.setText("Lütfen güncellenecek bir salon seçin.");
            }
        } else {

            int id = (int) model.getValueAt(selectedrow, 0);

            islemler.salonGuncelle(id, ad, koltuk, ekranboy);

            salonGoruntule();

            hata_mesaj2.setText("Salon başarıyla güncellendi...");
        }

    }//GEN-LAST:event_salon_veriguncelleActionPerformed

    // seçilen satırdan id bilgisi alır ve o id'ye ait veriyi veritabanından siler.
    
    private void salon_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salon_silActionPerformed
        hata_mesaj2.setText("");

        int selectedrow = salon_tablosu.getSelectedRow();

        if (selectedrow == -1) {
            if (model.getRowCount() == 0) {
                hata_mesaj2.setText("Salon tablosu şu anda boş...");
            } else {
                hata_mesaj2.setText("Lütfen silinecek bir salon seçin...");
            }

        } else {
            int id = (int) model.getValueAt(selectedrow, 0);

            islemler.salonSil(id);

            salonGoruntule();

            hata_mesaj2.setText("Salon başarıyla silindi...");
        }
    }//GEN-LAST:event_salon_silActionPerformed
 
    // tablodan seçilen verileri textfield içerisine yazar. 
    
    private void salon_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salon_tablosuMouseClicked
        int selectedrow = salon_tablosu.getSelectedRow();

        salon_adi.setText(model.getValueAt(selectedrow, 1).toString());
        koltuk_sayi.setText(model.getValueAt(selectedrow, 2).toString());
        ekran_boyut.setText(model.getValueAt(selectedrow, 3).toString());
    }//GEN-LAST:event_salon_tablosuMouseClicked

    // salon vertabanından aldığı bilgileri salon nesnesi üzerinden array ile tabloya akatarır.
    public void salonGoruntule() {

        model.setRowCount(0);

        ArrayList<SinemaSalon> salonlar = new ArrayList<SinemaSalon>();

        salonlar = islemler.salonGetir();

        if (salonlar != null) {

            for (SinemaSalon salon : salonlar) {
                Object[] eklenecek = {salon.getId(), salon.getSalon_Adi(), salon.getKoltuk_Sayisi(), salon.getEkran_Boyutu()};

                model.addRow(eklenecek);

            }

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
            java.util.logging.Logger.getLogger(SalonYonetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalonYonetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalonYonetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalonYonetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalonYonetim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ekran_boyut;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel hata_mesaj2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField koltuk_sayi;
    private javax.swing.JTextField salon_adi;
    private javax.swing.JButton salon_ekle;
    private javax.swing.JButton salon_guncelle;
    private javax.swing.JButton salon_sil;
    private javax.swing.JTable salon_tablosu;
    private javax.swing.JButton salon_veriguncelle;
    // End of variables declaration//GEN-END:variables
}
