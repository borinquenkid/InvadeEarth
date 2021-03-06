/*
 * GameHistoryDebugDialog.java
 *
 * Created on April 25, 2006, 9:21 AM
 */

package org.invade;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author  jcrosm
 */
public class GameHistoryDebugDialog extends javax.swing.JDialog {
    
    private HasGameThread gameThreadHolder;
    
    /** Creates new form GameHistoryDebugDialog */
    public GameHistoryDebugDialog(java.awt.Frame parent, HasGameThread gameThreadHolder) {
        super(parent);
        initComponents();        
        
        this.gameThreadHolder = gameThreadHolder;
        refresh();
        
        WindowCenteringUtility.center(this);        
    }

    public void refresh() {
        if(gameThreadHolder.getGameThread() == null) {
            historyList.setModel(new DefaultListModel());
            return;
        }
        DefaultListModel model = new DefaultListModel();
        for(Object object : gameThreadHolder.getGameThread().getLog()) {
            model.addElement(object.getClass() + ": " + 
                    ((object instanceof Integer) ? "(hidden)"
                    : object.toString()));
        }
        historyList.setModel(model);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        historyList = new javax.swing.JList();
        closeButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();

        setTitle("History");
        jScrollPane1.setViewportView(historyList);

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(refreshButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(closeButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(closeButton)
                    .add(refreshButton))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        refresh();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JList historyList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables
    
}