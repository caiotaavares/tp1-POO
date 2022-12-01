/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import view.CadastroImovel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;

/**
 *
 * @author João Pedro
 */
public class CadastroImovelController {

    private final CadastroImovel view;
    Path path = Path.of(".\\imovel.txt");

    public CadastroImovelController(CadastroImovel view) {
    this.view = view;
    }
    
    
    public void cadastrarImovel(){
    
        String endereco = view.getEnderecoText().getText();
        String a = view.getAreaText().getText();
        float area = Float.parseFloat(a);  
        String aC = view.getAreaCText().getText();
        float areaC = Float.parseFloat(aC);  
        String data = view.getDataCText().getText();
        String Nd = view.getDormitorioText().getText();
        int Ndormitorios = Integer.parseInt(Nd);
        String Nb = view.getBanheiroText().getText();
        int Nbanheiros = Integer.parseInt(Nb);
        String VaG = view.getVGaragemText().getText();
        int VaGaragem = Integer.parseInt(VaG);
        String ip = view.getVIPTUText().getText();
        float iptu = Float.parseFloat(ip);  
        String Vv = view.getVVendaText().getText();
        float Vvenda = Float.parseFloat(Vv);  
        String al = view.getVAluguelText().getText();
        float aluguel = Float.parseFloat(al);  
        String imovel = view.getImovelBox();
        String an = view.getAndarText().getText();
        int andar = Integer.parseInt(an);
        String con = view.getVCondomioText().getText();
        float condominio  = Integer.parseInt(con);
        String im = view.getImpostoText().getText();
        float imposto = Integer.parseInt(im);
        
        
        view.mensagem("Imóvel Cadastrado");
    }

    public void cadastroImovel(String endereco, float areaTotal, float areaConstruida, float valorIPTU, float valorVenda,
                               float valorAluguel, int codigoImovel, int quantDormitorios, int quantBanheiros,
                               int quantVagasGaragem, LocalDate dataConstrucao) throws IOException {

        if (Files.notExists(path)) {
            Files.createFile(path);
        }

        String s = String.join(
                System.getProperty("line.separator"),
                String.valueOf(endereco),
                String.valueOf(areaTotal),
                String.valueOf(areaConstruida),
                String.valueOf(valorIPTU),
                String.valueOf(valorVenda),
                String.valueOf(valorAluguel),
                String.valueOf(codigoImovel),
                String.valueOf(quantDormitorios),
                String.valueOf(quantBanheiros),
                String.valueOf(quantVagasGaragem),
                String.valueOf(dataConstrucao)
        );


        Files.writeString(path, (System.lineSeparator() + s), StandardOpenOption.APPEND);
    }
}
