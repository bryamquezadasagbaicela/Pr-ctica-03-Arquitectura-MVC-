/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.Clases;

import ec.edu.est.Interfaz.Acciones;

/**
 *
 * @author QuezadaBryam
 */
public final class TiranosaurioRex extends Terrestre implements Acciones {

    /**
     * declaracion de las variables
     */
    private boolean extinto;
    private boolean alimentoCarroño;
    private boolean capacidadSensorial;
    private boolean canibal;

    /**
     * creacion de los constructores
     */
    public TiranosaurioRex() {

    }

    public TiranosaurioRex(boolean extinto, boolean alimentoCarroño) {
        this.extinto = extinto;
        this.alimentoCarroño = alimentoCarroño;
    }

    public TiranosaurioRex(boolean extinto, boolean alimentoCarroño, boolean capacidadSensorial, boolean canibal, int numeroGarras, int numeroPatas, int numeroDientesCaninos, boolean depredadorSolitario, String nombre, String tipoReproduccion, String sexo, String termino) {
        super(numeroGarras, numeroPatas, numeroDientesCaninos, depredadorSolitario, nombre, tipoReproduccion, sexo, termino);
        this.extinto = extinto;
        this.alimentoCarroño = alimentoCarroño;
        this.capacidadSensorial = capacidadSensorial;
        this.canibal = canibal;
    }

    /**
     * getters y setters clase TiranosaurioRex
     *
     */
    public boolean isExtinto() {
        return extinto;
    }

    public void setExtinto(boolean extinto) {
        this.extinto = extinto;
    }

    public boolean isAlimentoCarroño() {
        return alimentoCarroño;
    }

    public void setAlimentoCarroño(boolean alimentoCarroño) {
        this.alimentoCarroño = alimentoCarroño;
    }

    public boolean isCapacidadSensorial() {
        return capacidadSensorial;
    }

    public void setCapacidadSensorial(boolean capacidadSensorial) {
        this.capacidadSensorial = capacidadSensorial;
    }

    public boolean isCanibal() {
        return canibal;
    }

    public void setCanibal(boolean canibal) {
        this.canibal = canibal;
    }

    /**
     * creacion de metodos
     */
    public void cambiarAlimento() {

    }

    public void modificarExtincion() {

    }

    public void modificarCapacidadSensorial() {

    }

    /**
     * metodo de la clase interfaz que indica hambre
     */
    @Override
    public void hambre() {
        System.out.println("El Tiranosaurio Rex " + this.getNombre() + "\tSpyke" + " \tTiene hambre");
    }

    /**
     * metodo de la clase interfax que indica comer
     */
    @Override
    public void comer() {
        System.out.println("El Tiranosaurio Rex " + this.getNombre() + "\tSpyke" + " \tVa a comer");
    }

    /**
     * metodo de la clase interfax que indica reproducirse
     */
    @Override
    public void reproducirse() {
        System.out.println("El Tiranosaurio Rex " + this.getNombre() + "\tSpyke" + " \tVa a reproducirse");
    }

    /**
     * toString que imprime los atributos de la clase abuelo Carnivoros de la
     * clase padre terrestre y la clase hija tiranosaurioRex
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "\n\tTiranosaurioRex" + "\n\textinto=" + extinto + ", \n\talimentoCarro\u00f1o=" + alimentoCarroño + ", \n\tcapacidadSensorial=" + capacidadSensorial + ", \n\tcanibal=" + canibal;
    }

}

