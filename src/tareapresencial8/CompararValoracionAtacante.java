/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapresencial8;

import java.util.Comparator;

/**
 *
 * @author Francis
 */
public class CompararValoracionAtacante implements Comparator<Atacante> {

    @Override
    public int compare(Atacante o1, Atacante o2) {

        if (o1.valoracionJugador() > o2.valoracionJugador()) {

            return -1;
        } else if (o1.valoracionJugador() < o2.valoracionJugador()) {

            return 1;

        } else {
            return 0;
        }
    }
}
