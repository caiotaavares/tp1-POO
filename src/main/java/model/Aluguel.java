/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Audrey
 */
public class Aluguel {

    private int codigoAluguel;
    private Cliente cliente;
    private Corretor corretor;
    private Imovel imovel;
    private LocalDate dataAluguel;
    private LocalDate dataDevolucao;
    private LocalDate dataPagamentoMensal;
    private float valorTotalAaluguel;
    private Pagamento formaPagamento;
    private ArrayList<Seguro> segurosContratados;
    private boolean pago;

    public float calcularValorTotal(Imovel imovel) {
        return imovel.getValorAluguel();
    }

    public boolean possuiSeguro() {
        for (Seguro seguro : this.segurosContratados) {
            if (seguro != null) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarAtraso(boolean pago) {
        if (pago == false) {
            return true;
        }
        return false;
    }

    public Aluguel() {
    }

    public Aluguel(int codigoAluguel, Cliente cliente, Corretor corretor, Imovel imovel, LocalDate dataAluguel,
            LocalDate dataDevolucao, LocalDate dataPagamentoMensal, float valorTotalAaluguel, Pagamento formaPagamento,
            ArrayList<Seguro> segurosContratados, boolean pago) {
        this.codigoAluguel = codigoAluguel;
        this.cliente = cliente;
        this.corretor = corretor;
        this.imovel = imovel;
        this.dataAluguel = dataAluguel;
        this.dataDevolucao = dataDevolucao;
        this.dataPagamentoMensal = dataPagamentoMensal;
        this.valorTotalAaluguel = valorTotalAaluguel;
        this.formaPagamento = formaPagamento;
        this.segurosContratados = segurosContratados;
        this.pago = pago;
    }

    public int getCodigoAluguel() {
        return codigoAluguel;
    }

    public void setCodigoAluguel(int codigoAluguel) {
        this.codigoAluguel = codigoAluguel;
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

    public LocalDate getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(LocalDate dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDate getDataPagamentoMensal() {
        return dataPagamentoMensal;
    }

    public void setDataPagamentoMensal(LocalDate dataPagamentoMensal) {
        this.dataPagamentoMensal = dataPagamentoMensal;
    }

    public float getValorTotalAaluguel() {
        return valorTotalAaluguel;
    }

    public void setValorTotalAaluguel(float valorTotalAaluguel) {
        this.valorTotalAaluguel = valorTotalAaluguel;
    }

    public Pagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public ArrayList<Seguro> getSegurosContratados() {
        return segurosContratados;
    }

    public void setSegurosContratados(ArrayList<Seguro> segurosContratados) {
        this.segurosContratados = segurosContratados;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "Aluguel{" + "codigoAluguel=" + codigoAluguel + ", cliente=" + cliente + ", corretor="
                + corretor + ", imovel=" + imovel + ", dataAluguel=" + dataAluguel + ", dataDevolucao="
                + dataDevolucao + ", dataPagamentoMensal=" + dataPagamentoMensal + ", valorTotalAaluguel="
                + valorTotalAaluguel + ", formaPagamento=" + formaPagamento + ", segurosContratados="
                + segurosContratados + ", pago=" + pago + '}';
    }

}
