/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BloodBankManagerRole;

import Business.EcoSystem;
import Business.Organization.BloodBankManagerOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientTreatmentWorkRequest;
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
public class BloodBankManagerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private EcoSystem ecosystem;
    private UserAccount usrAcnt;
    private BloodBankManagerOrganization bloodBankMngrOrg;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public BloodBankManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();

        this.jPanel = userProcessContainer;
        this.usrAcnt = account;
        this.ecosystem = business;
        this.bloodBankMngrOrg = (BloodBankManagerOrganization) organization;

        pplTbl();
    }

    public void pplTbl() {
        DefaultTableModel model = (DefaultTableModel) wrkReqJTable.getModel();

        model.setRowCount(0);


        for (WorkRequest request : bloodBankMngrOrg.getWrkQ().getWorkRequests()) {

            Object[] row = new Object[7];
            row[0] = request;
            row[1] = request.getSender().getEmp().getEmployeeName();
            row[2] = ((PatientTreatmentWorkRequest) request).getBloodBankManager();
            row[3] = request.getStatus();
            row[4] = ((PatientTreatmentWorkRequest ) request).getPat().getPatientFirstName() + " " + ((PatientTreatmentWorkRequest) request).getPat().getPatientLastName();
            row[5] = ((PatientTreatmentWorkRequest) request).getPat().getPatientId();
            row[6]=((PatientTreatmentWorkRequest) request).getBloodUnits();
            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        wrkReqJTable.setRowSorter(sorter);
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
        wrkReqJTable = new javax.swing.JTable();
        asgnJButton = new javax.swing.JButton();
        prcsJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        wrkReqJTable.setBackground(new java.awt.Color(204, 204, 204));
        wrkReqJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Patient Name", "Patient Id", "Blood Units"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(wrkReqJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 730, 90);

        asgnJButton.setBackground(new java.awt.Color(0, 0, 0));
        asgnJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        asgnJButton.setForeground(new java.awt.Color(255, 255, 255));
        asgnJButton.setText("Assign to me");
        asgnJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asgnJButtonActionPerformed(evt);
            }
        });
        add(asgnJButton);
        asgnJButton.setBounds(190, 130, 140, 40);

        prcsJButton.setBackground(new java.awt.Color(0, 0, 0));
        prcsJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        prcsJButton.setForeground(new java.awt.Color(255, 255, 255));
        prcsJButton.setText("Process");
        prcsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prcsJButtonActionPerformed(evt);
            }
        });
        add(prcsJButton);
        prcsJButton.setBounds(370, 130, 140, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void asgnJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asgnJButtonActionPerformed

        int selectedRow = wrkReqJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row first to display");
            return;
        }

        PatientTreatmentWorkRequest request = (PatientTreatmentWorkRequest) wrkReqJTable.getValueAt(selectedRow, 0);
        if (request.getBloodBankManager() == null) {
            if (request.getStatus().equalsIgnoreCase("SentToBloodBank")) {
                request.setBloodBankManager(usrAcnt);
                request.setStatus("Pending on Blood Bank");
                pplTbl();
                JOptionPane.showMessageDialog(null, "The request is allocated to You!");
            } else {
                JOptionPane.showMessageDialog(null, "Cannot give this lab request as the current status is: " + request.getStatus());
            }
        }
        else
        {

            if(usrAcnt.equals(request.getLabAst()))

            {
                JOptionPane.showMessageDialog(null,"Request is already allocated to you");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Request is allocated to other Lab Assistant");
            }
        }

    }//GEN-LAST:event_asgnJButtonActionPerformed

    private void prcsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prcsJButtonActionPerformed

        int selectedRow = wrkReqJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to display");
            return;
        }

        PatientTreatmentWorkRequest request = (PatientTreatmentWorkRequest) wrkReqJTable.getValueAt(selectedRow, 0);

        BloodProcessWorkRequestJPanel processWorkRequestJPanel = new BloodProcessWorkRequestJPanel(jPanel, request);
        if (request.getBloodBankManager() != null) {
            if (usrAcnt.equals(request.getBloodBankManager())) {
                if (request.getStatus().equalsIgnoreCase("Pending on Blood Bank")) {

                    jPanel.add("processWorkRequestJPanel", processWorkRequestJPanel);
                    CardLayout layout = (CardLayout) jPanel.getLayout();
                    layout.next(jPanel);
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot process the request as the status is: " + request.getStatus());
                }

            } else {

                JOptionPane.showMessageDialog(null, "Not authorised to process the request");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please allocate the request first");
        }
    }//GEN-LAST:event_prcsJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asgnJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton prcsJButton;
    private javax.swing.JTable wrkReqJTable;
    // End of variables declaration//GEN-END:variables
}
