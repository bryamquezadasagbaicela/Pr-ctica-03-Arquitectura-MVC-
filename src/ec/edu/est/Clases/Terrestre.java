/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.Clases;

/**
 *
 * @author QuezadaBryam
 */
public abstract class Terrestre extends Carnivoro {

    /**
     * declaracion metodo abstracto
     */
    public abstract void hambre();
    /**
     * declaracion de variables clase terrestre
     */
    private int numeroGarras;
    private int numeroPatas;
    private int numeroDientesCaninos;
    private boolean depredadorSolitario;

    /**
     * creacion de los constructores
     */
    public Terrestre() {

    }

    public Terrestre(int numeroGarras, int numeroPatas) {
        this.numeroGarras = numeroGarras;
        this.numeroPatas = numeroPatas;
    }

    public Terrestre(int numeroGarras, int numeroPatas, int numeroDientesCaninos, boolean depredadorSolitario, String nombre, String tipoReproduccion, String sexo, String termino) {
        super(nombre, tipoReproduccion, sexo, termino);
        this.numeroGarras = numeroGarras;
        this.numeroPatas = numeroPatas;
        this.numeroDientesCaninos = numeroDientesCaninos;
        this.depredadorSolitario = depredadorSolitario;
    }


    /**
     * getters y setters atributos de la clase Terrestre
     *
     */
    public int getNumeroGarras() {
        return numeroGarras;
    }

    public void setNumeroGarras(int numeroGarras) {
        this.numeroGarras = numeroGarras;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroDientesCaninos() {
        return numeroDientesCaninos;
    }

    public void setNumeroDientesCaninos(int numeroDientesCaninos) {
        this.numeroDientesCaninos = numeroDientesCaninos;
    }

    public boolean isDepredadorSolitario() {
        return depredadorSolitario;
    }

    public void setDepredadorSolitario(boolean depredadorSolitario) {
        this.depredadorSolitario = depredadorSolitario;
    }

    /**
     * creacion de metodos
     */
    public void cambiarGarra() {

    }

    public void cambiarDientes() {

    }

    public void cambiarManada() {

    }

    /**
     * toString imprime los datos clase padre carnivoro y clase hija terrestre
     *
     */
    @Override
    public String toString() {
        return super.toString() + "\n\tTerrestre" + "\n\tnumeroGarras=" + numeroGarras + ", \n\tnumeroPatas=" + numeroPatas + ", \n\tnumeroDientesCaninos=" + numeroDientesCaninos + ", \n\tdepredadorSolitario=" + depredadorSolitario;
    }

}
