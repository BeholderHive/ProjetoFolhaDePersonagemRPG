package br.ifsp.edu.FolhaPersonagem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxwe
 */
public class Status {

    private double hpMaximo;
    private double hpAtual;
    private double valorSaida;
    private String jobClass = "";
    List<ServicoInterface> servicos = new ArrayList<>();

    public Status(String jobClass) {
        this.jobClass = jobClass;
    }

    public String obterCatalogoDeServicosDisponiveis() {
        String catalogo = "";
        int i = 0;
        for (ServicoInterface si : servicos) {
            if (si.calculoE(this.getJobClass())) {
                catalogo += si.getOperacao()+", ";
                i++;
            }
        }
        catalogo=catalogo.substring(0, catalogo.length()-2);
        return catalogo;
    }

    public double aplicar(String operacao) throws Exception {
        for (ServicoInterface si : servicos) {
            if (si.calculoE(this.getJobClass())) {
                if (si.operacaoE(operacao)) {
                    si.setHpMaximo(hpMaximo);
                    si.setHpAtual(hpAtual);
                    double res=0;
                    try {
                        res = si.aplicar();
                    } catch (Exception e) {
                        throw new Exception("erro");
                    }
                    return res;
                }
            }
        }
        return 0;
    }

    public void adicionaServico(ServicoInterface servico) {
        servicos.add(servico);
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

    public double getValorSaida() {
        return valorSaida;
    }

    public void setValorSaida(double valorSaida) {
        this.valorSaida = valorSaida;
    }


    public String getJobClass() {
        return jobClass;
    }


    public void setJobClass(String jobClass) {
        this.jobClass = jobClass;
    }
}
