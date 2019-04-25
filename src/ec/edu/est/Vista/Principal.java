/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.Vista;

import ec.edu.est.Clases.Cobra;
import ec.edu.est.Clases.Megalodon;
import ec.edu.est.Clases.PezPiedra;
import ec.edu.est.Clases.TiranosaurioRex;
import ec.edu.est.Controladores.ControladorCobra;
import ec.edu.est.Controladores.ControladorMegalodon;
import ec.edu.est.Controladores.ControladorPezPiedra;
import ec.edu.est.Controladores.ControladorTiranosaurioRex;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Quezada Bryam
 */
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

                        switch (opcionMenuCobra) {

                            case 1:
                                System.out.println("Crear animal");
                                System.out.println("Ingrese Nombre");
                                String nom = cob.next();
                                System.out.println("Ingrese tipo reproduccion");
                                String tip = cob.next();
                                System.out.println("Ingrese sexo");
                                String sex = cob.next();
                                System.out.println("Termino");
                                String ter = cob.next();
                                System.out.println("Ingrese numero de garras");
                                int numg = cob.nextInt();
                                System.out.println("Ingrese numero patas");
                                int nump = cob.nextInt();
                                System.out.println("Ingrese numero de dientes caninos");
                                int numc = cob.nextInt();
                                System.out.println("Depredador Solitario");
                                boolean deps = cob.nextBoolean();
                                System.out.println("Invertebrado");
                                boolean inv = cob.nextBoolean();
                                System.out.println("Venenoso");
                                boolean ven = cob.nextBoolean();
                                System.out.println("Mudar Piel");
                                boolean mud = cob.nextBoolean();
                                System.out.println("Sensor infrarrojo");
                                boolean sen = cob.nextBoolean();
                                Cobra cobra = new Cobra(inv, ven, mud, sen, numg, nump, numc, deps, nom, tip, sex, ter);
                                controladorCob.create(cobra);
                                break;
                            case 2:
                                System.out.println("Leer animal");
                                System.out.println("Ingrese el codigo del animal");
                                int codigo = cob.nextInt();
                                System.out.println(controladorCob.read(codigo));
                                System.out.println(codigo);

                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del animal");
                                codigo = cob.nextInt();
                                if (controladorCob.read(codigo) != null) {
                                    System.out.println("Ingrese Nombre");
                                    String nombr = cob.next();
                                    System.out.println("Ingrese tipo reproduccion");
                                    String tipor = cob.next();
                                    System.out.println("Ingrese sexo");
                                    String sexo = cob.next();
                                    System.out.println("Termino");
                                    String termin = cob.next();
                                    System.out.println("Ingrese numero de garras");
                                    int numga = cob.nextInt();
                                    System.out.println("Ingrese numero patas");
                                    int numpa = cob.nextInt();
                                    System.out.println("Ingrese numero de dientes caninos");
                                    int numca = cob.nextInt();
                                    System.out.println("Depredador Solitario");
                                    boolean depso = cob.nextBoolean();
                                    System.out.println("Invertebrado");
                                    boolean inve = cob.nextBoolean();
                                    System.out.println("Venenoso");
                                    boolean vene = cob.nextBoolean();
                                    System.out.println("Mudar Piel");
                                    boolean muda = cob.nextBoolean();
                                    System.out.println("sensor infrarrojo");
                                    boolean sensor = cob.nextBoolean();
                                    Cobra cobraActualizada = new Cobra(inve, vene, muda, sensor, numga, numpa, numca, depso, nombr, tipor, sexo, termin);
                                    controladorCob.update(cobraActualizada);
                                } else {
                                    System.out.println("El animal no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Eliminar animal");
                                System.out.println("Ingrese el codigo del animal a eliminar");
                                codigo = cob.nextInt();
                                controladorCob.delete(codigo);
                                break;
                            case 5:
                                controladorCob.imprimir();
                                break;
                            case 6:
                                repetirCobra = false;
                                break;
                        }
                    } while (repetirCobra);
                    break;
                case 2:
                    boolean repetirTiranosaurioRex = true;
                    Scanner tirano = new Scanner(System.in);
                    do {
                        System.out.println("ELIJA UNA OPCION:");
                        System.out.println("1. Create ");
                        System.out.println("2. Read ");
                        System.out.println("3. Update");
                        System.out.println("4. Delete ");
                        System.out.println("5. Listar ");
                        System.out.println("6. Regresar");
                        int opcionMenuTiranosaurioRex = tirano.nextInt();
                        switch (opcionMenuTiranosaurioRex) {
                            case 1:
                                System.out.println("Ingrese Nombre");
                                String nom = tirano.next();
                                System.out.println("Ingrese tipo reproduccion");
                                String tip = tirano.next();
                                System.out.println("Ingrese sexo");
                                String sex = tirano.next();
                                System.out.println("Termino");
                                String ter = tirano.next();
                                System.out.println("Ingrese numero de garras");
                                int numg = tirano.nextInt();
                                System.out.println("Ingrese numero patas");
                                int nump = tirano.nextInt();
                                System.out.println("Ingrese numero de dientes caninos");
                                int numc = tirano.nextInt();
                                System.out.println("Depredador Solitario");
                                boolean deps = tirano.nextBoolean();
                                System.out.println("Extinto");
                                boolean ext = tirano.nextBoolean();
                                System.out.println("consume alimento carrono");
                                boolean ali = tirano.nextBoolean();
                                System.out.println("Tiene capacidad sensorial");
                                boolean cap = tirano.nextBoolean();
                                System.out.println("Canibal");
                                boolean can = tirano.nextBoolean();
                                TiranosaurioRex tiranosaurioRex = new TiranosaurioRex(ext, ali, cap, can, numg, nump, numc, deps, nom, tip, sex, ter);
                                controladorTirano.create(tiranosaurioRex);

                                break;
                            case 2:
                                System.out.println("Leer animal");
                                System.out.println("Ingrese el codigo del animal");
                                int codigo = tirano.nextInt();
                                System.out.println(controladorTirano.read(codigo));
                                System.out.println(codigo);

                            case 3:
                                System.out.println("Ingrese el codigo del animal");
                                codigo = tirano.nextInt();
                                if (controladorTirano.read(codigo) != null) {
                                    System.out.println("Ingrese Nombre");
                                    String nombr1 = tirano.next();
                                    System.out.println("Ingrese tipo reproduccion");
                                    String tipor1 = tirano.next();
                                    System.out.println("Ingrese sexo");
                                    String sexo1 = tirano.next();
                                    System.out.println("Termino");
                                    String termin1 = tirano.next();
                                    System.out.println("Ingrese numero de garras");
                                    int numga1 = tirano.nextInt();
                                    System.out.println("Ingrese numero patas");
                                    int numpa1 = tirano.nextInt();
                                    System.out.println("Ingrese numero de dientes caninos");
                                    int numca1 = tirano.nextInt();
                                    System.out.println("Depredador Solitario");
                                    boolean depso1 = tirano.nextBoolean();
                                    System.out.println("Extinto");
                                    boolean ext1 = tirano.nextBoolean();
                                    System.out.println("consume alimento carrono");
                                    boolean ali1 = tirano.nextBoolean();
                                    System.out.println("Tiene capacidad sensorial");
                                    boolean cap1 = tirano.nextBoolean();
                                    System.out.println("Canibal");
                                    boolean can1 = tirano.nextBoolean();
                                    TiranosaurioRex tiranoActualizada = new TiranosaurioRex(ext1, ali1, cap1, can1, numga1, numpa1, numca1, depso1, nombr1, tipor1, sexo1, termin1);
                                    controladorTirano.update(tiranoActualizada);
                                } else {
                                    System.out.println("El no animal no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Elimar animal");
                                System.out.println("Ingrese el codigo animal a eliminar");
                                codigo = tirano.nextInt();
                                controladorTirano.delete(codigo);
                                break;
                            case 5:
                                controladorTirano.imprimir();
                                break;
                            case 6:
                                repetirTiranosaurioRex = false;
                                break;
                        }
                    } while (repetirTiranosaurioRex);

                    break;
                case 3:
                    Scanner pez = new Scanner(System.in);
                    boolean repetirPezPiedra = true;
                    do {
                        System.out.println("ELIJA UNA OPCION:");
                        System.out.println("1. Create ");
                        System.out.println("2. Read ");
                        System.out.println("3. Update");
                        System.out.println("4. Delete ");
                        System.out.println("5. Listar ");
                        System.out.println("6. Regresar");
                        int opcionMenuPezPiedra = pez.nextInt();
                        switch (opcionMenuPezPiedra) {
                            case 1:
                                System.out.println("Ingrese Nombre");
                                String nom1 = pez.next();
                                System.out.println("Ingrese tipo reproduccion");
                                String tip1 = pez.next();
                                System.out.println("Ingrese sexo");
                                String sex1 = pez.next();
                                System.out.println("Termino");
                                String ter1 = pez.next();
                                System.out.println("Ingrese numero de aletas");
                                int numg1 = pez.nextInt();
                                System.out.println("Agua Salada");
                                boolean aguas = pez.nextBoolean();
                                System.out.println("Ingrese numero de espinas");
                                int nums = pez.nextInt();
                                System.out.println("Venenoso");
                                boolean venen = pez.nextBoolean();
                                System.out.println("Camuflaje");
                                boolean camu = pez.nextBoolean();
                                System.out.println("Tiene neurotoxina");
                                boolean neuro = pez.nextBoolean();
                                System.out.println("Resistencia fuera del agua");
                                boolean resis = pez.nextBoolean();
                                System.out.println("Exotico");
                                boolean exo = pez.nextBoolean();
                                PezPiedra pezPiedra = new PezPiedra(camu, neuro, resis, exo, numg1, aguas, nums, venen, nom1, tip1, sex1, ter1);
                                controladorPez.create(pezPiedra);
                                break;
                            case 2:
                                System.out.println("Leer animal");
                                System.out.println("Ingrese el codigo del animal");
                                int codigo = pez.nextInt();
                                System.out.println(controladorPez.read(codigo));
                                System.out.println(codigo);
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del animal");
                                codigo = pez.nextInt();
                                if (controladorPez.read(codigo) != null) {
                                    System.out.println("Ingrese Nombre");
                                    String nom2 = pez.next();
                                    System.out.println("Ingrese tipo reproduccion");
                                    String tip2 = pez.next();
                                    System.out.println("Ingrese sexo");
                                    String sex2 = pez.next();
                                    System.out.println("Termino");
                                    String ter2 = pez.next();
                                    System.out.println("Ingrese numero de aletas");
                                    int numg2 = pez.nextInt();
                                    System.out.println("Agua Salada");
                                    boolean aguas2 = pez.nextBoolean();
                                    System.out.println("Ingrese numero de espinas");
                                    int nums2 = pez.nextInt();
                                    System.out.println("Venenoso");
                                    boolean venen2 = pez.nextBoolean();
                                    System.out.println("Camuflaje");
                                    boolean camu2 = pez.nextBoolean();
                                    System.out.println("Tiene neurotoxina");
                                    boolean neuro2 = pez.nextBoolean();
                                    System.out.println("Resistencia fuera del agua");
                                    boolean resis2 = pez.nextBoolean();
                                    System.out.println("Exotico");
                                    boolean exo2 = pez.nextBoolean();
                                    PezPiedra pezPiedraActualizada = new PezPiedra(camu2, neuro2, resis2, exo2, numg2, aguas2, nums2, venen2, nom2, tip2, sex2, ter2);
                                    controladorPez.update(pezPiedraActualizada);
                                } else {
                                    System.out.println("El animal no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Eliminar animal");
                                System.out.println("Ingrese el codigo del animal a eliminar");
                                codigo = pez.nextInt();
                                controladorPez.delete(codigo);
                                break;
                            case 5:
                                controladorPez.imprimir();
                                break;
                            case 6:
                                repetirPezPiedra = false;
                                break;
                        }
                    } while (repetirPezPiedra);

                    break;
                case 4:
                    Scanner meg = new Scanner(System.in);
                    boolean repetirMegalodon = true;
                    do {
                        System.out.println("ELIJA UNA OPCION:");
                        System.out.println("1. Create ");
                        System.out.println("2. Read ");
                        System.out.println("3. Update");
                        System.out.println("4. Delete ");
                        System.out.println("5. Listar ");
                        System.out.println("6. Regresar");
                        int opcionMenuMegalodon = meg.nextInt();
                        switch (opcionMenuMegalodon) {
                            case 1:
                                System.out.println("Ingrese Nombre");
                                String nom1 = meg.next();
                                System.out.println("Ingrese tipo reproduccion");
                                String tip1 = meg.next();
                                System.out.println("Ingrese sexo");
                                String sex1 = meg.next();
                                System.out.println("Termino");
                                String ter1 = meg.next();
                                System.out.println("Ingrese numero de aletas");
                                int numg1 = meg.nextInt();
                                System.out.println("Agua Salada");
                                boolean aguas = meg.nextBoolean();
                                System.out.println("Ingrese numero de espinas");
                                int nums = meg.nextInt();
                                System.out.println("Venenoso");
                                boolean venen = meg.nextBoolean();
                                System.out.println("Depredador Solitario");
                                boolean depss = meg.nextBoolean();
                                System.out.println("Numero de ileras de dientes");
                                int iler = meg.nextInt();
                                System.out.println("Canibal");
                                boolean cani = meg.nextBoolean();
                                System.out.println("Extinto");
                                boolean ext = meg.nextBoolean();
                                Megalodon megalodon = new Megalodon(depss, iler, cani, ext, numg1, aguas, nums, venen, nom1, tip1, sex1, ter1);
                                controladorMeg.create(megalodon);
                                break;
                            case 2:
                                System.out.println("Leer animal");
                                System.out.println("Ingrese el codigo del animal");
                                int codigo = meg.nextInt();
                                System.out.println(controladorMeg.read(codigo));
                                System.out.println(codigo);
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del animal");
                                codigo = meg.nextInt();
                                if (controladorMeg.read(codigo) != null) {
                                    System.out.println("Ingrese Nombre");
                                    String nom = meg.next();
                                    System.out.println("Ingrese tipo reproduccion");
                                    String tip = meg.next();
                                    System.out.println("Ingrese sexo");
                                    String sex = meg.next();
                                    System.out.println("Termino");
                                    String ter = meg.next();
                                    System.out.println("Ingrese numero de aletas");
                                    int numg = meg.nextInt();
                                    System.out.println("Agua Salada");
                                    boolean aguas1 = meg.nextBoolean();
                                    System.out.println("Ingrese numero de espinas");
                                    int nums1 = meg.nextInt();
                                    System.out.println("Venenoso");
                                    boolean venen1 = meg.nextBoolean();
                                    System.out.println("Depredador Solitario");
                                    boolean depss1 = meg.nextBoolean();
                                    System.out.println("Numero de ileras de dientes");
                                    int iler1 = meg.nextInt();
                                    System.out.println("Canibal");
                                    boolean cani1 = meg.nextBoolean();
                                    System.out.println("Extinto");
                                    boolean ext1 = meg.nextBoolean();
                                    Megalodon megaActualizada = new Megalodon(depss1, iler1, cani1, ext1, numg, aguas1, nums1, venen1, nom, tip, sex, ter);
                                    controladorMeg.update(megaActualizada);
                                } else {
                                    System.out.println("El animal no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Eliminar animal");
                                System.out.println("Ingrese el codigo del animal a eliminar");
                                codigo = meg.nextInt();
                                controladorMeg.delete(codigo);
                                break;
                            case 5:
                                controladorMeg.imprimir();
                                break;
                            case 6:
                                repetirMegalodon = false;
                                break;
                        }
                    } while (repetirMegalodon);

                    break;
                case 5:
                    System.out.println("Adios");
                    repetir = false;

            }

        } while (repetir);
    }

}
