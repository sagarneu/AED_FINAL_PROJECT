/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.NGOAdministratorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.NGOAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GovernmentFundRequest;
import Business.WorkQueue.NGODonorRequest;
import Business.WorkQueue.NGOFundRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import userinterface.HealthcareOfficerRole.MapJPanel;
import userinterface.HealthcareOfficerRole.OfficerProcessWorkRequestJPanel;

/**
 *
 * @author sagred
 */
public class NGOAdministratorWorkAreaPanel extends javax.swing.JPanel {

    private JPanel usrCnter;
    private UserAccount usrAcc;
    private EcoSystem ecoSys;
    private Enterprise ent;
    private NGOAdminOrganization ngoAdmOrg;

    /**
     * Creates new form NGOAdministratorWorkAreaPanel
     */
    public NGOAdministratorWorkAreaPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.usrCnter = userProcessContainer;
        this.ngoAdmOrg = (NGOAdminOrganization) organization;
        this.usrAcc = userAccount;
        this.ent = enterprise;
        populateRequestTable();
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
        workRequestJTable = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        processRequestBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        mapBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        workRequestJTable.setBackground(new java.awt.Color(204, 204, 204));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Location", "Sender", "Receiver", "Status", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        btnAssign.setBackground(new java.awt.Color(0, 0, 0));
        btnAssign.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText("Assign To Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        processRequestBtn.setBackground(new java.awt.Color(0, 0, 0));
        processRequestBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        processRequestBtn.setForeground(new java.awt.Color(255, 255, 255));
        processRequestBtn.setText("Process Request");
        processRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processRequestBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NGO Admin Panel");

        mapBtn.setBackground(new java.awt.Color(0, 0, 0));
        mapBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mapBtn.setForeground(new java.awt.Color(255, 255, 255));
        mapBtn.setText("Verification on Map");
        mapBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(processRequestBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(mapBtn)
                        .addGap(61, 61, 61)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 620, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(394, 394, 394))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(processRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(mapBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to view details");
            return;
        } else {
            WorkRequest request = (NGOFundRequest) workRequestJTable.getValueAt(selectedRow, 0);
            if (request.getStatus().equals("Sent")) {
                request.setReceiver(usrAcc);
                request.setStatus("Pending on " + request.getReceiver().getEmp().getEmployeeName());
                populateRequestTable();
                JOptionPane.showMessageDialog(null, "Request is assigned successfully to you ");
            } else {
                JOptionPane.showMessageDialog(null, "Can't assign this work request, as the work request is in " + request.getStatus() + " status", "Warning!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void processRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processRequestBtnActionPerformed
        
     // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to view details");
            return;
        } else {

            NGOFundRequest request = (NGOFundRequest) workRequestJTable.getValueAt(selectedRow, 0);

            if (request.getStatus().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Cannot process a Rejected Request", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (request.getStatus().equalsIgnoreCase("Sent to Director")) {
                JOptionPane.showMessageDialog(null, "Request already processed", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (request.getStatus().equalsIgnoreCase("Sent")) {
                JOptionPane.showMessageDialog(null, "Assign the request first");
                return;
            }
            if (!usrAcc.equals(request.getReceiver())) {
                JOptionPane.showMessageDialog(null, "Not Authorized", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (!usrAcc.getEmp().equals(request.getReceiver().getEmp())) {
                JOptionPane.showMessageDialog(null, "Request assigned to other Officer", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            } else {

                NGOAdministratorProcessWorkRequestJPanel panel = new NGOAdministratorProcessWorkRequestJPanel(usrCnter, usrAcc, request, ent);
                usrCnter.add("OfficerProcessWorkRequestJPanel", panel);
                CardLayout layout = (CardLayout) usrCnter.getLayout();
                layout.next(usrCnter);

            }
    }
    }//GEN-LAST:event_processRequestBtnActionPerformed

    private void mapBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapBtnActionPerformed
        // TODO add your handling code here:
        MapJPanel mapJPanel = new MapJPanel(usrCnter);
        usrCnter.add("mapJPanel",mapJPanel);
        CardLayout layout=(CardLayout)usrCnter.getLayout();
        layout.next(usrCnter);
    }//GEN-LAST:event_mapBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mapBtn;
    private javax.swing.JButton processRequestBtn;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    void populateRequestTable() {
         DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : ngoAdmOrg.getWrkQ().getWorkRequests()) {
            Object[] row = new Object[5];
            String status = request.getStatus();
            row[0] = ((NGOFundRequest) request);
            row[1] = request.getSender().getEmp().getEmployeeName();
            if (status.equalsIgnoreCase("Sent to Director") ) {
                row[2] = null;
            } else {
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmp().getEmployeeName();
            }
            row[3] = request.getStatus();
            row[4] = ((NGOFundRequest) request).getNeededamtreq();

            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        workRequestJTable.setRowSorter(sorter);
    }
}
