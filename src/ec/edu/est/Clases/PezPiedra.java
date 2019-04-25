/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.Clases;

import ec.edu.est.Interfaz.Acciones;

/**
 *
 * @author 59398
 */
public final class PezPiedra extends Acuatico implements Acciones {

    /**
     * declaracion de las variables de la clase PezPiedra
     */
    private boolean camuflaje;
    private boolean neurotoxina;
    private boolean resisteFueraAgua;
    private boolean exotico;

    /**
     * creacion de los constructores
     */
    public PezPiedra() {

    }

    public PezPiedra(boolean camuflaje, boolean neurotoxina) {
        this.camuflaje = camuflaje;
        this.neurotoxina = neurotoxina;
    }

    public PezPiedra(String nombre, String tipoReproduccion, String sexo, String termino,int codigo, int numeroAletas, boolean aguaSalada, int numeroEspinas, boolean venenoso, boolean camuflaje, boolean neurotoxina, boolean resisteFueraAgua, boolean exotico) {
        super(nombre, tipoReproduccion, sexo, termino,codigo, numeroAletas, aguaSalada, numeroEspinas, venenoso);
        this.camuflaje = camuflaje;
        this.neurotoxina = neurotoxina;
        this.resisteFueraAgua = resisteFueraAgua;
        this.exotico = exotico;
    }

    /**
     * creacion de getters y setters
     *
     */
    public boolean isCamuflaje() {
        return camuflaje;
    }

    public void setCamuflaje(boolean camuflaje) {
        this.camuflaje = camuflaje;
    }

    public boolean isNeurotoxina() {
        return neurotoxina;
    }

    public void setNeurotoxina(boolean neurotoxina) {
        this.neurotoxina = neurotoxina;
    }

    public boolean isResisteFueraAgua() {
        return resisteFueraAgua;
    }

    public void setResisteFueraAgua(boolean resisteFueraAgua) {
        this.resisteFueraAgua = resisteFueraAgua;
    }

    public boolean isExotico() {
        return exotico;
    }

    public void setExotico(boolean exotico) {
        this.exotico = exotico;
    }

    /**
     * creacion de metodos
     */
    public void controlarNeurotoxina() {

    }

    public void modificarCamuflaje() {

    }

    public void cambiarAgua() {

    }

    /**
     * metodo de la clase interfaz que indica sangreFria
     */
    @Override
    public void sangreFria() {
        System.out.println("El Pez Piedra " + this.getNombre() + "\tMemo" + " \tEs de sangre fria");
    }

    /**
     * metodo de la clase interfaz que indica comer
     */
    @Override
    public void comer() {
        System.out.println("El Pez Piedra " + this.getNombre() + "\tMemo" + " \tVa a comer");
    }

    /**
     * metodo de la clase interfax que indica reproducirse
     */
    @Override
    public void reproducirse() {
        System.out.println("La Pez Piedra " + this.getNombre() + "\tMemo" + " \tVa a reproducirse");
    }

    /**
     *
     * toStrin que imprime los atributos de la clase abuelo Carnivoros de la
     * clase padre Acuatico de la clase hija pexPiedra
     */
    @Override
    public String toString() {
        return super.toString() + "\n\tPezPiedra" + "\n\tcamuflaje=" + camuflaje + ", \n\tneurotoxina=" + neurotoxina + ", \n\tresisteFueraAgua=" + resisteFueraAgua + ", \n\texotico=" + exotico;
    }
}

