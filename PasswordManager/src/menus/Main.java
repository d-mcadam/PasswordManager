/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

/**
 *
 * @author DYLAN MCADAM
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonCreateRecord = new javax.swing.JButton();
        buttonEditRecord = new javax.swing.JButton();
        buttonDeleteRecord = new javax.swing.JButton();
        scrollpaneAccountList = new javax.swing.JScrollPane();
        listAccounts = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        checkboxShowPasswords = new javax.swing.JCheckBox();
        checkboxDisableAutotypeConfirmation = new javax.swing.JCheckBox();
        checkboxAutoUseCoordinates = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        labelAccountTitleBox = new javax.swing.JLabel();
        labelUsernameBox = new javax.swing.JLabel();
        labelPasswordBox = new javax.swing.JLabel();
        textfieldAccountTitle = new javax.swing.JTextField();
        textfieldUsernameBox = new javax.swing.JTextField();
        textfieldPasswordBox = new javax.swing.JPasswordField();
        labelDisplayCreatedDate = new javax.swing.JLabel();
        buttonTypeUsername = new javax.swing.JButton();
        buttonTypePassword = new javax.swing.JButton();
        buttonTypeBoth = new javax.swing.JButton();
        labelCoordinatesSection = new javax.swing.JLabel();
        labelPasswordPoint = new javax.swing.JLabel();
        labelXPointColumn = new javax.swing.JLabel();
        labelYPointColumn = new javax.swing.JLabel();
        labelUsernamePoint = new javax.swing.JLabel();
        textfieldUsernameX = new javax.swing.JTextField();
        textfieldUsernameY = new javax.swing.JTextField();
        textfieldPasswordX = new javax.swing.JTextField();
        textFieldPasswordY = new javax.swing.JTextField();
        checkboxLockRecordCoordinates = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonCreateRecord.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonCreateRecord.setText("New Account Info");

        buttonEditRecord.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonEditRecord.setText("Edit");

        buttonDeleteRecord.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonDeleteRecord.setText("Delete");

        listAccounts.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollpaneAccountList.setViewportView(listAccounts);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        checkboxShowPasswords.setText("Show passwords");

        checkboxDisableAutotypeConfirmation.setText("Disable Auto-Type confirmation");

        checkboxAutoUseCoordinates.setText("Automatically use saved coordinates");

        labelAccountTitleBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelAccountTitleBox.setText("Selected:");

        labelUsernameBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelUsernameBox.setText("Username:");

        labelPasswordBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPasswordBox.setText("Password:");

        labelDisplayCreatedDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDisplayCreatedDate.setText("DD / MM / YY");
        labelDisplayCreatedDate.setToolTipText("The date this record was created");

        buttonTypeUsername.setText("Type");

        buttonTypePassword.setText("Type");

        buttonTypeBoth.setText("Type both");

        labelCoordinatesSection.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCoordinatesSection.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCoordinatesSection.setText("Coordinates:");

        labelPasswordPoint.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPasswordPoint.setText("Password:");

        labelXPointColumn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelXPointColumn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelXPointColumn.setText("X");

        labelYPointColumn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelYPointColumn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelYPointColumn.setText("Y");

        labelUsernamePoint.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelUsernamePoint.setText("Username:");

        textfieldUsernameX.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textfieldUsernameX.setText("0000");

        textfieldUsernameY.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textfieldUsernameY.setText("0000");

        textfieldPasswordX.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textfieldPasswordX.setText("0000");

        textFieldPasswordY.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldPasswordY.setText("0000");

        checkboxLockRecordCoordinates.setText("<html>Lock all coordinates<br>(Only for this record)</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonEditRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(buttonDeleteRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonCreateRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollpaneAccountList, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkboxDisableAutotypeConfirmation)
                            .addComponent(checkboxAutoUseCoordinates)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelCoordinatesSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelAccountTitleBox)
                                            .addComponent(labelUsernameBox)
                                            .addComponent(labelPasswordBox))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textfieldUsernameBox, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(textfieldPasswordBox)
                                            .addComponent(textfieldAccountTitle))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelDisplayCreatedDate, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(buttonTypePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonTypeUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonTypeBoth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelPasswordPoint)
                                    .addComponent(labelUsernamePoint))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelXPointColumn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(textfieldUsernameX)
                                    .addComponent(textfieldPasswordX))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelYPointColumn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(textfieldUsernameY)
                                    .addComponent(textFieldPasswordY))
                                .addGap(18, 18, 18)
                                .addComponent(checkboxLockRecordCoordinates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkboxShowPasswords)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonCreateRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonEditRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDeleteRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkboxShowPasswords)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkboxDisableAutotypeConfirmation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkboxAutoUseCoordinates)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAccountTitleBox)
                            .addComponent(textfieldAccountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDisplayCreatedDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelUsernameBox)
                            .addComponent(textfieldUsernameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonTypeUsername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPasswordBox)
                            .addComponent(textfieldPasswordBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonTypePassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonTypeBoth)
                            .addComponent(labelCoordinatesSection))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelXPointColumn)
                            .addComponent(labelYPointColumn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelUsernamePoint)
                                    .addComponent(textfieldUsernameX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textfieldUsernameY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelPasswordPoint)
                                    .addComponent(textfieldPasswordX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldPasswordY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(checkboxLockRecordCoordinates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(scrollpaneAccountList, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCreateRecord;
    private javax.swing.JButton buttonDeleteRecord;
    private javax.swing.JButton buttonEditRecord;
    private javax.swing.JButton buttonTypeBoth;
    private javax.swing.JButton buttonTypePassword;
    private javax.swing.JButton buttonTypeUsername;
    private javax.swing.JCheckBox checkboxAutoUseCoordinates;
    private javax.swing.JCheckBox checkboxDisableAutotypeConfirmation;
    private javax.swing.JCheckBox checkboxLockRecordCoordinates;
    private javax.swing.JCheckBox checkboxShowPasswords;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelAccountTitleBox;
    private javax.swing.JLabel labelCoordinatesSection;
    private javax.swing.JLabel labelDisplayCreatedDate;
    private javax.swing.JLabel labelPasswordBox;
    private javax.swing.JLabel labelPasswordPoint;
    private javax.swing.JLabel labelUsernameBox;
    private javax.swing.JLabel labelUsernamePoint;
    private javax.swing.JLabel labelXPointColumn;
    private javax.swing.JLabel labelYPointColumn;
    private javax.swing.JList<String> listAccounts;
    private javax.swing.JScrollPane scrollpaneAccountList;
    private javax.swing.JTextField textFieldPasswordY;
    private javax.swing.JTextField textfieldAccountTitle;
    private javax.swing.JPasswordField textfieldPasswordBox;
    private javax.swing.JTextField textfieldPasswordX;
    private javax.swing.JTextField textfieldUsernameBox;
    private javax.swing.JTextField textfieldUsernameX;
    private javax.swing.JTextField textfieldUsernameY;
    // End of variables declaration//GEN-END:variables
}
