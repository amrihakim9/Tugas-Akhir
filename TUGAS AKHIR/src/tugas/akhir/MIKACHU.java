/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.akhir;
import com.sun.glass.events.KeyEvent;
import java.text.NumberFormat;
import java.util.StringTokenizer;
import java.util.Locale;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class MIKACHU extends javax.swing.JFrame {
    
    String nm_mknan="";
    int harga_mknan;
    int jml_beli;
    int jumlah_hrg;
    int kembalian;
    int jumlah_byr;
    int bayar,beli,Harga,bungkus;
    /**
     * Creates new form MIKACHU
     */
    public MIKACHU() {
        initComponents();
    }

    public void radio(){
        if(rdbungkus.isSelected()){
              bungkus = harga_mknan + 2000;
              txtharga.setText(""+bungkus);
        }else{
              txtharga.setText(""+harga_mknan);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        CBNNamaMkn = new javax.swing.JComboBox<>();
        txtharga = new javax.swing.JTextField();
        txtbeli = new javax.swing.JTextField();
        TmtjmlBayar = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtkembalian = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Total = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        rddisini = new javax.swing.JRadioButton();
        rdbungkus = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        jTextField5.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CBNNamaMkn.setBackground(new java.awt.Color(255, 255, 0));
        CBNNamaMkn.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        CBNNamaMkn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH MENU", "Paket Nasi Ayam", "Paket Nasi Sarden", "Paket Nasi Rendang", "Paket Nasi Lele", "Paket Hemat" }));
        CBNNamaMkn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CBNNamaMkn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBNNamaMknActionPerformed(evt);
            }
        });
        getContentPane().add(CBNNamaMkn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 180, 40));

        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });
        getContentPane().add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 180, 40));

        txtbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbeliActionPerformed(evt);
            }
        });
        txtbeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbeliKeyTyped(evt);
            }
        });
        getContentPane().add(txtbeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 180, 40));

        TmtjmlBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TmtjmlBayarActionPerformed(evt);
            }
        });
        TmtjmlBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TmtjmlBayarKeyTyped(evt);
            }
        });
        getContentPane().add(TmtjmlBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 180, 30));

        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });
        getContentPane().add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 180, 30));

        txtkembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkembalianActionPerformed(evt);
            }
        });
        getContentPane().add(txtkembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 180, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("HITUNG JUMLAH HARGA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 180, -1));

        Total.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Total.setText("BAYAR");
        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });
        getContentPane().add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 80, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 11)); // NOI18N
        jButton3.setText("BATAL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 80, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 11)); // NOI18N
        jButton4.setText("SELESAI");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 80, -1));

        buttonGroup1.add(rddisini);
        rddisini.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        rddisini.setForeground(new java.awt.Color(255, 255, 0));
        rddisini.setText("Makan Disini");
        rddisini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rddisiniActionPerformed(evt);
            }
        });
        getContentPane().add(rddisini, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 80, -1));

        buttonGroup1.add(rdbungkus);
        rdbungkus.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        rdbungkus.setForeground(new java.awt.Color(255, 255, 0));
        rdbungkus.setText("Bungkus");
        rdbungkus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbungkusActionPerformed(evt);
            }
        });
        getContentPane().add(rdbungkus, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 80, -1));

        hasil.setColumns(20);
        hasil.setRows(5);
        jScrollPane1.setViewportView(hasil);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 250, 160));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/akhir/MIKACHU.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int button = JOptionPane.YES_NO_OPTION;
        int answer = JOptionPane.showConfirmDialog(this,"Anda Yakin Ingin Membatalkan Pesanan Ini??","Selesai",button);
        if (answer==0){
        
        buttonGroup1.clearSelection();
        CBNNamaMkn.setSelectedIndex(0);
        txtharga.setText("");
        txtbeli.setText("");
        txtHarga.setText("");
        TmtjmlBayar.setText("");
        txtkembalian.setText("");
        hasil.setText("");
    
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CBNNamaMknActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBNNamaMknActionPerformed
       nm_mknan=(String)CBNNamaMkn.getSelectedItem();
       if(nm_mknan=="Paket Nasi Ayam")
       {
            harga_mknan=14000;
       }else if (nm_mknan=="Paket Nasi Sarden")
       {
            harga_mknan=12000;
       }else if (nm_mknan=="Paket Nasi Rendang")
       {
            harga_mknan=16000;
       }else if (nm_mknan=="Paket Nasi Lele")
       {
            harga_mknan=15000;
       }else if (nm_mknan=="Paket Hemat")
       {
            harga_mknan=10000;
       }

       txtharga.setText(""+harga_mknan);
    }//GEN-LAST:event_CBNNamaMknActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int answer = JOptionPane.showConfirmDialog(null,"Apakah Anda Ingin Menyudahi Pesanan Ini??","Selesai",JOptionPane.OK_OPTION);
        if (answer==JOptionPane.OK_OPTION){
        
        this.dispose();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void rddisiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rddisiniActionPerformed
        radio();
    }//GEN-LAST:event_rddisiniActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Harga =Integer.parseInt(txtharga.getText());
        beli =Integer.parseInt(txtbeli.getText());
        
        bayar = Harga * beli ;
        txtHarga.setText(""+bayar);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rdbungkusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbungkusActionPerformed
        radio();
    }//GEN-LAST:event_rdbungkusActionPerformed

    private void txtbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbeliActionPerformed

    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void TmtjmlBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TmtjmlBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TmtjmlBayarActionPerformed

    private void txtkembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkembalianActionPerformed

    private void txtbeliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbeliKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE) || (c==KeyEvent.VK_DELETE) || c=='.')){
            evt.consume();
        }
        if(c=='.' && txtbeli.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_txtbeliKeyTyped

    private void TmtjmlBayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TmtjmlBayarKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE) || (c==KeyEvent.VK_DELETE) || c=='.')){
            evt.consume();
        }
        if(c=='.' && TmtjmlBayar.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_TmtjmlBayarKeyTyped

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        int duit = Integer.parseInt(TmtjmlBayar.getText());
        int kembali = duit - bayar;
        
        
        txtkembalian.setText(""+kembali);
        
        ClassMIKACHU report = new ClassMIKACHU();
            report.sethasil("Terima Kasih Telah Mengunjungi Warung Kami \nSilakan Berkunjung Kembali");
        
            hasil.setText(""+report.gethasil());
    }//GEN-LAST:event_TotalActionPerformed

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
            java.util.logging.Logger.getLogger(MIKACHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MIKACHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MIKACHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MIKACHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MIKACHU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBNNamaMkn;
    private javax.swing.JTextField TmtjmlBayar;
    private javax.swing.JButton Total;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextArea hasil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JRadioButton rdbungkus;
    private javax.swing.JRadioButton rddisini;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtbeli;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkembalian;
    // End of variables declaration//GEN-END:variables
}
