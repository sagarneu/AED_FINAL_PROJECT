package userinterface.AdministrativeRole;

import userinterface.NGOAdministratorRole.NGOAdministratorWorkAreaPanel;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GovernmentEnterprise;
import Business.Enterprise.InsuranceCompanyEnterprise;
import Business.Enterprise.NGOEnterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author narasimhatejareddy
 */
public class EnterpriseAdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel jPanel;
    Enterprise entrpz;
    UserAccount usrAc;
    EcoSystem ecosystem;

   
    public EnterpriseAdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount userAccount, EcoSystem ecoSystem) {
        initComponents();
        this.jPanel = userProcessContainer;
        this.entrpz = enterprise;
        this.usrAc = userAccount;
        this.ecosystem = ecoSystem;
        valueLabel.setText(enterprise.getName());

        if (enterprise instanceof GovernmentEnterprise || enterprise instanceof InsuranceCompanyEnterprise
            || enterprise instanceof NGOEnterprise ) {
            btnGovtFundReq.setVisible(false);
        }
        
        if (enterprise instanceof GovernmentEnterprise || enterprise instanceof InsuranceCompanyEnterprise
            || enterprise instanceof NGOEnterprise ) {
            btnNGOFundReq.setVisible(false);
        }
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        mnguserJButton = new javax.swing.JButton();
        mngEmpJButton = new javax.swing.JButton();
        mngOrgJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnGovtFundReq = new javax.swing.JButton();
        btnNGOFundReq = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Adminstrative Role");

        mnguserJButton.setBackground(new java.awt.Color(0, 0, 0));
        mnguserJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mnguserJButton.setForeground(new java.awt.Color(255, 255, 255));
        mnguserJButton.setText("Manage User");
        mnguserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnguserJButtonActionPerformed(evt);
            }
        });

        mngEmpJButton.setBackground(new java.awt.Color(0, 0, 0));
        mngEmpJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mngEmpJButton.setForeground(new java.awt.Color(255, 255, 255));
        mngEmpJButton.setText("Manage Employee");
        mngEmpJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngEmpJButtonActionPerformed(evt);
            }
        });

        mngOrgJButton.setBackground(new java.awt.Color(0, 0, 0));
        mngOrgJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mngOrgJButton.setForeground(new java.awt.Color(255, 255, 255));
        mngOrgJButton.setText("Manage Organization");
        mngOrgJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngOrgJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise :");

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btnGovtFundReq.setBackground(new java.awt.Color(0, 0, 0));
        btnGovtFundReq.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnGovtFundReq.setForeground(new java.awt.Color(255, 255, 255));
        btnGovtFundReq.setText("Request Funds from Government");
        btnGovtFundReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGovtFundReqActionPerformed(evt);
            }
        });

        btnNGOFundReq.setBackground(new java.awt.Color(0, 0, 0));
        btnNGOFundReq.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnNGOFundReq.setForeground(new java.awt.Color(255, 255, 255));
        btnNGOFundReq.setText("Request Funds from NGO");
        btnNGOFundReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNGOFundReqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(414, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(mnguserJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mngEmpJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mngOrgJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGovtFundReq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNGOFundReq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(mngOrgJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(mngEmpJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(mnguserJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGovtFundReq, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnNGOFundReq, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mnguserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnguserJButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(jPanel, entrpz);
        jPanel.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.next(jPanel);
    }//GEN-LAST:event_mnguserJButtonActionPerformed

    private void mngEmpJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngEmpJButtonActionPerformed


        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(jPanel, entrpz.getOrgDir());
        jPanel.add("manageEmployeeJPanel", manageEmployeeJPanel);


        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.next(jPanel);

    }//GEN-LAST:event_mngEmpJButtonActionPerformed

    private void mngOrgJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngOrgJButtonActionPerformed


        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(jPanel, entrpz.getOrgDir(), entrpz);
        jPanel.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.next(jPanel);
    }//GEN-LAST:event_mngOrgJButtonActionPerformed


    private void btnGovtFundReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGovtFundReqActionPerformed
        CardLayout layout = (CardLayout) jPanel.getLayout();
        jPanel.add("RequestFundsJPanel", new RequestFundsJPanel(jPanel, entrpz, usrAc, ecosystem));
        layout.next(jPanel);
    }//GEN-LAST:event_btnGovtFundReqActionPerformed

    private void btnNGOFundReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNGOFundReqActionPerformed
        // TODO add your handling code here:
       CardLayout layout = (CardLayout) jPanel.getLayout();
        jPanel.add("NGORequestFundsJPanel", new NGORequestFundsJPanel(jPanel, entrpz, usrAc, ecosystem));
        layout.next(jPanel);
    }//GEN-LAST:event_btnNGOFundReqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGovtFundReq;
    private javax.swing.JButton btnNGOFundReq;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mngEmpJButton;
    private javax.swing.JButton mngOrgJButton;
    private javax.swing.JButton mnguserJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}
