/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Window;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.SwingUtilities;
import model.Item;
import controller.MainClass;

/**
 *
 * @author YASH
 */
public class Success extends javax.swing.JPanel {

    /**
     * Creates new form Main
     */
    private static ArrayList<Item> items;
    private static String[] selects;
    public Success() {
     
        initComponents();
    }
    public Success(ArrayList<Item> item){
        items=item;
        selects=MainClass.selectedValues(items);
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        intro = new javax.swing.JLabel();
        riceLabel = new javax.swing.JLabel();
        vegesLabel = new javax.swing.JLabel();
        meatLabel = new javax.swing.JLabel();
        sauceLabel = new javax.swing.JLabel();
        sourCrLabel = new javax.swing.JLabel();
        guacLabel = new javax.swing.JLabel();
        placeOrder = new javax.swing.JButton();
        tax = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        orderTotal = new javax.swing.JLabel();
        heading = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(827, 632));

        intro.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        intro.setForeground(new java.awt.Color(0, 0, 102));
        intro.setText("Your order has been placed successfully!!!");

        riceLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        riceLabel.setText(selects[0]);

        vegesLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        vegesLabel.setText(selects[1]);

        meatLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        meatLabel.setText(selects[2]);

        sauceLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        sauceLabel.setText(selects[3]);

        sourCrLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        sourCrLabel.setText(selects[4]);

        guacLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        guacLabel.setText(selects[5]);

        placeOrder.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        placeOrder.setText("Checkout");
        placeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderActionPerformed(evt);
            }
        });

        tax.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        tax.setText(selects[7]);

        total.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        total.setText(selects[6]);

        orderTotal.setFont(new java.awt.Font("Trebuchet MS", 3, 28)); // NOI18N
        orderTotal.setForeground(new java.awt.Color(255, 0, 51));
        orderTotal.setText(selects[8]);

        heading.setFont(new java.awt.Font("Trebuchet MS", 3, 40)); // NOI18N
        heading.setForeground(new java.awt.Color(153, 0, 0));
        heading.setText("Rice Bowl Restaurante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(vegesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                        .addComponent(riceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(meatLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sauceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sourCrLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guacLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(placeOrder)
                    .addComponent(orderTotal)
                    .addComponent(intro, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(intro)
                .addGap(32, 32, 32)
                .addComponent(riceLabel)
                .addGap(18, 18, 18)
                .addComponent(vegesLabel)
                .addGap(18, 18, 18)
                .addComponent(meatLabel)
                .addGap(18, 18, 18)
                .addComponent(sauceLabel)
                .addGap(18, 18, 18)
                .addComponent(sourCrLabel)
                .addGap(18, 18, 18)
                .addComponent(guacLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(total)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tax)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orderTotal)
                .addGap(18, 18, 18)
                .addComponent(placeOrder)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void placeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderActionPerformed
         System.exit(0);
    }//GEN-LAST:event_placeOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel guacLabel;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel intro;
    private javax.swing.JLabel meatLabel;
    private javax.swing.JLabel orderTotal;
    private javax.swing.JButton placeOrder;
    private javax.swing.JLabel riceLabel;
    private javax.swing.JLabel sauceLabel;
    private javax.swing.JLabel sourCrLabel;
    private javax.swing.JLabel tax;
    private javax.swing.JLabel total;
    private javax.swing.JLabel vegesLabel;
    // End of variables declaration//GEN-END:variables
}
