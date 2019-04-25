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

    public final class Megalodon extends Acuatico implements Acciones {

    /**
     * declaracion de las variables clase megalodon
     */
    private boolean depredadorSolitario;
    private int numeroIlerasDientes;
    private boolean canibal;
    private boolean extinto;

    /**
     * creacion de los constructores
     */
    public Megalodon() {

    }

    public Megalodon(boolean depredadorSolitario, int numeroIlerasDientes) {
        this.depredadorSolitario = depredadorSolitario;
        this.numeroIlerasDientes = numeroIlerasDientes;
    }

    public Megalodon(String nombre, String tipoReproduccion, String sexo, String termino,int codigo, int numeroAletas, boolean aguaSalada, int numeroEspinas, boolean venenoso, boolean depredadorSolitario, int numeroIlerasDientes, boolean canibal, boolean extinto) {
        super(nombre, tipoReproduccion, sexo, termino,codigo, numeroAletas, aguaSalada, numeroEspinas, venenoso);
        this.depredadorSolitario = depredadorSolitario;
        this.numeroIlerasDientes = numeroIlerasDientes;
        this.canibal = canibal;
        this.extinto = extinto;
    }

    public Megalodon(String nom, String tip, String sex, String ter, int numg, int nump, int numc, boolean deps, boolean inv, boolean ven, boolean mud, boolean sen, boolean inv0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * creacion de los getters y setters
     *
     */
    public boolean isDepredadorSolitario() {
        return depredadorSolitario;
    }

    public void setDepredadorSolitario(boolean depredadorSolitario) {
        this.depredadorSolitario = depredadorSolitario;
    }

    public int getNumeroIlerasDientes() {
        return numeroIlerasDientes;
    }

    public void setNumeroIlerasDientes(int numeroIlerasDientes) {
        this.numeroIlerasDientes = numeroIlerasDientes;
    }

    public boolean isCanibal() {
        return canibal;
    }

    public void setCanibal(boolean canibal) {
        this.canibal = canibal;
    }

    public boolean isExtinto() {
        return extinto;
    }

    public void setExtinto(boolean extinto) {
        this.extinto = extinto;
    }

    /**
     * creacion de los metodos
     */
    public void agregarManada() {

    }

    public void cambiarDientes() {

    }

    public void modificarExtincion() {

    }

    /**
     * metodo de la clase interfaz que indica sangrefria
     */
    @Override
    public void sangreFria() {
        System.out.println("El Megalodon " + this.getNombre() + "\tGlut" + " \tEs de sangre fria");
    }

    /**
     * metodo de la clase interfaz que indica comer
     */
    @Override
    public void comer() {
        System.out.println("El Megalodon " + this.getNombre() + "\tGlut" + " \tVa a comer");
    }

    /**
     * metodo de la clase interfaz que indica reproducirse
     */
    @Override
    public void reproducirse() {
        System.out.println("El Megalodon " + this.getNombre() + "\tGlut" + " \tVa a reproducirse");
    }

    /**
     * toString que imprime los atrubitos de la clase abuelo carnivoros, de la
     * clase padre acuatico de la clase hija megalodon
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "\n\tMegalodon" + "\n\tdepredadorSolitario=" + depredadorSolitario + ", \n\tnumeroIlerasDientes=" + numeroIlerasDientes + ", \n\tcanibal=" + canibal + ", \n\textinto=" + extinto;
    }

    public int nextInt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


