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
public class ApartamentoResidencial extends Imovel {

    protected int andar;
    protected float valorCondominio;

    public ApartamentoResidencial() {
    }

    public ApartamentoResidencial(int andar, float valorCondominio, String endereco, float areaTotal,
            float areaConstruida, float valorIPTU, float valorVenda, float valorAluguel, int codigoImovel,
            int quantDormitorios, int quantBanheiros, int quantVagasGaragem, LocalDate dataConstrucao) {
        super(endereco, areaTotal, areaConstruida, valorIPTU, valorVenda, valorAluguel, codigoImovel,
                quantDormitorios, quantBanheiros, quantVagasGaragem, dataConstrucao);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public float getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(float valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    @Override
    public float getValorAluguel() {
        float valor = valorCondominio + valorAluguel;
        return valor;
    }

    @Override
    public String toString() {
        return "ApartamentoResidencial{" + "andar=" + andar + ", valorCondominio=" + valorCondominio + '}';
    }

}
