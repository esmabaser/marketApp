
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class Products extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    
    public void MusteriSec(){
        try{
            String query="Select * from products";
            con=(Connection) DriverManager.getConnection("jdbc:sqlite:C:\\Users\\lenovo\\OneDrive\\Belgeler\\NetBeans\\Apps\\marketApplication2\\supermarket2.db");
            st=con.createStatement();
            rs=st.executeQuery(query);
            urunList.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
           e.printStackTrace();
        }
    }
    
    public Products() {
        initComponents();
        con=(Connection) connect.connection();
        MusteriSec();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GoToProducts = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        m_eklebtn = new javax.swing.JButton();
        m_silbtn = new javax.swing.JButton();
        m_clearbtn = new javax.swing.JButton();
        m_guncellebtn = new javax.swing.JButton();
        m_id = new javax.swing.JTextField();
        m_isim = new javax.swing.JTextField();
        m_adet = new javax.swing.JTextField();
        m_fiyat = new javax.swing.JTextField();
        m_kategori = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        urunList = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        exitIcon = new javax.swing.JLabel();
        GoToCustomers = new javax.swing.JLabel();

        GoToProducts.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        GoToProducts.setText("MALZEME YÖNETİMİ");
        GoToProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoToProductsMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 197, 71));

        jPanel2.setBackground(new java.awt.Color(255, 234, 190));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setPreferredSize(new java.awt.Dimension(905, 555));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("SIRA");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ÜRÜN ADI");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("KATEGORİ");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("ADEDİ");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("FİYATI");

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

        m_guncellebtn.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        m_guncellebtn.setForeground(new java.awt.Color(153, 0, 51));
        m_guncellebtn.setText("GÜNCELLE");
        m_guncellebtn.setBorder(null);
        m_guncellebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_guncellebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_guncellebtnMouseClicked(evt);
            }
        });

        m_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        m_isim.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        m_adet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        m_fiyat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        m_kategori.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        m_kategori.setForeground(new java.awt.Color(102, 0, 204));
        m_kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İÇECEK", "ET/TAVUK", "SÜT VE SÜT ÜRÜNLERİ", "SEBZE", "MEYVE", "ATIŞTIRMALIK", "UNLU MAMÜLLER" }));
        m_kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_kategoriActionPerformed(evt);
            }
        });

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

        jLabel6.setFont(new java.awt.Font("Consolas", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(156, 93, 2));
        jLabel6.setText("ÜRÜN YÖNETİMİ");

        jLabel7.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(127, 58, 14));
        jLabel7.setText("ÜRÜN LİSTESİ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(m_id)
                            .addComponent(m_isim)
                            .addComponent(m_kategori, 0, 184, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(m_adet)
                            .addComponent(m_fiyat, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(m_eklebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(m_silbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(m_guncellebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(m_clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(151, 151, 151))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_adet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(m_id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m_isim, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(m_kategori)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m_clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(m_eklebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(m_silbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(m_guncellebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        exitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconlar/exitIcon.png"))); // NOI18N
        exitIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitIconMouseClicked(evt);
            }
        });

        GoToCustomers.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        GoToCustomers.setText("MÜŞTERİ YÖNETİMİ");
        GoToCustomers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GoToCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoToCustomersMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoToCustomers, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(GoToCustomers)
                        .addGap(28, 28, 28)
                        .addComponent(exitIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void m_clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_clearbtnActionPerformed
        // TODO add your handling code here:
        //boş
    }//GEN-LAST:event_m_clearbtnActionPerformed

    private void m_kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_kategoriActionPerformed
        // TODO add your handling code here:
        //boş
    }//GEN-LAST:event_m_kategoriActionPerformed

    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked
        this.setVisible(false);
        Login giris=new Login();
        giris.setVisible(true);
    }//GEN-LAST:event_exitIconMouseClicked

    private void m_eklebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_eklebtnMouseClicked
        String query="Insert into products (id,urunAdi,adet,fiyat,kategori) values(?,?,?,?,?)";
        if(m_id.getText().isEmpty()||m_isim.getText().isEmpty()||m_adet.getText().isEmpty()||m_fiyat.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Eksik bilgi girdiniz.");
        }
        else{               
            try{
                ps=con.prepareStatement(query);
                ps.setInt(1, Integer.valueOf(m_id.getText()));
                ps.setString(2, m_isim.getText());
                ps.setInt(3, Integer.valueOf(m_adet.getText()));
                ps.setInt(4, Integer.valueOf(m_fiyat.getText()));
                ps.setString(5, m_kategori.getSelectedItem().toString());            
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

    private void m_clearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_clearbtnMouseClicked
        m_id.setText("");
        m_isim.setText("");
        m_adet.setText("");
        m_fiyat.setText("");
    }//GEN-LAST:event_m_clearbtnMouseClicked

    private void m_silbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_silbtnMouseClicked
        if(m_id.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Silinecek ürünü seçin");
        }
        else{
            try{
                con=(Connection) DriverManager.getConnection("jdbc:sqlite:C:\\Users\\lenovo\\OneDrive\\Belgeler\\NetBeans\\Apps\\marketApplication2\\supermarket2.db");
                String id=m_id.getText();
                String q="Delete from products where id="+id;
                Statement add=con.createStatement();
                add.execute(q);
                JOptionPane.showMessageDialog(null,"Ürün silindi.");
                MusteriSec();
                add.close();
            }
            catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Ürün silinemedi!!!");
            }
        }
    }//GEN-LAST:event_m_silbtnMouseClicked

    private void urunListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urunListMouseClicked
        DefaultTableModel m=(DefaultTableModel)urunList.getModel();
        int Myindex=urunList.getSelectedRow();
        m_id.setText(m.getValueAt(Myindex,0).toString());
        m_isim.setText(m.getValueAt(Myindex,1).toString());
        m_adet.setText(m.getValueAt(Myindex,2).toString());
        m_fiyat.setText(m.getValueAt(Myindex,3).toString());
    }//GEN-LAST:event_urunListMouseClicked

    private void m_guncellebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_guncellebtnMouseClicked
        if(m_id.getText().isEmpty()||m_isim.getText().isEmpty()||m_adet.getText().isEmpty()||m_fiyat.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Eksik bilgi.");
        }
        else{
            try{
                con=(Connection) DriverManager.getConnection("jdbc:sqlite:C:\\Users\\lenovo\\OneDrive\\Belgeler\\NetBeans\\Apps\\marketApplication2\\supermarket2.db");
                String q="Update products set urunAdi='"+m_isim.getText()+"'"+",adet='"+m_adet.getText()+"'"+",fiyat='"+m_fiyat.getText()+"'"
                        +",kategori='"+m_kategori.getSelectedItem().toString()+"'"+"where id="+m_id.getText();
                Statement Add=con.createStatement();
                Add.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Güncelleme başarılı.");
                MusteriSec();
                Add.close();
            }
            catch(SQLException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Güncelleme başarısız!!!");
            }
        }
    }//GEN-LAST:event_m_guncellebtnMouseClicked

    private void GoToProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoToProductsMouseClicked
        
    }//GEN-LAST:event_GoToProductsMouseClicked

    private void GoToCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoToCustomersMouseClicked
        this.setVisible(false);
        Müsteriler m=new Müsteriler();
        m.setVisible(true);
    }//GEN-LAST:event_GoToCustomersMouseClicked

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GoToCustomers;
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
    private javax.swing.JTextField m_adet;
    private javax.swing.JButton m_clearbtn;
    private javax.swing.JButton m_eklebtn;
    private javax.swing.JTextField m_fiyat;
    private javax.swing.JButton m_guncellebtn;
    private javax.swing.JTextField m_id;
    private javax.swing.JTextField m_isim;
    private javax.swing.JComboBox<String> m_kategori;
    private javax.swing.JButton m_silbtn;
    private javax.swing.JTable urunList;
    // End of variables declaration//GEN-END:variables
}
