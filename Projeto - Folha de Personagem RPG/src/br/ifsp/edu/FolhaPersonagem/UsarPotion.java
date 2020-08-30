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
public class UsarPotion implements ServicoInterface {
    private double hpMaximo;
    private double hpAtual;
    private String operacao = "Usar Potion";
    private String tipoCalculo = "Comum";
    
    
    
    @Override
    public double aplicar() throws Exception{
        if((hpAtual + 25) < hpMaximo){
            return (hpAtual + 25);
        }else {
            return hpMaximo;
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
