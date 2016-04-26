/*
 * MissionCardDisplay.java
 *
 * Created on July 28, 2005, 3:58 PM
 */

package org.invade.classic;

import org.invade.MapCanvas;
import org.invade.WindowCenteringUtility;

/**
 *
 * @author  jcrosm
 */
public class MissionCardDisplay extends javax.swing.JDialog {
            
    public MissionCardDisplay(java.awt.Frame parent, AbstractMissionCard card) {
        super(parent);
        
        initComponents();
        
        nameLabel.setText(card.getName(false, false));
        descriptionText.setText(card.getDescriptionString());
        
        setTitle(card.getName(true, false)  + " (" + card.getPlayer().getName() + ")");
        
        WindowCenteringUtility.center(this);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        descriptionText = new javax.swing.JTextArea();
        closeButton = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.FlowLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Card");
        setModal(true);
        setResizable(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(240, 320));
        nameLabel.setFont(new java.awt.Font("SansSerif", 1, 14));
        nameLabel.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 20, 2);
        jPanel1.add(nameLabel, gridBagConstraints);

        descriptionText.setEditable(false);
        descriptionText.setFont(new java.awt.Font("SansSerif", 0, 12));
        descriptionText.setLineWrap(true);
        descriptionText.setWrapStyleWord(true);
        descriptionText.setBorder(new javax.swing.border.EtchedBorder());
        descriptionText.setFocusable(false);
        descriptionText.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.75;
        jPanel1.add(descriptionText, gridBagConstraints);

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(closeButton, gridBagConstraints);

        getContentPane().add(jPanel1);

        pack();
    }
    // </editor-fold>//GEN-END:initComponents
    
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JTextArea descriptionText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables
    
}
