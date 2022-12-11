/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GovernmentTreasurerRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.TreasurerOrganization;
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
 * @author bhavana0414
 */
public class TreasurerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TreasurerWorkAreaJPanel
     */
    private JPanel jPanel;
    private UserAccount userAccount;
    private TreasurerOrganization treasurerOrganization;
    private Enterprise enterprise;

    public TreasurerWorkAreaJPanel(JPanel jpanel, UserAccount usrAcnt, Organization org, Enterprise entrpz) {
        initComponents();
        this.enterprise = entrpz;
        this.jPanel = jpanel;
        this.treasurerOrganization = (TreasurerOrganization) org;
        this.userAccount = usrAcnt;

        pplTbl();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wrkReqJPanel = new javax.swing.JTable();
        asgnBtn = new javax.swing.JButton();
        reqGovtSecBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Treasurer Work Area ");

        wrkReqJPanel.setBackground(new java.awt.Color(204, 204, 204));
        wrkReqJPanel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        wrkReqJPanel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Status", "Amount", "Message", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(wrkReqJPanel);

        asgnBtn.setBackground(new java.awt.Color(0, 0, 0));
        asgnBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        asgnBtn.setForeground(new java.awt.Color(255, 255, 255));
        asgnBtn.setText("Assign To Me");
        asgnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asgnBtnActionPerformed(evt);
            }
        });

        reqGovtSecBtn.setBackground(new java.awt.Color(0, 0, 0));
        reqGovtSecBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        reqGovtSecBtn.setForeground(new java.awt.Color(255, 255, 255));
        reqGovtSecBtn.setText("Process Request");
        reqGovtSecBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqGovtSecBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(asgnBtn)
                        .addGap(77, 77, 77)
                        .addComponent(reqGovtSecBtn)
                        .addGap(212, 212, 212)))
                .addContainerGap(910, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asgnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reqGovtSecBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(474, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void asgnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asgnBtnActionPerformed
        int selectedRow = wrkReqJPanel.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to view details");
            return;
        } else {
            WorkRequest req = (GovernmentFundRequest) wrkReqJPanel.getValueAt(selectedRow, 5);
            if (req.getStatus().equals("Sent to Treasurer")) {
                req.setReceiver(userAccount);
                req.setStatus("Pending on " + req.getReceiver().getEmp().getEmployeeName());
                pplTbl();
                JOptionPane.showMessageDialog(null, "Request is assigned successfully to you");
            } else {
                JOptionPane.showMessageDialog(null, "Can't assign this work request, as the work request is in " + req.getStatus() + " status", "Warning!", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_asgnBtnActionPerformed

    private void reqGovtSecBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqGovtSecBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = wrkReqJPanel.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to view details");
            return;
        } else {
            GovernmentFundRequest req = (GovernmentFundRequest) wrkReqJPanel.getValueAt(selectedRow, 5);
            if (req.getStatus().equalsIgnoreCase("Sent to Treasurer")) {
                JOptionPane.showMessageDialog(null, "Please assign selected request first");
                return;
            }
            if (req.getStatus().equalsIgnoreCase("Accepted")) {
                JOptionPane.showMessageDialog(null, "Request already completed", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!userAccount.equals(req.getReceiver())) {
                JOptionPane.showMessageDialog(null, "Not Authorized", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!userAccount.equals(req.getReceiver())) {
                JOptionPane.showMessageDialog(null, "Not Authorized", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!userAccount.getEmp().equals(req.getReceiver().getEmp())) {
                JOptionPane.showMessageDialog(null, "Request assigned to other Officer", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (req.getStatus().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Cannot process a Rejected Request", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            //request.setStatus("Processing");
            TreasurerProcessWorkRequestJPanel trrPrcsWrkReqJPanel = new TreasurerProcessWorkRequestJPanel(jPanel, req);
            jPanel.add("TreasurerProcessWorkRequestJPanel", trrPrcsWrkReqJPanel);
            CardLayout layout = (CardLayout) jPanel.getLayout();
            layout.next(jPanel);
        }
    }//GEN-LAST:event_reqGovtSecBtnActionPerformed

    public void pplTbl() {
        DefaultTableModel model = (DefaultTableModel) wrkReqJPanel.getModel();
        model.setRowCount(0);

        for (WorkRequest request : treasurerOrganization.getWrkQ().getWorkRequests()) {
            String status = request.getStatus();
            Object[] row = new Object[6];
            row[0] = request.getSender().getEmp().getEmployeeName();
            if (status.equalsIgnoreCase("Sent to Treasurer") || status.equalsIgnoreCase("Sent to Secretary")) {
                row[1] = null;
            } else {
                row[1] = request.getReceiver() == null ? null : request.getReceiver().getEmp().getEmployeeName();
            }

            row[2] = status;
            row[3] = ((GovernmentFundRequest) request).getReqAmt();
            row[4] = ((GovernmentFundRequest) request).getWrMsg();
            row[5] = request;

            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        wrkReqJPanel.setRowSorter(sorter);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asgnBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reqGovtSecBtn;
    private javax.swing.JTable wrkReqJPanel;
    // End of variables declaration//GEN-END:variables
}