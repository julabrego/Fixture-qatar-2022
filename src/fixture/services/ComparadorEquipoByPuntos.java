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
public class ComparadorEquipoByPuntos implements Comparator<Equipo> {


    @Override
    public int compare(Equipo o1, Equipo o2) {
        return o1.getPuntosDeEquipo() > o2.getPuntosDeEquipo() ? -1 :1;
    }
    
}
