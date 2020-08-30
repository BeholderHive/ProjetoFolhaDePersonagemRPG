/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifsp.edu.FolhaPersonagem;

/**
 *
 * @author maxwe
 */
public class LevarDano implements ServicoInterface {
    private double hpMaximo;
    private double hpAtual;
    private String operacao = "Levar Dano";
    private String tipoCalculo = "Comum";
    
    
    
    @Override
    public double aplicar() throws Exception{
        double dano = 50;
        if(hpAtual > dano){
            return (hpAtual - dano);
        }else {
            return 0;
        }
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
    
    public boolean operacaoE(String operacao){
        if (this.operacao.equals(operacao)){
            return true;
        }
        return false;
    }

    public String getTipoCalculadora() {
        return tipoCalculo;
    }

    public void setJobClass(String tipoCalculadora) {
        this.tipoCalculo = tipoCalculadora;
    }

    @Override
    public boolean calculoE(String tipoCalculo) {
        return true;
    }

    public double getHpMaximo() {
        return hpMaximo;
    }

    public void setHpMaximo(double hpMaximo) {
        this.hpMaximo = hpMaximo;
    }

    public double getHpAtual() {
        return hpAtual;
    }

    public void setHpAtual(double hpAtual) {
        this.hpAtual = hpAtual;
    }
    
}
