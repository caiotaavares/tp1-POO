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
public class CasaResidencial extends Imovel {

    public CasaResidencial() {
    }

    public CasaResidencial(String endereco, float areaTotal, float areaConstruida, float valorIPTU,
            float valorVenda, float valorAluguel, int codigoImovel, int quantDormitorios,
            int quantBanheiros, int quantVagasGaragem, LocalDate dataConstrucao) {
        super(endereco, areaTotal, areaConstruida, valorIPTU, valorVenda, valorAluguel, codigoImovel,
                quantDormitorios, quantBanheiros, quantVagasGaragem, dataConstrucao);
    }

}
