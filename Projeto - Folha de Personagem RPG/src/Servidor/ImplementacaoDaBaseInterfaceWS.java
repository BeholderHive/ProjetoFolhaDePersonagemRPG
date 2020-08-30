/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import br.ifsp.edu.FolhaPersonagem.LuzSagrada;
import br.ifsp.edu.FolhaPersonagem.Status;
import br.ifsp.edu.FolhaPersonagem.ServicoInterface;
import br.ifsp.edu.FolhaPersonagem.UsarPotion;
import br.ifsp.edu.FolhaPersonagem.LevarDano;
import javax.jws.WebService;
/**
 *
 * @author maxwe
 */
@WebService(endpointInterface="Servidor.BaseInterfaceWS")
public class ImplementacaoDaBaseInterfaceWS implements BaseInterfaceWS{

    Status lily = new Status("Healer");
    public String operacao="";
    
    @Override
    public double getServico(String nomedoServico, double a, double b) {
        

        lily.setHpMaximo(a);
        lily.setHpAtual(b);
        
        ServicoInterface servico01 = new UsarPotion();
        lily.adicionaServico(servico01);
        ServicoInterface servico02 = new LevarDano();
        lily.adicionaServico(servico02);
        ServicoInterface servico03 = new LuzSagrada();
        lily.adicionaServico(servico03);
       
        double resul=0;
        try {
            resul = lily.aplicar(nomedoServico);
            System.out.println("HP atual : " + resul);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.operacao=nomedoServico;
        return resul;
    }

    @Override
    public String getCatalogo() {
        return operacao;
    }
    
}
