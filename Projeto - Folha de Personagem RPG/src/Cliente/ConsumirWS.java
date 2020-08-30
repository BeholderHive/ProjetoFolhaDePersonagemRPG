/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Servidor.BaseInterfaceWS;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
/**
 *
 * @author maxwe
 */
public class ConsumirWS {
    public static void main (String[] args) throws Exception{
        URL url=new URL("http://localhost:9999/Servidor/ServidorMensagens?wsdl");
        QName qname=new QName("http://Servidor/", "ImplementacaoDaBaseInterfaceWSService");
        
        Service service=Service.create(url, qname);
        
        BaseInterfaceWS receptorCliente=service.getPort(BaseInterfaceWS.class);
        
        System.out.println(receptorCliente.getServico("Luz Sagrada", 100, 25));
        System.out.println(receptorCliente.getCatalogo());
        System.out.println(receptorCliente.getServico("Levar Dano", 100, 60));
        System.out.println(receptorCliente.getCatalogo());
    }
}
