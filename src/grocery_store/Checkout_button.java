/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery_store;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;

/**
 *
 * @author Win-10
 */
public class Checkout_button extends javax.swing.JPanel {

    /**
     * Creates new form Checkout_button
     */
    public Checkout_button() {
        initComponents();
        this.setVisible(true);
    }

    public int okay = -1;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignUp_button = new javax.swing.JButton();

        SignUp_button.setBackground(new java.awt.Color(255, 0, 0));
        SignUp_button.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        SignUp_button.setForeground(new java.awt.Color(255, 255, 255));
        SignUp_button.setText("Checkout");
        SignUp_button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        SignUp_button.setBorderPainted(false);
        SignUp_button.setMaximumSize(new java.awt.Dimension(150, 20));
        SignUp_button.setMinimumSize(new java.awt.Dimension(150, 20));
        SignUp_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUp_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignUp_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignUp_buttonMouseExited(evt);
            }
        });
        SignUp_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUp_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SignUp_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SignUp_button, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SignUp_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUp_buttonMouseClicked
        int input = JOptionPane.showConfirmDialog(null,"Do you really want to place this order?", "Confirmation", OK_CANCEL_OPTION);
        Checkout_Items checkout_items = new Checkout_Items();
        okay = input;
//        checkout_items.getInput(input);
//        System.out.println("input " + input);
    }//GEN-LAST:event_SignUp_buttonMouseClicked

    private void SignUp_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUp_buttonMouseEntered
        SignUp_button.setForeground(Color.white);
        SignUp_button.setBackground(Color.BLACK);
    }//GEN-LAST:event_SignUp_buttonMouseEntered

    private void SignUp_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUp_buttonMouseExited
        SignUp_button.setForeground(Color.white);
        SignUp_button.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_SignUp_buttonMouseExited

    private void SignUp_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUp_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUp_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignUp_button;
    // End of variables declaration//GEN-END:variables
}
