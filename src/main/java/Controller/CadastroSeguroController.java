/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import view.CadastroSeguro;

/**
 *
 * @author João Pedro
 */
public class CadastroSeguroController {

    private final CadastroSeguro view;

    public CadastroSeguroController(CadastroSeguro view) {
        this.view = view;
    }
    
    public void CadastroSguro(){
        String seguradora = view.getNomeText().getText();
        String co = view.getCodigoText().getText();
        int codigo = Integer.parseInt(co);
        String Tipo = view.getTipoText().getText();
        String va = view.getValorText().getText();
        float valor = Float.parseFloat(va); 
        String Descricao = view.getDescricaoTextB();
    }
}
