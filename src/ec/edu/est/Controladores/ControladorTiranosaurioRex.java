/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.Controladores;

import ec.edu.est.Clases.TiranosaurioRex;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 59398
 */
public class ControladorTiranosaurioRex {
   
    private Set<TiranosaurioRex> lista;
    private int codigo;

    public ControladorTiranosaurioRex() {
        lista = new HashSet<>();
        codigo =0;

    }

    public void create(TiranosaurioRex objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }

    public TiranosaurioRex read(int codigo) {
        for(TiranosaurioRex tiranosaurioRex : lista){
            if(tiranosaurioRex.getCodigo()== codigo){
               return tiranosaurioRex; 
            }
        }
        return null;
    }

    public void update(TiranosaurioRex objeto) {
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }

    public void delete(int codigo) {
        for(TiranosaurioRex tiranosaurioRex : lista){
            if(tiranosaurioRex.getCodigo()== codigo){
               lista.remove(tiranosaurioRex);
               break;
            }
        }
        
    }
}
