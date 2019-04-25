/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.Clases;

/**
 *
 * @author 59398
 */
public abstract class Acuatico extends Carnivoro {
    public abstract void sangreFria();

    /**
     * Declaracion de variables
     */
    private int numeroAletas;
    private boolean aguaSalada;
    private int numeroEspinas;
    private boolean venenoso;
  

    /**
     * contructores
     */
    public Acuatico() {

    }

    public Acuatico(int numeroAletas, boolean aguaSalada) {
        this.numeroAletas = numeroAletas;
        this.aguaSalada = aguaSalada;
    }

    public Acuatico( String nombre, String tipoReproduccion, String sexo, String termino, int codigo, int numeroAletas, boolean aguaSalada, int numeroEspinas, boolean venenoso) {
        super(codigo, nombre, tipoReproduccion, sexo, termino);
        this.numeroAletas = numeroAletas;
        this.aguaSalada = aguaSalada;
        this.numeroEspinas = numeroEspinas;
        this.venenoso = venenoso;
    }

    /**
     * getters y setters atributos clase acuatico
     *
     */
    
    public int getNumeroAletas() {
        return numeroAletas;
    }

    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }

    public boolean isAguaSalada() {
        return aguaSalada;
    }

    public void setAguaSalada(boolean aguaSalada) {
        this.aguaSalada = aguaSalada;
    }

    public int getNumeroEspinas() {
        return numeroEspinas;
    }

    public void setNumeroEspinas(int numeroEspinas) {
        this.numeroEspinas = numeroEspinas;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(){
        this.codigo = codigo;
    }
    /**
     * creacion de metodos
     */
    public void cambiarAgua() {

    }

    public void perderEspina() {

    }

    public void envenenar() {

    }

    /**
     *
     * toString imprime los datos clase padre carnivoro y clase hija acuatico
     */
    @Override
    public String toString() {
        return super.toString() + "\n\tAcuatico" + "\n\tnumeroAletas=" + numeroAletas + ", \n\taguaSalada=" + aguaSalada + ", \n\tnumeroEspinas=" + numeroEspinas + ", \n\tvenenoso=" + venenoso;
    }

}
