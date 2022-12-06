/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabAssistantRole;


import Business.WorkQueue.PatientTreatmentWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sagred
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    PatientTreatmentWorkRequest patientTreatmentWorkRequest;

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, PatientTreatmentWorkRequest patientTreatmentWorkRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.patientTreatmentWorkRequest = patientTreatmentWorkRequest;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rsltJTxtField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        submitJBtn.setBackground(new java.awt.Color(0, 0, 0));
        submitJBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        submitJBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitJBtn.setText("Submit Result");
        submitJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJBtnActionPerformed(evt);
            }
        });
        add(submitJBtn);
        submitJBtn.setBounds(280, 150, 118, 36);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Result");
        add(jLabel1);
        jLabel1.setBounds(220, 110, 40, 17);
        add(rsltJTxtField);
        rsltJTxtField.setBounds(270, 100, 160, 30);

        backJButton.setBackground(new java.awt.Color(204, 204, 204));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setText(" Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(10, 11, 72, 21);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Lab Test Results");
        add(jLabel2);
        jLabel2.setBounds(230, 20, 310, 29);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabAssistantWorkAreaJPanel dwjp = (LabAssistantWorkAreaJPanel) component;
        dwjp.popLabAsstTbl();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJBtnActionPerformed
        String labResult = rsltJTxtField.getText().trim();
        if (labResult.equals("")) {
            JOptionPane.showMessageDialog(null, "Result field is required");
            return;
        } else {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you wish to proceed?");
            if (dialogResult == JOptionPane.YES_OPTION) {
                patientTreatmentWorkRequest.setLabRslt(labResult);
                patientTreatmentWorkRequest.setStatus("Lab Test Completed");
                JOptionPane.showMessageDialog(null, "Result submitted successfully");
                rsltJTxtField.setText("");
                submitJBtn.setEnabled(false);
            }

        }


    }//GEN-LAST:event_submitJBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField rsltJTxtField;
    private javax.swing.JButton submitJBtn;
    // End of variables declaration//GEN-END:variables
}
