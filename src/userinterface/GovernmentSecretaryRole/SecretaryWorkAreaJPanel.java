/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GovernmentSecretaryRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SecretaryOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GovernmentFundRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author narasimhatejareddy
 */
public class SecretaryWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SecretaryWorkAreaJPanel
     */
    private JPanel jPanel;
    private UserAccount usrAcnt;
    private SecretaryOrganization secOrg;
    private Enterprise entrpz;

    public SecretaryWorkAreaJPanel(JPanel jpanel, UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.entrpz = enterprise;
        this.jPanel = jpanel;
        this.secOrg = (SecretaryOrganization) organization;
        this.usrAcnt = userAccount;

        ppltTbl();
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
        wrkReJqTable = new javax.swing.JTable();
        asgnBtn = new javax.swing.JButton();
        prcsReqBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        wrkReJqTable.setBackground(new java.awt.Color(204, 204, 204));
        wrkReJqTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        wrkReJqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Location", "Sender", "Receiver", "Status", "Amount", "Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(wrkReJqTable);

        asgnBtn.setBackground(new java.awt.Color(0, 0, 0));
        asgnBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        asgnBtn.setForeground(new java.awt.Color(255, 255, 255));
        asgnBtn.setText("Assign To Me");
        asgnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asgnBtnActionPerformed(evt);
            }
        });

        prcsReqBtn.setBackground(new java.awt.Color(0, 0, 0));
        prcsReqBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        prcsReqBtn.setForeground(new java.awt.Color(255, 255, 255));
        prcsReqBtn.setText("Process Request");
        prcsReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prcsReqBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Secretary Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(213, 213, 213)
                            .addComponent(asgnBtn)
                            .addGap(38, 38, 38)
                            .addComponent(prcsReqBtn))))
                .addContainerGap(534, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asgnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prcsReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(372, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void asgnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asgnBtnActionPerformed
        int selectedRow = wrkReJqTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to view details");
            return;
        } else {
            WorkRequest req = (GovernmentFundRequest) wrkReJqTable.getValueAt(selectedRow, 0);
            if (req.getStatus().equals("Sent to Secretary")) {
                req.setReceiver(usrAcnt);
                req.setStatus("Pending on " + req.getReceiver().getEmp().getEmployeeName());
                ppltTbl();
                JOptionPane.showMessageDialog(null, "Request is assigned successfully to you ");
            } else {
                JOptionPane.showMessageDialog(null, "Can't assign this work request, as the work request is in " + req.getStatus() + " status", "Warning!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_asgnBtnActionPerformed

    private void prcsReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prcsReqBtnActionPerformed
        // TODO add your handling code here:

        int selectedRow = wrkReJqTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to view details");
            return;
        } else {
            GovernmentFundRequest fundReq = (GovernmentFundRequest) wrkReJqTable.getValueAt(selectedRow, 0);
            if (fundReq.getStatus().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Cannot process a Rejected Request", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            if (fundReq.getStatus().equalsIgnoreCase("Sent to Treasurer")) {
                JOptionPane.showMessageDialog(null, "Request already processed" , "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (fundReq.getStatus().equalsIgnoreCase("Sent to Secretary")) {
                JOptionPane.showMessageDialog(null, "Please assign selected request first");
                return;
            }
             if(!usrAcnt.equals(fundReq.getReceiver())){
             JOptionPane.showMessageDialog(null, "Not Authorized", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!usrAcnt.getEmp().equals(fundReq.getReceiver().getEmp())) {
                JOptionPane.showMessageDialog(null, "Request assigned to other Officer", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            
            SecretaryProcessWorkRequestJPanel secPrcWrkreqJPanel = new SecretaryProcessWorkRequestJPanel(jPanel, usrAcnt, fundReq, entrpz);
            jPanel.add("secretaryProcessWorkRequestJPanel", secPrcWrkreqJPanel);
            CardLayout layout = (CardLayout) jPanel.getLayout();
            layout.next(jPanel);

        }
    }//GEN-LAST:event_prcsReqBtnActionPerformed

    public void ppltTbl() {
        DefaultTableModel model = (DefaultTableModel) wrkReJqTable.getModel();

        model.setRowCount(0);

        for (WorkRequest req : secOrg.getWrkQ().getWorkRequests()) {
            String status = req.getStatus();
            Object[] row = new Object[6];
            row[0] = ((GovernmentFundRequest) req);
            row[1] = req.getSender().getEmp().getEmployeeName();
            if (status.equalsIgnoreCase("Sent to Treasurer") || status.equalsIgnoreCase("Sent to Secretary")) {
                row[2] = null;
            } else {
                row[2] = req.getReceiver() == null ? null : req.getReceiver().getEmp().getEmployeeName();
            }
            row[3] = status;
            row[4] = ((GovernmentFundRequest) req).getReqAmt();
            row[5] = ((GovernmentFundRequest) req).getWrMsg();

            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        wrkReJqTable.setRowSorter(sorter);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asgnBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton prcsReqBtn;
    private javax.swing.JTable wrkReJqTable;
    // End of variables declaration//GEN-END:variables
}
