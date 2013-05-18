/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hpvas20131d;

import control.SearchControl;
import entity.Owner;
import java.security.acl.Acl;
import java.util.ArrayList;

/**
 *
 * @author antonio
 */
public class MainView extends javax.swing.JFrame {

    private static SearchControl search;
    
    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        TabbedPane.add("Consulta", new ResultsView());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchTF = new javax.swing.JTextField();
        searchB = new javax.swing.JButton();
        jComboBoxSelect = new javax.swing.JComboBox();
        loginB = new javax.swing.JButton();
        titleL = new javax.swing.JLabel();
        TabbedPane = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchB.setText("Search");
        searchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBActionPerformed(evt);
            }
        });

        jComboBoxSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "all", "veterinarian", "owner", "pet", "SSN" }));

        loginB.setText("LogIn");
        loginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBActionPerformed(evt);
            }
        });

        titleL.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        titleL.setText("Healthy Pets Veterinarian Association ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TabbedPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchTF))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchB))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(loginB)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginB)
                    .addComponent(titleL, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchB)
                    .addComponent(jComboBoxSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBActionPerformed
        // TODO add your handling code here:
        Login login = new Login(this, true);
        login.setVisible(true);
    }//GEN-LAST:event_loginBActionPerformed

    private void searchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBActionPerformed
        switch(jComboBoxSelect.getSelectedItem().toString()){
            case "all":
                search.searchAll(searchTF.getText());
                showVeterinarian();
                showOwner();
                showPet();
            case "veterinarian":
                search.searchVeterinarian(searchTF.getText());
                showVeterinarian();
            case "owner":
                search.searchOwner(searchTF.getText());
                showOwner();
            case "pet":
                search.searchPet(searchTF.getText());
                showPet();
            case "SSN":
                search.searchPerson(searchTF.getText());
                showSSN();
        }
    }//GEN-LAST:event_searchBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }
    
    public void showVeterinarian(){}
    public void showOwner(){
        OwnerPanel ownerPanel = new OwnerPanel();
        TabbedPane.add(ownerPanel);
        ownerPanel.setVisible(false);        
        //ownerPanel.ownerNameL.setText(search.getOwners().get(0).getName());
        //ownerPanel.ownerLastNameL.setText(search.getOwners().get(0).getLastName());
        //ownerPanel.ownerBirthDateL.setText(search.getOwners().get(0).getBirthDate().toString());
        //ownerPanel.ownerBirthPlaceL.setText(search.getOwners().get(0).getBirthPlace());
        //ownerPanel.ownerssnL.setText(search.getOwners().get(0).getSSN());
        ownerPanel.setVisible(true);
    }
    public void showPet(){}
    public void showSSN(){}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JComboBox jComboBoxSelect;
    private javax.swing.JButton loginB;
    private javax.swing.JButton searchB;
    private javax.swing.JTextField searchTF;
    private javax.swing.JLabel titleL;
    // End of variables declaration//GEN-END:variables
}
