/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.InformacoesClientesController;

/**
 *
 * @author João Pedro
 */
public class InformacoesClientes extends javax.swing.JFrame {

    private final InformacoesClientesController controller;

    /**
     * Creates new form InformacoesClientes
     */
    public InformacoesClientes() {
        initComponents();
        controller = new InformacoesClientesController(this);
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
        NomeT = new javax.swing.JLabel();
        AlugueisT = new javax.swing.JLabel();
        HistoricoB = new javax.swing.JButton();
        AlugueisB = new javax.swing.JButton();
        NomeText = new javax.swing.JTextField();
        AlugueisBox = new javax.swing.JComboBox<>();
        Tabela = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 51, 51));
        Titulo.setText("Clientes");

        NomeT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NomeT.setForeground(new java.awt.Color(0, 0, 0));
        NomeT.setText("Nome do cliente");

        AlugueisT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AlugueisT.setForeground(new java.awt.Color(0, 0, 0));
        AlugueisT.setText("Alugueis");

        HistoricoB.setBackground(new java.awt.Color(102, 255, 204));
        HistoricoB.setForeground(new java.awt.Color(0, 0, 0));
        HistoricoB.setText("Ver Histórico");

        AlugueisB.setBackground(new java.awt.Color(102, 255, 204));
        AlugueisB.setForeground(new java.awt.Color(0, 0, 0));
        AlugueisB.setText("Visualizar");

        AlugueisBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Atrasados" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Email", "Código do Imóvel", "Status", "Valor"
            }
        ));
        Tabela.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(Titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NomeT)
                        .addGap(20, 20, 20)
                        .addComponent(NomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190)
                        .addComponent(AlugueisT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(AlugueisBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(HistoricoB, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(350, 350, 350)
                        .addComponent(AlugueisB, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomeT)
                    .addComponent(NomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlugueisT)
                    .addComponent(AlugueisBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HistoricoB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlugueisB))
                .addGap(32, 32, 32)
                .addComponent(Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(InformacoesClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacoesClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacoesClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacoesClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacoesClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlugueisB;
    private javax.swing.JComboBox<String> AlugueisBox;
    private javax.swing.JLabel AlugueisT;
    private javax.swing.JButton HistoricoB;
    private javax.swing.JLabel NomeT;
    private javax.swing.JTextField NomeText;
    private javax.swing.JScrollPane Tabela;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}