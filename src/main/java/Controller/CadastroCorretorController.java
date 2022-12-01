/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import view.CadastroCorretor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;

/**
 *
 * @author João Pedro
 */
public class CadastroCorretorController {

    private final CadastroCorretor view;
    Path path = Path.of(".\\corretor.txt");

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

    public void cadastroCorretor(String creci, String pis, float salario, LocalDate dataAdmissao, String nome,
                                String cpf, String rg, String endereco, String cep, String telefone, String email,
                                int codigoUsuario, LocalDate dataNascimento) throws IOException, IOException {

        if (Files.notExists(path)) {
            Files.createFile(path);
        }

        String s = String.join(
                System.getProperty("line.separator"),
                creci.toString(),
                pis.toString(),
                String.valueOf(salario),
                dataAdmissao.toString(),
                nome.toString(),
                cpf.toString(),
                rg.toString(),
                endereco.toString(),
                cep.toString(),
                email.toString(),
                String.valueOf(codigoUsuario),
                dataNascimento.toString()
        );

        Files.writeString(path, (System.lineSeparator() + s), StandardOpenOption.APPEND);
    }
}
