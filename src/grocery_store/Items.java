   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery_store;


import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;


public final class Items extends javax.swing.JFrame {


    public Items() { 
        setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));      
        initComponents();
        Display();

    }
    
    public Items(String name){
        Username = name;
        setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));      
        initComponents();
        Display();
        getName(Username);

    }
    

    public void getName(String name) {
        if(name==null)username_label.setText("Guest");
        else{ 
            char name_array[] = name.toCharArray();
            name_array[0] = Character.toUpperCase(name_array[0]);
            Username = String.valueOf(name_array);
            username_label.setText(Username);
        }
        if(Username==null){
            SignIn_Out.setText("Sign In");
        }
        else{
            SignIn_Out.setText("Sign Out");
        }
    }
    public String getUsername(){
        return Username;
    }
    
//    public int getProductID(int id){
//        return id;
//    }
//    public int getProductCount(int count){
//        return count ;
//    }
    

    public void  Display(){
        getName(Username);
        ImageIcon cart = new ImageIcon(new ImageIcon(getClass().getResource("/images/add_to_cart.png")).getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        add_to_cart_label.setIcon(cart);
        GridBagConstraints gb = new GridBagConstraints(); 
        gb.insets = new Insets(15,15,15,15);
        int p=0; 
        try{
            FileReader filereader = new FileReader("Items.csv");
            CSVReader reader = new CSVReaderBuilder(filereader).withSkipLines(1).build();  
            List<String[]> Items = reader.readAll();

            int x=0,y=0;  
            int ID =1;
            for(String[] item:Items){               
                Item item_obj = new Item(ID);
                ImageIcon img = new ImageIcon(new ImageIcon(getClass().getResource(item[0])).getImage().getScaledInstance(145, 165, Image.SCALE_DEFAULT));
                item_obj.setImage(img);
                item_obj.setProductName(item[1]);
                item_obj.setUnit(item[2]);
                item_obj.setPrice("Tk " + item[3]);
                main_panel.add(item_obj,gb);
                x++;
                if(x==4){
                    x=0;
                    y++;
                }
                gb.gridx=x;
                gb.gridy=y;
                ID++;
            } 
        }
        catch(IOException e){
            e.printStackTrace(); 
        }
        catch(CsvException e){
            e.printStackTrace();
        }        
    }
    
    public void showDisplay(boolean clicked){
        if(clicked == true) this.setVisible(true);        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        header_label = new javax.swing.JLabel();
        add_to_cart_label = new javax.swing.JLabel();
        SignIn_Out = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        Order_2 = new javax.swing.JLabel();
        Order_1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        main_panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 247, 243));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        header_label.setFont(new java.awt.Font("Elephant", 2, 14)); // NOI18N
        header_label.setForeground(new java.awt.Color(255, 255, 255));
        header_label.setText("Vai  Brothers  Store ");
        header_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        add_to_cart_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_to_cart_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_to_cart_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_to_cart_labelMouseClicked(evt);
            }
        });

        SignIn_Out.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        SignIn_Out.setForeground(new java.awt.Color(255, 255, 255));
        SignIn_Out.setText("Sign Out");
        SignIn_Out.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignIn_Out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignIn_OutMouseClicked(evt);
            }
        });
        SignIn_Out.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                SignIn_OutComponentShown(evt);
            }
        });

        username_label.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        username_label.setForeground(new java.awt.Color(255, 255, 255));
        username_label.setText("Guest");
        username_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        username_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                username_labelMouseClicked(evt);
            }
        });
        username_label.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                username_labelComponentShown(evt);
            }
        });

        Order_2.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        Order_2.setForeground(new java.awt.Color(255, 255, 255));
        Order_2.setText("Order");
        Order_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Order_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Order_2MouseClicked(evt);
            }
        });
        Order_2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                Order_2ComponentShown(evt);
            }
        });

        Order_1.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        Order_1.setForeground(new java.awt.Color(255, 255, 255));
        Order_1.setText("Details");
        Order_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Order_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Order_1MouseClicked(evt);
            }
        });
        Order_1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                Order_1ComponentShown(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(header_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(username_label)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Order_2)
                    .addComponent(Order_1))
                .addGap(43, 43, 43)
                .addComponent(SignIn_Out)
                .addGap(18, 18, 18)
                .addComponent(add_to_cart_label, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Order_2)
                                .addGap(0, 0, 0)
                                .addComponent(Order_1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(header_label, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SignIn_Out, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(add_to_cart_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        main_panel.setBackground(new java.awt.Color(255, 247, 243));
        main_panel.setMinimumSize(new java.awt.Dimension(1200, 800));
        main_panel.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(main_panel);

        jPanel2.setBackground(new java.awt.Color(255, 247, 243));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Contact Us");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 51, 51)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 301, 0, 0);
        jPanel2.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("01674455123");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 18, 0, 0);
        jPanel2.add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("vaibrothers@gmail.com");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 608);
        jPanel2.add(jLabel11, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Vai Brothers Store");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 48, 0);
        jPanel2.add(jLabel13, gridBagConstraints);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/call.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 136, 0, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/facebook-logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 136, 48, 0);
        jPanel2.add(jLabel5, gridBagConstraints);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gmail.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 136, 0, 0);
        jPanel2.add(jLabel6, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username_labelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_username_labelComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_username_labelComponentShown

    private void username_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_labelMouseClicked
        if(username_label.getText().toLowerCase().equals("admin")){
            new Admin_Control_Option().setVisible(true);
        }
        else if(username_label.getText().toLowerCase().equals("guest")){
            JOptionPane.showMessageDialog(null, "You cannot see user information without login", "Login First", JOptionPane.ERROR_MESSAGE);
        }
        else{
            new User_Information_Frame().setVisible(true);
            this.setVisible(false); 
        }
        
    }//GEN-LAST:event_username_labelMouseClicked

    private void SignIn_OutComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_SignIn_OutComponentShown

    }//GEN-LAST:event_SignIn_OutComponentShown

    private void SignIn_OutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignIn_OutMouseClicked
        if(Username==null){
            new SignIn().setVisible(true);
            this.dispose();
        }
        else{
            new Items().setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_SignIn_OutMouseClicked

    private void add_to_cart_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_to_cart_labelMouseClicked
        //this.setVisible(false);
        if(username_label.getText().toLowerCase().equals("admin")){
            JOptionPane.showMessageDialog(null, "Admin cannot buy products ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(Username==null)  JOptionPane.showMessageDialog(null, "You cannot order without login", "Login First", JOptionPane.ERROR_MESSAGE);
        else  new Checkout_Items(Username).setVisible(true);
    }//GEN-LAST:event_add_to_cart_labelMouseClicked

    private void Order_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Order_2MouseClicked
        if(username_label.getText().toLowerCase().equals("admin")){
            JOptionPane.showMessageDialog(null, "Admin Cannot see order details ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(username_label.getText().toLowerCase().equals("guest")){
            JOptionPane.showMessageDialog(null, "You cannot see order details without login", "Login First", JOptionPane.ERROR_MESSAGE);
        }
        else{
            new Product_Details().setVisible(true);
            this.dispose(); 
        }
    }//GEN-LAST:event_Order_2MouseClicked

    private void Order_2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Order_2ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_Order_2ComponentShown

    private void Order_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Order_1MouseClicked
       if(username_label.getText().toLowerCase().equals("admin")){
            JOptionPane.showMessageDialog(null, "Admin Cannot see order details ", "Error", JOptionPane.ERROR_MESSAGE);
       }
        else if(username_label.getText().toLowerCase().equals("guest")){
            JOptionPane.showMessageDialog(null, "You cannot see order details without login", "Login First", JOptionPane.ERROR_MESSAGE);
        }
        else{
            new Product_Details().setVisible(true);
            this.dispose(); 
        }
    }//GEN-LAST:event_Order_1MouseClicked

    private void Order_1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Order_1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_Order_1ComponentShown

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
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

            
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {  
                new Items().setVisible(true);
            }
        });
    }
    public JLabel getUsernameLabel(){
        return SignIn_Out;
    }
    private String Username;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Order_1;
    private javax.swing.JLabel Order_2;
    private javax.swing.JLabel SignIn_Out;
    private javax.swing.JLabel add_to_cart_label;
    private javax.swing.JLabel header_label;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel main_panel;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables

}
