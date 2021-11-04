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
public class RegistroRepartidor implements IRegistrarRepartidor{
    
    private List listaRepartidores;

    public RegistroRepartidor() {
        this.listaRepartidores = new ArrayList();
    }
    
    
    

    public List getListaRepartidores() {
        return listaRepartidores;
    }

    public void setListaRepartidores(List listaRepartidores) {
        this.listaRepartidores = listaRepartidores;
    }
    

    @Override
    public boolean RegistrarRepartidor(Repartidor rep) {
        return this.listaRepartidores.add(rep);
    }

}
