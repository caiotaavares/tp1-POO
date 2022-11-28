/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import view.OperacaoAluguel;

/**
 *
 * @author João Pedro
 */
public class OperacaoAluguelController {

    private final OperacaoAluguel view;

    public OperacaoAluguelController(OperacaoAluguel view) {
    this.view = view;
    }
    
    public void AlugarImovel(){
        
        //Cliente
        //Corretor
        //Imovel
        String dataA = view.getDataAText().getText();
        String dataD = view.getDataDText().getText();
        String VT = view.getValorTText().getText();
        float valorT = Float.parseFloat(VT);
        String pag = view.getPagamentoMText().getText();
        float pagamentoM = Float.parseFloat(pag);
        //a forma de pagamento pela string
        String FormPagamento = view.getFormaPBox();
        //
        String seguro = view.getSegurosText().getText();
        String nome = view.getNomeText().getText();
        String bandeira = view.getBandeiraText().getText();
        String numero = view.getNumeroText().getText();
    }
    
}
