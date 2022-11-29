/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import view.CadastroCorretor;

/**
 *
 * @author João Pedro
 */
public class CadastroCorretorController {

    private final CadastroCorretor view; 

    public CadastroCorretorController(CadastroCorretor view) {
    this.view = view;
    }
    
    
    public void cadastrarCorretor(){
        String nome = view.getNomeText().getText();
        String cpf = view.getCPFText().getText();
        String rg = view.getRgText().getText();
        String endereco = view.getEnderecoText().getText();
        String email = view.getEmailText().getText();
        String cep = view.getCEPText().getText();
        String telefone = view.getTelefoneText().getText();
        String salario = view.getSalarioText().getText();
        String nascimento = view.getNacimentoText().getText();
        String dataAd = view.getDataText().getText();
        String Creci = view.getCreciText().getText();
        String Pis = view.getPisText().getText();
        
        view.mensagem("Corretor Cadastrado");
    }
}
