/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Audrey
 */
public class Imovel {

    protected String endereco;
    protected float areaTotal;
    protected float areaConstruida;
    protected float valorIPTU;
    protected float valorVenda;
    protected float valorAluguel;
    protected int codigoImovel;
    protected int quantDormitorios;
    protected int quantBanheiros;
    protected int quantVagasGaragem;
    protected LocalDate dataConstrucao;

    public Imovel() {
    }

    public Imovel(String endereco, float areaTotal, float areaConstruida, float valorIPTU, float valorVenda,
            float valorAluguel, int codigoImovel, int quantDormitorios, int quantBanheiros,
            int quantVagasGaragem, LocalDate dataConstrucao) {
        this.endereco = endereco;
        this.areaTotal = areaTotal;
        this.areaConstruida = areaConstruida;
        this.valorIPTU = valorIPTU;
        this.valorVenda = valorVenda;
        this.valorAluguel = valorAluguel;
        this.codigoImovel = codigoImovel;
        this.quantDormitorios = quantDormitorios;
        this.quantBanheiros = quantBanheiros;
        this.quantVagasGaragem = quantVagasGaragem;
        this.dataConstrucao = dataConstrucao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(float areaTotal) {
        this.areaTotal = areaTotal;
    }

    public float getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(float areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public float getValorIPTU() {
        return valorIPTU;
    }

    public void setValorIPTU(float valorIPTU) {
        this.valorIPTU = valorIPTU;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public float getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(float valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public int getCodigoImovel() {
        return codigoImovel;
    }

    public void setCodigoImovel(int codigoImovel) {
        this.codigoImovel = codigoImovel;
    }

    public int getQuantDormitorios() {
        return quantDormitorios;
    }

    public void setQuantDormitorios(int quantDormitorios) {
        this.quantDormitorios = quantDormitorios;
    }

    public int getQuantBanheiros() {
        return quantBanheiros;
    }

    public void setQuantBanheiros(int quantBanheiros) {
        this.quantBanheiros = quantBanheiros;
    }

    public int getQuantVagasGaragem() {
        return quantVagasGaragem;
    }

    public void setQuantVagasGaragem(int quantVagasGaragem) {
        this.quantVagasGaragem = quantVagasGaragem;
    }

    public LocalDate getDataConstrucao() {
        return dataConstrucao;
    }

    public void setDataConstrucao(LocalDate dataConstrucao) {
        this.dataConstrucao = dataConstrucao;
    }

    @Override
    public String toString() {
        return "Imovel{" + "endereco=" + endereco + ", areaTotal=" + areaTotal + ", areaConstruida="
                + areaConstruida + ", valorIPTU=" + valorIPTU + ", valorVenda=" + valorVenda
                + ", valorAluguel=" + valorAluguel + ", codigoImovel=" + codigoImovel
                + ", quantDormitorios=" + quantDormitorios + ", quantBanheiros=" + quantBanheiros
                + ", quantVagasGaragem=" + quantVagasGaragem + ", dataConstrucao=" + dataConstrucao + '}';
    }

}
