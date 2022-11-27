/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fixture.view;

import fixture.model.Equipo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import static java.util.Objects.nonNull;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abreg
 */
public class TablaDePosiciones extends javax.swing.JFrame {

    private ArrayList<Equipo> equipos;

    /**
     * Creates new form TablaDePosiciones
     *
     * @param e
     */
    public TablaDePosiciones(HashSet<Equipo> e) {
        // Transformo el HashSet a ArrayList, para poder ordenarlo
        equipos = new ArrayList(e);

        initComponents();

        DefaultTableModel tablaPosicionesModel = (DefaultTableModel) tablaPosiciones.getModel();

        // Criterios de ordenamiento:
        //  1) Mayor puntaje
        //  2) Mayor diferencia de goles
        //  3) Mayor cantidad de goles totales
        // Los ordeno por puntaje
        Collections.sort(equipos, new Comparator<Equipo>() {
            @Override
            public int compare(Equipo e1, Equipo e2) {
                return e1.getPuntos() > e2.getPuntos() ? -1 : 1;
            }
        });

        // Verifico si es necesario reordenar por 
        boolean puntajesIguales = false;
        int auxPuntaje = -1;
        for (Equipo equipo : equipos) {
            if (equipo.getPuntos() == auxPuntaje) {
                puntajesIguales = true;
            }
            auxPuntaje = equipo.getPuntos();
        }

        // Los reordeno por diferencia de goles si encontré dos equipos con igual puntaje
        if (puntajesIguales) {
            Collections.sort(equipos, new Comparator<Equipo>() {
                @Override
                public int compare(Equipo e1, Equipo e2) {
                    int diferenciaDeGolesE1 = e1.getGolesHechos() - e1.getGolesEnContra();
                    int diferenciaDeGolesE2 = e2.getGolesHechos() - e2.getGolesEnContra();

                    if (e1.getPuntos() == e2.getPuntos()) {
                        return diferenciaDeGolesE1 > diferenciaDeGolesE2 ? -1 : 1;
                    }
                    return 0;
                }
            });

            // Verifico is es necesario reordenar por golesHechos
            boolean diferenciaDeGolesIguales = false;
            int auxDiferenciaDeGoles = equipos.get(0).getGolesHechos() - equipos.get(0).getGolesEnContra();
            for (int i = 1; i < equipos.size(); i++) {
                int diferenciaDeGoles = equipos.get(i).getGolesHechos() - equipos.get(i).getGolesEnContra();
                if (diferenciaDeGoles == auxDiferenciaDeGoles) {
                    diferenciaDeGolesIguales = true;
                }
                auxDiferenciaDeGoles = diferenciaDeGoles;
            }

            // Los reordeno por golesHechos si ecuentro dos equipos con igual diferencia de goles
            if (diferenciaDeGolesIguales) {
                Collections.sort(equipos, new Comparator<Equipo>() {
                    @Override
                    public int compare(Equipo e1, Equipo e2) {
                        int diferenciaDeGolesE1 = e1.getGolesHechos() - e1.getGolesEnContra();
                        int diferenciaDeGolesE2 = e2.getGolesHechos() - e2.getGolesEnContra();

                        if (diferenciaDeGolesE1 == diferenciaDeGolesE2) {
                            return e1.getGolesHechos() < e2.getGolesHechos() ? -1 : 1;
                        }
                        return 0;
                    }
                });
            }
        }

        // Los reordeno por goles hechos
        Collections.sort(equipos, new Comparator<Equipo>() {
            @Override
            public int compare(Equipo e1, Equipo e2) {
                int diferenciaDeGolesE1 = e1.getGolesHechos() - e1.getGolesEnContra();
                int diferenciaDeGolesE2 = e2.getGolesHechos() - e2.getGolesEnContra();

                if (diferenciaDeGolesE1 == diferenciaDeGolesE2) {
                    return e1.getGolesHechos() > e2.getGolesHechos() ? -1 : 1;
                }
                return 0;
            }
        });

        for (Equipo equipo : equipos) {
            if (nonNull(equipo)) {
                // Calculo la diferencia de goles
                int diferenciaDeGoles = equipo.getGolesHechos() - equipo.getGolesEnContra();

                // Creo la fila con los datos del equipo iterado
                Object[] filaTablaPosiciones = {
                    equipo.getNombre(),
                    equipo.getPartidosJugados(),
                    equipo.getPartidosGanados(),
                    equipo.getPartidosEmpatados(),
                    equipo.getPartidosPerdidos(),
                    equipo.getGolesHechos(),
                    equipo.getGolesEnContra(),
                    diferenciaDeGoles,
                    equipo.getPuntos()
                };

                // Agrego la fila creada a la tabla
                tablaPosicionesModel.addRow(filaTablaPosiciones);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPosiciones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaPosiciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipo", "PJ", "G", "E", "P", "GF", "GC", "DG", "Pts"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPosiciones.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaPosiciones);
        if (tablaPosiciones.getColumnModel().getColumnCount() > 0) {
            tablaPosiciones.getColumnModel().getColumn(0).setResizable(false);
            tablaPosiciones.getColumnModel().getColumn(0).setPreferredWidth(200);
            tablaPosiciones.getColumnModel().getColumn(1).setResizable(false);
            tablaPosiciones.getColumnModel().getColumn(2).setResizable(false);
            tablaPosiciones.getColumnModel().getColumn(3).setResizable(false);
            tablaPosiciones.getColumnModel().getColumn(4).setResizable(false);
            tablaPosiciones.getColumnModel().getColumn(5).setResizable(false);
            tablaPosiciones.getColumnModel().getColumn(6).setResizable(false);
            tablaPosiciones.getColumnModel().getColumn(7).setResizable(false);
            tablaPosiciones.getColumnModel().getColumn(8).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPosiciones;
    // End of variables declaration//GEN-END:variables
}
