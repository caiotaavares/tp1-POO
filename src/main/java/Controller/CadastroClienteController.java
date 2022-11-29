/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import model.Cliente;
import view.CadastroCliente;

/**
 *
 * @author João Pedro
 */
public class CadastroClienteController {
    
    private final CadastroCliente view;
    
    public CadastroClienteController(CadastroCliente view) {
        this.view = view;
    }
    
    public void CadastrarCliente() {
        
        Cliente cliente = new Cliente();
        
        String nome = view.getNomeText().getText();
        cliente.setNome(nome);
        String cpf = view.getCPFText().getText();
        cliente.setCpf(cpf);
        String rg = view.getRgText().getText();
        cliente.setRg(rg);
        String endereco = view.getEnderecoText().getText();
        cliente.setEndereco(endereco);
        String email = view.getEmailText().getText();
        cliente.setEmail(email);
        String cep = view.getCEPText().getText();
        cliente.setCep(cep);
        String telefone = view.getTelefoneText().getText();
        cliente.setTelefone(telefone);
        String nascimento = view.getNacimentoText().getText();
<<<<<<< HEAD
        cliente.setDataNascimento(nascimento);
=======
        String DataCa = view.getDataCadText().getText();
        
>>>>>>> 0b78d2caafe53128939ec7d52122169f13f67ffa
        
        view.mensagem("Cliente cadastrado");
    }
    
}
