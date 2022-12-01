/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import view.InformacoesCorretores;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 *
 * @author João Pedro
 */
public class InformacoesCorretoresController {

    private final InformacoesCorretores view;

    public InformacoesCorretoresController(InformacoesCorretores view) {
    this.view = view;
    }
    Path path = Path.of(".\\corretores.txt");
    public void mostrarCorretores() throws IOException {
        List<String> strings = Files.readAllLines(path);

        for (String texto : strings) {
            System.out.println(texto);
        }
    }
    
}
