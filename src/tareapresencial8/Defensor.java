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
public class Defensor extends Jugador {

    private String nombre;
    private int num;
    private int pases;
    private int balones;
    private int metrosRecorridos;
    private int goles;

    public Defensor(String nombre, int num, int goles) {
        super(nombre, num, goles);
        this.pases = (int) (Math.random() * 80);
        this.balones = (int) (Math.random() * 25);
        this.metrosRecorridos = (int) (Math.random() * 300);
    }

    @Override
    public double valoracionJugador() {

        int valoracionFinal;

        valoracionFinal = (this.goles * 20) + (this.pases) + (this.balones * 4) + (this.metrosRecorridos / 1000);

        return valoracionFinal;

    }

    @Override
    public String toString() {
        return "Defensor" + super.toString() + "La valoracion del defensor es :" + valoracionJugador() + "\n";
    }

    @Override
    public int compareTo(Jugador o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
