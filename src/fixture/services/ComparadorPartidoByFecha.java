/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixture.services;

import fixture.model.Partido;
import java.util.Comparator;

/**
 *
 * @author Nico
 */
public class ComparadorPartidoByFecha implements Comparator<Partido> {

    @Override
    public int compare(Partido o1, Partido o2) {
        return o1.getFechaYHora().isBefore(o2.getFechaYHora()) ? -1 : 1;
    }
    
}
