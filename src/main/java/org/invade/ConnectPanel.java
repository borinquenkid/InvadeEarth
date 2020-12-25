/*
 * ConnectPanel.java
 *
 * Created on July 25, 2005, 2:44 PM
 */

package org.invade;

import java.io.IOException;
import javax.swing.JOptionPane;
import org.invade.gameserver.Client;

/**
 *
 * @author  jcrosm
 */
public class ConnectPanel extends javax.swing.JPanel {
    
    private HasClient clientHolder;
    private ConnectionListener connectionListener;
    private ServerListDialog serverListDialog = null;
    
    /** Creates new form ConnectPanel */
    public ConnectPanel() {
        initComponents();
        portField.setText(Integer.toString(InvadeEarthServer.DEFAULT_PORT));
    }
    
    public ServerListDialog getServerListDialog() {
        if(serverListDialog == null) {
            serverListDialog = new ServerListDialog(this);
        }
        return serverListDialog;
    }
    
    public void disposeServerListDialog() {
        if(serverListDialog != null) {
            serverListDialog.dispose();
            serverListDialog = null;
        }
    }
    
    public void connectWith(String host, String port) {
        if(serverListDialog != null) {
            serverListDialog.setVisible(false);
        }
        hostField.setText(host);
        portField.setText(port);
        connectButton.doClick();
    }
    
    public HasClient getClientHolder() {
        return clientHolder;
    }
    
    public void setClientHolder(HasClient clientHolder) {
        this.clientHolder = clientHolder;
        if( clientHolder != null && clientHolder.getClient() != null ) {
            hostField.setText(clientHolder.getClient().getHost());
            portField.setText(Integer.toString(clientHolder.getClient().getPort()));
            nameField.setText(clientHolder.getClient().getName());
        }
    }
    
    public ConnectionListener getConnectionListener() {
        return connectionListener;
    }
    
    public void setConnectionListener(ConnectionListener connectionListener) {
        this.connectionListener = connectionListener;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        networkPanel = new javax.swing.JPanel();
        hostField = new javax.swing.JTextField();
        portField = new javax.swing.JTextField();
        connectButton = new javax.swing.JButton();
        hostLabel = new javax.swing.JLabel();
        portLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        serverListButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        hostField.setText("localhost");
        hostField.setMinimumSize(new java.awt.Dimension(128, 19));
        hostField.setPreferredSize(new java.awt.Dimension(128, 19));
        hostField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostFieldActionPerformed(evt);
            }
        });

        portField.setMinimumSize(new java.awt.Dimension(48, 19));
        portField.setPreferredSize(new java.awt.Dimension(48, 19));
        portField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portFieldActionPerformed(evt);
            }
        });

        connectButton.setText("Connect");
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });

        hostLabel.setText("Host name or IP address");

        portLabel.setText("Port");

        nameField.setText("Anonymous");
        nameField.setMinimumSize(new java.awt.Dimension(96, 19));
        nameField.setPreferredSize(new java.awt.Dimension(96, 19));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        nameLabel.setText("Name");

        serverListButton.setText("Server List...");
        serverListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverListButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout networkPanelLayout = new org.jdesktop.layout.GroupLayout(networkPanel);
        networkPanel.setLayout(networkPanelLayout);
        networkPanelLayout.setHorizontalGroup(
            networkPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(networkPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(networkPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(networkPanelLayout.createSequentialGroup()
                        .add(hostLabel)
                        .add(18, 18, 18)
                        .add(portLabel)
                        .add(36, 36, 36)
                        .add(nameLabel))
                    .add(networkPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(networkPanelLayout.createSequentialGroup()
                            .add(serverListButton)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(connectButton))
                        .add(networkPanelLayout.createSequentialGroup()
                            .add(hostField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(8, 8, 8)
                            .add(portField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(8, 8, 8)
                            .add(nameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        networkPanelLayout.setVerticalGroup(
            networkPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(networkPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(networkPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(hostLabel)
                    .add(portLabel)
                    .add(nameLabel))
                .add(10, 10, 10)
                .add(networkPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(hostField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(portField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(nameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(networkPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(connectButton)
                    .add(serverListButton))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        add(networkPanel, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    private void serverListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverListButtonActionPerformed
        getServerListDialog().setVisible(true);
    }//GEN-LAST:event_serverListButtonActionPerformed
    
    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        connectButton.doClick();
    }//GEN-LAST:event_nameFieldActionPerformed
    
    private void portFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portFieldActionPerformed
        connectButton.doClick();
    }//GEN-LAST:event_portFieldActionPerformed
    
    private void hostFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostFieldActionPerformed
        connectButton.doClick();
    }//GEN-LAST:event_hostFieldActionPerformed
    
    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
        if( ! clientHolder.confirmDisconnect() ) {
            return;
        }
        try {
            final int portNumber = Integer.parseInt(portField.getText());
            new Thread("ConnectThread") {
                public void run() {
                    connectButton.setEnabled(false);
                    Client client = new Client(hostField.getText(), portNumber);
                    try {
                        client.connect();
                        client.setName(nameField.getText());
                        clientHolder.setClient( client );
                        if( connectionListener != null ) {
                            if(serverListDialog != null) {
                                serverListDialog.setVisible(false);
                            }
                            connectionListener.connectionMade();
                        }
                    } catch(Exception ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(ConnectPanel.this, "Failed to connect\n" + ex.toString(), "Error",
                                JOptionPane.ERROR_MESSAGE);                        
                    }
                    connectButton.setEnabled(true);
                }
            }.start();
        } catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Port number must be an integer", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_connectButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connectButton;
    private javax.swing.JTextField hostField;
    private javax.swing.JLabel hostLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel networkPanel;
    private javax.swing.JTextField portField;
    private javax.swing.JLabel portLabel;
    private javax.swing.JButton serverListButton;
    // End of variables declaration//GEN-END:variables
    
}