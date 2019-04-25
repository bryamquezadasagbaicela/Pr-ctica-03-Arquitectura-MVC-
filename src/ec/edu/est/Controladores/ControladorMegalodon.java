/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.Controladores;

import ec.edu.est.Clases.Megalodon;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author QuezadaBryam
 */
public class ControladorMegalodon {

    private Map<Integer, Megalodon> lista;
    private int codigo;

    public ControladorMegalodon() {
        lista = new TreeMap<>();
        codigo =0;

    }

    public void create(Megalodon objeto) {
        codigo ++;
        objeto.setCodigo(codigo);
        lista.put(codigo, objeto);
    }

    public Megalodon read(int codigo) {
 
               return lista.get(codigo); 
        }
        
    public void update(Megalodon objeto) {
        lista.put(objeto.getCodigo(), objeto);
    }

    public void delete(int codigo) {
       
               lista.remove(codigo);
               
            }
    
    public void imprimir(){
        System.out.println("lista ordenada");
            System.out.println(lista.entrySet());
        }
    }



