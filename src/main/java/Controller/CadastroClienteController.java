/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import view.CadastroCliente;

/**
 *
 * @author João Pedro
 */
public class CadastroClienteController {

    private final CadastroCliente view;
    
    public CadastroClienteController(CadastroCliente view){
    this.view = view;
    }
    
    public void CadastrarCliente(){
        
        String nome = view.getNomeText().getText();
        String cpf = view.getCPFText().getText();
        String rg = view.getRgText().getText();
        String endereco = view.getEnderecoText().getText();
        String email = view.getEmailText().getText();
        String cep = view.getCEPText().getText();
        String telefone = view.getTelefoneText().getText();
        String nascimento = view.getNacimentoText().getText();
        
        
        
        view.mensagem("Cliente cadastrado");
    }
    
  }
