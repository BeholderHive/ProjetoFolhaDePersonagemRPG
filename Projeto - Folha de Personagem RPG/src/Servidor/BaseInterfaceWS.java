/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
/**
 *
 * @author maxwe
 */

@WebService(name="ServidorMensagens") //annotations
@SOAPBinding(style=Style.RPC)
public interface BaseInterfaceWS {
    @WebMethod double getServico (String nomedoServico, double a, double b);
    @WebMethod String getCatalogo ();
}
