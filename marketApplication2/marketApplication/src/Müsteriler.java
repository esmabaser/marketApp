
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class Müsteriler extends javax.swing.JFrame {

    /**
     * Creates new form Müsteriler
     */
    Connection con=null;
    PreparedStatement ps=null;
    Statement st=null;
    ResultSet rs=null;
    
    public void MusteriSec(){
        try{
            String query="Select * from MusteriList";
            con=(Connection) DriverManager.getConnection("jdbc:sqlite:C:\\Users\\lenovo\\OneDrive\\Belgeler\\NetBeans\\Apps\\marketApplication\\supermarket2.DB");
            st=con.createStatement();
            rs=st.executeQuery(query);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
           e.printStackTrace();
        }
    }
    
    public Müsteriler() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        m_id = new javax.swing.JTextField();
        m_isim = new javax.swing.JTextField();
        m_sifre = new javax.swing.JTextField();
        m_cinsiyet = new javax.swing.JComboBox<>();
        m_eklebtn = new javax.swing.JButton();
        m_silbtn = new javax.swing.JButton();
        m_guncellebtn = new javax.swing.JButton();
        m_clearbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        GoToProducts = new javax.swing.JLabel();
        exitIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 197, 71));

        jPanel2.setBackground(new java.awt.Color(255, 234, 190));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(156, 93, 2));
        jLabel1.setText("MÜŞTERİ EKLE/ÇIKAR");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("SIRA:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("İSİM:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("ŞİFRE:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("CİNSİYET:");

        m_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        m_isim.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        m_sifre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        m_cinsiyet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        m_cinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KADIN", "ERKEK", " " }));

        m_eklebtn.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        m_eklebtn.setForeground(new java.awt.Color(153, 0, 0));
        m_eklebtn.setText("EKLE");
        m_eklebtn.setBorder(null);
        m_eklebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_eklebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_eklebtnMouseClicked(evt);
            }
        });

        m_silbtn.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        m_silbtn.setForeground(new java.awt.Color(153, 0, 0));
        m_silbtn.setText("SİL");
        m_silbtn.setBorder(null);
        m_silbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_silbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_silbtnMouseClicked(evt);
            }
        });

        m_guncellebtn.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        m_guncellebtn.setForeground(new java.awt.Color(153, 0, 0));
        m_guncellebtn.setText("GÜNCELLE");
        m_guncellebtn.setBorder(null);
        m_guncellebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_guncellebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_guncellebtnMouseClicked(evt);
            }
        });

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

        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(156, 93, 2));
        jLabel6.setText("MÜŞTERİ LİSTESİ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "İSİM", "ŞİFRE", "CİNSİYET"
            }
        ));
        jTable1.setRowHeight(20);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(m_id, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(m_isim))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(m_eklebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(m_silbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76)
                                        .addComponent(m_guncellebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(m_clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(m_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m_cinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(113, 113, 113))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_isim, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_cinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_eklebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_silbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_guncellebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        GoToProducts.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        GoToProducts.setText("MALZEME YÖNETİMİ");
        GoToProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GoToProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoToProductsMouseClicked(evt);
            }
        });

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
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GoToProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exitIcon)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GoToProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitIcon)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void m_eklebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_eklebtnMouseClicked
        String query = "Insert into MusteriList (id,isim,sifre,cinsiyet) values (?,?,?,?)";
        DefaultTableModel m=(DefaultTableModel)jTable1.getModel();
        if(m_id.getText().isEmpty()||m_isim.getText().isEmpty()||m_sifre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Eksik bilgi girdiniz.");
        }
        else{               
            try{
                ps=con.prepareStatement(query);
                ps.setInt(1, Integer.valueOf(m_id.getText()));
                ps.setString(2, m_isim.getText());
                ps.setString(3, m_sifre.getText());
                ps.setString(4, m_cinsiyet.getSelectedItem().toString());            
                ps.execute();
                JOptionPane.showMessageDialog(null, "Ekleme başarılı");
                MusteriSec();
                ps.close();
            }
            catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Ekleme başarısız");
            }                              
        }
    }//GEN-LAST:event_m_eklebtnMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel m=(DefaultTableModel)jTable1.getModel();
        int Myindex=jTable1.getSelectedRow();
        m_id.setText(m.getValueAt(Myindex,0).toString());
        m_isim.setText(m.getValueAt(Myindex,1).toString());
        m_sifre.setText(m.getValueAt(Myindex,2).toString());       
    }//GEN-LAST:event_jTable1MouseClicked

    private void m_clearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_clearbtnMouseClicked
        m_id.setText("");
        m_isim.setText("");
        m_sifre.setText("");  
    }//GEN-LAST:event_m_clearbtnMouseClicked

    private void m_silbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_silbtnMouseClicked
        if(m_id.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Silinecek müşteriyi seçin");
        }
        else{
            try{
                //con=(Connection) DriverManager.getConnection("jdbc:sqlite:C:\\Users\\lenovo\\OneDrive\\Belgeler\\NetBeans\\Apps\\marketApplication\\supermarket2.DB");
                String id=m_id.getText();
                String q="Delete from MusteriList where id="+id;
                Statement add=con.createStatement();
                add.execute(q);
                JOptionPane.showMessageDialog(null,"Müşteri silindi.");
                MusteriSec();  
                add.close();
            }
            catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Müşteri silinemedi!!!");
            }
        }
    }//GEN-LAST:event_m_silbtnMouseClicked

    private void m_guncellebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_guncellebtnMouseClicked
        if(m_id.getText().isEmpty()||m_isim.getText().isEmpty()||m_sifre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Eksik bilgi.");
        }
        else{
            try{
                //con=(Connection) DriverManager.getConnection("jdbc:sqlite:C:\\Users\\lenovo\\OneDrive\\Belgeler\\NetBeans\\Apps\\marketApplication\\supermarket2.db");
                String q="Update MusteriList set isim='"+m_isim.getText()+"'"+",sifre='"+m_sifre.getText()+"'"+",cinsiyet='"+m_cinsiyet.getSelectedItem().toString()+"'"+
                        "where id="+m_id.getText();
                Statement Add=con.createStatement();
                Add.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Güncelleme başarılı.");
                MusteriSec();
                Add.close();
            }
            catch(SQLException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Güncelleme başarısız!!!!");
            }
        }
    }//GEN-LAST:event_m_guncellebtnMouseClicked

    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked
        this.setVisible(false);
        Login giris=new Login();
        giris.setVisible(true);
    }//GEN-LAST:event_exitIconMouseClicked

    private void GoToProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoToProductsMouseClicked
        this.setVisible(false);
        Products p=new Products();
        p.setVisible(true);
    }//GEN-LAST:event_GoToProductsMouseClicked

    
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
            java.util.logging.Logger.getLogger(Müsteriler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Müsteriler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Müsteriler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Müsteriler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Müsteriler().setVisible(true);
        });
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GoToProducts;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> m_cinsiyet;
    private javax.swing.JButton m_clearbtn;
    private javax.swing.JButton m_eklebtn;
    private javax.swing.JButton m_guncellebtn;
    private javax.swing.JTextField m_id;
    private javax.swing.JTextField m_isim;
    private javax.swing.JTextField m_sifre;
    private javax.swing.JButton m_silbtn;
    // End of variables declaration//GEN-END:variables
}
