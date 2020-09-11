/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import data.User;
import java.util.Arrays;
import javax.swing.UIManager;
import utilities.ImageUtilities;

/**
 *
 * @author DYLAN MCADAM
 */
public class NewAccount extends javax.swing.JDialog {
    
    private User thisUser;

    /**
     * Creates new form NewAccount
     */
    public NewAccount(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.textfieldPasswordBox.setEchoChar('\u25cf');
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitle = new javax.swing.JLabel();
        labelAccountTitleBox = new javax.swing.JLabel();
        labelUsernameBox = new javax.swing.JLabel();
        labelPasswordBox = new javax.swing.JLabel();
        textfieldAccountTitle = new javax.swing.JTextField();
        textfieldUsernameBox = new javax.swing.JTextField();
        textfieldPasswordBox = new javax.swing.JPasswordField();
        buttonCreateRecord = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        labelAccountNameIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Create Account Info");

        labelAccountTitleBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelAccountTitleBox.setText("Account:");

        labelUsernameBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelUsernameBox.setText("Username:");

        labelPasswordBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPasswordBox.setText("Password:");

        textfieldAccountTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldAccountTitleFocusGained(evt);
            }
        });
        textfieldAccountTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textfieldAccountTitleKeyReleased(evt);
            }
        });

        textfieldUsernameBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldUsernameBoxFocusGained(evt);
            }
        });
        textfieldUsernameBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textfieldUsernameBoxKeyReleased(evt);
            }
        });

        textfieldPasswordBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldPasswordBoxFocusGained(evt);
            }
        });
        textfieldPasswordBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textfieldPasswordBoxKeyReleased(evt);
            }
        });

        buttonCreateRecord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonCreateRecord.setText("Create");
        buttonCreateRecord.setEnabled(false);

        buttonCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        labelAccountNameIcon.setToolTipText("Username already exists.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelAccountTitleBox)
                            .addComponent(labelUsernameBox)
                            .addComponent(labelPasswordBox))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfieldUsernameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfieldPasswordBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textfieldAccountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelAccountNameIcon)))))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonCreateRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labelTitle)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelAccountTitleBox)
                        .addComponent(textfieldAccountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelAccountNameIcon))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsernameBox)
                    .addComponent(textfieldUsernameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPasswordBox)
                    .addComponent(textfieldPasswordBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCreateRecord)
                    .addComponent(buttonCancel))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textfieldAccountTitleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldAccountTitleFocusGained
        this.textfieldAccountTitle.selectAll();
    }//GEN-LAST:event_textfieldAccountTitleFocusGained

    private void textfieldUsernameBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldUsernameBoxFocusGained
        this.textfieldUsernameBox.selectAll();
    }//GEN-LAST:event_textfieldUsernameBoxFocusGained

    private void textfieldPasswordBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldPasswordBoxFocusGained
        this.textfieldPasswordBox.selectAll();
    }//GEN-LAST:event_textfieldPasswordBoxFocusGained

    private void textfieldAccountTitleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldAccountTitleKeyReleased
        checkSaveEligibility();
    }//GEN-LAST:event_textfieldAccountTitleKeyReleased

    private void textfieldUsernameBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldUsernameBoxKeyReleased
        checkSaveEligibility();
    }//GEN-LAST:event_textfieldUsernameBoxKeyReleased

    private void textfieldPasswordBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldPasswordBoxKeyReleased
        checkSaveEligibility();
    }//GEN-LAST:event_textfieldPasswordBoxKeyReleased

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewAccount dialog = new NewAccount(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonCreateRecord;
    private javax.swing.JLabel labelAccountNameIcon;
    private javax.swing.JLabel labelAccountTitleBox;
    private javax.swing.JLabel labelPasswordBox;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelUsernameBox;
    private javax.swing.JTextField textfieldAccountTitle;
    private javax.swing.JPasswordField textfieldPasswordBox;
    private javax.swing.JTextField textfieldUsernameBox;
    // End of variables declaration//GEN-END:variables

    public void setReferences(User loggedInUser) {
        thisUser = loggedInUser;
    }
    
    private void checkSaveEligibility() {
        String accountName = this.textfieldAccountTitle.getText().trim();
        String accountUsername = this.textfieldUsernameBox.getText().trim();
        char[] accountPassword = this.textfieldPasswordBox.getPassword();
        
        boolean textInFields = !accountName.equals("") && !accountUsername.equals("") && accountPassword.length > 0;
        boolean accountNameIsUnique = !this.thisUser.getRecordObjects().stream().anyMatch(record -> record.getTitle().equals(accountName));
        
        this.buttonCreateRecord.setEnabled(textInFields && accountNameIsUnique);
        this.buttonCreateRecord.setToolTipText(
                !textInFields ? "All fields require values." : 
                !accountNameIsUnique ? "Account name already exists." : "Create the new record");
        
        this.labelAccountNameIcon.setIcon(!accountNameIsUnique ? ImageUtilities.getFinalIcon(UIManager.getIcon("OptionPane.errorIcon"), 27, 27) : null);
    }

}
