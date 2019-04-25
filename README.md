# Pr-ctica-03-Arquitectura-MVC-
Modelo Vista Controlador

  *ACTIVIDADES POR DESARROLLAR*
  
  *1.	Crear un repositorio en GitHub con el nombre “Práctica 03 – Arquitectura MVC”*
  
  Práctica 03 – Arquitectura MVC
  
  *2. Sincronizar el repositorio creado con un proyecto en NetBeans. Realizar varios commit y push por cada requerimiento de los puntos a continuación descritos (incluir un mensaje que identifique claramente los commits realizados a GitHub).*
  
  •	Evidencia de todos los comits con sus respectivos pasos y lo que se realiza en cada uno.
  
  Paso 3 Creación de los paquetes para los controladores y la vista.
  
  paso4 creacion de los controladores por cada clase hija
  
  paso5 implementacion del InterfaceList y ArrayList
  
  Paso6 Implementacion del interfaz Set y la clase HashSet.
  
  paso7 implementacion de la interfaz SortedSet y la clase TreeSet
  
  Paso8 Implementacion de la interfaz Mapa y la clase TreeMap.
  
  paso9 creacion de la clase principal con el programa funcionando
  
  *3.	Crear un paquete para los controladores y un paquete para la vista.*
  
  creacion de los packages :
  
  ec.edu.est.Clases
  
  ec.edu.esu.Controladores
  
  ec.edu.est.Interfaz
  
  ec.edu.est.Vista
  
  *4.	Crear un controlador por cada clase hija. En total, cuatro controladores.*
  
  dentro del packagesControladores se encuentran:
  
  ControladorCobra
  
  ControladorMegalodon
  
  ControladorPezPiedra
  
  ControladorTiranosaurioRex
  
  *5.	Al menos una clase Controlador debe ser implementada usando la interface List y la clase ArrayList.*
  
  import ec.edu.est.Clases.Cobra;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author QuezadaBryam
 */
public class ControladorCobra {

    private List<Cobra> lista;
    private int contador;

    public ControladorCobra() {
        lista = new ArrayList<>();
        contador = 0;
    }
    
    *6.	Al menos una clase Controlador debe ser implementada usando la interface Set y la clase HashSet.*
    
    package ec.edu.est.Controladores;

import ec.edu.est.Clases.TiranosaurioRex;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author QuezadaBryam
 */
public class ControladorTiranosaurioRex {
   
    private Set<TiranosaurioRex> lista;
    private int codigo;

    public ControladorTiranosaurioRex() {
        lista = new HashSet<>();
        codigo =0;

    }
    
    *7.	Al menos una clase Controlador debe ser implementada usando la interface SortedSet y la clase TreeSet.*
    
    package ec.edu.est.Controladores;

import ec.edu.est.Clases.PezPiedra;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author QuezadaBryam
 */
public class ControladorPezPiedra {
  
    private SortedSet<PezPiedra> listaOrdenada;
    private int codigo;

    public ControladorPezPiedra() {
        listaOrdenada = new TreeSet<>();
        codigo =0;

    }
    
    
    *8.	Al menos una clase Controlador debe ser implementada usando la interface Map y la clase HashMap o la interface Map y la clase TreeMap.*
    
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


*9.	Crear una clase “Principal”, en donde se demostrará el funcionamiento del sistema completo a través de la consola de java, usando menús y submenús para acceder a las opciones. Por ejemplo:*

public class Principal { 

    public static void main(String args[]) {

        ControladorCobra controladorCob = new ControladorCobra();
        ControladorMegalodon controladorMeg = new ControladorMegalodon();
        ControladorPezPiedra controladorPez = new ControladorPezPiedra();
        ControladorTiranosaurioRex controladorTirano = new ControladorTiranosaurioRex();
        Scanner animal = new Scanner(System.in);

        boolean repetir = true;

        do {
            System.out.println("1. MENU PRINCIPAL ");
            System.out.println("2. CRUD COBRA ");
            System.out.println("3. CRUD PEZ PIEDRA");
            System.out.println("4. CRUD TIRANOSAURIO REX");
            System.out.println("5. CRUD MEGALODON");
            System.out.println("6. SALIR ");

            int opcionMenu = animal.nextInt();
            ;

            switch (opcionMenu) {

                case 1:
                    Scanner cob = new Scanner(System.in);
                    boolean repetirCobra = true;
                    do {
                        System.out.println("ELIJA UNA OPCION:");
                        System.out.println("1. Create ");
                        System.out.println("2. Read ");
                        System.out.println("3. Update");
                        System.out.println("4. Delete ");
                        System.out.println("5. Listar ");
                        System.out.println("6. Regresar");
                        int opcionMenuCobra = cob.nextInt();
                        
                        *INFORMACION ACERCA DEL GITHUB:*
                        
                        *Usuario*
                        
                        bryamquez
                        
                        *Url*
                        
                        https://github.com/bryamquezadasagbaicela
                        
                        *RESULTADO(S) OBTENIDO(S):*
                        
                        List almacenó los objetos que ingresan de acuerdo al programa.
SortedSet ordena los objetos de acuerdo al código nombrado.
Map me sirvió para mostrar los objetos en un orden.
En finalidad obtuve como resultado que mi proyecto tenga una orden mucho mas manejable y mas fácil de utilizar y captar.


*CONCLUSIONES:*

Me fue de gran aprovechamiento ya que  asi pude llevar un orden jerarquico mas factible en los  objetos dentro de mi proyecto y de esta manera tener una mejor presentación.

*RECOMENDACIONES:*

Como primera recomendación desde mi punto e vista es hacer el diagrama uml como primer paso y saber organizar bien las clases y sus herencias ya que a mi me sucedió que me toco volver a organizar los constructores y sus objetos por no organizar siguiendo un buen orden.

Como ultima recomendación es aplicar mas seguido estos métodos aprendidos ya que de esta manera podemos emplear en proyectos futuros y tener un mejor orden y una mejor presentación.


