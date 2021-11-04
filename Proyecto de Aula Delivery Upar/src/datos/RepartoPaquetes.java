/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import Entidades.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author German
 */
public class RepartoPaquetes implements IRegistrarPaqRepartido{
    
    private List paquetesRepartidos;
    


    public RepartoPaquetes() {
        this.paquetesRepartidos = new ArrayList();
    }

    public List getPaquetesRepartidos() {
        return paquetesRepartidos;
    }

    public void setPaquetesRepartidos(List paquetesRepartidos) {
        this.paquetesRepartidos = paquetesRepartidos;
    }

    
  
    @Override
    public boolean RepartirPaquetes(Paquete p) {
        return this.paquetesRepartidos.add(p);
    }
    
}
