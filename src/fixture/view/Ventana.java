/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fixture.view;

import fixture.model.Fase;
import fixture.model.Grupo;
import fixture.model.Partido;
import fixture.repository.GrupoRepository;
import fixture.repository.PartidoRepository;
import fixture.repository.migrations.GruposMigrations;
import fixture.repository.migrations.PartidosMigrations;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;

/**
 *
 * @author abreg
 */
public class Ventana extends javax.swing.JFrame {

    private ImageIcon logoImage;
    
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        
        cargarRepositorios();
        
        loadPartidosGrupoA();
        
        loadPartidosGrupoB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelBody = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        panelGrupoB = new javax.swing.JPanel();
        labelLogo2 = new javax.swing.JLabel();
        lblFechaPartidoB0 = new javax.swing.JLabel();
        lblEquipoLocalB = new javax.swing.JLabel();
        lblEquipoVisitantelB = new javax.swing.JLabel();
        lblNombreEstadioB = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lblFechaPartidoB2 = new javax.swing.JLabel();
        lblEquipoLocalB1 = new javax.swing.JLabel();
        lblNombreEstadioB1 = new javax.swing.JLabel();
        lblEquipoVisitantelB1 = new javax.swing.JLabel();
        panelGrupoC = new javax.swing.JPanel();
        panelGrupoD = new javax.swing.JPanel();
        panelGrupoE = new javax.swing.JPanel();
        panelGrupoF = new javax.swing.JPanel();
        panelGrupoG = new javax.swing.JPanel();
        panelGrupoH = new javax.swing.JPanel();
        panelOctavos = new javax.swing.JPanel();
        panelCuartos = new javax.swing.JPanel();
        panelSemifinales = new javax.swing.JPanel();
        panelTercerPuesto = new javax.swing.JPanel();
        panelFinal = new javax.swing.JPanel();
        panelGrupoA = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        lblFechaPartido0 = new javax.swing.JLabel();
        lblEquipoLocal0 = new javax.swing.JLabel();
        lblNombreEstadio6 = new javax.swing.JLabel();
        lblEquipoVisitante6 = new javax.swing.JLabel();
        lblFechaPartido1 = new javax.swing.JLabel();
        lblFechaPartido2 = new javax.swing.JLabel();
        lblFechaPartido3 = new javax.swing.JLabel();
        lblFechaPartido4 = new javax.swing.JLabel();
        lblFechaPartido5 = new javax.swing.JLabel();
        lblEquipoLocal1 = new javax.swing.JLabel();
        lblEquipoLocal2 = new javax.swing.JLabel();
        lblEquipoLocal3 = new javax.swing.JLabel();
        lblEquipoLocal4 = new javax.swing.JLabel();
        lblEquipoLocal5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        lblNombreEstadio1 = new javax.swing.JLabel();
        lblNombreEstadio2 = new javax.swing.JLabel();
        lblNombreEstadio3 = new javax.swing.JLabel();
        lblNombreEstadio4 = new javax.swing.JLabel();
        lblNombreEstadio5 = new javax.swing.JLabel();
        lblEquipoVisitante1 = new javax.swing.JLabel();
        lblEquipoVisitante2 = new javax.swing.JLabel();
        lblEquipoVisitante3 = new javax.swing.JLabel();
        lblEquipoVisitante4 = new javax.swing.JLabel();
        lblEquipoVisitante5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        panelHeader = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelSubtitulo = new javax.swing.JLabel();
        labelLogo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fixture interactivo - Qatar 2022");
        setBounds(new java.awt.Rectangle(0, 0, 1000, 800));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));

        panelMain.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelMain.setPreferredSize(new java.awt.Dimension(1280, 720));

        panelBody.setPreferredSize(new java.awt.Dimension(1280, 263));

        tabbedPane.setMaximumSize(panelBody.getMinimumSize());

        panelGrupoB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/grupoA.png"))); // NOI18N
        labelLogo2.setText("LOGO");
        panelGrupoB.add(labelLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 82, 308, 228));

        lblFechaPartidoB0.setText("Fecha Partido");
        panelGrupoB.add(lblFechaPartidoB0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        lblEquipoLocalB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalB.setText("Equipo Local B");
        panelGrupoB.add(lblEquipoLocalB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        lblEquipoVisitantelB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitantelB.setText("Equipo Local B");
        panelGrupoB.add(lblEquipoVisitantelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        lblNombreEstadioB.setText("Fecha Partido");
        panelGrupoB.add(lblNombreEstadioB, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));
        panelGrupoB.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 290, 10));

        lblFechaPartidoB2.setText("Fecha Partido");
        panelGrupoB.add(lblFechaPartidoB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        lblEquipoLocalB1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalB1.setText("Equipo Local B");
        panelGrupoB.add(lblEquipoLocalB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        lblNombreEstadioB1.setText("Fecha Partido");
        panelGrupoB.add(lblNombreEstadioB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        lblEquipoVisitantelB1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitantelB1.setText("Equipo Local B");
        panelGrupoB.add(lblEquipoVisitantelB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        tabbedPane.addTab("B", panelGrupoB);

        javax.swing.GroupLayout panelGrupoCLayout = new javax.swing.GroupLayout(panelGrupoC);
        panelGrupoC.setLayout(panelGrupoCLayout);
        panelGrupoCLayout.setHorizontalGroup(
            panelGrupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1241, Short.MAX_VALUE)
        );
        panelGrupoCLayout.setVerticalGroup(
            panelGrupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tabbedPane.addTab("C", panelGrupoC);

        javax.swing.GroupLayout panelGrupoDLayout = new javax.swing.GroupLayout(panelGrupoD);
        panelGrupoD.setLayout(panelGrupoDLayout);
        panelGrupoDLayout.setHorizontalGroup(
            panelGrupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1241, Short.MAX_VALUE)
        );
        panelGrupoDLayout.setVerticalGroup(
            panelGrupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tabbedPane.addTab("D", panelGrupoD);

        javax.swing.GroupLayout panelGrupoELayout = new javax.swing.GroupLayout(panelGrupoE);
        panelGrupoE.setLayout(panelGrupoELayout);
        panelGrupoELayout.setHorizontalGroup(
            panelGrupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1241, Short.MAX_VALUE)
        );
        panelGrupoELayout.setVerticalGroup(
            panelGrupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tabbedPane.addTab("E", panelGrupoE);

        javax.swing.GroupLayout panelGrupoFLayout = new javax.swing.GroupLayout(panelGrupoF);
        panelGrupoF.setLayout(panelGrupoFLayout);
        panelGrupoFLayout.setHorizontalGroup(
            panelGrupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1241, Short.MAX_VALUE)
        );
        panelGrupoFLayout.setVerticalGroup(
            panelGrupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tabbedPane.addTab("F", panelGrupoF);

        javax.swing.GroupLayout panelGrupoGLayout = new javax.swing.GroupLayout(panelGrupoG);
        panelGrupoG.setLayout(panelGrupoGLayout);
        panelGrupoGLayout.setHorizontalGroup(
            panelGrupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1241, Short.MAX_VALUE)
        );
        panelGrupoGLayout.setVerticalGroup(
            panelGrupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tabbedPane.addTab("G", panelGrupoG);

        javax.swing.GroupLayout panelGrupoHLayout = new javax.swing.GroupLayout(panelGrupoH);
        panelGrupoH.setLayout(panelGrupoHLayout);
        panelGrupoHLayout.setHorizontalGroup(
            panelGrupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1241, Short.MAX_VALUE)
        );
        panelGrupoHLayout.setVerticalGroup(
            panelGrupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tabbedPane.addTab("H", panelGrupoH);

        javax.swing.GroupLayout panelOctavosLayout = new javax.swing.GroupLayout(panelOctavos);
        panelOctavos.setLayout(panelOctavosLayout);
        panelOctavosLayout.setHorizontalGroup(
            panelOctavosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1241, Short.MAX_VALUE)
        );
        panelOctavosLayout.setVerticalGroup(
            panelOctavosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tabbedPane.addTab("OCTAVOS", panelOctavos);

        javax.swing.GroupLayout panelCuartosLayout = new javax.swing.GroupLayout(panelCuartos);
        panelCuartos.setLayout(panelCuartosLayout);
        panelCuartosLayout.setHorizontalGroup(
            panelCuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1241, Short.MAX_VALUE)
        );
        panelCuartosLayout.setVerticalGroup(
            panelCuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tabbedPane.addTab("CUARTOS", panelCuartos);

        javax.swing.GroupLayout panelSemifinalesLayout = new javax.swing.GroupLayout(panelSemifinales);
        panelSemifinales.setLayout(panelSemifinalesLayout);
        panelSemifinalesLayout.setHorizontalGroup(
            panelSemifinalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1241, Short.MAX_VALUE)
        );
        panelSemifinalesLayout.setVerticalGroup(
            panelSemifinalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tabbedPane.addTab("SEMIFINALES", panelSemifinales);

        javax.swing.GroupLayout panelTercerPuestoLayout = new javax.swing.GroupLayout(panelTercerPuesto);
        panelTercerPuesto.setLayout(panelTercerPuestoLayout);
        panelTercerPuestoLayout.setHorizontalGroup(
            panelTercerPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1241, Short.MAX_VALUE)
        );
        panelTercerPuestoLayout.setVerticalGroup(
            panelTercerPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tabbedPane.addTab("3er PUESTO", panelTercerPuesto);

        javax.swing.GroupLayout panelFinalLayout = new javax.swing.GroupLayout(panelFinal);
        panelFinal.setLayout(panelFinalLayout);
        panelFinalLayout.setHorizontalGroup(
            panelFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1241, Short.MAX_VALUE)
        );
        panelFinalLayout.setVerticalGroup(
            panelFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tabbedPane.addTab("FINAL", panelFinal);

        panelGrupoA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/grupoA.png"))); // NOI18N
        labelLogo.setText("LOGO");
        panelGrupoA.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 113, 250, 210));

        lblFechaPartido0.setText("FechaPartido");
        panelGrupoA.add(lblFechaPartido0, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        lblEquipoLocal0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocal0.setText("Equipo Local");
        panelGrupoA.add(lblEquipoLocal0, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 111, -1, -1));

        lblNombreEstadio6.setText("NombreEstadio");
        panelGrupoA.add(lblNombreEstadio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        lblEquipoVisitante6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitante6.setText("Equipo Visitante");
        panelGrupoA.add(lblEquipoVisitante6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        lblFechaPartido1.setText("FechaPartido");
        panelGrupoA.add(lblFechaPartido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        lblFechaPartido2.setText("FechaPartido");
        panelGrupoA.add(lblFechaPartido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        lblFechaPartido3.setText("FechaPartido");
        panelGrupoA.add(lblFechaPartido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        lblFechaPartido4.setText("FechaPartido");
        panelGrupoA.add(lblFechaPartido4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        lblFechaPartido5.setText("FechaPartido");
        panelGrupoA.add(lblFechaPartido5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        lblEquipoLocal1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocal1.setText("Equipo Local");
        panelGrupoA.add(lblEquipoLocal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        lblEquipoLocal2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocal2.setText("Equipo Local");
        panelGrupoA.add(lblEquipoLocal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        lblEquipoLocal3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocal3.setText("Equipo Local");
        panelGrupoA.add(lblEquipoLocal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        lblEquipoLocal4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocal4.setText("Equipo Local");
        panelGrupoA.add(lblEquipoLocal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        lblEquipoLocal5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocal5.setText("Equipo Local");
        panelGrupoA.add(lblEquipoLocal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));
        panelGrupoA.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 371, 10));
        panelGrupoA.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 139, 371, 10));
        panelGrupoA.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 371, 10));
        panelGrupoA.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 371, 10));
        panelGrupoA.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 371, 10));
        panelGrupoA.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 371, 10));

        lblNombreEstadio1.setText("NombreEstadio");
        panelGrupoA.add(lblNombreEstadio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        lblNombreEstadio2.setText("NombreEstadio");
        panelGrupoA.add(lblNombreEstadio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        lblNombreEstadio3.setText("NombreEstadio");
        panelGrupoA.add(lblNombreEstadio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        lblNombreEstadio4.setText("NombreEstadio");
        panelGrupoA.add(lblNombreEstadio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        lblNombreEstadio5.setText("NombreEstadio");
        panelGrupoA.add(lblNombreEstadio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        lblEquipoVisitante1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitante1.setText("Equipo Visitante");
        panelGrupoA.add(lblEquipoVisitante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 111, -1, -1));

        lblEquipoVisitante2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitante2.setText("Equipo Visitante");
        panelGrupoA.add(lblEquipoVisitante2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        lblEquipoVisitante3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitante3.setText("Equipo Visitante");
        panelGrupoA.add(lblEquipoVisitante3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        lblEquipoVisitante4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitante4.setText("Equipo Visitante");
        panelGrupoA.add(lblEquipoVisitante4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, -1));

        lblEquipoVisitante5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitante5.setText("Equipo Visitante");
        panelGrupoA.add(lblEquipoVisitante5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        jTextField1.setText("jTextField1");
        panelGrupoA.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        jTextField2.setText("jTextField2");
        panelGrupoA.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        jTextField3.setText("jTextField1");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        panelGrupoA.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jTextField4.setText("jTextField1");
        panelGrupoA.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        jTextField5.setText("jTextField1");
        panelGrupoA.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jTextField6.setText("jTextField1");
        panelGrupoA.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jTextField7.setText("jTextField1");
        panelGrupoA.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jTextField8.setText("jTextField1");
        panelGrupoA.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jTextField9.setText("jTextField1");
        panelGrupoA.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        jTextField10.setText("jTextField1");
        panelGrupoA.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        jTextField11.setText("jTextField1");
        panelGrupoA.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        jTextField12.setText("jTextField1");
        panelGrupoA.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        tabbedPane.addTab("A", panelGrupoA);

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );
        panelBodyLayout.setVerticalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPane.getAccessibleContext().setAccessibleName("tabB");

        labelTitulo.setBackground(new java.awt.Color(46, 30, 34));
        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(154, 16, 50));
        labelTitulo.setText("QATAR 2022 - FIXTURE");

        labelSubtitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSubtitulo.setForeground(new java.awt.Color(154, 16, 50));
        labelSubtitulo.setText("del 21 de noviembre al 18 de diciembre de 2022");

        labelLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/qatar_2022_logo.png"))); // NOI18N
        labelLogo1.setText("LOGO");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelSubtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTitulo))
                .addContainerGap(664, Short.MAX_VALUE))
            .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelHeaderLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(labelLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1067, Short.MAX_VALUE)))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSubtitulo)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelHeaderLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(10, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 1251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    private GrupoRepository grupoRepository;
    private PartidoRepository partidoRepository ;  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelLogo1;
    private javax.swing.JLabel labelLogo2;
    private javax.swing.JLabel labelSubtitulo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel lblEquipoLocal0;
    private javax.swing.JLabel lblEquipoLocal1;
    private javax.swing.JLabel lblEquipoLocal2;
    private javax.swing.JLabel lblEquipoLocal3;
    private javax.swing.JLabel lblEquipoLocal4;
    private javax.swing.JLabel lblEquipoLocal5;
    private javax.swing.JLabel lblEquipoLocalB;
    private javax.swing.JLabel lblEquipoLocalB1;
    private javax.swing.JLabel lblEquipoVisitante1;
    private javax.swing.JLabel lblEquipoVisitante2;
    private javax.swing.JLabel lblEquipoVisitante3;
    private javax.swing.JLabel lblEquipoVisitante4;
    private javax.swing.JLabel lblEquipoVisitante5;
    private javax.swing.JLabel lblEquipoVisitante6;
    private javax.swing.JLabel lblEquipoVisitantelB;
    private javax.swing.JLabel lblEquipoVisitantelB1;
    private javax.swing.JLabel lblFechaPartido0;
    private javax.swing.JLabel lblFechaPartido1;
    private javax.swing.JLabel lblFechaPartido2;
    private javax.swing.JLabel lblFechaPartido3;
    private javax.swing.JLabel lblFechaPartido4;
    private javax.swing.JLabel lblFechaPartido5;
    private javax.swing.JLabel lblFechaPartidoB0;
    private javax.swing.JLabel lblFechaPartidoB2;
    private javax.swing.JLabel lblNombreEstadio1;
    private javax.swing.JLabel lblNombreEstadio2;
    private javax.swing.JLabel lblNombreEstadio3;
    private javax.swing.JLabel lblNombreEstadio4;
    private javax.swing.JLabel lblNombreEstadio5;
    private javax.swing.JLabel lblNombreEstadio6;
    private javax.swing.JLabel lblNombreEstadioB;
    private javax.swing.JLabel lblNombreEstadioB1;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelCuartos;
    private javax.swing.JPanel panelFinal;
    private javax.swing.JPanel panelGrupoA;
    private javax.swing.JPanel panelGrupoB;
    private javax.swing.JPanel panelGrupoC;
    private javax.swing.JPanel panelGrupoD;
    private javax.swing.JPanel panelGrupoE;
    private javax.swing.JPanel panelGrupoF;
    private javax.swing.JPanel panelGrupoG;
    private javax.swing.JPanel panelGrupoH;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelOctavos;
    private javax.swing.JPanel panelSemifinales;
    private javax.swing.JPanel panelTercerPuesto;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables

    private void loadPartidosGrupoA() {
    
       javax.swing.JLabel [] fechasA = {
           lblFechaPartido0,
           lblFechaPartido1,
           lblFechaPartido2,
           lblFechaPartido3,
           lblFechaPartido4,
           lblFechaPartido5
       };
       
       javax.swing.JLabel [] equipoLocales = {
           lblEquipoLocal0,
           lblEquipoLocal1,
           lblEquipoLocal2,
           lblEquipoLocal3,
           lblEquipoLocal4,
           lblEquipoLocal5,
       };
       
       javax.swing.JLabel [] estadiosA = {
           lblNombreEstadio1,
           lblNombreEstadio2,
           lblNombreEstadio3,
           lblNombreEstadio4,
           lblNombreEstadio5,
           lblNombreEstadio6,
       };
       
       javax.swing.JLabel [] equiposVisitantes = {
           lblEquipoVisitante1,
           lblEquipoVisitante2,
           lblEquipoVisitante3,
           lblEquipoVisitante4,
           lblEquipoVisitante5,
           lblEquipoVisitante6,
       };
       
               
       Grupo grupoA = grupoRepository.get('a');
    
       ArrayList<Partido> partidos = partidoRepository.findBy(Fase.DE_GRUPOS, grupoA);
    
      Collections.sort(partidos, new Comparator<Partido>(){
           public int compare(Partido p1, Partido p2) {
               return p1.getFechaYHora().isBefore(p2.getFechaYHora()) ? -1 : 1;
          }
      });
      
      List<Partido> partidosOrdenados =  partidos.stream()
        .sorted(Comparator.comparing(Partido::getFechaYHora))
        .collect(Collectors.toList());
      
       int i= 0;
       for(Partido p : partidos ){
           
           fechasA[i].setText(p.getFechaYHora().toString());
           
           equipoLocales[i].setText(p.getEquipo1().getNombre());
           
           estadiosA[i].setText(p.getEstadio().getNombre());
           
           equiposVisitantes[i++].setText(p.getEquipo2().getNombre());
       }
        
    }

    private void loadPartidosGrupoB() {

        javax.swing.JLabel [] fechasB = {
           lblFechaPartidoB0,
           lblFechaPartidoB2
       };
       
       Grupo grupoB = grupoRepository.get('b');
    
       ArrayList<Partido> partidosGrupoB = partidoRepository.findBy(Fase.DE_GRUPOS, grupoB);
    
       int i= 0;
       for(Partido p : partidosGrupoB ){
           fechasB[i++].setText(p.getFechaYHora().toString());
           if(i == 2){
               break;
           }
       }
    }
 
    
    private void cargarRepositorios() {
    
       GruposMigrations.up();
       PartidosMigrations.up();
       
       grupoRepository = new GrupoRepository();
       partidoRepository = new PartidoRepository();
    }
}
