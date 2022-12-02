/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixture.services;

import fixture.model.Equipo;
import java.util.Comparator;

/**
 *
 * @author Nico
 */
public class ComparadorDeEquipoByGolesHechos implements Comparator<Equipo>{

    @Override
    public int compare(Equipo o1, Equipo o2) {
        if(o1.calcularDifDeGoles() == o2.calcularDifDeGoles() ){
        return o1.getGolesHechos() > o2.getGolesHechos() ? -1 : 1;
        }
        return 0;
    }
    
}
