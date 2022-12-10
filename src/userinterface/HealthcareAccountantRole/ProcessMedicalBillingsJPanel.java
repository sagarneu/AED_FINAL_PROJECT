/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthcareAccountantRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AccountantOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AccountantBillingRequest;
import Business.WorkQueue.InsuranceWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author bhavana0414
 */
public class ProcessMedicalBillingsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private AccountantOrganization accountantOrganization;
    private EcoSystem ecoSystem;

    /**
     * Creates new form ProcessMedicalBillingsJPanel
     */
    public ProcessMedicalBillingsJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, AccountantOrganization accountantOrganization, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.accountantOrganization = accountantOrganization;
        this.ecoSystem = ecoSystem;
        populateTable();
        populateInsuranceClaimTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prcsReqBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        wrkReqJTable = new javax.swing.JTable();
        asgnToMeBtn = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        insrTbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        prcsReqBtn.setBackground(new java.awt.Color(0, 0, 0));
        prcsReqBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        prcsReqBtn.setForeground(new java.awt.Color(255, 255, 255));
        prcsReqBtn.setText("Process Request");
        prcsReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prcsReqBtnActionPerformed(evt);
            }
        });

        wrkReqJTable.setBackground(new java.awt.Color(204, 204, 204));
        wrkReqJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "PatientId", "Patient Name", "Assigned Doctor", "Accountant ", "Status", "Billing Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(wrkReqJTable);

        asgnToMeBtn.setBackground(new java.awt.Color(0, 0, 0));
        asgnToMeBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        asgnToMeBtn.setForeground(new java.awt.Color(255, 255, 255));
        asgnToMeBtn.setText("AssignToMe");
        asgnToMeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asgnToMeBtnActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(204, 204, 204));
        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Receptionist: Patient Billing Area");

        insrTbl.setBackground(new java.awt.Color(204, 204, 204));
        insrTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Policy Number", "Accountant", "Insurance Agent", "Billing Amount", "Claim Amount", "Claim Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane2.setViewportView(insrTbl);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Insurance Claim Status Table");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Patient Billing Table");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backJButton)
                                .addGap(157, 157, 157)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(372, 372, 372)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(asgnToMeBtn)
                                .addGap(69, 69, 69)
                                .addComponent(prcsReqBtn)))
                        .addGap(0, 351, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton)))
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(asgnToMeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(prcsReqBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void prcsReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prcsReqBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = wrkReqJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to select");
            return;
        } else {

            AccountantBillingRequest accountBillingRequest = (AccountantBillingRequest) wrkReqJTable.getValueAt(selectedRow, 5);

            if (accountBillingRequest.getReceiver() != null) {
                if (accountBillingRequest.getReceiver().equals(userAccount)) {
                    if (accountBillingRequest.getStatus().equalsIgnoreCase("Pending on " + accountBillingRequest.getReceiver().getEmp().getEmployeeName())) {
                        AccountantProcessRequestJPanel panel = new AccountantProcessRequestJPanel(userProcessContainer, userAccount, accountBillingRequest, enterprise, ecoSystem);
                        userProcessContainer.add("AccountantProcessRequestJPanel", panel);
                        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                        layout.next(userProcessContainer);
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot process Request as request is in " + accountBillingRequest.getStatus());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not authorised for you");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please assign the request first!");
            }
        }
//        }
    }//GEN-LAST:event_prcsReqBtnActionPerformed

    private void asgnToMeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asgnToMeBtnActionPerformed
        int selectedRow = wrkReqJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to select");
            return;
        } else {
            WorkRequest request = (AccountantBillingRequest) wrkReqJTable.getValueAt(selectedRow, 5);
            if (request.getReceiver() == null) {

                request.setReceiver(userAccount);
                request.setStatus("Pending on " + request.getReceiver().getEmp().getEmployeeName());
                populateTable();
            } else {
                JOptionPane.showMessageDialog(null, "The request is already allocated ");
            }
        }
    }//GEN-LAST:event_asgnToMeBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asgnToMeBtn;
    private javax.swing.JButton backJButton;
    private javax.swing.JTable insrTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton prcsReqBtn;
    private javax.swing.JTable wrkReqJTable;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) wrkReqJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : accountantOrganization.getWrkQ().getWorkRequests()) {
            Object[] row = new Object[6];
            String status = request.getStatus();
            row[0] = ((AccountantBillingRequest) request).getPatient();
            row[1] = ((AccountantBillingRequest) request).getPatient().getPatientFirstName() + " " + ((AccountantBillingRequest) request).getPatient().getPatientLastName();
            row[2] = request.getSender().getEmp().getEmployeeName();
            if (status.equalsIgnoreCase("Sent to Treasurer") || status.equalsIgnoreCase("Sent to Secretary")) {
                row[2] = null;
            } else {
                row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmp().getEmployeeName();
            }
            row[4] = request.getStatus();
            row[5] = ((AccountantBillingRequest) request);

            model.addRow(row);
        }
        
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        wrkReqJTable.setRowSorter(sorter);

    }

    public void populateInsuranceClaimTable() {
        List<InsuranceWorkRequest> insuranceWorkRequests = new ArrayList<>();
        ArrayList<WorkRequest> workRequests = userAccount.getWrkQ().getWorkRequests();
        for (WorkRequest workRequest : workRequests) {
            if (workRequest instanceof InsuranceWorkRequest) {
                insuranceWorkRequests.add((InsuranceWorkRequest) workRequest);
            }
        }

        DefaultTableModel model = (DefaultTableModel) insrTbl.getModel();

        model.setRowCount(0);
        for (InsuranceWorkRequest insuranceWorkRequest : insuranceWorkRequests) {
            Object[] row = new Object[6];
            row[0] = insuranceWorkRequest;
            row[1] = userAccount.getEmp().getEmployeeName();
            row[2] = insuranceWorkRequest.getReceiver() == null ? "" : insuranceWorkRequest.getReceiver().getEmp().getEmployeeName();
            row[3] = insuranceWorkRequest.getBillAmt();
            row[4] = insuranceWorkRequest.getClaimAmt();
            row[5] = insuranceWorkRequest.getStatus();
            model.addRow(row);

        }
         TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        insrTbl.setRowSorter(sorter);
    }
}
