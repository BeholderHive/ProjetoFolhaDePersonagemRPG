/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifsp.edu.FolhaPersonagem;

import java.util.Random;

/**
 *
 * @author maxwe
 */
public class LuzSagrada implements ServicoInterface{
    private double hpMaximo;
    private double hpAtual;
    private String operacao="Luz Sagrada";
    private String tipoCalculo="Healer";
    private String tipoCalculadora="";
    
    
    @Override
    public double aplicar() throws Exception{
        if (tipoCalculadora.equals(tipoCalculo)){
            throw new Exception("Erro de abilidade - Healer.");
        }
        double resul;
        resul = hpAtual + (hpMaximo/2);
        if(hpAtual > hpMaximo){resul = hpMaximo;}
        return resul;
    }
    
    public boolean calculoE(String tipoCalculo){
        if (this.tipoCalculo.equals(tipoCalculo)){
            return true;
        }
        return false;
    }

    @Override
    public boolean operacaoE(String operacao) {
        if (this.operacao.equals(operacao)){
            return true;
        }
        return false;
    }

    @Override
    public void setHpMaximo(double hpMaximo) {
        this.hpMaximo=hpMaximo;
    }

    @Override
    public void setHpAtual(double hpAtual) {
        this.hpAtual=hpAtual;
    }

    @Override
    public String getOperacao() {
        return operacao;
    }

    @Override
    public void setJobClass(String tipoCalculadora) {
        this.tipoCalculadora=tipoCalculadora;
    }
    
}
