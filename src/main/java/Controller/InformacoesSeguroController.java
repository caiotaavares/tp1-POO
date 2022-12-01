/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import view.InformacoesSeguro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 *
 * @author João Pedro
 */
public class InformacoesSeguroController {

    private final InformacoesSeguro view;

    public InformacoesSeguroController(InformacoesSeguro view) {
    this.view = view;
    }

    Path path = Path.of(".\\seguro.txt");
    public void mostrarSeguro() throws IOException {
        List<String> strings = Files.readAllLines(path);

        for (String texto : strings) {
            System.out.println(texto);
        }
    }
    
}
