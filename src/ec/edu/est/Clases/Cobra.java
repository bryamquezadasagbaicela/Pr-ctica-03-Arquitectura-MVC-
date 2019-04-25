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
public final class Cobra extends Terrestre implements Acciones {



    /**
     * declaracion de las variables de la clase cobra
     */
    private boolean invertebrado;
    private boolean venenoso;
    private boolean mudarPiel;
    private boolean sensorInfrarrojo;

    /**
     * creacion de los constructores
     */
    public Cobra() {

    }

    public Cobra(boolean invertebrado, boolean venenoso) {
        this.invertebrado = invertebrado;
        this.venenoso = venenoso;
    }

    public Cobra(int codig, String nombr, String tipor, String sexo, String termin, int numga, int numpa, int numca, boolean depso, boolean inve, boolean vene, boolean muda, boolean sensor) {
        super(nombr, termin, sexo, tipor, codig, numga, numpa, numca, depso);
        this.invertebrado = invertebrado;
        this.venenoso = venenoso;
        this.mudarPiel = mudarPiel;
        this.sensorInfrarrojo = sensorInfrarrojo;
    }





    /**
     * creacion de los getters y setters
     *
     */
    public boolean isInvertebrado() {
        return invertebrado;
    }

    public void setInvertebrado(boolean invertebrado) {
        this.invertebrado = invertebrado;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public boolean isMudarPiel() {
        return mudarPiel;
    }

    public void setMudarPiel(boolean mudarPiel) {
        this.mudarPiel = mudarPiel;
    }

    public boolean isSensorInfrarrojo() {
        return sensorInfrarrojo;
    }

    public void setSensorInfrarrojo(boolean sensorInfrarrojo) {
        this.sensorInfrarrojo = sensorInfrarrojo;
    }

    /**
     * creacion de metodos
     */
    public void envenenar() {

    }

    public void mudarPiel() {

    }

    public void modificarSensorInfrarrojo() {

    }

    /**
     * metodo de la clase interfaz que indica hambre
     */
    @Override
    public void hambre() {
        System.out.println("La Cobra " + this.getNombre() + "\tNaja Naja" + "\tTiene hambre");
    }

    /**
     * metodo de la clase interfaz que indica comer
     */
    @Override
    public void comer() {
        System.out.println("La Cobra " + this.getNombre() + "\tNaja Naja" + " \tVa a comer");
    }

    /**
     * metodo de la clase interfaz que indica reproducirse
     */
    @Override
    public void reproducirse() {
        System.out.println("La Cobra " + this.getNombre() + "\tNaja Naja" + " \tSe va a reproducir");
    }

    /**
     *
     * toString que imprime los atributos de la clase abuelo carnivoros de la
     * clase padre terrestre y la clase hija cobra
     */
    @Override
    public String toString() {
        return super.toString() + "\n\tCobra" + "\n\tinvertebrado=" + invertebrado + ", \n\tvenenoso=" + venenoso + ", \n\tmudarPiel=" + mudarPiel + ", \n\tsensorInfrarrojo=" + sensorInfrarrojo;
    }



}

