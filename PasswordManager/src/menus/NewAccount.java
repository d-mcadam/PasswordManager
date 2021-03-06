/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import data.Record;
import data.User;
import java.util.Arrays;
import javax.swing.UIManager;
import utilities.ImageUtilities;

/**
 *
 * @author DYLAN MCADAM
 */
public class NewAccount extends javax.swing.JDialog {
    
    private Main menuParent;
    private User thisUser;
    private Record currentRecord;

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
        checkboxShowPassword = new javax.swing.JCheckBox();

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
        buttonCreateRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateRecordActionPerformed(evt);
            }
        });

        buttonCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        labelAccountNameIcon.setToolTipText("Account name already exists.");

        checkboxShowPassword.setText("Show password");
        checkboxShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxShowPasswordActionPerformed(evt);
            }
        });

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
                                .addComponent(labelAccountNameIcon))
                            .addComponent(checkboxShowPassword))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkboxShowPassword)
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

    private void checkboxShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxShowPasswordActionPerformed
        this.textfieldPasswordBox.setEchoChar(this.checkboxShowPassword.isSelected() ? '\u0000' : '\u25cf');
    }//GEN-LAST:event_checkboxShowPasswordActionPerformed

    private void buttonCreateRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateRecordActionPerformed
        createNewAccount();
    }//GEN-LAST:event_buttonCreateRecordActionPerformed

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
    private javax.swing.JCheckBox checkboxShowPassword;
    private javax.swing.JLabel labelAccountNameIcon;
    private javax.swing.JLabel labelAccountTitleBox;
    private javax.swing.JLabel labelPasswordBox;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelUsernameBox;
    private javax.swing.JTextField textfieldAccountTitle;
    private javax.swing.JPasswordField textfieldPasswordBox;
    private javax.swing.JTextField textfieldUsernameBox;
    // End of variables declaration//GEN-END:variables

    public void setReferences(Main menuParent, User loggedInUser){
        this.menuParent = menuParent;
        thisUser = loggedInUser;
    }
    
    public void setReferences(Main menuParent, User loggedInUser, Record currentRecord){
        setReferences(menuParent, loggedInUser);
        this.currentRecord = currentRecord;
        
        this.buttonCreateRecord.setText("Save");
        
        this.textfieldAccountTitle.setText(currentRecord.getTitle());
        this.textfieldUsernameBox.setText(currentRecord.getUsername());
        this.textfieldPasswordBox.setText(currentRecord.getPassword());
    }
    
    private void checkSaveEligibility(){
        String accountName = this.textfieldAccountTitle.getText().trim();
        String accountUsername = this.textfieldUsernameBox.getText().trim();
        char[] accountPassword = this.textfieldPasswordBox.getPassword();
        
        boolean textInFields = !accountName.equals("") && !accountUsername.equals("") && accountPassword.length > 0;
        boolean accountNameIsUnique = this.currentRecord == null ? 
                !this.thisUser.getRecordObjects().stream().anyMatch(record -> record.getTitle().equals(accountName)) :
                !this.thisUser.getRecordObjects().stream().filter(record -> !record.getTitle().equals(this.currentRecord.getTitle())).anyMatch(record -> record.getTitle().equals(accountName));
        
        this.buttonCreateRecord.setEnabled(textInFields && accountNameIsUnique);
        this.buttonCreateRecord.setToolTipText(
                !textInFields ? "All fields require values." : 
                !accountNameIsUnique ? "Account name already exists." : "Create the new record");
        
        this.labelAccountNameIcon.setIcon(!accountNameIsUnique ? ImageUtilities.getFinalIcon(UIManager.getIcon("OptionPane.errorIcon"), 27, 27) : null);
    }

    private void createNewAccount(){
        String accountName = this.textfieldAccountTitle.getText().trim();
        String accountUsername = this.textfieldUsernameBox.getText().trim();
        char[] accountPassword = this.textfieldPasswordBox.getPassword();
        
        if (this.currentRecord == null){
            Record record = new Record(accountName, accountUsername, accountPassword);
            this.thisUser.addRecordObject(record);
        }else{
            this.currentRecord.setTitle(accountName);
            this.currentRecord.setUsername(accountUsername);
            this.currentRecord.setPassword(accountPassword);
        }
        
        this.menuParent.refreshList();
        this.dispose();
    }

}
