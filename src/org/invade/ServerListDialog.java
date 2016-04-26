/*
 * ServerListDialog.java
 *
 * Created on February 10, 2006, 1:08 PM
 */

package org.invade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  jcrosm
 */
public class ServerListDialog extends javax.swing.JDialog {
    
    private ConnectPanel connectPanel;
    private Timer timer;
    
    private static final int UPDATE_DELAY = 7;
    
    /** Creates new form ServerListDialog */
    public ServerListDialog(ConnectPanel connectPanel) {
        
        this.connectPanel = connectPanel;
        initComponents();
        
        serverTable.getColumnModel().getColumn(0).setPreferredWidth(96);
        serverTable.getColumnModel().getColumn(1).setPreferredWidth(48);
        serverTable.getColumnModel().getColumn(2).setPreferredWidth(128);
        serverTable.getColumnModel().getColumn(3).setPreferredWidth(128);
        serverTable.getColumnModel().getColumn(4).setPreferredWidth(48);
        serverTable.getColumnModel().getColumn(5).setPreferredWidth(400);
                
        timer = new Timer(UPDATE_DELAY * 1000, new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if(ServerListDialog.this.isVisible()) {
                    updateTable();
                }
            }
        });
        timer.start();
        
        WindowCenteringUtility.center(this);
        
        updateTable();
    }
    
    public void updateTable() {
        new Thread(new RetrieveListThread(), "Retrieve RSS feed").start();
    }
    
    class RetrieveListThread implements Runnable {
        public void run() {
            List<List<String>> serverList;
            try {
                serverList = ServerListHandler.getServerList();
            } catch (IOException ex) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        JOptionPane.showMessageDialog(ServerListDialog.this, "Could not retrieve data from server list",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                });
                return;
            }
            final List<List<String>> finalServerList = serverList;
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    DefaultTableModel model = (DefaultTableModel)serverTable.getModel();
                    model.setRowCount(0);
                    for(List<String> server : finalServerList ) {
                        model.addRow(server.toArray());
                    }
                }
            });
        }
    }
    
/** This method is called from within the constructor to
 * initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is
 * always regenerated by the Form Editor.
 */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        serverTable = new javax.swing.JTable();
        cancelButton = new javax.swing.JButton();
        connectButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Available Hosts");
        setAlwaysOnTop(true);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(736, 320));
        serverTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Host", "Port", "Rules", "Map", "Max", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        serverTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        serverTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serverTableMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(serverTable);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        connectButton.setText("Connect");
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
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
                .add(refreshButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 501, Short.MAX_VALUE)
                .add(connectButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cancelButton)
                .addContainerGap())
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cancelButton)
                    .add(connectButton)
                    .add(refreshButton))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void serverTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serverTableMouseClicked
        if( evt.getClickCount() > 1 ) {
            connectButton.doClick();
        }
    }//GEN-LAST:event_serverTableMouseClicked
    
    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
        int row = serverTable.getSelectedRow();
        if(serverTable.getSelectedRow() >= 0) {
            connectPanel.connectWith(serverTable.getValueAt(row, 0).toString(),
                    serverTable.getValueAt(row, 1).toString());
        }
    }//GEN-LAST:event_connectButtonActionPerformed
    
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        updateTable();
    }//GEN-LAST:event_refreshButtonActionPerformed
    
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton connectButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTable serverTable;
    // End of variables declaration//GEN-END:variables
    
}
