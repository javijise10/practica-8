
package tareapresencial8;


public abstract class Jugador implements Comparable <Jugador>{
    
    private String nombre;
    private int num;
    private int goles;

    public Jugador(String nombre, int num, int goles) {
        this.nombre = nombre;
        this.num = num;
        this.goles = goles;
    }

    @Override
    public String toString() {
        return "Jugador: " + nombre + " ''"+  num  + "'' "+  ", goles: " + goles  ;
    }




    
    
    
    
    
    
    

   public abstract double valoracionJugador(); 
}
