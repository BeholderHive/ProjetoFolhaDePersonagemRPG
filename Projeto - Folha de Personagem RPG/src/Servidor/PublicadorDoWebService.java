/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import javax.xml.ws.Endpoint;
/**
 *
 * @author maxwe
 */
public class PublicadorDoWebService {
    public static void main (String[] args){
        Endpoint.publish("http://localhost:9999/Servidor/ServidorMensagens", new ImplementacaoDaBaseInterfaceWS());
    }
}
