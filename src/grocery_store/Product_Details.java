/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery_store;

import static grocery_store.Grocery_Store.All_user_order_details;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Win-10
 */
public class Product_Details extends javax.swing.JFrame {

    /**
     * Creates new form Product_Details
     */
    public Product_Details() {
        setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));   
        initComponents();
        Display();
        pack();
    }
    public Product_Details(String name){
        this.Username = name;
        setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));   
        initComponents();
        Display();
        pack();
    }
    
    private static String Username;
    private static String U_name;
    public void getName(String name) {
        Username = name;
        if(name==null)username_label1.setText("Guest");
        else{ 
            String temp_name;
            char name_array[] = name.toCharArray();
            name_array[0] = Character.toUpperCase(name_array[0]);
            temp_name = String.valueOf(name_array);
            username_label1.setText(temp_name);
            U_name = temp_name;
        }
        if(Username==null){
            SignIn_Out.setText("Sign In");
        }
        else{
            SignIn_Out.setText("Sign Out");
        }
    }
    
    public static ArrayList<String[]> all_user_order_details = new Grocery_Store().getAllUserOrderDetails();
    public void Display(){
        Checkout_Items checkout_items = new Checkout_Items();
        ArrayList<String> product_price = checkout_items.getProductPrice();
        ArrayList<String> product_image = checkout_items.getProductImage();
        ArrayList<String> product_unit = checkout_items.getProductUnit();
        ArrayList<String> product_name = checkout_items.getProductName();
        getName(Username);
        ImageIcon cart = new ImageIcon(new ImageIcon(getClass().getResource("/images/add_to_cart.png")).getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        add_to_cart_label1.setIcon(cart);
        
        
        System.out.println("Username " + Username + "\n");
        System.out.println("all_user_order_details " + all_user_order_details.size() + "\n");

        ArrayList<Integer> buy_times = new ArrayList<Integer>();
        for(int i=0;i<all_user_order_details.size();i++){
            for(String s: all_user_order_details.get(i)){
                if(Username!=null){
                    if(s.equals(Username.toLowerCase())){
                        buy_times.add(i);
                        System.out.println("add plz ");
                    }
                }
           }
        }
        
        System.out.println("\n These are the products that you've bought ");
        System.out.println("Buy tims  " + buy_times.size());
        for(int i=0;i<buy_times.size();i++){
            int first=-2;
            for(String s : all_user_order_details.get(buy_times.get(i))){
                System.out.print(" " + s  + " ");
                if(first>=0){
                    System.out.print(product_name.get(first) + " ");
                    System.out.print(product_price.get(first)+" ");
                    System.out.print(product_unit.get(first)+" \n");
                }
                first++;
            }
        }
        GridBagConstraints gb = new GridBagConstraints();
        gb.insets = new Insets(15,15,15,15);
        int y=0;
        gb.gridx=0;
        gb.gridy=y;
        y++;
        System.out.println("Buy times  " + buy_times.size());
        for(int i=0;i<buy_times.size();i++){
            Product_Detail product_detail = new Product_Detail(buy_times.get(i));
            product_detail.setTotalCost("Total Cost : " + all_user_order_details.get(buy_times.get(i))[1]);
            int first =-2;
            int product_count=0;
            int quantity =0;
            for(String items : all_user_order_details.get(buy_times.get(i))){
                first++;
                if(first > 0 ){
                    if(Integer.valueOf(items) > 0){
                        product_count++;
                        quantity += Integer.valueOf(items);
                    }
                }
            }
            product_detail.setProductCount(String.valueOf("Total Products : " + product_count));
            product_detail.setQuantity(String.valueOf("Quantity : "+quantity));
            Main_Panel.add(product_detail,gb);
            gb.gridx = 0;
            gb.gridy = y;
            y++;
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

        Header_Panel = new javax.swing.JPanel();
        header_label1 = new javax.swing.JLabel();
        add_to_cart_label1 = new javax.swing.JLabel();
        username_label1 = new javax.swing.JLabel();
        SignIn_Out = new javax.swing.JLabel();
        Order_1 = new javax.swing.JLabel();
        Order_2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Main_Panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header_Panel.setBackground(new java.awt.Color(102, 102, 102));

        header_label1.setFont(new java.awt.Font("Elephant", 2, 14)); // NOI18N
        header_label1.setForeground(new java.awt.Color(255, 255, 255));
        header_label1.setText("Vai  Brothers  Store ");
        header_label1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        header_label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                header_label1MouseClicked(evt);
            }
        });

        add_to_cart_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_to_cart_label1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_to_cart_label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_to_cart_label1MouseClicked(evt);
            }
        });

        username_label1.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        username_label1.setForeground(new java.awt.Color(255, 255, 255));
        username_label1.setText("Guest");
        username_label1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        username_label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                username_label1MouseClicked(evt);
            }
        });
        username_label1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                username_label1ComponentShown(evt);
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

        javax.swing.GroupLayout Header_PanelLayout = new javax.swing.GroupLayout(Header_Panel);
        Header_Panel.setLayout(Header_PanelLayout);
        Header_PanelLayout.setHorizontalGroup(
            Header_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header_PanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(header_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 777, Short.MAX_VALUE)
                .addComponent(username_label1)
                .addGap(40, 40, 40)
                .addGroup(Header_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Order_2)
                    .addComponent(Order_1))
                .addGap(48, 48, 48)
                .addComponent(SignIn_Out)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(add_to_cart_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        Header_PanelLayout.setVerticalGroup(
            Header_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Header_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Header_PanelLayout.createSequentialGroup()
                        .addComponent(Order_2)
                        .addGap(0, 0, 0)
                        .addComponent(Order_1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Header_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(add_to_cart_label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Header_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(header_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SignIn_Out, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Main_Panel.setBackground(new java.awt.Color(255, 247, 243));
        Main_Panel.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(Main_Panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_to_cart_label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_to_cart_label1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_add_to_cart_label1MouseClicked

    private void username_label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_label1MouseClicked
        new User_Information_Frame().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_username_label1MouseClicked

    private void username_label1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_username_label1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_username_label1ComponentShown

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

    private void SignIn_OutComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_SignIn_OutComponentShown

    }//GEN-LAST:event_SignIn_OutComponentShown

    private void Order_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Order_1MouseClicked
        new Product_Details().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Order_1MouseClicked

    private void Order_1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Order_1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_Order_1ComponentShown

    private void Order_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Order_2MouseClicked
        new Product_Details().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Order_2MouseClicked

    private void Order_2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Order_2ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_Order_2ComponentShown

    private void header_label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_label1MouseClicked
        new Items(username_label1.getText().toLowerCase()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_header_label1MouseClicked

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
            java.util.logging.Logger.getLogger(Product_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header_Panel;
    private javax.swing.JPanel Main_Panel;
    private javax.swing.JLabel Order_1;
    private javax.swing.JLabel Order_2;
    private javax.swing.JLabel SignIn_Out;
    private javax.swing.JLabel add_to_cart_label1;
    private javax.swing.JLabel header_label1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel username_label1;
    // End of variables declaration//GEN-END:variables
}
