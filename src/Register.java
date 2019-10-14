
import java.io.*;
import java.security.*;
import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import javax.swing.*;
import javax.xml.bind.DatatypeConverter;

public class Register extends javax.swing.JFrame {

    ArrayList<String> newEncArr = new ArrayList<> ();
    static ArrayList<User> arrUser;
    static ArrayList<String> encArr;
    static ArrayList<String> decArr;

    Cipher cipher;
    byte[] encryptKey = "0yRevERvBN8CgYEAoozQh/d1RCv/h/+s9C7K9BBP3p94KL6+yft902j+XbKvySVKPumUNHG2mi/qW4X3KgCfT69FDapa2TjIsqlOJl3oElYT2t4KUinTH51ycXgEGjva".getBytes ();
    IvParameterSpec IvParameters = new IvParameterSpec (new byte[] { 12 , 34 , 56 , 78 , 90 , 87 , 65 , 43 });

    /**
     * Creates new form Register
     */
    public Register (ArrayList<User> arrUser) throws NoSuchAlgorithmException , NoSuchPaddingException {
        this.cipher = Cipher.getInstance ("DESede/CBC/PKCS5Padding");
        Register.arrUser = arrUser;
    }

    public Register (ArrayList<User> arrUser , ArrayList<String> encArr , ArrayList<String> decArr) throws NoSuchAlgorithmException , NoSuchPaddingException {
        this.cipher = Cipher.getInstance ("DESede/CBC/PKCS5Padding");
        Register.arrUser = arrUser;
        Register.encArr = encArr;
        Register.decArr = decArr;
        initComponents ();
    }

    public Register () {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txbName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txbUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txbPass = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txbRePass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        btnBackRegister = new javax.swing.JButton();
        lblQuestion = new javax.swing.JLabel();
        cboxQuestion = new javax.swing.JComboBox<>();
        lblAnswer = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign-up");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txbName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 189, 240, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 189, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 231, -1, -1));

        txbUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txbUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbUserActionPerformed(evt);
            }
        });
        getContentPane().add(txbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 231, 240, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 270, -1, -1));

        txbPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txbPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 270, 240, -1));

        btnRegister.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Re-Type Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 308, -1, -1));

        txbRePass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txbRePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbRePassActionPerformed(evt);
            }
        });
        getContentPane().add(txbRePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 307, 240, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Register");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 58, -1, -1));

        btnBackRegister.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBackRegister.setText("Back");
        btnBackRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnBackRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, -1, -1));

        lblQuestion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblQuestion.setText("Question");
        getContentPane().add(lblQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        cboxQuestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select...", "What's your birthplace?", "What's your favourite animal?", "What's your first school?" }));
        cboxQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxQuestionActionPerformed(evt);
            }
        });
        getContentPane().add(cboxQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, -1));

        lblAnswer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAnswer.setText("Answer");
        getContentPane().add(lblAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

        txtAnswer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswerActionPerformed(evt);
            }
        });
        getContentPane().add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 250, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txbUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbUserActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        String strName = txbName.getText ();
        String strUser = txbUser.getText ();
        String strPass = txbPass.getText ();
        String strRePass = txbRePass.getText ();
        String question = ( String ) cboxQuestion.getSelectedItem ();
        String answer = txtAnswer.getText ();

        boolean isAnswer = false;
        boolean isQuestion = false;
        boolean isNameBlank = false;
        boolean isUserBlank = false;
        boolean isPassBlank = false;
        boolean isPassEqual = false;
        boolean isUserUnique = false;
        boolean isAlphaNum = false;

        //-----------Checking for empty name
        if (  ! ( ( strName.equals (" ") ) || ( strName.equals ("") ) ) ) {
            isNameBlank = true;
        } else {
            JOptionPane.showMessageDialog (null , "Name Required" , "Error" , JOptionPane.ERROR_MESSAGE);
        }

        //-----------Checking for empty username
        if (  ! ( ( strUser.equals (" ") ) || ( strUser.equals ("") ) ) ) {
            isUserBlank = true;
        } else {
            JOptionPane.showMessageDialog (null , "Username Required" , "Error" , JOptionPane.ERROR_MESSAGE);
        }

        //-----------Checking for empty password, password should be 8 or more characters and including uppercase, lowercase and numbers
        isAlphaNum = isValidPassword (strPass);
        if (  ! ( ( strPass.equals (" ") ) && ( strPass.equals ("") ) ) ) {
            if ( ( strPass.length () > 7 ) ) {
                if ( isAlphaNum ) {
                    isPassBlank = true;
                } else {
                    JOptionPane.showMessageDialog (null , "Password Should Have Uppercase, Lowercase and Numbers" , "Error" , JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog (null , "Password Should Be 8 Or More Characters" , "Error" , JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog (null , "Password Required" , "Error" , JOptionPane.ERROR_MESSAGE);
        }

        //-----------Checking for matching passwords
        if (  ! ( strPass.equals (strRePass) ) ) {
            JOptionPane.showMessageDialog (null , "Password Mismatch" , "Error" , JOptionPane.ERROR_MESSAGE);
        } else {
            isPassEqual = true;
        }

        //-------------Checking for existing username
        for ( int i = 0; i < arrUser.size (); i ++ ) {
            if ( arrUser.get (i).getUserName ().equals (strUser) ) {
                JOptionPane.showMessageDialog (null , "Username Exists" , "Error" , JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        if ( cboxQuestion.getSelectedIndex () != 0 ) {
            question = ( String ) cboxQuestion.getSelectedItem ();
            isQuestion = true;
        } else {
            JOptionPane.showMessageDialog (null , "Please Select One Question" , "Select" , JOptionPane.ERROR_MESSAGE);
            isQuestion = false;
        }

        if ( answer.equals ("") ) {
            JOptionPane.showMessageDialog (null , "You can't leave the answer blank" , "Select" , JOptionPane.ERROR_MESSAGE);
            isAnswer = false;
        } else {
            isAnswer = true;
        }

        //-----------------Only save the arraylist and to file if all the conditions are met
        if ( ( isNameBlank ) && ( isUserBlank ) && ( isPassBlank ) && ( isPassEqual ) && ( isQuestion ) && ( isAnswer ) ) {
            String hashPass = BCrypt.hashpw (strPass , BCrypt.gensalt (13));
            arrUser.add (new User (strName , strUser , hashPass , hashPass , question , answer));
            saveToFile (arrUser);

            //-------Reset all the textfields
            txbName.setText ("");
            txbUser.setText ("");
            txbPass.setText ("");
            txbRePass.setText ("");

            //--------If all the conditions are met, return to the login page
            JOptionPane.showMessageDialog (rootPane , "Account Saved" , "Success" , JOptionPane.INFORMATION_MESSAGE);
            Login log = new Login ();
            log.setVisible (true);
            log.setSize (900 , 600);
            log.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
            this.dispose ();
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    void saveToFile (ArrayList<User> arrUser) {
        try {
            //--------------use Tripple DES encryption
            DESedeKeySpec spec = new DESedeKeySpec (encryptKey);
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance ("DESede");
            SecretKey theKey = keyFactory.generateSecret (spec);
            cipher.init (Cipher.ENCRYPT_MODE , theKey , IvParameters);

            /*
                parse each index into a string and then into a byte array
                apply the encryption and then encoded to Base64
                parse the byte array into a string and save it into ArrayList encArr
             */
            for ( int i = 0; i < arrUser.size (); i ++ ) {
                String clearString = arrUser.get (i).getName () + "," + arrUser.get (i).getUserName () + "," + arrUser.get (i).getPassword () + "," + arrUser.get (i).getRePassword () + "," + arrUser.get (i).getQuestion () + "," + arrUser.get (i).getAnswer ();
                byte[] clearByte = clearString.getBytes ();
                byte[] encryptByte = cipher.doFinal (clearByte);
                String base64Enc = Base64.getEncoder ().encodeToString (encryptByte);
                newEncArr.add (base64Enc);
            }
            try ( BufferedWriter outToFile = new BufferedWriter (new FileWriter ("shadow.txt")) ) {
                //--------write the encrypted data to file
                for ( int i = 0; i < newEncArr.size (); i ++ ) {
                    String encryptData = newEncArr.get (i);
                    System.out.println ("save: " + encryptData);  //test
                    outToFile.write (encryptData);
                    outToFile.newLine ();
                }
            }
        } catch ( Exception ea ) {
            ea.printStackTrace ();
        }
        //save the hash in another file
        try {
            String hashStr = generateHash ();
            System.out.println ("admin: " + hashStr);
            BufferedWriter outToFile = new BufferedWriter (new FileWriter ("integrity.txt"));
            outToFile.write (hashStr);
            outToFile.close ();
        } catch ( Exception e ) {
            e.printStackTrace ();
        }

    }

    public static String generateHash () throws NoSuchAlgorithmException , InvalidKeyException , IOException {
        String message = "";
        String line = "";
        String secretKey = "3a6aSWdBsRne62l0xroB34+1haFY+J3Qm4JeVdT4h3lAuhCVU2Gf2gDmFVVyxVP8DiCYLaNRhRnIfBUFWOpSGROnKEQ64fyJKwe9AZr4deauVyDMqrZy5TKp2pVi/aDE";
        try {
            //-----------------Reading from a file
            BufferedReader br = new BufferedReader (new FileReader (new File ("shadow.txt")));
            while ( ( line = br.readLine () ) != null ) {
                message += line;
            }
            br.close ();
        } catch ( Exception e ) {
            System.out.println ("not working");
        }

        Mac hasher = Mac.getInstance ("HmacSHA256");
        hasher.init (new SecretKeySpec (secretKey.getBytes () , "HmacSHA256"));
        byte[] hash = hasher.doFinal (message.getBytes ());

        // to base64
        String hashStr = DatatypeConverter.printBase64Binary (hash);
        return hashStr;
    }

    public boolean isValidPassword (String strPass) {
        String num = ".*[0-9].*";
        String alpha = ".*[A-Z].*";
        return strPass.matches (num) && strPass.matches (alpha);
    }


    private void txbRePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbRePassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbRePassActionPerformed

    private void btnBackRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackRegisterActionPerformed
        Login log = new Login ();
        log.setVisible (true);
        log.setSize (900 , 600);
        log.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        this.dispose ();
    }//GEN-LAST:event_btnBackRegisterActionPerformed

    private void cboxQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxQuestionActionPerformed


    }//GEN-LAST:event_cboxQuestionActionPerformed

    private void txtAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswerActionPerformed


    }//GEN-LAST:event_txtAnswerActionPerformed

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
            java.util.logging.Logger.getLogger (Register.class.getName ()).log (java.util.logging.Level.SEVERE , null , ex);
        } catch ( InstantiationException ex ) {
            java.util.logging.Logger.getLogger (Register.class.getName ()).log (java.util.logging.Level.SEVERE , null , ex);
        } catch ( IllegalAccessException ex ) {
            java.util.logging.Logger.getLogger (Register.class.getName ()).log (java.util.logging.Level.SEVERE , null , ex);
        } catch ( javax.swing.UnsupportedLookAndFeelException ex ) {
            java.util.logging.Logger.getLogger (Register.class.getName ()).log (java.util.logging.Level.SEVERE , null , ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater (new Runnable () {
            public void run () {
                try {
                    new Register (arrUser , encArr , decArr).setVisible (true);
                } catch ( Exception e ) {
                    e.printStackTrace ();
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackRegister;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cboxQuestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblAnswer;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JTextField txbName;
    private javax.swing.JPasswordField txbPass;
    private javax.swing.JPasswordField txbRePass;
    private javax.swing.JTextField txbUser;
    private javax.swing.JTextField txtAnswer;
    // End of variables declaration//GEN-END:variables
}