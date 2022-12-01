/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import view.InformacoesClientes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 *
 * @author João Pedro
 */
public class InformacoesClientesController {

    private final InformacoesClientes view;
    Path path = Path.of(".\\clientes.txt");

    public InformacoesClientesController(InformacoesClientes view) {
    this.view = view;
    }
    
    public void AtualizarTabela(){
        //buscar uma lista com os clientes
        //exibir a lista na view
    }

    public void mostrarClientes() throws IOException {
        List<String> strings = Files.readAllLines(path);

        for (String texto : strings) {
            System.out.println(texto);
        }
    }
}
