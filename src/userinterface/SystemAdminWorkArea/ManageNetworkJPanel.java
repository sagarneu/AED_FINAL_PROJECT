/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author sagred
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecosystem;

    /**
     *
     * Creates new form ManageNetworkJPanel
     */
    public ManageNetworkJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        popNtwrkTbl();
    }

    private void popNtwrkTbl() {
        DefaultTableModel model = (DefaultTableModel) ntwrkJTbl.getModel();
        model.setRowCount(0);
        for (Network network : ecosystem.getNetworks()) {
            Object[] row = new Object[1];
            row[0] = network;
            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        ntwrkJTbl.setRowSorter(sorter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ntwrkJTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        sbmtJBtn = new javax.swing.JButton();
        nmJTxtField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnDlt = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        ntwrkJTbl.setBackground(new java.awt.Color(204, 204, 204));
        ntwrkJTbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ntwrkJTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ntwrkJTbl);
        if (ntwrkJTbl.getColumnModel().getColumnCount() > 0) {
            ntwrkJTbl.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Name");

        sbmtJBtn.setBackground(new java.awt.Color(0, 0, 0));
        sbmtJBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sbmtJBtn.setForeground(new java.awt.Color(255, 255, 255));
        sbmtJBtn.setText("Submit");
        sbmtJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmtJBtnActionPerformed(evt);
            }
        });

        nmJTxtField.setBackground(new java.awt.Color(204, 204, 204));
        nmJTxtField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        backJButton.setBackground(new java.awt.Color(204, 204, 204));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setText(" Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Manage Network");

        btnDlt.setBackground(new java.awt.Color(0, 0, 0));
        btnDlt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDlt.setForeground(new java.awt.Color(255, 255, 255));
        btnDlt.setText("Delete");
        btnDlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDltActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sbmtJBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(nmJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDlt))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(backJButton)
                        .addGap(105, 105, 105)
                        .addComponent(jLabel2)))
                .addContainerGap(337, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(backJButton))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nmJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDlt))
                .addGap(104, 104, 104)
                .addComponent(sbmtJBtn)
                .addGap(0, 374, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sbmtJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmtJBtnActionPerformed

        String name = nmJTxtField.getText();
        ArrayList<Network> networkList = ecosystem.getNetworks();
        ArrayList<String> networkNames = new ArrayList<>();
        for (Network network : networkList) {
            networkNames.add(network.getNetwrkNm());
        }
        if (networkNames.contains(name)) {
            JOptionPane.showMessageDialog(null, "This Network already exists!!");
            nmJTxtField.setText("");
            return;
        } else {
            if (name == null || name.equals("")) {
                JOptionPane.showMessageDialog(null, "Network Name cannot be Empty!!", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                Network network = ecosystem.createAndAddNetwork();
                network.setNetwrkNm(name);
                JOptionPane.showMessageDialog(null, "New Network is added");
                nmJTxtField.setText("");
                popNtwrkTbl();
            }
        }
    }//GEN-LAST:event_sbmtJBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnDltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDltActionPerformed
        int selectedRow = ntwrkJTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete Network", "Warning!", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            Network network = (Network) ntwrkJTbl.getValueAt(selectedRow, 0);
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            if (dialogResult == JOptionPane.YES_OPTION) {
                ecosystem.getNetworks().remove(network);
                popNtwrkTbl();

                JOptionPane.showMessageDialog(null, "Network is deleted");
            }

        }
    }//GEN-LAST:event_btnDltActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnDlt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nmJTxtField;
    private javax.swing.JTable ntwrkJTbl;
    private javax.swing.JButton sbmtJBtn;
    // End of variables declaration//GEN-END:variables
}
