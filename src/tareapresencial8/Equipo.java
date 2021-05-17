/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapresencial8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Equipo implements Comparable<Equipo> {

    private ArrayList<Jugador> j = new ArrayList<>();
    private int puntos;
    private String nombre;
    private String localidad;

    private String nombreFichero = "Equipos.dat";
    private File fichero = new File(nombreFichero);

    public Equipo() {
        this.puntos = (int) (Math.random() * 80);
        this.nombre = "Equipo " + (int) (Math.random() * 2);
        this.localidad = "CORDOBA";
        this.j = crearJugadores();
    }

    public int getPuntos() {
        return puntos;
    }

    private ArrayList<Jugador> crearJugadores() {

        Jugador p1 = new Portero("Casillas", 1, 3);
        j.add(p1);
        Jugador p2 = new Portero("Neuer", 2, 3);
        j.add(p2);

        Jugador p3 = new Atacante("Cristiano", 7, 45);
        j.add(p3);
        Jugador p4 = new Atacante("Messi", 10, 30);
        j.add(p4);

        Jugador p5 = new Defensor("De ligh", 5, 3);
        j.add(p5);
        Jugador p6 = new Defensor("Ramos", 4, 3);
        j.add(p6);

        Jugador p7 = new Centrocampista("Goretzka", 11, 3);
        j.add(p7);
        Jugador p8 = new Centrocampista("Schurle", 22, 5);
        j.add(p8);

        /// ALEATORIO O MANUAL
        
//        int suma = 0;
//        for (int i = 0; i < 10; i++) {
//            int aleatorio1 = (int) (Math.random() * 4);
//
//            switch (aleatorio1) {
//                case 0:
//                    Jugador p1 = new Portero();
//                    j.add(p1);
//
//                    break;
//                case 1:
//                    Jugador p2 = new Atacante();
//                    j.add(p2);
//
//                    break;
//
//                case 2:
//                    Jugador p3 = new Centrocampista();
//                    j.add(p3);
//
//                    break;
//
//                case 3:
//                    Jugador p4 = new Defensor();
//                    j.add(p4);
//
//                    break;
//
//            }
//        }
        return j;
    }

    public String mostrarJugadores() {

        String mostJugadores = "";

        for (int i = 0; i < j.size(); i++) {

            mostJugadores += "#" + i + " " + j.get(i) + " ";

        }

        return mostJugadores;
    }
    



    public void cargararchivo() {
        Jugador r;

        if (fichero.exists()) {

            try {

                FileInputStream fis = new FileInputStream(fichero);
                ObjectInputStream entrada = new ObjectInputStream(fis);
                while ((r = (Jugador) entrada.readObject()) != null) {

                    j.add(r);

                }
                entrada.close();
            } catch (FileNotFoundException e) {
                System.out.println("No se puede leer archivo");
            } catch (IOException e) {

            } catch (ClassNotFoundException e) {
                System.out.println("No hay datos del tipo registro ventas");
            }
        }
    }

    public void guardarArchivo() {

        try {

            FileOutputStream fos = new FileOutputStream(fichero);
            ObjectOutputStream salida = new ObjectOutputStream(fos);

            for (int i = 0; i < j.size(); i++) {
                salida.writeObject(j.get(i));
            }

            salida.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se puede leer archivo");
        } catch (IOException e) {
            System.out.println("No se puede leer archivo");
        }

    }

    @Override
    public String toString() {
        return "\n" + "El nombre es : " + nombre + " Localidad: " + localidad + " Los puntos son: " + puntos + "\n" + mostrarJugadores();
    }

    @Override
    public int compareTo(Equipo o) {

        if (o.getPuntos() > puntos) {

            return -1;
        } else if (o.getPuntos() < puntos) {

            return 0;

        } else {
            return 0;
        }

    }
    }
