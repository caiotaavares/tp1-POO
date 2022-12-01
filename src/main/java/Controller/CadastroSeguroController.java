/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import view.CadastroSeguro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;

/**
 *
 * @author João Pedro
 */
public class CadastroSeguroController {

    private final CadastroSeguro view;
    Path path = Path.of(".\\seguro.txt");

    public CadastroSeguroController(CadastroSeguro view) {
        this.view = view;
    }
    
    public void CadastroSguro(){
        String seguradora = view.getNomeText().getText();
        String co = view.getCodigoText().getText();
        int codigo = Integer.parseInt(co);
        String Tipo = view.getTipoText().getText();
        String va = view.getValorText().getText();
        float valor = Float.parseFloat(va); 
        String Descricao = view.getDescricaoTextB();
    }

    public void cadastroSeguro(int codigoSeguro, String nomeSeguradora, String tipo, String descricao, float valor) throws IOException {

        if (Files.notExists(path)) {
            Files.createFile(path);
        }

        String s = String.join(
                System.getProperty("line.separator"),
                String.valueOf(codigoSeguro),
                nomeSeguradora.toString(),
                tipo.toString(),
                descricao.toString(),
                String.valueOf(valor)
        );


        Files.writeString(path, (System.lineSeparator() + s), StandardOpenOption.APPEND);
    }
}
