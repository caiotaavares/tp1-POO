/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import view.OperacaoVenda;

/**
 *
 * @author João Pedro
 */
public class OperacaoVendaController {

    private final OperacaoVenda view;

    public OperacaoVendaController(OperacaoVenda view) {
    this.view = view;
    }
    
    public void VenderImovel(){
        //Cliente
        //Corretor
        //Imovel
        String dataV = view.getDataVText().getText();
        String VT = view.getValorTText().getText();
        float valorT = Float.parseFloat(VT);
        //a forma de pagamento pela string
        String FormPagamento = view.getFormaPBox();
        //
        String nome = view.getNomeText().getText();
        String bandeira = view.getBandeiraText().getText();
        String numero = view.getNumeroText().getText();
    }
    }
    
