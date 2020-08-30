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
public interface ServicoInterface {
    public double aplicar () throws Exception;
    public boolean operacaoE(String operacao);
    public void setHpMaximo(double hpMaximo);
    public void setHpAtual(double hpAtual);
    public String getOperacao();
    public boolean calculoE(String tipoCalculo);
    public void setJobClass(String jobClass);   
}
