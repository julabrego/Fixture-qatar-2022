/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixture.model.types;

import java.util.ArrayList;
import javax.swing.JFormattedTextField;

/**
 *
 * @author abreg
 */
public class IdsPartidosConResultados {

    private ArrayList<Integer> idsPartidos;
    private JFormattedTextField[] golesLocal;
    private JFormattedTextField[] golesVisitantes;

    public IdsPartidosConResultados(ArrayList<Integer> idsPartidos, JFormattedTextField[] golesLocal, JFormattedTextField[] golesVisitantes) {
        this.idsPartidos = idsPartidos;
        this.golesLocal = golesLocal;
        this.golesVisitantes = golesVisitantes;
    }

}
