/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.CadastroSeguroController;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author João Pedro
 */
public class CadastroSeguro extends javax.swing.JFrame {

    private final CadastroSeguroController controller;

    /**
     * Creates new form CadastroSeguro
     */
    public CadastroSeguro() {
        initComponents();
        controller = new CadastroSeguroController(this);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        CodigoT = new javax.swing.JLabel();
        NomeT = new javax.swing.JLabel();
        TipoT = new javax.swing.JLabel();
        DescricaoT = new javax.swing.JLabel();
        ValorT = new javax.swing.JLabel();
        CodigoText = new javax.swing.JTextField();
        NomeText = new javax.swing.JTextField();
        TipoText = new javax.swing.JTextField();
        ValorText = new javax.swing.JTextField();
        DescricaoTextB = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 51, 51));
        Titulo.setText("Cadastro de Seguro");

        CodigoT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CodigoT.setForeground(new java.awt.Color(0, 0, 0));
        CodigoT.setText("Código do Seguro:");

        NomeT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NomeT.setForeground(new java.awt.Color(0, 0, 0));
        NomeT.setText("Seguradora:");

        TipoT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TipoT.setForeground(new java.awt.Color(0, 0, 0));
        TipoT.setText("Tipo de Seguro:");

        DescricaoT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DescricaoT.setForeground(new java.awt.Color(0, 0, 0));
        DescricaoT.setText("Descrição");

        ValorT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ValorT.setForeground(new java.awt.Color(0, 0, 0));
        ValorT.setText("Valor do Seguro:");

        CodigoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoTextActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        DescricaoTextB.setViewportView(jTextArea1);

        jButton1.setBackground(new java.awt.Color(102, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Cadastrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(Titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NomeT)
                        .addGap(14, 14, 14)
                        .addComponent(NomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(CodigoT)
                        .addGap(8, 8, 8)
                        .addComponent(CodigoText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TipoT)
                        .addGap(14, 14, 14)
                        .addComponent(TipoText, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(ValorT)
                        .addGap(6, 6, 6)
                        .addComponent(ValorText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DescricaoT)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(DescricaoTextB, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(490, 490, 490)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomeT)
                    .addComponent(NomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodigoT)
                    .addComponent(CodigoText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TipoT)
                    .addComponent(TipoText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValorT)
                    .addComponent(ValorText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(DescricaoT)
                .addGap(15, 15, 15)
                .addComponent(DescricaoTextB, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CodigoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoTextActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroSeguro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CodigoT;
    private javax.swing.JTextField CodigoText;
    private javax.swing.JLabel DescricaoT;
    private javax.swing.JScrollPane DescricaoTextB;
    private javax.swing.JLabel NomeT;
    private javax.swing.JTextField NomeText;
    private javax.swing.JLabel TipoT;
    private javax.swing.JTextField TipoText;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel ValorT;
    private javax.swing.JTextField ValorText;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    public JTextField getCodigoText() {
        return CodigoText;
    }

    public void setCodigoText(JTextField CodigoText) {
        this.CodigoText = CodigoText;
    }

    public String getDescricaoTextB() {
        return DescricaoTextB.toString();
    }

    public void setDescricaoTextB(JScrollPane DescricaoTextB) {
        this.DescricaoTextB = DescricaoTextB;
    }

    public JTextField getNomeText() {
        return NomeText;
    }

    public void setNomeText(JTextField NomeText) {
        this.NomeText = NomeText;
    }

    public JTextField getTipoText() {
        return TipoText;
    }

    public void setTipoText(JTextField TipoText) {
        this.TipoText = TipoText;
    }

    public JTextField getValorText() {
        return ValorText;
    }

    public void setValorText(JTextField ValorText) {
        this.ValorText = ValorText;
    }

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }


}