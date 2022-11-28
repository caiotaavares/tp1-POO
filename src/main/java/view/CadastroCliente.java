/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.CadastroClienteController;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author João Pedro
 */
public class CadastroCliente extends javax.swing.JFrame {

    private final CadastroClienteController controller;

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
        controller = new CadastroClienteController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NomeT1 = new javax.swing.JLabel();
        CPFT1 = new javax.swing.JLabel();
        NacimentoT1 = new javax.swing.JLabel();
        Rg1 = new javax.swing.JLabel();
        EnderecoT1 = new javax.swing.JLabel();
        CEPT1 = new javax.swing.JLabel();
        EmailT1 = new javax.swing.JLabel();
        TelefoneT1 = new javax.swing.JLabel();
        NomeText = new javax.swing.JTextField();
        CPFText = new javax.swing.JTextField();
        NacimentoText = new javax.swing.JTextField();
        RgText = new javax.swing.JTextField();
        EnderecoText = new javax.swing.JTextField();
        CEPText = new javax.swing.JTextField();
        EmailText = new javax.swing.JTextField();
        TelefoneText = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Cadastro dos Clientes");

        NomeT1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NomeT1.setForeground(new java.awt.Color(0, 0, 0));
        NomeT1.setText("Nome:");

        CPFT1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CPFT1.setForeground(new java.awt.Color(0, 0, 0));
        CPFT1.setText("CPF:");

        NacimentoT1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NacimentoT1.setForeground(new java.awt.Color(0, 0, 0));
        NacimentoT1.setText("Data de Nacimento:");

        Rg1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Rg1.setForeground(new java.awt.Color(0, 0, 0));
        Rg1.setText("RG:");

        EnderecoT1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EnderecoT1.setForeground(new java.awt.Color(0, 0, 0));
        EnderecoT1.setText("Endereço:");

        CEPT1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CEPT1.setForeground(new java.awt.Color(0, 0, 0));
        CEPT1.setText("CEP:");

        EmailT1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EmailT1.setForeground(new java.awt.Color(0, 0, 0));
        EmailT1.setText("Email:");

        TelefoneT1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TelefoneT1.setForeground(new java.awt.Color(0, 0, 0));
        TelefoneT1.setText("Telefone:");

        NomeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeTextActionPerformed(evt);
            }
        });

        RgText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RgTextActionPerformed(evt);
            }
        });

        EnderecoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnderecoTextActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 255, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel1)
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(NomeT1)
                            .addGap(7, 7, 7)
                            .addComponent(NomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(90, 90, 90)
                            .addComponent(CPFT1)
                            .addGap(16, 16, 16)
                            .addComponent(CPFText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(NacimentoT1)
                            .addGap(13, 13, 13)
                            .addComponent(NacimentoText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(90, 90, 90)
                            .addComponent(Rg1)
                            .addGap(23, 23, 23)
                            .addComponent(RgText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(EnderecoT1)
                            .addGap(13, 13, 13)
                            .addComponent(EnderecoText, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(CEPT1)
                            .addGap(6, 6, 6)
                            .addComponent(CEPText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(EmailT1)
                            .addGap(44, 44, 44)
                            .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(TelefoneT1)
                            .addGap(9, 9, 9)
                            .addComponent(TelefoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(490, 490, 490)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(380, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NomeT1)
                        .addComponent(NomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CPFT1)
                        .addComponent(CPFText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NacimentoT1)
                        .addComponent(NacimentoText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Rg1)
                        .addComponent(RgText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(80, 80, 80)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(EnderecoT1)
                        .addComponent(EnderecoText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CEPT1)
                        .addComponent(CEPText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(EmailT1)
                        .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TelefoneT1)
                        .addComponent(TelefoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NomeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeTextActionPerformed

    private void RgTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RgTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RgTextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        controller.CadastrarCliente();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void EnderecoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnderecoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnderecoTextActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CEPT1;
    private javax.swing.JTextField CEPText;
    private javax.swing.JLabel CPFT1;
    private javax.swing.JTextField CPFText;
    private javax.swing.JLabel EmailT1;
    private javax.swing.JTextField EmailText;
    private javax.swing.JLabel EnderecoT1;
    private javax.swing.JTextField EnderecoText;
    private javax.swing.JLabel NacimentoT1;
    private javax.swing.JTextField NacimentoText;
    private javax.swing.JLabel NomeT1;
    private javax.swing.JTextField NomeText;
    private javax.swing.JLabel Rg1;
    private javax.swing.JTextField RgText;
    private javax.swing.JLabel TelefoneT1;
    private javax.swing.JTextField TelefoneText;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public JTextField getCEPText() {
        return CEPText;
    }

    public void setCEPText(JTextField CEPText) {
        this.CEPText = CEPText;
    }

    public JTextField getCPFText() {
        return CPFText;
    }

    public void setCPFText(JTextField CPFText) {
        this.CPFText = CPFText;
    }

    public JTextField getEmailText() {
        return EmailText;
    }

    public void setEmailText(JTextField EmailText) {
        this.EmailText = EmailText;
    }

    public JTextField getEnderecoText() {
        return EnderecoText;
    }

    public void setEnderecoText(JTextField EnderecoText) {
        this.EnderecoText = EnderecoText;
    }

    public JTextField getNacimentoText() {
        return NacimentoText;
    }

    public void setNacimentoText(JTextField NacimentoText) {
        this.NacimentoText = NacimentoText;
    }

    public JTextField getNomeText() {
        return NomeText;
    }

    public void setNomeText(JTextField NomeText) {
        this.NomeText = NomeText;
    }

    public JTextField getRgText() {
        return RgText;
    }

    public void setRgText(JTextField RgText) {
        this.RgText = RgText;
    }

    public JTextField getTelefoneText() {
        return TelefoneText;
    }

    public void setTelefoneText(JTextField TelefoneText) {
        this.TelefoneText = TelefoneText;
    }
    
    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public void mensagem(String menssage){
        JOptionPane.showMessageDialog(null, menssage);
    }


}
