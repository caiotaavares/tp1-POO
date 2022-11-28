/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.OperacaoVendaController;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author João Pedro
 */
public class OperacaoVenda extends javax.swing.JFrame {

    private final OperacaoVendaController controller;

    /**
     * Creates new form OperacaoVenda
     */
    public OperacaoVenda() {
        initComponents();
        controller = new OperacaoVendaController(this);
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
        ClienteT = new javax.swing.JLabel();
        CorretorT = new javax.swing.JLabel();
        CodigoIT = new javax.swing.JLabel();
        DataVT = new javax.swing.JLabel();
        ValorTT = new javax.swing.JLabel();
        FormaPT = new javax.swing.JLabel();
        CartaoT = new javax.swing.JLabel();
        NomeT = new javax.swing.JLabel();
        BandeiraT = new javax.swing.JLabel();
        NumeroT = new javax.swing.JLabel();
        ClienteText = new javax.swing.JTextField();
        CorretorText = new javax.swing.JTextField();
        CodigoIText = new javax.swing.JTextField();
        DataVText = new javax.swing.JTextField();
        ValorTText = new javax.swing.JTextField();
        FormaPBox = new javax.swing.JComboBox<>();
        NomeText = new javax.swing.JTextField();
        BandeiraText = new javax.swing.JTextField();
        NumeroText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 51, 51));
        Titulo.setText("Venda");

        ClienteT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ClienteT.setForeground(new java.awt.Color(0, 0, 0));
        ClienteT.setText("Cliente:");

        CorretorT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CorretorT.setForeground(new java.awt.Color(0, 0, 0));
        CorretorT.setText("Corretor:");

        CodigoIT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CodigoIT.setForeground(new java.awt.Color(0, 0, 0));
        CodigoIT.setText("Código do Imóvel:");

        DataVT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DataVT.setForeground(new java.awt.Color(0, 0, 0));
        DataVT.setText("Data da Venda:");

        ValorTT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ValorTT.setForeground(new java.awt.Color(0, 0, 0));
        ValorTT.setText("Valor Total da Venda:");

        FormaPT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FormaPT.setForeground(new java.awt.Color(0, 0, 0));
        FormaPT.setText("Forma de pagamento:");

        CartaoT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        CartaoT.setForeground(new java.awt.Color(0, 51, 51));
        CartaoT.setText("Cartão");

        NomeT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NomeT.setForeground(new java.awt.Color(0, 0, 0));
        NomeT.setText("Nome:");

        BandeiraT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BandeiraT.setForeground(new java.awt.Color(0, 0, 0));
        BandeiraT.setText("Bandeira:");

        NumeroT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NumeroT.setForeground(new java.awt.Color(0, 0, 0));
        NumeroT.setText("Número:");

        ClienteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteTextActionPerformed(evt);
            }
        });

        CodigoIText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoITextActionPerformed(evt);
            }
        });

        DataVText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataVTextActionPerformed(evt);
            }
        });

        FormaPBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boleto", "Débito", "Crédito", "Dinheiro" }));

        jButton1.setBackground(new java.awt.Color(102, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Cadastrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(ClienteT)
                                .addGap(13, 13, 13)
                                .addComponent(ClienteText, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(CorretorT)
                                .addGap(10, 10, 10)
                                .addComponent(CorretorText, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(CodigoIT)
                                .addGap(11, 11, 11)
                                .addComponent(CodigoIText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(DataVT)
                                .addGap(19, 19, 19)
                                .addComponent(DataVText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ValorTT)
                                .addGap(11, 11, 11)
                                .addComponent(ValorTText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(FormaPT)
                                .addGap(13, 13, 13)
                                .addComponent(FormaPBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(CartaoT))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(NomeT)
                                .addGap(17, 17, 17)
                                .addComponent(NomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(BandeiraT)
                                .addGap(18, 18, 18)
                                .addComponent(BandeiraText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(NumeroT)
                                .addGap(21, 21, 21)
                                .addComponent(NumeroText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(500, 500, 500)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(Titulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClienteT)
                    .addComponent(ClienteText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CorretorT)
                    .addComponent(CorretorText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CodigoIT)
                    .addComponent(CodigoIText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataVT)
                    .addComponent(DataVText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ValorTT)
                    .addComponent(ValorTText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FormaPT)
                    .addComponent(FormaPBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(CartaoT)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomeT)
                    .addComponent(NomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BandeiraT)
                    .addComponent(BandeiraText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NumeroT)
                    .addComponent(NumeroText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClienteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteTextActionPerformed

    private void CodigoITextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoITextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoITextActionPerformed

    private void DataVTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataVTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataVTextActionPerformed

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
            java.util.logging.Logger.getLogger(OperacaoVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperacaoVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperacaoVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperacaoVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperacaoVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BandeiraT;
    private javax.swing.JTextField BandeiraText;
    private javax.swing.JLabel CartaoT;
    private javax.swing.JLabel ClienteT;
    private javax.swing.JTextField ClienteText;
    private javax.swing.JLabel CodigoIT;
    private javax.swing.JTextField CodigoIText;
    private javax.swing.JLabel CorretorT;
    private javax.swing.JTextField CorretorText;
    private javax.swing.JLabel DataVT;
    private javax.swing.JTextField DataVText;
    private javax.swing.JComboBox<String> FormaPBox;
    private javax.swing.JLabel FormaPT;
    private javax.swing.JLabel NomeT;
    private javax.swing.JTextField NomeText;
    private javax.swing.JLabel NumeroT;
    private javax.swing.JTextField NumeroText;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel ValorTT;
    private javax.swing.JTextField ValorTText;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

    public JTextField getBandeiraText() {
        return BandeiraText;
    }

    public void setBandeiraText(JTextField BandeiraText) {
        this.BandeiraText = BandeiraText;
    }

    public JTextField getClienteText() {
        return ClienteText;
    }

    public void setClienteText(JTextField ClienteText) {
        this.ClienteText = ClienteText;
    }

    public JTextField getCodigoIText() {
        return CodigoIText;
    }

    public void setCodigoIText(JTextField CodigoIText) {
        this.CodigoIText = CodigoIText;
    }

    public JTextField getCorretorText() {
        return CorretorText;
    }

    public void setCorretorText(JTextField CorretorText) {
        this.CorretorText = CorretorText;
    }

    public JTextField getDataVText() {
        return DataVText;
    }

    public void setDataVText(JTextField DataVText) {
        this.DataVText = DataVText;
    }

    public String getFormaPBox() {
        return FormaPBox.getSelectedItem().toString();
    }

    public void setFormaPBox(JComboBox<String> FormaPBox) {
        this.FormaPBox = FormaPBox;
    }

    public JTextField getNomeText() {
        return NomeText;
    }

    public void setNomeText(JTextField NomeText) {
        this.NomeText = NomeText;
    }

    public JTextField getNumeroText() {
        return NumeroText;
    }

    public void setNumeroText(JTextField NumeroText) {
        this.NumeroText = NumeroText;
    }

    public JTextField getValorTText() {
        return ValorTText;
    }

    public void setValorTText(JTextField ValorTText) {
        this.ValorTText = ValorTText;
    }


}
