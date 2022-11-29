/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Audrey
 */
public class Cliente extends Usuario {

    protected LocalDate dataCadastro;
    Path path = Path.of(".\\clientes.txt");

    public Cliente() {
    }

    public Cliente(LocalDate dataCadastro, String nome, String cpf, String rg, String endereco,
            String cep, String telefone, String email, int codigoUsuario, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, cep, telefone, email, codigoUsuario, dataNascimento);
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dataCadastro=" + dataCadastro + '}';
    }

    public void setDataNascimento(String nascimento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

        Files.writeString(path, s);
    }

    public String mostrarClientes() throws IOException {
        List<String> strings = Files.readAllLines(path);

        for (String texto : strings) {
            System.out.println(texto);
        }
        return null;
    }
}
