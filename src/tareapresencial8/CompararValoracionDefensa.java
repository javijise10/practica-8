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
public class CompararValoracionDefensa implements Comparator<Defensor> {

    @Override
    public int compare(Defensor o1, Defensor o2) {
        if (o1.valoracionJugador() > o2.valoracionJugador()) {

            return -1;
        } else if (o1.valoracionJugador() < o2.valoracionJugador()) {

            return 1;

        } else {
            return 0;
        }

    }

}
