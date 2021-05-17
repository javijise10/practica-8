/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapresencial8;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TareaPresencial8 {

    private static Equipo equipo = new Equipo();

    public static void main(String[] args) {

        equipo.cargararchivo();
        menu();

    }

    public static void menu() {

        boolean salir = false;
        do {
            System.out.println("\nEquipos");
            System.out.println("*************************************\n");
            System.out.println("1. MOSTRAR");
            System.out.println("2. ORDENAR");
            System.out.println("3. SALIR");

            System.out.print("\nPor favor, introduzca una opción (1-2):");

            try {

                Scanner entrada = new Scanner(System.in);

                int opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:

                        ArrayList<Equipo> e = new ArrayList<>();

                        Equipo e1 = new Equipo();
                        Equipo e2 = new Equipo();

                        e.add(e1);
                        e.add(e2);

                        System.out.println(e);

                        break;

                    case 2:
                        
                        //No me da tiempo a llamar al método y comprobarlo.
                        // Si quieres comparar por valoracion = Collections.sort(equipos) // Está creado el compareto
                        // Si quieres comparar por ambos comparesto = Collections.sort(equipos, new CompararV...());

                        break;

                    case 3:
                        System.out.println("\n\nAdios!\n");
                        salir = true;
                        equipo.guardarArchivo();
                        break;

                    default:
                        System.err.println("Error: Por favor, introduzca una opción válida (1-2)");
                        break;
                }
            } catch (InputMismatchException e) {
                System.err.println("Error: Por favor, introduzca una opción válida (1-2)");
            }
        } while (salir != true);
    }

}
