/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapresencial8;

/**
 *
 * @author Francis
 */
public class Atacante extends Jugador {

    private String nombre;
    private int num;
    private int pases;
    private int balones;
    private int metrosRecorridos;
    private int goles;

    public Atacante(String nombre, int num, int goles) {
        super(nombre, num, goles);
        this.pases = (int) (Math.random() * 80);
        this.balones = (int) (Math.random() * 25);
        this.metrosRecorridos = (int) (Math.random() * 300);
    }

    @Override
    public String toString() {
        return "Delantero " + super.toString() + " La valoracion final del atacante es: " + valoracionJugador() + "\n";
    }

    @Override
    public double valoracionJugador() {

        int valoracionFinal;

        valoracionFinal = (this.goles * 30) + (this.pases) + (this.balones * 3) + (this.metrosRecorridos / 1000);

        return valoracionFinal;

    }

    @Override
    public int compareTo(Jugador o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
