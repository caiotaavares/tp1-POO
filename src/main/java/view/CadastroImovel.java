/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author João Pedro
 */
public class CadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
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
        EnderecoT = new javax.swing.JLabel();
        DataCT = new javax.swing.JLabel();
        AreaT = new javax.swing.JLabel();
        AreaCT = new javax.swing.JLabel();
        DormitorioT = new javax.swing.JLabel();
        BanheiroT = new javax.swing.JLabel();
        VGaragemT = new javax.swing.JLabel();
        VIPTUT = new javax.swing.JLabel();
        VVenda = new javax.swing.JLabel();
        VAluguel = new javax.swing.JLabel();
        ImovelT = new javax.swing.JLabel();
        ApartamentoT = new javax.swing.JLabel();
        ComercialT = new javax.swing.JLabel();
        AndarT = new javax.swing.JLabel();
        VCondominioT = new javax.swing.JLabel();
        ImpostoT = new javax.swing.JLabel();
        EnderecoText = new javax.swing.JTextField();
        DataCText = new javax.swing.JTextField();
        AreaText = new javax.swing.JTextField();
        AreaCText = new javax.swing.JTextField();
        DormitorioText = new javax.swing.JTextField();
        BanheiroText = new javax.swing.JTextField();
        VGaragemText = new javax.swing.JTextField();
        VIPTUText = new javax.swing.JTextField();
        VVendaText = new javax.swing.JTextField();
        VAluguelText = new javax.swing.JTextField();
        AndarText = new javax.swing.JTextField();
        VCondomioText = new javax.swing.JTextField();
        ImpostoText = new javax.swing.JTextField();
        ImovelBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Sombra = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Cadastro de Imóvel");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        EnderecoT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EnderecoT.setForeground(new java.awt.Color(255, 255, 255));
        EnderecoT.setText("Endereço:");
        getContentPane().add(EnderecoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        DataCT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DataCT.setForeground(new java.awt.Color(255, 255, 255));
        DataCT.setText("Data de Construção:");
        getContentPane().add(DataCT, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        AreaT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AreaT.setForeground(new java.awt.Color(255, 255, 255));
        AreaT.setText("Área Total:");
        getContentPane().add(AreaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        AreaCT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AreaCT.setForeground(new java.awt.Color(255, 255, 255));
        AreaCT.setText("Área Construida:");
        getContentPane().add(AreaCT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        DormitorioT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DormitorioT.setForeground(new java.awt.Color(255, 255, 255));
        DormitorioT.setText("nº de Dormitórios:");
        getContentPane().add(DormitorioT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        BanheiroT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BanheiroT.setForeground(new java.awt.Color(255, 255, 255));
        BanheiroT.setText("nº de Banheiros:");
        getContentPane().add(BanheiroT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        VGaragemT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        VGaragemT.setForeground(new java.awt.Color(255, 255, 255));
        VGaragemT.setText("nº de Vagas na Garagem:");
        getContentPane().add(VGaragemT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        VIPTUT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        VIPTUT.setForeground(new java.awt.Color(255, 255, 255));
        VIPTUT.setText("Valor do IPTU:");
        getContentPane().add(VIPTUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        VVenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        VVenda.setForeground(new java.awt.Color(255, 255, 255));
        VVenda.setText("Valor da Venda:");
        getContentPane().add(VVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        VAluguel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        VAluguel.setForeground(new java.awt.Color(255, 255, 255));
        VAluguel.setText("Valor do Aluguel:");
        getContentPane().add(VAluguel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        ImovelT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ImovelT.setForeground(new java.awt.Color(255, 255, 255));
        ImovelT.setText("Tipo de Imóvel:");
        getContentPane().add(ImovelT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        ApartamentoT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ApartamentoT.setForeground(new java.awt.Color(102, 255, 204));
        ApartamentoT.setText("Apartamento Residencial");
        getContentPane().add(ApartamentoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        ComercialT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ComercialT.setForeground(new java.awt.Color(102, 255, 204));
        ComercialT.setText("Comercial");
        getContentPane().add(ComercialT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, -1));

        AndarT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AndarT.setForeground(new java.awt.Color(255, 255, 255));
        AndarT.setText("Andar:");
        getContentPane().add(AndarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        VCondominioT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        VCondominioT.setForeground(new java.awt.Color(255, 255, 255));
        VCondominioT.setText("Valor do Condomínio:");
        getContentPane().add(VCondominioT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        ImpostoT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ImpostoT.setForeground(new java.awt.Color(255, 255, 255));
        ImpostoT.setText("Taxa de Imposto:");
        getContentPane().add(ImpostoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, -1, -1));
        getContentPane().add(EnderecoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 340, 30));

        DataCText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataCTextActionPerformed(evt);
            }
        });
        getContentPane().add(DataCText, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 160, 30));
        getContentPane().add(AreaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 120, 30));
        getContentPane().add(AreaCText, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 120, 30));

        DormitorioText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DormitorioTextActionPerformed(evt);
            }
        });
        getContentPane().add(DormitorioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 30, 30));
        getContentPane().add(BanheiroText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 30, 30));
        getContentPane().add(VGaragemText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 30, 30));
        getContentPane().add(VIPTUText, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 130, 30));
        getContentPane().add(VVendaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 130, 30));

        VAluguelText.setToolTipText("");
        getContentPane().add(VAluguelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 130, 30));
        getContentPane().add(AndarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 50, 30));
        getContentPane().add(VCondomioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 120, 30));
        getContentPane().add(ImpostoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 90, 30));

        ImovelBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ImovelBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa Residencial", "Apartamento Residencial", "Comercial" }));
        getContentPane().add(ImovelBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 240, 30));

        jButton1.setBackground(new java.awt.Color(102, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Cadastrar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 140, 30));

        Sombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(Sombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 0, 760, 580));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/logo2.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -140, -1, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DataCTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataCTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataCTextActionPerformed

    private void DormitorioTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DormitorioTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DormitorioTextActionPerformed

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
    private javax.swing.JLabel AndarT;
    private javax.swing.JTextField AndarText;
    private javax.swing.JLabel ApartamentoT;
    private javax.swing.JLabel AreaCT;
    private javax.swing.JTextField AreaCText;
    private javax.swing.JLabel AreaT;
    private javax.swing.JTextField AreaText;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel BanheiroT;
    private javax.swing.JTextField BanheiroText;
    private javax.swing.JLabel ComercialT;
    private javax.swing.JLabel DataCT;
    private javax.swing.JTextField DataCText;
    private javax.swing.JLabel DormitorioT;
    private javax.swing.JTextField DormitorioText;
    private javax.swing.JLabel EnderecoT;
    private javax.swing.JTextField EnderecoText;
    private javax.swing.JComboBox<String> ImovelBox;
    private javax.swing.JLabel ImovelT;
    private javax.swing.JLabel ImpostoT;
    private javax.swing.JTextField ImpostoText;
    private javax.swing.JLabel Sombra;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel VAluguel;
    private javax.swing.JTextField VAluguelText;
    private javax.swing.JLabel VCondominioT;
    private javax.swing.JTextField VCondomioText;
    private javax.swing.JLabel VGaragemT;
    private javax.swing.JTextField VGaragemText;
    private javax.swing.JLabel VIPTUT;
    private javax.swing.JTextField VIPTUText;
    private javax.swing.JLabel VVenda;
    private javax.swing.JTextField VVendaText;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
