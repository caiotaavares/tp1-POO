/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import model.Cliente;
import view.CadastroCliente;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;

/**
 *
 * @author João Pedro
 */
public class CadastroClienteController {
    
    private final CadastroCliente view;
    Path path = Path.of(".\\clientes.txt");

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
        cliente.setDataNascimento(nascimento);
        String DataCa = view.getDataCadText().getText();
        view.mensagem("Cliente cadastrado");
    }

    public void cadastroCliente(LocalDate dataCadastro, String nome, String cpf, String rg, String endereco,
                                String cep, String telefone, String email, int codigoUsuario, LocalDate dataNascimento) throws IOException, IOException {

        if (Files.notExists(path)) {
            Files.createFile(path);
        }

        String s = String.join(
                System.getProperty("line.separator"),
                dataCadastro.toString(),
                nome.toString(),
                cpf.toString(),
                rg.toString(),
                endereco.toString(),
                cep.toString(),
                telefone.toString(),
                email.toString(),
                String.valueOf(codigoUsuario),
                dataNascimento.toString()
        );

        Files.writeString(path, (System.lineSeparator() + s), StandardOpenOption.APPEND);
    }
}
