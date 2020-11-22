/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery_store;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author Win-10
 */
public class Checkout_Total_Price extends javax.swing.JPanel {

    /**
     * Creates new form Checkout_Total_Price
     */

    public Checkout_Total_Price() {
        initComponents();
    }
    
    
    
//    void Display(){
//
//        for(int i=0;i< new Checkout_Item().product_total_price.length;i++){
//            total += new Checkout_Item().product_total_price[i];
//        }
//        setTotalPrice(String.valueOf(total));
//    }

    
    
       
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Total_Price_Label = new javax.swing.JLabel();
        TOTAL = new javax.swing.JLabel();
        Discount_Price_Label = new javax.swing.JLabel();
        DOTTED_LINE = new javax.swing.JLabel();
        Final_Price_Label = new javax.swing.JLabel();
        Discount_Price_Label1 = new javax.swing.JLabel();
        Discount_Price_Label2 = new javax.swing.JLabel();
        Voucher_Label = new javax.swing.JTextField();
        Voucher_Button = new javax.swing.JButton();
        TOTAL1 = new javax.swing.JLabel();
        TOTAL2 = new javax.swing.JLabel();
        Discount_Price_Label3 = new javax.swing.JLabel();
        Vat_Price = new javax.swing.JLabel();
        DELIVERY = new javax.swing.JLabel();
        Delivery_Label = new javax.swing.JLabel();
        Discount_Price_Label4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)));

        Total_Price_Label.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        Total_Price_Label.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Total_Price_Label.setText("0");

        TOTAL.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        TOTAL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TOTAL.setText("Total Price");
        TOTAL.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 0, 51)));

        Discount_Price_Label.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        Discount_Price_Label.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Discount_Price_Label.setText("0");

        DOTTED_LINE.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        DOTTED_LINE.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        DOTTED_LINE.setText("------------------------------------");

        Final_Price_Label.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        Final_Price_Label.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Final_Price_Label.setText("0");

        Discount_Price_Label1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Discount_Price_Label1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Discount_Price_Label1.setText("Do you have any voucher code ?");

        Discount_Price_Label2.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        Discount_Price_Label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Discount_Price_Label2.setText("-");

        Voucher_Label.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Voucher_Label.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)));
        Voucher_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Voucher_LabelActionPerformed(evt);
            }
        });

        Voucher_Button.setBackground(new java.awt.Color(255, 0, 0));
        Voucher_Button.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Voucher_Button.setForeground(new java.awt.Color(255, 255, 255));
        Voucher_Button.setText("Submit");
        Voucher_Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        Voucher_Button.setBorderPainted(false);
        Voucher_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Voucher_ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Voucher_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Voucher_ButtonMouseExited(evt);
            }
        });
        Voucher_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Voucher_ButtonActionPerformed(evt);
            }
        });

        TOTAL1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        TOTAL1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        TOTAL1.setText("Vat (5%)");

        TOTAL2.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        TOTAL2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        TOTAL2.setText("Discount");

        Discount_Price_Label3.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        Discount_Price_Label3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Discount_Price_Label3.setText("+");

        Vat_Price.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        Vat_Price.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Vat_Price.setText("0");

        DELIVERY.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        DELIVERY.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        DELIVERY.setText("Delivery");

        Delivery_Label.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        Delivery_Label.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Delivery_Label.setText("0");

        Discount_Price_Label4.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        Discount_Price_Label4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Discount_Price_Label4.setText("+");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Discount_Price_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Voucher_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Voucher_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TOTAL1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DELIVERY, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TOTAL2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Discount_Price_Label4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Delivery_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Discount_Price_Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Vat_Price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Total_Price_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Discount_Price_Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Discount_Price_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(DOTTED_LINE, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Final_Price_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(TOTAL)
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Discount_Price_Label4)
                                .addComponent(DELIVERY))
                            .addComponent(Delivery_Label)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Total_Price_Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Discount_Price_Label)
                                    .addComponent(Discount_Price_Label2)
                                    .addComponent(TOTAL2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TOTAL1)
                                    .addComponent(Discount_Price_Label3)
                                    .addComponent(Vat_Price))
                                .addGap(2, 2, 2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(Discount_Price_Label1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Voucher_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(Voucher_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DOTTED_LINE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Final_Price_Label)
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Voucher_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Voucher_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Voucher_LabelActionPerformed

    private void Voucher_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Voucher_ButtonMouseClicked

    }//GEN-LAST:event_Voucher_ButtonMouseClicked

    private void Voucher_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Voucher_ButtonMouseEntered
        Voucher_Button.setForeground(Color.white);
        Voucher_Button.setBackground(Color.black);
        Voucher_Button.setBorderPainted(false);
        Border border = BorderFactory.createMatteBorder(1,1,1,1,Color.red);
        Voucher_Button.setBorder(border);
    }//GEN-LAST:event_Voucher_ButtonMouseEntered

    private void Voucher_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Voucher_ButtonMouseExited
        Voucher_Button.setForeground(Color.white);
        Voucher_Button.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_Voucher_ButtonMouseExited

    private void Voucher_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Voucher_ButtonActionPerformed
        if(Voucher_Label.getText().toLowerCase().equals("vaikomao")){
            Double final_price = Double.valueOf(Final_Price_Label.getText());
            if(final_price >= 400.0){
                int total_price = Integer.valueOf(Total_Price_Label.getText());
                Discount_Price_Label.setText("120");
                Vat_Price.setText(String.valueOf((Integer)total_price * 0.05));
                Final_Price_Label.setText(String.valueOf(total_price + total_price * 0.05 - 120 + Integer.valueOf(Delivery_Label.getText())));
                
            }
            else{
                Discount_Price_Label.setText("0");
                JOptionPane.showMessageDialog(null, "Sorry, You have to order minimum 400 taka products ", "Error", JOptionPane.ERROR_MESSAGE);  
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Sorry, There's no such voucher code ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_Voucher_ButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DELIVERY;
    private javax.swing.JLabel DOTTED_LINE;
    private javax.swing.JLabel Delivery_Label;
    private javax.swing.JLabel Discount_Price_Label;
    private javax.swing.JLabel Discount_Price_Label1;
    private javax.swing.JLabel Discount_Price_Label2;
    private javax.swing.JLabel Discount_Price_Label3;
    private javax.swing.JLabel Discount_Price_Label4;
    private javax.swing.JLabel Final_Price_Label;
    private javax.swing.JLabel TOTAL;
    private javax.swing.JLabel TOTAL1;
    private javax.swing.JLabel TOTAL2;
    private javax.swing.JLabel Total_Price_Label;
    private javax.swing.JLabel Vat_Price;
    private javax.swing.JButton Voucher_Button;
    private javax.swing.JTextField Voucher_Label;
    // End of variables declaration//GEN-END:variables
    
    void setTotalPrice(String s){
        Total_Price_Label.setText(s);
    }
    void setDiscountPrice(String s){
        Discount_Price_Label.setText(s);
    }
    void setFinalPrice(String s){
        Final_Price_Label.setText(s);
    }
    void setDeliveryPrice(String s){
        Delivery_Label.setText(s);
    }
    void setVatPrice(String s){
        Vat_Price.setText(s);
    }
    public String getFinalPrice(){
        return Final_Price_Label.getText();
    }

}
