/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no_estructuras;

import java.util.Comparator;

/**
 *
 * @author User
 */
public class OrdenarRevista implements Comparator<Revista>{


    @Override
    public int compare(Revista o1, Revista o2) {
        if ((int)o1.getTitulo().charAt(0)> (int)o2.getTitulo().charAt(0)) {
            return -1;
        } else if ((int)o1.getTitulo().charAt(0)< (int)o2.getTitulo().charAt(0)) {
            return 1;
        } else {
            return 0;
        }
    }
}
    

