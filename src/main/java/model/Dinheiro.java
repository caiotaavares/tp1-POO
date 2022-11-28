/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Audrey
 */
public class Dinheiro extends Pagamento {

    private boolean pix;
    private boolean cedula;

    public Dinheiro() {
    }

    public Dinheiro(boolean pix, boolean cedula, String tipoPagamento) {
        super(tipoPagamento);
        this.pix = pix;
        this.cedula = cedula;
    }

    public boolean isPix() {
        return pix;
    }

    public void setPix(boolean pix) {
        this.pix = pix;
    }

    public boolean isCedula() {
        return cedula;
    }

    public void setCedula(boolean cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Dinheiro{" + "pix=" + pix + ", cedula=" + cedula + '}';
    }

}
