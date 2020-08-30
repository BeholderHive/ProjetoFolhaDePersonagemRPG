/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofolhadepersonagemrpg;

import br.ifsp.edu.FolhaPersonagem.LuzSagrada;
import br.ifsp.edu.FolhaPersonagem.Status;
import br.ifsp.edu.FolhaPersonagem.ServicoInterface;
import br.ifsp.edu.FolhaPersonagem.UsarPotion;
import br.ifsp.edu.FolhaPersonagem.LevarDano;

/**
 *
 * @author maxwe
 */
public class ProjetoFolhaDePersonagemRPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Status lily = new Status("Healer");

        //Polimorfismo
        ServicoInterface servico01 = new UsarPotion();
        ServicoInterface servico02 = new LevarDano();
        ServicoInterface servico03 = new LuzSagrada();

        lily.adicionaServico(servico01);
        lily.adicionaServico(servico02);
        lily.adicionaServico(servico03);

        lily.setHpMaximo(100);
        lily.setHpAtual(25);

        try {
            double potion = lily.aplicar("Usar Potion");
            System.out.println("HP atual: " + potion);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {           
            double dano = lily.aplicar("Levar Dano");
            System.out.println("HP atual: " + dano);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (lily.getJobClass().equalsIgnoreCase("Healer")){
            try {
               double luz = lily.aplicar("Luz Sagrada");
                System.out.println("Hp atual: " + luz);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Catálogo: " + lily.obterCatalogoDeServicosDisponiveis());
    }

}
