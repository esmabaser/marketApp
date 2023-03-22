
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class Alisveris extends javax.swing.JFrame {

    /**
     * Creates new form Alisveris
     */   
        
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    
    public void MusteriSec(){
        try{
            String query="Select * from products";
            con=(java.sql.Connection) DriverManager.getConnection("jdbc:sqlite:C:\\Users\\lenovo\\OneDrive\\Belgeler\\NetBeans\\Apps\\marketApplication\\p4.db");
            st=(Statement) con.createStatement();
            rs=st.executeQuery(query);
            urunList.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
           e.printStackTrace();
        }
    }
    
    public Alisveris() {
        initComponents();
        con=(Connection) connect.connection();
        MusteriSec();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        m_BuyBtn = new javax.swing.JButton();
        m_isim = new javax.swing.JTextField();
        m_adet = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        urunList = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        m_clearbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bill = new javax.swing.JTextArea();
        genelTop = new javax.swing.JLabel();
        m_bitirBtn = new javax.swing.JButton();
        exitIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 197, 71));

        jPanel2.setBackground(new java.awt.Color(255, 234, 190));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setPreferredSize(new java.awt.Dimension(905, 555));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Ürün adı");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Ürün adedi");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("FATURA");

        m_BuyBtn.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        m_BuyBtn.setForeground(new java.awt.Color(153, 0, 0));
        m_BuyBtn.setText("SATIN AL");
        m_BuyBtn.setBorder(null);
        m_BuyBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_BuyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_BuyBtnMouseClicked(evt);
            }
        });

        m_isim.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        m_adet.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        urunList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        urunList.setForeground(new java.awt.Color(0, 153, 0));
        urunList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ÜRÜN", "ADET", "FİYAT", "KATEGORİ"
            }
        ));
        urunList.setRowHeight(20);
        urunList.setSelectionForeground(new java.awt.Color(255, 234, 190));
        urunList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urunListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(urunList);

        jLabel4.setFont(new java.awt.Font("Consolas", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(156, 93, 2));
        jLabel4.setText("ALIŞVERİŞ ve FATURA");

        jLabel5.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(127, 58, 14));
        jLabel5.setText("ÜRÜN LİSTESİ");

        m_clearbtn.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        m_clearbtn.setForeground(new java.awt.Color(153, 0, 0));
        m_clearbtn.setText("CLEAR");
        m_clearbtn.setBorder(null);
        m_clearbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_clearbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_clearbtnMouseClicked(evt);
            }
        });
        m_clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_clearbtnActionPerformed(evt);
            }
        });

        bill.setColumns(20);
        bill.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        bill.setRows(5);
        jScrollPane2.setViewportView(bill);

        genelTop.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N

        m_bitirBtn.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        m_bitirBtn.setForeground(new java.awt.Color(102, 102, 102));
        m_bitirBtn.setText("Alışverişi bitir");
        m_bitirBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_bitirBtnMouseClicked(evt);
            }
        });
        m_bitirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_bitirBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(m_adet, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(m_BuyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(m_clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(161, 337, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 176, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(m_isim, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel4)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genelTop, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_bitirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(genelTop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(m_bitirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m_isim, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_adet, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m_BuyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
        );

        exitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconlar/exitIcon.png"))); // NOI18N
        exitIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(exitIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exitIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    double price,toplam=0.0,genelToplam=0.0;
    int stok,yenistok,pID;
    int i=0;

    public void update(){
        int newStok;
        newStok=stok - Integer.valueOf(m_adet.getText());
        try{
            con=(Connection) DriverManager.getConnection("jdbc:sqlite:C:\\Users\\lenovo\\OneDrive\\Belgeler\\NetBeans\\Apps\\marketApplication\\p4.db");
            String q="Update products set adet=" +newStok+ "" + " where id=" + pID;
            Statement Add=con.createStatement();
            Add.executeUpdate(q);
            MusteriSec();
            Add.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    private void m_BuyBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_BuyBtnMouseClicked
           if(m_adet.getText().isEmpty()||m_isim.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "Eksik bilgi...");
           }
           else if(stok<=Integer.valueOf(m_adet.getText())){
               JOptionPane.showMessageDialog(null,"Yeterli stok yok!!!");
           }
           else{
                i++;
                toplam=price*Double.valueOf(m_adet.getText());
                genelToplam=genelToplam+toplam;
                if(i==1){
                    bill.setText(bill.getText()+"=======================SUPERMARKET========================\n"+"NUM\tPRODUCT\tPRİCE\tQUANTITY\tTOTAL\n"+i
                                 +"\t"+m_isim.getText()+"\t"+price+"\t"+m_adet.getText()+"\t"+toplam+"\n");
                }
                else{
                    bill.setText(bill.getText()+i+"\t"+m_isim.getText()+"\t"+price+"\t"+m_adet.getText()+"\t"+toplam+"\n");
                }
                genelTop.setText("GENEL TOPLAM: "+genelToplam+"TL");
                update();
           }
    }//GEN-LAST:event_m_BuyBtnMouseClicked

    private void urunListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urunListMouseClicked
        DefaultTableModel m=(DefaultTableModel)urunList.getModel();
        int Myindex=urunList.getSelectedRow();
        pID=Integer.valueOf(m.getValueAt(Myindex,0).toString());
        stok=Integer.valueOf(m.getValueAt(Myindex,2).toString());
        m_isim.setText(m.getValueAt(Myindex,1).toString());
        price=Double.valueOf(m.getValueAt(Myindex,3).toString());
    }//GEN-LAST:event_urunListMouseClicked

    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked
        this.setVisible(false);
        Login giris=new Login();
        giris.setVisible(true);
    }//GEN-LAST:event_exitIconMouseClicked

    private void m_clearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_clearbtnMouseClicked
        m_isim.setText("");
        m_adet.setText("");
    }//GEN-LAST:event_m_clearbtnMouseClicked

    private void m_clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_clearbtnActionPerformed
        // TODO add your handling code here:
        //boş
    }//GEN-LAST:event_m_clearbtnActionPerformed

    private void m_bitirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_bitirBtnActionPerformed
        // TODO add your handling code here:
        //boş
    }//GEN-LAST:event_m_bitirBtnActionPerformed

    private void m_bitirBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_bitirBtnMouseClicked
        try{
            bill.print();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_m_bitirBtnMouseClicked

        
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
            java.util.logging.Logger.getLogger(Alisveris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alisveris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alisveris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alisveris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alisveris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea bill;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JLabel genelTop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton m_BuyBtn;
    private javax.swing.JTextField m_adet;
    private javax.swing.JButton m_bitirBtn;
    private javax.swing.JButton m_clearbtn;
    private javax.swing.JTextField m_isim;
    private javax.swing.JTable urunList;
    // End of variables declaration//GEN-END:variables
}
