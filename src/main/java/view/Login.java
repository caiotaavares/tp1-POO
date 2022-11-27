/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author João Pedro
 */
public class Login extends javax.swing.JFrame {

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Enter = new javax.swing.JButton();
        SenhaDeUsuario = new javax.swing.JPasswordField();
        NomeDeUsuario = new javax.swing.JTextField();
        Senha = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        BackgroudLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Enter.setBackground(new java.awt.Color(255, 255, 255));
        Enter.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Enter.setForeground(new java.awt.Color(0, 0, 0));
        Enter.setText("Enter");
        getContentPane().add(Enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 870, 110, 30));

        SenhaDeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(SenhaDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 820, 290, 20));

        NomeDeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(NomeDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 750, 290, -1));

        Senha.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Senha.setForeground(new java.awt.Color(255, 255, 255));
        Senha.setText("Senha");
        getContentPane().add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 790, -1, -1));

        Login.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("Login");
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 660, 90, -1));

        Nome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Nome.setForeground(new java.awt.Color(255, 255, 255));
        Nome.setText("Nome de usuário");
        getContentPane().add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 720, 140, 20));

        BackgroudLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Logo.jpg"))); // NOI18N
        getContentPane().add(BackgroudLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroudLogo;
    private javax.swing.JButton Enter;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Nome;
    private javax.swing.JTextField NomeDeUsuario;
    private javax.swing.JLabel Senha;
    private javax.swing.JPasswordField SenhaDeUsuario;
    // End of variables declaration//GEN-END:variables
}
