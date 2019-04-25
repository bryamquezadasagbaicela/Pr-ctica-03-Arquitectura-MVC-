/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.Controladores;

import ec.edu.est.Clases.Cobra;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 59398
 */
public class ControladorCobra {
    private List<Cobra> lista;
    private int contador;

    public ControladorCobra() {
        lista = new ArrayList<>();
        contador =0;
    }

    public void create(Cobra objeto) {
        contador++;
        objeto.setCodigo(contador);
        lista.add(objeto);
    }

    public Cobra read(int codigo) {
        for (Cobra cobra : lista) {
            if (cobra.getCodigo() == codigo) {
                return cobra;
            }
        }
        return null;
    }

    public void update(Cobra objeto) {
        for (int i = 0; i < lista.size(); i++) {
            Cobra elemento = lista.get(i);
            if (elemento.getCodigo() == objeto.getCodigo()) {
                lista.set(i, objeto);
                break;
            }

        }
    }

    public void delete(int codigo) {
        for (int i = 0; i < lista.size(); i++) {
            Cobra elemento = lista.get(i);
            if (elemento.getCodigo() == codigo) {
                lista.remove(i);
                break;
            }
        }

    }

}
