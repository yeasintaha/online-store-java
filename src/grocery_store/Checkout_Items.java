/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery_store;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import javax.swing.border.Border;


class Information{
    String image;
    String product_name;
    String unit;  
    String price;
    String product_id;    
}


public class Checkout_Items extends javax.swing.JFrame {

    public static ArrayList<String> product_price= new ArrayList<>();    
    public static ArrayList<String> product_name= new ArrayList<>();    
    public static ArrayList<String> product_unit= new ArrayList<>();    
    public static ArrayList<String> product_image= new ArrayList<>();    

    ArrayList<Information> All_info = new ArrayList<>();
    private String Username;
    public Checkout_Items() {
        initComponents();  
        Display();
        pack();
    }
    public Checkout_Items(String name){
        this.Username = name;
        initComponents();  
        Display();
        pack();
    }
    
    public ArrayList getProductPrice(){
        return product_price;
    }
    
    public ArrayList getProductImage(){
        return product_image;
    }
    public ArrayList getProductUnit(){
        return product_unit;
    }
    public ArrayList getProductName(){
        return product_name;
    }
    
    
    
    Grocery_Store Store = new Grocery_Store();
    Checkout_Total_Price checkout_total_price = Store.checkout_total_price;
    
    public void Display(){  
        ImageIcon cart = new ImageIcon(new ImageIcon(getClass().getResource("/images/add_to_cart.png")).getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        System.out.println("username " + Username);
        
        if(Username==null)  username_label.setText("Guest");
        else username_label.setText(Username);
        
        if(Username==null)  SignIn_Out.setText("Sign In");
        else  SignIn_Out.setText("Sign Out");
        
        add_to_cart_label.setIcon(cart);
        
        GridBagConstraints gb = new GridBagConstraints();
        int y=0;
        gb.insets = new Insets(10,10,10,10);
        gb.gridx=0;
        gb.gridy=0;

        
        int total =0;
        try{      
            FileReader filereader = new FileReader("Items.csv");
            CSVReader reader = new CSVReaderBuilder(filereader).withSkipLines(1).build(); 
            List<String[]> Items = reader.readAll();
             
            for(String[] item : Items){            
                Information info = new Information();
                info.image = (item[0]);
                info.product_name = item[1];
                info.unit = item[2];
                info.price = item[3];
                info.product_id = item[4];                        
                All_info.add(info);
                product_price.add(item[3]);
                product_name.add(item[1]);
                product_image.add(item[0]);
                product_unit.add(item[2]);
            }
            
            JLabel checkout_Label = new JLabel();
            checkout_Label.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
            checkout_Label.setForeground(new java.awt.Color(255, 0, 51));
            checkout_Label.setText("Checkout");
            checkout_Label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new  java.awt.Color(255, 0, 51)));
            main_panel.add(checkout_Label,gb);
            y++;
            gb.gridx =0;
            gb.gridy =y;
            
            filereader = new FileReader("Buy.csv");
            reader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
            String[] Buy = reader.readNext();
            
            int p=0;
            for(String buy : Buy){
                if(!buy.equals("") && p!=0){
                    if(Integer.valueOf(buy)>0){ 
                        for(int i=0;i<All_info.size();i++){
                            if(All_info.get(i).product_id.equals(Integer.toString(p-1))){
                                System.out.println(" p checkout_items " + p);                                
                                Checkout_Item item_obj = new Checkout_Item();
                                ImageIcon img = new ImageIcon( new ImageIcon(getClass().getResource(All_info.get(i).image)).getImage().getScaledInstance(125, 145, Image.SCALE_DEFAULT));
                                item_obj.setImage(img);
                                item_obj.setProductName(All_info.get(i).product_name);
                                item_obj.setUnit(All_info.get(i).unit);
                                item_obj.setPrice(All_info.get(i).price);
                                item_obj.setQuantity(buy);
                                item_obj.setTotalPrice(Integer.toString(Integer.valueOf(All_info.get(i).price)*Integer.valueOf(buy)));
                                item_obj.getID(Integer.valueOf(All_info.get(i).product_id));
                                
                                total += Integer.valueOf(All_info.get(i).price)*Integer.valueOf(buy);
                                main_panel.add(item_obj,gb);                              
                              //  main_panel.add(item_obj, gb);
                                y++;  
                                gb.gridx=0;
                                gb.gridy=y;
                            }
                        }
                    }
                }              
                p++; 
            }
           // username_label.setText(Buy[0].toUpperCase());
            int Delivery_cost = 50;
            checkout_total_price.setTotalPrice(String.valueOf(total));
            checkout_total_price.setVatPrice(String.valueOf(total * 0.05));
            checkout_total_price.setDeliveryPrice(String.valueOf(Delivery_cost));
            checkout_total_price.setFinalPrice(String.valueOf( total + total*0.05 + Delivery_cost));
            
            
            main_panel.add(checkout_total_price,gb);
            y++;
            gb.gridx=0;
            gb.gridy=y;
                
            JButton Checkout_Button = new JButton();

            Checkout_Button.setBackground(new java.awt.Color(255, 0, 0));
            Checkout_Button.setFont(new java.awt.Font("Verdana", 1, 14));
            Checkout_Button.setForeground(new java.awt.Color(255, 255, 255));
            Checkout_Button.setText("Checkout");
            Checkout_Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
            Checkout_Button.setBorderPainted(false);
            Checkout_Button.setMaximumSize(new java.awt.Dimension(300, 20));
            Checkout_Button.setMinimumSize(new java.awt.Dimension(300, 20));
            Checkout_Button.setPreferredSize(new Dimension(300, 30));
            

            main_panel.add(Checkout_Button,gb);
            y++;
            gb.gridx=0;
            gb.gridy=y;
            
            final double final_total = total + (total*0.5) + Delivery_cost;
            
            Checkout_Button.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {                                           
                    Checkout_Button.setForeground(Color.white);
                    Checkout_Button.setBackground(Color.black); 
                    Checkout_Button.setBorderPainted(false);
                    Border border = BorderFactory.createMatteBorder(1,1,1,1,Color.red);
                    Checkout_Button.setBorder(border);
                }                                          

                public void mouseExited(java.awt.event.MouseEvent evt) {                                          
                    Checkout_Button.setForeground(Color.white);
                    Checkout_Button.setBackground(new Color(255,0,0));
                } 
            });
            
            
            Checkout_Button.addActionListener(new java.awt.event.ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(Username==null) {
                        int order_proceed = JOptionPane.showConfirmDialog(null,"You have to login to place this order", "Confirmation", OK_CANCEL_OPTION);
                        if(order_proceed==0){
                            dispose();
                            new SignIn().setVisible(true);
                        }
                    }
                    else{
                        int input = JOptionPane.showConfirmDialog(null,"Do you really want to place this order?", "Confirmation", OK_CANCEL_OPTION);
                        if(input==0){
                            if(final_total < 400.0){
                                int add_more = JOptionPane.showConfirmDialog(null,"Sorry We can't take this order.Your total cost is below 400. Add more product in the cart.", "Confirmation", OK_CANCEL_OPTION);
                                if(add_more==0) dispose();
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Your order has been successfully placed.Thank you so much for ordering from our store.", "Order Accepted", JOptionPane.PLAIN_MESSAGE);
                                try{
                                    CSVWriter writer = new CSVWriter(new FileWriter("Buyers.csv",true));
                                    List<String[]> records = new ArrayList<>();
                                    Buy[1] = String.valueOf(checkout_total_price.getFinalPrice());
                                    records.add(Buy);
                                    writer.writeAll(records);
                                    writer.flush();
                                    writer.close();
                                    
                                }
                                catch(Exception exception){
                                    exception.printStackTrace();
                                }
                                dispose();
                                
                                Store.init();
                            }
                        }
                    }
                }
            });
        }     
        catch(IOException e){
            e.printStackTrace(); 
        }
        catch(CsvException e){
            e.printStackTrace();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        main_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        header_label = new javax.swing.JLabel();
        add_to_cart_label = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        SignIn_Out = new javax.swing.JLabel();
        Order_2 = new javax.swing.JLabel();
        Order_1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 247, 243));
        setMinimumSize(new java.awt.Dimension(1000, 1000));

        main_panel.setBackground(new java.awt.Color(255, 247, 243));
        main_panel.setMinimumSize(new java.awt.Dimension(1200, 800));
        main_panel.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(main_panel);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        header_label.setFont(new java.awt.Font("Elephant", 2, 14)); // NOI18N
        header_label.setForeground(new java.awt.Color(255, 255, 255));
        header_label.setText("Vai  Brothers  Store ");
        header_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        header_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                header_labelMouseClicked(evt);
            }
        });

        add_to_cart_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_to_cart_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_to_cart_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_to_cart_labelMouseClicked(evt);
            }
        });

        username_label.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        username_label.setForeground(new java.awt.Color(255, 255, 255));
        username_label.setText("Guest");
        username_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                username_labelMouseClicked(evt);
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
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Order_2)
                    .addComponent(Order_1))
                .addGap(44, 44, 44)
                .addComponent(SignIn_Out)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(add_to_cart_label, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Order_2)
                        .addGap(0, 0, 0)
                        .addComponent(Order_1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(add_to_cart_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(header_label, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SignIn_Out, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 247, 243));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Contact Us");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 51, 51)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 301, 0, 0);
        jPanel3.add(jLabel11, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("01674455123");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 18, 0, 0);
        jPanel3.add(jLabel12, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("vaibrothers@gmail.com");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 608);
        jPanel3.add(jLabel13, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Vai Brothers Store");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 48, 0);
        jPanel3.add(jLabel14, gridBagConstraints);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/call.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 136, 0, 0);
        jPanel3.add(jLabel2, gridBagConstraints);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/facebook-logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 136, 48, 0);
        jPanel3.add(jLabel5, gridBagConstraints);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gmail.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 136, 0, 0);
        jPanel3.add(jLabel6, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_to_cart_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_to_cart_labelMouseClicked
        dispose();
        new Checkout_Items().setVisible(true);
    }//GEN-LAST:event_add_to_cart_labelMouseClicked

    private void header_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_labelMouseClicked
        dispose();
        new Items().setVisible(true);
    }//GEN-LAST:event_header_labelMouseClicked

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

    private void Order_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Order_2MouseClicked
        if(username_label.getText().toLowerCase().equals("guest")){
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
        if(username_label.getText().toLowerCase().equals("guest")){
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

    private void username_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_labelMouseClicked
        if(username_label.getText().toLowerCase().equals("guest")){
            JOptionPane.showMessageDialog(null, "You cannot see user information without login", "Login First", JOptionPane.ERROR_MESSAGE);
        }
        else{
            User_Information_Frame uif = new User_Information_Frame();
            uif.getUName(Username);
            uif.setVisible(true);
        }
    }//GEN-LAST:event_username_labelMouseClicked

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
            java.util.logging.Logger.getLogger(Checkout_Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout_Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout_Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout_Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout_Items().setVisible(true);
            }
            
        });

    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Order_1;
    private javax.swing.JLabel Order_2;
    private javax.swing.JLabel SignIn_Out;
    private javax.swing.JLabel add_to_cart_label;
    private javax.swing.JLabel header_label;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel main_panel;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables
}
