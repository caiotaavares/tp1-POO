/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Audrey
 */
public class Imobiliaria {

    private String nome;
    private String endereco;
    private ArrayList<Aluguel> alugueis;
    private ArrayList<Venda> vendas;
    private ArrayList<Imovel> imoveis;
    private ArrayList<Usuario> clientes;
    private ArrayList<Seguro> seguros;
    private ArrayList<Usuario> corretores;
    private Configuracao configuracoes;
    Path path = Path.of(".\\Imobiliarias.txt");

    public Imobiliaria() {
    }

    public Imobiliaria(String nome, String endereco, ArrayList<Aluguel> alugueis, ArrayList<Venda> vendas,
            ArrayList<Imovel> imoveis, ArrayList<Usuario> clientes, ArrayList<Seguro> seguros,
            ArrayList<Usuario> corretores, Configuracao configuracoes) {
        this.nome = nome;
        this.endereco = endereco;
        this.alugueis = alugueis;
        this.vendas = vendas;
        this.imoveis = imoveis;
        this.clientes = clientes;
        this.seguros = seguros;
        this.corretores = corretores;
        this.configuracoes = configuracoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Aluguel> getAlugueis() {
        return alugueis;
    }

    public void setAlugueis(ArrayList<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(ArrayList<Venda> vendas) {
        this.vendas = vendas;
    }

    public ArrayList<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(ArrayList<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    public ArrayList<Usuario> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Usuario> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Seguro> getSeguros() {
        return seguros;
    }

    public void setSeguros(ArrayList<Seguro> seguros) {
        this.seguros = seguros;
    }

    public ArrayList<Usuario> getCorretores() {
        return corretores;
    }

    public void setCorretores(ArrayList<Usuario> corretores) {
        this.corretores = corretores;
    }

    public Configuracao getConfiguracoes() {
        return configuracoes;
    }

    public void setConfiguracoes(Configuracao configuracoes) {
        this.configuracoes = configuracoes;
    }

    public void cadastroImobiliaria(LocalDate dataCadastro, String nome, String cpf, String rg, String endereco,
                                    String cep, String telefone, String email, int codigoUsuario, LocalDate dataNascimento) throws IOException {

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

    public String mostrarImobiliaria() throws IOException {
        List<String> strings = Files.readAllLines(path);

        for (String texto: strings) {
            System.out.println(texto);
        }
        return null;
    }
}
