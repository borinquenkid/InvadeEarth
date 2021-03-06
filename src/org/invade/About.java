/*
 * About.java
 *
 * Created on August 2, 2005, 1:20 PM
 */

package org.invade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ListModel;

/**
 *
 * @author  jcrosm
 */
public class About extends javax.swing.JDialog {
    
    // Alphabetical order here; the list is shuffled before display
    private List<String> developers = Arrays.asList(
            "Brett Coburn",
            "Jonathan Crosmer",
            "Dan Goggins",
            "Luke Miklos");
    
    /** Creates new form About */
    public About(java.awt.Frame parent) {
        super(parent);
        initComponents();
        versionField.setText(InvadeEarth.VERSION);
        vmField.setText(System.getProperty("java.vm.name"));
        javaVersionField.setText(System.getProperty("java.vm.version"));
        osField.setText(System.getProperty("os.name"));
        
        // Show developers in random order :)
        Collections.shuffle(developers);
        ListModel model = new AbstractListModel() {
            public Object getElementAt(int index) {
                return developers.get(index);
            }
            public int getSize() {
                return developers.size();
            }
        };
        developerList.setModel(model);
        
        pack();
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        versionField = new javax.swing.JLabel();
        authorField = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        versionLabel = new javax.swing.JLabel();
        vmField = new javax.swing.JLabel();
        javaVersionLabel = new javax.swing.JLabel();
        osLabel = new javax.swing.JLabel();
        javaVersionField = new javax.swing.JLabel();
        osField = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        developerList = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About");
        setModal(true);
        setResizable(false);
        mainPanel.setLayout(new java.awt.GridBagLayout());

        mainPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(32, 32, 32, 32));
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(32, 2, 2, 2);
        mainPanel.add(closeButton, gridBagConstraints);

        titleLabel.setFont(new java.awt.Font("Serif", 1, 24));
        titleLabel.setText("Invade Earth");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 26, 0);
        mainPanel.add(titleLabel, gridBagConstraints);

        versionField.setText("Unknown");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        mainPanel.add(versionField, gridBagConstraints);

        authorField.setText("Jonathan Crosmer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        mainPanel.add(authorField, gridBagConstraints);

        authorLabel.setText("Project Administrator:  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        mainPanel.add(authorLabel, gridBagConstraints);

        versionLabel.setText("Version:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        mainPanel.add(versionLabel, gridBagConstraints);

        vmField.setText("Java VM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 2, 6, 2);
        mainPanel.add(vmField, gridBagConstraints);

        javaVersionLabel.setText("Version:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        mainPanel.add(javaVersionLabel, gridBagConstraints);

        osLabel.setText("Operating System:  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        mainPanel.add(osLabel, gridBagConstraints);

        javaVersionField.setText("Unknown");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        mainPanel.add(javaVersionField, gridBagConstraints);

        osField.setText("Unknown");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        mainPanel.add(osField, gridBagConstraints);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(64, 64));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(64, 64));
        developerList.setFocusable(false);
        jScrollPane1.setViewportView(developerList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        mainPanel.add(jScrollPane1, gridBagConstraints);

        jLabel2.setText("Developers:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 2, 2, 2);
        mainPanel.add(jLabel2, gridBagConstraints);

        getContentPane().add(mainPanel, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorField;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JList developerList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel javaVersionField;
    private javax.swing.JLabel javaVersionLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel osField;
    private javax.swing.JLabel osLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel versionField;
    private javax.swing.JLabel versionLabel;
    private javax.swing.JLabel vmField;
    // End of variables declaration//GEN-END:variables
    
}
