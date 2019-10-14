
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UserMenu extends javax.swing.JFrame {

    static ArrayList<User> arrUser;
    static int userIndex;
    public static String answer;
    public static String question;

    /**
     * Creates new form UserMenu
     */
    public UserMenu (ArrayList<User> arrUser , int userIndex , String question , String answer) {
        initComponents ();
        initComponents ();
        UserMenu.question = question;
        UserMenu.answer = answer;
        UserMenu.arrUser = arrUser;
        UserMenu.userIndex = userIndex;
        lblWelcomeUser.setText ("welcome " + arrUser.get (userIndex).getName ());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTest2 = new javax.swing.JLabel();
        lblWelcomeUser = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBackUserMenu = new javax.swing.JButton();

        lblTest2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTest2.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblWelcomeUser.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lblWelcomeUser.setLabelFor(lblWelcomeUser);
        getContentPane().add(lblWelcomeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 151, -1, -1));

        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEdit.setText("Edit Profile");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setText("Delete Profile");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        btnBackUserMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBackUserMenu.setText("Logout");
        btnBackUserMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackUserMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnBackUserMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

        setSize(new java.awt.Dimension(918, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackUserMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackUserMenuActionPerformed
        Login log = new Login ();
        log.setVisible (true);
        log.setSize (900 , 600);
        log.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        this.dispose ();
    }//GEN-LAST:event_btnBackUserMenuActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        userEditForm edit = new userEditForm (arrUser , userIndex , question , answer);
        edit.setVisible (true);
        edit.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        this.dispose ();

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int op = JOptionPane.showConfirmDialog (null , "Do you really want to delete your account?" , "Delete Account" , JOptionPane.YES_NO_OPTION);

        if ( op == JOptionPane.YES_OPTION ) {
            arrUser.remove (userIndex);
            JOptionPane.showMessageDialog (null , "Your account was successfully deleted" , "Delete Account" , JOptionPane.INFORMATION_MESSAGE);

            Register reg;
            try {
                reg = new Register (arrUser);
                reg.saveToFile (arrUser);
            } catch ( NoSuchAlgorithmException | NoSuchPaddingException ex ) {
                Logger.getLogger (UserMenu.class.getName ()).log (Level.SEVERE , null , ex);
            }

            Login log = new Login ();
            log.setVisible (true);
            log.setSize (900 , 600);
            log.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
            this.dispose ();
        } else if ( op == JOptionPane.NO_OPTION ) {
            JOptionPane.showMessageDialog (null , "You cancelled the Deletion" , "Delete Account" , JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        /*
            Change File Permission
         */
        File shadow = new File ("shadow.txt");
        File integrity = new File ("integrity.txt");

        shadow.setExecutable (false);
        shadow.setReadable (false);
        shadow.setWritable (false);

        integrity.setExecutable (false);
        integrity.setReadable (false);
        integrity.setWritable (false);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main (String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for ( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels () ) {
                if ( "Nimbus".equals (info.getName ()) ) {
                    javax.swing.UIManager.setLookAndFeel (info.getClassName ());
                    break;
                }
            }
        } catch ( ClassNotFoundException ex ) {
            java.util.logging.Logger.getLogger (UserMenu.class.getName ()).log (java.util.logging.Level.SEVERE , null , ex);
        } catch ( InstantiationException ex ) {
            java.util.logging.Logger.getLogger (UserMenu.class.getName ()).log (java.util.logging.Level.SEVERE , null , ex);
        } catch ( IllegalAccessException ex ) {
            java.util.logging.Logger.getLogger (UserMenu.class.getName ()).log (java.util.logging.Level.SEVERE , null , ex);
        } catch ( javax.swing.UnsupportedLookAndFeelException ex ) {
            java.util.logging.Logger.getLogger (UserMenu.class.getName ()).log (java.util.logging.Level.SEVERE , null , ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater (new Runnable () {
            public void run () {
                new UserMenu (arrUser , userIndex , question , answer).setVisible (true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackUserMenu;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel lblTest2;
    private javax.swing.JLabel lblWelcomeUser;
    // End of variables declaration//GEN-END:variables

}
