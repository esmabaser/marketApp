/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    Connection con=null;
    PreparedStatement ps=null;
    Statement st=null;
    ResultSet rs=null;
    
    public Login() {
        initComponents();
        con=(Connection) connect.connection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        m_Role = new javax.swing.JComboBox<>();
        m_isim = new javax.swing.JTextField();
        m_LogInBtn = new javax.swing.JButton();
        m_clearBtn = new javax.swing.JButton();
        m_psw = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 197, 71));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        jLabel1.setText("SUPERMARKET");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Belgeler\\NetBeans\\Apps\\marketApplication\\sepet8.jpg")); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 197, 71));
        jLabel3.setText("LOGIN SCREEN");

        jLabel4.setFont(new java.awt.Font("Cambria", 3, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 197, 71));
        jLabel4.setText("İSİM:");

        jLabel5.setFont(new java.awt.Font("Cambria", 3, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 197, 71));
        jLabel5.setText("ŞİFRE:");

        jLabel6.setFont(new java.awt.Font("Cambria", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 197, 71));
        jLabel6.setText("SEÇİNİZ:");

        m_Role.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        m_Role.setForeground(new java.awt.Color(153, 0, 0));
        m_Role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YÖNETİCİ", "MÜŞTERİ", " " }));

        m_isim.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        m_isim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_isimActionPerformed(evt);
            }
        });

        m_LogInBtn.setBackground(new java.awt.Color(255, 197, 71));
        m_LogInBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        m_LogInBtn.setText("LOGİN");
        m_LogInBtn.setBorder(null);
        m_LogInBtn.setBorderPainted(false);
        m_LogInBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_LogInBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_LogInBtnMouseClicked(evt);
            }
        });

        m_clearBtn.setBackground(new java.awt.Color(255, 197, 71));
        m_clearBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        m_clearBtn.setText("CLEAR");
        m_clearBtn.setBorder(null);
        m_clearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(m_LogInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(m_clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(m_isim)
                                    .addComponent(m_Role, 0, 282, Short.MAX_VALUE)
                                    .addComponent(m_psw))))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(89, 89, 89))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel3)
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(m_Role, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(m_isim))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_psw, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(m_LogInBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m_clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void m_isimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_isimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_isimActionPerformed

    private void m_clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_clearBtnActionPerformed
        m_isim.setText("");
        m_psw.setText("");
    }//GEN-LAST:event_m_clearBtnActionPerformed

    private void m_LogInBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_LogInBtnMouseClicked
        if(m_Role.getSelectedItem().toString().equals("MÜŞTERİ")){
            System.out.println("role müşteri if");
            try{
                String ad=m_isim.getText();
                String Sifre=String.valueOf(m_psw.getText());
                String sql="Select * from MusteriList where isim= '"+ad+"' and sifre='"+Sifre+"'";
                st=con.createStatement();
                rs=st.executeQuery(sql);
                if(rs.next()){
                    this.setVisible(false);
                    Alisveris a=new Alisveris();
                    a.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"YANLIŞ İSİM YA DA ŞİFRE");
                    }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            System.out.println("role admin");
            String ad="Esma";
            String Sifre="1207";
            String m_ad=m_isim.getText();
            String m_Sifre=String.valueOf(m_psw.getPassword());
            if(m_ad.equals(ad) && m_Sifre.equals(Sifre)){
                this.setVisible(false);
                chooseForm cf=new chooseForm();
                cf.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"YANLIŞ İSİM YA DA ŞİFRE");
            }
        }
    }//GEN-LAST:event_m_LogInBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton m_LogInBtn;
    private javax.swing.JComboBox<String> m_Role;
    private javax.swing.JButton m_clearBtn;
    private javax.swing.JTextField m_isim;
    private javax.swing.JPasswordField m_psw;
    // End of variables declaration//GEN-END:variables
}
