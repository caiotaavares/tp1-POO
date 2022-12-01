/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;

/**
 *
 * @author Audrey
 */
public class Corretor extends Usuario {

    protected String creci;
    protected String pis;
    protected float salario;
    protected LocalDate dataAdmissao;

    public Corretor() {
    }

    public Corretor(String creci, String pis, float salario, LocalDate dataAdmissao, String nome,
            String cpf, String rg, String endereco, String cep, String telefone, String email,
            int codigoUsuario, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, cep, telefone, email, codigoUsuario, dataNascimento);
        this.creci = creci;
        this.pis = pis;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public String getCreci() {
        return creci;
    }

    public void setCreci(String creci) {
        this.creci = creci;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return "Corretor{" + "creci=" + creci + ", pis=" + pis + ", salario="
                + salario + ", dataAdmissao=" + dataAdmissao + '}';
    }

    Path path = Path.of(".\\corretor.txt");

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
