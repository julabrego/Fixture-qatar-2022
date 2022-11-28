/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixture.services;

import fixture.model.Equipo;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Nico
 */
public class ComparadorDeListaEquipos implements Comparator<Equipo> {

    private List<Comparator<Equipo>> listofcomparators;

    public ComparadorDeListaEquipos(Comparator<Equipo>... comparators) {
        this.listofcomparators = Arrays.asList(comparators);
    }

    @Override
    public int compare(Equipo o1, Equipo o2) {
        for (Comparator<Equipo> comparator : listofcomparators) {
            int result = comparator.compare(o1, o2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }

}
