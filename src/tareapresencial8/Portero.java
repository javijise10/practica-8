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
public class Portero extends Jugador{
    
    private String nombre;
    private int num;
    
    private int goles;
    private int paradas;
//    private double valoracion;
    


    public Portero(String nombre, int num, int goles) {
        super(nombre, num, goles);
        this.paradas = (int) (Math.random() * 90);
//        this.valoracion = valoracionJugador();
    }
    
    
    
        @Override
    public double valoracionJugador() {
        
        int valoracionFinal;
        
        valoracionFinal = (this.goles * 10) + (this.paradas * 5);
        
        
        return valoracionFinal;
        
        
        
    }

    @Override
    public String toString() {
        return "Portero " +super.toString() + ", paradas: " + paradas + "La valoracion del portero es: " + valoracionJugador()+ "\n";
    }

    @Override
    public int compareTo(Jugador o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }





    
    
    
    
    
    
    
    
    
    
}
