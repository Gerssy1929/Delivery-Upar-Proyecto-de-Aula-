/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import Entidades.*;


/**
 *
 * @author German
 */
public interface IRegistrable {
    boolean registrarDestinatario(Destinatario d);
    boolean registrarRemitente(Remitente r);
    boolean registrarPaquetes(Paquete p);
    int getTotalregistros();
}
