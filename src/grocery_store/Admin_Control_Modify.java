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
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import javax.swing.JScrollPane;


public class Admin_Control_Modify extends javax.swing.JFrame {


    public Admin_Control_Modify() { 
        setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));      
        initComponents();

    }
    
    public Admin_Control_Modify(String name){
        Product_name_add11 = name;
        setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));      
        initComponents();
        getName(Product_name_add11);

    }
    

    public void getName(String name) {
        if(name==null)username_label.setText("Guest");
        else{ 
            char name_array[] = name.toCharArray();
            name_array[0] = Character.toUpperCase(name_array[0]);
            Product_name_add11 = String.valueOf(name_array);
            username_label.setText(Product_name_add11);
        }
        if(Product_name_add11==null){
            SignIn_Out.setText("Sign In");
        }
        else{
            SignIn_Out.setText("Sign Out");
        }
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        header_label = new javax.swing.JLabel();
        SignIn_Out = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        main_panel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Product_unit_modify = new javax.swing.JTextField();
        Product_price_modify = new javax.swing.JTextField();
        Product_image_modify = new javax.swing.JTextField();
        image_combo_add = new javax.swing.JComboBox<>();
        unit_combo_add1 = new javax.swing.JComboBox<>();
        Product_name_modify = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        Product_unit_modify1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Product_name_modify2 = new javax.swing.JTextField();
        unit_combo_add2 = new javax.swing.JComboBox<>();
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
        header_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                header_labelMouseClicked(evt);
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
        username_label.setText("Admin");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(header_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(username_label)
                .addGap(52, 52, 52)
                .addComponent(SignIn_Out)
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(header_label, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignIn_Out, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main_panel.setBackground(new java.awt.Color(255, 247, 243));
        main_panel.setMinimumSize(new java.awt.Dimension(1200, 800));
        main_panel.setLayout(new java.awt.GridBagLayout());

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Modify Product");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 103, 0, 0);
        main_panel.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 102));
        jLabel8.setText("Current Product Unit : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 265, 0, 0);
        main_panel.add(jLabel8, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 102));
        jLabel12.setText("Current Product Price : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 265, 0, 0);
        main_panel.add(jLabel12, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 102));
        jLabel14.setText("Current Product Image : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 265, 0, 0);
        main_panel.add(jLabel14, gridBagConstraints);

        Product_unit_modify.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Product_unit_modify.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        Product_unit_modify.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Product_unit_modifyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Product_unit_modifyFocusLost(evt);
            }
        });
        Product_unit_modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Product_unit_modifyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Product_unit_modifyMouseExited(evt);
            }
        });
        Product_unit_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_unit_modifyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 310;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 46, 0, 0);
        main_panel.add(Product_unit_modify, gridBagConstraints);

        Product_price_modify.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Product_price_modify.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        Product_price_modify.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Product_price_modifyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Product_price_modifyFocusLost(evt);
            }
        });
        Product_price_modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Product_price_modifyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Product_price_modifyMouseExited(evt);
            }
        });
        Product_price_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_price_modifyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 441;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 46, 0, 601);
        main_panel.add(Product_price_modify, gridBagConstraints);

        Product_image_modify.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Product_image_modify.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        Product_image_modify.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Product_image_modifyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Product_image_modifyFocusLost(evt);
            }
        });
        Product_image_modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Product_image_modifyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Product_image_modifyMouseExited(evt);
            }
        });
        Product_image_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_image_modifyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 310;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 46, 0, 0);
        main_panel.add(Product_image_modify, gridBagConstraints);

        image_combo_add.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        image_combo_add.setForeground(new java.awt.Color(255, 0, 51));
        image_combo_add.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "png", "jpg" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 62;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 0, 601);
        main_panel.add(image_combo_add, gridBagConstraints);

        unit_combo_add1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        unit_combo_add1.setForeground(new java.awt.Color(255, 51, 51));
        unit_combo_add1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kg", "gm", "pcs", "dozen", "L", "ml" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 49;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 601);
        main_panel.add(unit_combo_add1, gridBagConstraints);

        Product_name_modify.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Product_name_modify.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        Product_name_modify.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Product_name_modifyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Product_name_modifyFocusLost(evt);
            }
        });
        Product_name_modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Product_name_modifyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Product_name_modifyMouseExited(evt);
            }
        });
        Product_name_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_name_modifyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 441;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 46, 0, 601);
        main_panel.add(Product_name_modify, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 102));
        jLabel15.setText("Current Product Name : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 265, 0, 0);
        main_panel.add(jLabel15, gridBagConstraints);

        Update.setBackground(new java.awt.Color(255, 0, 0));
        Update.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        Update.setBorderPainted(false);
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 90;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(107, 152, 379, 0);
        main_panel.add(Update, gridBagConstraints);

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 102));
        jLabel16.setText("Previous Product Unit : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 265, 0, 0);
        main_panel.add(jLabel16, gridBagConstraints);

        Product_unit_modify1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Product_unit_modify1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        Product_unit_modify1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Product_unit_modify1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Product_unit_modify1FocusLost(evt);
            }
        });
        Product_unit_modify1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Product_unit_modify1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Product_unit_modify1MouseExited(evt);
            }
        });
        Product_unit_modify1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_unit_modify1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 306;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 46, 0, 0);
        main_panel.add(Product_unit_modify1, gridBagConstraints);

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 102));
        jLabel17.setText("Previous Product Name : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(118, 265, 0, 0);
        main_panel.add(jLabel17, gridBagConstraints);

        Product_name_modify2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Product_name_modify2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        Product_name_modify2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Product_name_modify2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Product_name_modify2FocusLost(evt);
            }
        });
        Product_name_modify2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Product_name_modify2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Product_name_modify2MouseExited(evt);
            }
        });
        Product_name_modify2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_name_modify2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 441;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(114, 46, 0, 601);
        main_panel.add(Product_name_modify2, gridBagConstraints);

        unit_combo_add2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        unit_combo_add2.setForeground(new java.awt.Color(255, 51, 51));
        unit_combo_add2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kg", "gm", "pcs", "dozen", "L", "ml" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 2, 0, 601);
        main_panel.add(unit_combo_add2, gridBagConstraints);

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1490, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username_labelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_username_labelComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_username_labelComponentShown

    private void username_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_labelMouseClicked
        new Admin_Control_Option().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_username_labelMouseClicked

    private void SignIn_OutComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_SignIn_OutComponentShown

    }//GEN-LAST:event_SignIn_OutComponentShown

    private void SignIn_OutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignIn_OutMouseClicked
        new SignIn().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_SignIn_OutMouseClicked

    private void header_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_labelMouseClicked
        new Items("admin").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_header_labelMouseClicked

    private void Product_unit_modifyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Product_unit_modifyFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_unit_modifyFocusGained

    private void Product_unit_modifyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Product_unit_modifyFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_unit_modifyFocusLost

    private void Product_unit_modifyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_unit_modifyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_unit_modifyMouseEntered

    private void Product_unit_modifyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_unit_modifyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_unit_modifyMouseExited

    private void Product_unit_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_unit_modifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_unit_modifyActionPerformed

    private void Product_price_modifyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Product_price_modifyFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_price_modifyFocusGained

    private void Product_price_modifyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Product_price_modifyFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_price_modifyFocusLost

    private void Product_price_modifyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_price_modifyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_price_modifyMouseEntered

    private void Product_price_modifyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_price_modifyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_price_modifyMouseExited

    private void Product_price_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_price_modifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_price_modifyActionPerformed

    private void Product_image_modifyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Product_image_modifyFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_image_modifyFocusGained

    private void Product_image_modifyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Product_image_modifyFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_image_modifyFocusLost

    private void Product_image_modifyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_image_modifyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_image_modifyMouseEntered

    private void Product_image_modifyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_image_modifyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_image_modifyMouseExited

    private void Product_image_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_image_modifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_image_modifyActionPerformed

    private void Product_name_modifyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Product_name_modifyFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_name_modifyFocusGained

    private void Product_name_modifyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Product_name_modifyFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_name_modifyFocusLost

    private void Product_name_modifyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_name_modifyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_name_modifyMouseEntered

    private void Product_name_modifyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_name_modifyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_name_modifyMouseExited

    private void Product_name_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_name_modifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_name_modifyActionPerformed

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        if(Product_name_modify2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Specify Product Name", "Specify", JOptionPane.ERROR_MESSAGE);
        }
        else if(Product_unit_modify1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Specify Product Unit", "Specify", JOptionPane.ERROR_MESSAGE);
        }
        else{
            ArrayList<String[]> updatedItems= new ArrayList<>();
            try{
                FileReader filereader = new FileReader("Items.csv");
                CSVReader reader = new CSVReaderBuilder(filereader).build();       
                List<String[]> Items = reader.readAll();
                
                CSVWriter writer = new CSVWriter(new FileWriter("Items.csv"));
                String unit = Product_unit_modify1.getText() + " " + String.valueOf(unit_combo_add2.getSelectedItem());
                for(String[] item : Items){
                    updatedItems.add(item);
                }
                boolean flag =false;
                for(int i=0;i<updatedItems.size();i++){
                    if(Product_name_modify2.getText().toLowerCase().equals(updatedItems.get(i)[1].toLowerCase().trim()) && unit.toLowerCase().equals(updatedItems.get(i)[2].toLowerCase())){
                        if(Product_image_modify.getText().equals("")){
                            
                        }
                        else{
                            updatedItems.get(i)[0] = Product_image_modify.getText();
                        }
                        if(Product_price_modify.getText().equals("")){
                            
                        }
                        else{
                            updatedItems.get(i)[3] = Product_price_modify.getText();
                        }
                        if(Product_unit_modify.getText().equals("")){
                            
                        }
                        else{
                            updatedItems.get(i)[2] = Product_unit_modify.getText() + " " + String.valueOf(unit_combo_add1.getSelectedItem());
                        }
                        if(Product_name_modify.getText().equals("")){
                            
                        }
                        else{
                            updatedItems.get(i)[1] = Product_name_modify.getText();
                        }
                        
                        flag=true;
 
                    }
                }
                if(flag==false){
                    JOptionPane.showMessageDialog(this, "Product Info didn't match. Sorry , cannot modify ", "Didn't match", JOptionPane.ERROR_MESSAGE); 
                    
                }
                else{
                    int input = JOptionPane.showConfirmDialog(null,"Do you really want to modify?", "Confirmation", OK_CANCEL_OPTION);
                    if(input==0){
                        try{
                            CSVWriter writer1 = new CSVWriter(new FileWriter("Items.csv"));
                            writer1.writeAll(updatedItems);
                            writer1.flush();
                            writer1.close();
                            JOptionPane.showMessageDialog(this, "Product has been updated ", "Updated", JOptionPane.PLAIN_MESSAGE); 
                         }
                         catch(IOException e){
                             e.printStackTrace(); 
                         }

                    }
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
        }
            
    }//GEN-LAST:event_UpdateMouseClicked

    private void Product_unit_modify1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Product_unit_modify1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_unit_modify1FocusGained

    private void Product_unit_modify1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Product_unit_modify1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_unit_modify1FocusLost

    private void Product_unit_modify1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_unit_modify1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_unit_modify1MouseEntered

    private void Product_unit_modify1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_unit_modify1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_unit_modify1MouseExited

    private void Product_unit_modify1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_unit_modify1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_unit_modify1ActionPerformed

    private void Product_name_modify2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Product_name_modify2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_name_modify2FocusGained

    private void Product_name_modify2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Product_name_modify2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_name_modify2FocusLost

    private void Product_name_modify2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_name_modify2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_name_modify2MouseEntered

    private void Product_name_modify2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_name_modify2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_name_modify2MouseExited

    private void Product_name_modify2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_name_modify2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_name_modify2ActionPerformed

    
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
                new Admin_Control_Modify().setVisible(true);
            }
        });
    }
    public JLabel getUsernameLabel(){
        return SignIn_Out;
    }
    private String Product_name_add11;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Product_image_modify;
    private javax.swing.JTextField Product_name_modify;
    private javax.swing.JTextField Product_name_modify2;
    private javax.swing.JTextField Product_price_modify;
    private javax.swing.JTextField Product_unit_modify;
    private javax.swing.JTextField Product_unit_modify1;
    private javax.swing.JLabel SignIn_Out;
    private javax.swing.JButton Update;
    private javax.swing.JLabel header_label;
    private javax.swing.JComboBox<String> image_combo_add;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel main_panel;
    private javax.swing.JComboBox<String> unit_combo_add1;
    private javax.swing.JComboBox<String> unit_combo_add2;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables

}
