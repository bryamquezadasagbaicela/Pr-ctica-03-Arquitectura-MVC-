/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.Controladores;

import ec.edu.est.Clases.PezPiedra;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author 59398
 */
public class ControladorPezPiedra {
  
    private SortedSet<PezPiedra> listaOrdenada;
    private int codigo;

    public ControladorPezPiedra() {
        listaOrdenada = new TreeSet<>();
        codigo =0;

    }

    public void create(PezPiedra objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        listaOrdenada.add(objeto);
    }

    public PezPiedra read(int codigo) {
        for(PezPiedra pezPiedra : listaOrdenada){
            if(pezPiedra.getCodigo()== codigo){
               return pezPiedra; 
            }
        }
        return null;
    }

    public void update(PezPiedra objeto) {
        if(listaOrdenada.contains(objeto)){
            listaOrdenada.remove(objeto);
            listaOrdenada.add(objeto);
        }
    }

    public void delete(int codigo) {
        for(PezPiedra pezPiedra : listaOrdenada){
            if(pezPiedra.getCodigo()== codigo){
               listaOrdenada.remove(pezPiedra);
               break;
            }
        }
        
    }

    public void imprimir(){
        System.out.println("lista ordenada");
        for(PezPiedra pezPiedra : listaOrdenada){
            System.out.println(pezPiedra.getNombre());
        }
    }

}


