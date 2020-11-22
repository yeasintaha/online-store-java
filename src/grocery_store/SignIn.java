/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery_store;

import java.awt.Color;
import static java.awt.Color.white;
import java.awt.Frame;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class SignIn extends javax.swing.JFrame {

    /**
     * Creates new form SignIn
     */
    public SignIn() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        SignUp_label = new javax.swing.JLabel();
        SignIn_button = new javax.swing.JButton();
        Skip_label = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/online-shop.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Elephant", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Welcome to ");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 270, 50));

        jLabel5.setFont(new java.awt.Font("Elephant", 3, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vai Brothers Store ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 340, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 471, 680));

        jPanel2.setBackground(new java.awt.Color(255, 247, 243));

        jPanel4.setBackground(new java.awt.Color(255, 247, 243));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Sign In");

        Username.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameFocusLost(evt);
            }
        });
        Username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UsernameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UsernameMouseExited(evt);
            }
        });
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 102));
        jLabel4.setText("Username : ");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Password : ");

        Password.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        Password.setToolTipText("");
        Password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFocusLost(evt);
            }
        });
        Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PasswordMouseExited(evt);
            }
        });
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("Didn't have any account? ");

        SignUp_label.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        SignUp_label.setForeground(new java.awt.Color(255, 0, 51));
        SignUp_label.setText("Sign Up");
        SignUp_label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        SignUp_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUp_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUp_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignUp_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignUp_labelMouseExited(evt);
            }
        });

        SignIn_button.setBackground(new java.awt.Color(255, 0, 0));
        SignIn_button.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        SignIn_button.setForeground(new java.awt.Color(255, 255, 255));
        SignIn_button.setText("Sign In");
        SignIn_button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        SignIn_button.setBorderPainted(false);
        SignIn_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignIn_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignIn_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignIn_buttonMouseExited(evt);
            }
        });
        SignIn_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignIn_buttonActionPerformed(evt);
            }
        });

        Skip_label.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        Skip_label.setForeground(new java.awt.Color(255, 0, 51));
        Skip_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Skip_label.setText("Skip >>");
        Skip_label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        Skip_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Skip_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Skip_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Skip_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Skip_labelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Username)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password)
                            .addComponent(SignIn_button, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SignUp_label))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel2)))
                .addContainerGap(171, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Skip_label, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(276, 276, 276))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(SignIn_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(SignUp_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(Skip_label)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 630, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        
    }//GEN-LAST:event_UsernameActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void SignUp_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUp_labelMouseClicked
        new SignUp().setVisible(true);
        dispose();
    }//GEN-LAST:event_SignUp_labelMouseClicked

    private void SignUp_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUp_labelMouseEntered
        Border signup_border = BorderFactory.createMatteBorder(1,1,1,1,Color.blue);
        SignUp_label.setBorder(signup_border);    
    }//GEN-LAST:event_SignUp_labelMouseEntered

    private void SignUp_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUp_labelMouseExited
       Border signup_border = BorderFactory.createMatteBorder(0,0,1,0,Color.red);
       SignUp_label.setBorder(signup_border);  
    }//GEN-LAST:event_SignUp_labelMouseExited

    private void UsernameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsernameMouseEntered
       Border signup_border = BorderFactory.createMatteBorder(1,1,1,1,Color.blue);
       Username.setBorder(signup_border);  
    }//GEN-LAST:event_UsernameMouseEntered

    private void UsernameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsernameMouseExited
        Border signup_border = BorderFactory.createMatteBorder(0,0,1,0,Color.red);
        Username.setBorder(signup_border);  
    }//GEN-LAST:event_UsernameMouseExited

    private void PasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMouseEntered
       Border signup_border = BorderFactory.createMatteBorder(1,1,1,1,Color.blue);
       Password.setBorder(signup_border);
    }//GEN-LAST:event_PasswordMouseEntered

    private void PasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMouseExited
        Border signup_border = BorderFactory.createMatteBorder(0,0,1,0,Color.red);
        Password.setBorder(signup_border); 
    }//GEN-LAST:event_PasswordMouseExited

    private void SignIn_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignIn_buttonActionPerformed
        try{
            if(Username.getText().toLowerCase().trim().equals("admin") && Password.getText().trim().equals("admin123")){
                new Admin_Control_Option().setVisible(true);
                this.dispose();
            }
            else if(Username.getText().trim().equals("") && Password.getText().trim().equals("")){
                //JOptionPane.showMessageDialog(this, "Please fill up username and password!", "ERROR", JOptionPane.ERROR_MESSAGE);
                throw new LoginException("Please fill up username and password!");
            }
            else if(Username.getText().trim().equals("")){
                //JOptionPane.showMessageDialog(this, "Please fill up username!", "ERROR", JOptionPane.ERROR_MESSAGE);
                throw new LoginException("Please fill up username!");
            }
            else if(Password.getText().trim().equals("")){
                //JOptionPane.showMessageDialog(this, "Please fill up password!", "ERROR", JOptionPane.ERROR_MESSAGE);
                throw new LoginException("Please fill up password!");
            }
            else{
                int p = new Authentication().File_csv(Username.getText(), Password.getText());
                if(p==1){                
                    Items items = new Items(Username.getText().toLowerCase());
                    Grocery_Store store = new Grocery_Store();
                    Product_Details product_details = new Product_Details();
                    User_Information_Frame uif = new User_Information_Frame();

                    store.insertUsername(Username.getText().toLowerCase());
                    product_details.getName(Username.getText().toLowerCase());
                    items.getName(Username.getText().toLowerCase());
                    uif.getUName(Username.getText().toLowerCase());
                    items.setVisible(true);
                    dispose();
                }
                else{
                   JOptionPane.showMessageDialog(this, "Username or Password didn't match!", "ERROR", JOptionPane.ERROR_MESSAGE); 
                }
            }
        }
        catch(LoginException e){
            System.out.println("LOGIN ERROR");
        }

    }//GEN-LAST:event_SignIn_buttonActionPerformed

    private void SignIn_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignIn_buttonMouseEntered
        SignIn_button.setForeground(Color.white);
        SignIn_button.setBackground(Color.black); 
        SignIn_button.setBorderPainted(false);
        Border border = BorderFactory.createMatteBorder(1,1,1,1,Color.red);
        SignIn_button.setBorder(border);
    }//GEN-LAST:event_SignIn_buttonMouseEntered

    private void SignIn_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignIn_buttonMouseExited
        SignIn_button.setForeground(Color.white);
        SignIn_button.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_SignIn_buttonMouseExited

    private void SignIn_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignIn_buttonMouseClicked
        
          

    }//GEN-LAST:event_SignIn_buttonMouseClicked

    private void UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusGained
         Border border = BorderFactory.createMatteBorder(1,1,1,1,Color.blue);
         Username.setBorder(border);
    }//GEN-LAST:event_UsernameFocusGained

    private void UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusLost
         Border border = BorderFactory.createMatteBorder(0,0,1,0,Color.red);
         Username.setBorder(border);
    }//GEN-LAST:event_UsernameFocusLost

    private void PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusGained
         Border border = BorderFactory.createMatteBorder(1,1,1,1,Color.blue);
         Password.setBorder(border);
    }//GEN-LAST:event_PasswordFocusGained

    private void PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusLost
         Border border = BorderFactory.createMatteBorder(0,0,1,0,Color.red);
         Password.setBorder(border);
    }//GEN-LAST:event_PasswordFocusLost

    private void Skip_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Skip_labelMouseClicked
        new Items().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Skip_labelMouseClicked

    private void Skip_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Skip_labelMouseEntered
        Border border = BorderFactory.createMatteBorder(1,1,1,1,Color.blue);
        Skip_label.setBorder(border); 
    }//GEN-LAST:event_Skip_labelMouseEntered

    private void Skip_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Skip_labelMouseExited
        Border border = BorderFactory.createMatteBorder(0,0,1,0,Color.red);
        Skip_label.setBorder(border); 
    }//GEN-LAST:event_Skip_labelMouseExited

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);                
            }
        });
    }
    
    class LoginException extends Exception {
        public LoginException(String msg) {
            JOptionPane.showMessageDialog(null,msg,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton SignIn_button;
    private javax.swing.JLabel SignUp_label;
    private javax.swing.JLabel Skip_label;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    // End of variables declaration//GEN-END:variables
}
