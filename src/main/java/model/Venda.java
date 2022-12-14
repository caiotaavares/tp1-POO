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
public class Venda {

    private int codigoVenda;
    private Cliente cliente;
    private Corretor corretor;
    private Imovel imovel;
    private LocalDate dataVenda;
    private float valorTotalvenda;
    private Pagamento formaPagamento;

    public Venda() {
    }

    public Venda(int codigoVenda, Cliente cliente, Corretor corretor, Imovel imovel, LocalDate dataVenda,
            float valorTotalvenda, Pagamento formaPagamento) {
        this.codigoVenda = codigoVenda;
        this.cliente = cliente;
        this.corretor = corretor;
        this.imovel = imovel;
        this.dataVenda = dataVenda;
        this.valorTotalvenda = valorTotalvenda;
        this.formaPagamento = formaPagamento;
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public float getValorTotalvenda() {
        return valorTotalvenda;
    }

    public void setValorTotalvenda(float valorTotalvenda) {
        this.valorTotalvenda = valorTotalvenda;
    }

    public Pagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "Venda{" + "codigoVenda=" + codigoVenda + ", cliente=" + cliente + ", corretor=" + corretor
                + ", imovel=" + imovel + ", dataVenda=" + dataVenda + ", valorTotalvenda=" + valorTotalvenda
                + ", formaPagamento=" + formaPagamento + '}';
    }

}
