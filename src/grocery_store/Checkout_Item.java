/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery_store;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Win-10
 */
public class Checkout_Item extends javax.swing.JPanel {

    /**
     * Creates new form Checkout_Item
     */
    public int ID;
    public Checkout_Item() {
        initComponents();        
    }
    
    static int total=0;

    Grocery_Store gc = new Grocery_Store();
    Checkout_Total_Price checkout__price = new Checkout_Total_Price();
    public static int[] product_total_price = new int[1000];
    

    
    public void getID(int id){
        this.ID = id;
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        product_name_label = new javax.swing.JLabel();
        unit_label = new javax.swing.JLabel();
        price_label = new javax.swing.JLabel();
        quantity_label = new javax.swing.JLabel();
        total_price_label = new javax.swing.JLabel();
        total_price_label1 = new javax.swing.JLabel();
        quantity_label1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        image_label6 = new javax.swing.JLabel();
        price_label1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 247, 243));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        setMaximumSize(new java.awt.Dimension(800, 200));
        setMinimumSize(new java.awt.Dimension(500, 200));
        setPreferredSize(new java.awt.Dimension(650, 200));

        product_name_label.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        product_name_label.setText("Product Name : ");

        unit_label.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        unit_label.setText("Unit");

        price_label.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        price_label.setText("Price:");

        quantity_label.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        quantity_label.setText("X");

        total_price_label.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        total_price_label.setText("Price");

        total_price_label1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        total_price_label1.setText("Tk");

        quantity_label1.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        quantity_label1.setText("X");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        image_label6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image_label6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image_label6, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image_label6, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );

        price_label1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        price_label1.setText("Tk");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(unit_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(product_name_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(price_label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price_label)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quantity_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(quantity_label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(total_price_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total_price_label, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(product_name_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unit_label)
                            .addComponent(quantity_label)
                            .addComponent(total_price_label)
                            .addComponent(total_price_label1)
                            .addComponent(quantity_label1))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(price_label)
                            .addComponent(price_label1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image_label6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel price_label;
    private javax.swing.JLabel price_label1;
    private javax.swing.JLabel product_name_label;
    private javax.swing.JLabel quantity_label;
    private javax.swing.JLabel quantity_label1;
    private javax.swing.JLabel total_price_label;
    private javax.swing.JLabel total_price_label1;
    private javax.swing.JLabel unit_label;
    // End of variables declaration//GEN-END:variables

    void setImage(ImageIcon image_icon) {
        image_label6.setIcon(image_icon);
    }
    void setProductName(String name){        
        product_name_label.setText(name);
    }
    void setUnit(String s) {
       unit_label.setText(s);
    }
    void setPrice(String s){
        price_label.setText(s);
    }
    void setQuantity(String s){
        quantity_label.setText(s);
    }
    void setTotalPrice(String s){
        total_price_label.setText(s);
    }
 

}
