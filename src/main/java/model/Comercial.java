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
public class Comercial extends Imovel {

    protected float taxaImpostoFederal;

    public Comercial() {
    }

    public Comercial(float taxaImpostoFederal, String endereco, float areaTotal, float areaConstruida,
            float valorIPTU, float valorVenda, float valorAluguel, int codigoImovel, int quantDormitorios,
            int quantBanheiros, int quantVagasGaragem, LocalDate dataConstrucao) {
        super(endereco, areaTotal, areaConstruida, valorIPTU, valorVenda, valorAluguel, codigoImovel,
                quantDormitorios, quantBanheiros, quantVagasGaragem, dataConstrucao);
        this.taxaImpostoFederal = taxaImpostoFederal;
    }

    public float getTaxaImpostoFederal() {
        return taxaImpostoFederal;
    }

    public void setTaxaImpostoFederal(float taxaImpostoFederal) {
        this.taxaImpostoFederal = taxaImpostoFederal;
    }

    @Override
    public float getValorAluguel() {
        float valor = taxaImpostoFederal + valorAluguel;
        return valor;
    }

    @Override
    public String toString() {
        return "Comercial{" + "taxaImpostoFederal=" + taxaImpostoFederal + '}';
    }

}
