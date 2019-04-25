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
public class Carnivoro implements Comparable<Carnivoro>{
     int codigo;
    String nombre;
    private String tipoReproduccion;
    private String sexo;
    private String termino;

    /**
     * creacion de los constructores
     */
    public Carnivoro() {

    }

    public Carnivoro(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Carnivoro(int codigo, String nombre, String tipoReproduccion, String sexo, String termino) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoReproduccion = tipoReproduccion;
        this.sexo = sexo;
        this.termino = termino;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * creacion de los getters y setters
     *
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoReproduccion() {
        return tipoReproduccion;
    }

    public void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }

    /**
     *
     *
     */
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTermino() {
        return termino;
    }

    public void setTermino(String termino) {
        this.termino = termino;
    }

    @Override
    public String toString() {
        return "Carnivoro{" + "codigo=" + codigo + ", nombre=" + nombre + ", tipoReproduccion=" + tipoReproduccion + ", sexo=" + sexo + ", termino=" + termino + '}';
    }

    @Override//metodos subescritos de la clase over
    /**
     * hash code que se genera debe ser unico
     */
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + this.codigo;
        return hash;
    }

    @Override
    /**
     * recibe un objeto (object clase padre de todos)
     *
     *
     */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {//obtiene la clase en la que se esta actualmente
            return false;
        }
        /**
         * declara una constante del objeto(final)
         */
        final Carnivoro other = (Carnivoro) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Carnivoro o) {

        if (nombre.compareTo(o.getNombre()) > 1) {
            return 1;
        } else if (nombre.compareTo(o.getNombre()) < 1) {
            return -1;
        } else {
            return 0;
        }
    }

}

