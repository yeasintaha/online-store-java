/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery_store;

import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Win-10
 */
public class Checkout_price extends javax.swing.JFrame {

    /**
     * Creates new form Checkout_price
     */
    public Checkout_price() {
        initComponents();
    }
    Checkout_Items ct = new Checkout_Items();
    ArrayList<String> product_price = ct.getProductPrice();
    
    public void addUserRecord(String username) {
        String filename = username +".csv";
        File file = new File(filename);
        try{
          CSVWriter writer = new CSVWriter(new FileWriter(filename,true));
          List<String[]> records = new ArrayList<>();
          if(file.length() == 0){
            file.createNewFile(); 
            String [] header = new String[]{username,"1","2","3","4","5","6","7","8","9","10","11","12","13"};
            records.add(header);
          } 
          String [] record = new String[]{username,"1","3","5"};
          records.add(record);
          writer.writeAll(records);
          writer.flush();
          writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
//    public static int total =0;
//    public void totalPrice(){
//        Checkout_Item ct =  new Checkout_Item();
//        int c = ct.COUNT;
//        int id = ct.ID;
//        total += Integer.valueOf(product_price.get(id-1)) * c;
//        total_price_label.setText(Integer.toString(total));
//    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        total_price_label = new javax.swing.JLabel();
        Tk = new javax.swing.JLabel();
        TOTAL = new javax.swing.JLabel();
        discount_price_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 247, 243));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        total_price_label.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        total_price_label.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        total_price_label.setText("Price");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        jPanel1.add(total_price_label, gridBagConstraints);

        Tk.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        Tk.setText("Tk");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 498, 0, 0);
        jPanel1.add(Tk, gridBagConstraints);

        TOTAL.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        TOTAL.setText("Total Price ");
        TOTAL.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 51)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 476, 0, 68);
        jPanel1.add(TOTAL, gridBagConstraints);

        discount_price_label.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        discount_price_label.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        discount_price_label.setText("Price");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 105, 0);
        jPanel1.add(discount_price_label, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 204, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



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
            java.util.logging.Logger.getLogger(Checkout_price.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout_price.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout_price.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout_price.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout_price().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TOTAL;
    private javax.swing.JLabel Tk;
    private javax.swing.JLabel discount_price_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel total_price_label;
    // End of variables declaration//GEN-END:variables
}
