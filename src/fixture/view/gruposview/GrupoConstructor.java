/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fixture.view.gruposview;

import fixture.model.Equipo;
import fixture.model.Fase;
import fixture.model.Grupo;
import fixture.model.Partido;
import fixture.repository.GrupoRepository;
import fixture.repository.PartidoRepository;
import fixture.repository.migrations.GruposMigrations;
import fixture.repository.migrations.PartidosMigrations;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Nico
 */
public class GrupoConstructor extends javax.swing.JFrame {

    /**
     * Creates new form GrupoConstructor
     */
    char letraGrupo;
    PartidoRepository partidoRepository;
    GrupoRepository grupoRepository;
    ArrayList<Integer> idDePartido = new ArrayList<Integer>();
    ArrayList<JFormattedTextField> golesEquipoLocal = new ArrayList();
    ArrayList<JFormattedTextField> golesEquipoVisit = new ArrayList();
    
    //
    public GrupoConstructor(char letra) {
        this.letraGrupo = letra;
        initComponents();
        cargarEquipos();
        inicializarGrupo(letraGrupo);
        cargarGrupo(letraGrupo);
    }

    private GrupoConstructor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private void close(){
    WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    private void cargarEquipos(){
        //PartidosMigrations.up();
        
        //GruposMigrations.up();
        partidoRepository = new PartidoRepository();
        grupoRepository = new GrupoRepository();
    };
    private void inicializarGrupo(char letraGrupo){
        Grupo grupo = grupoRepository.get(letraGrupo);
        ArrayList<Partido> partidos = partidoRepository.findBy(Fase.DE_GRUPOS, grupo);
        String titulo = "Grupo " + letraGrupo;
        jLabelTitulo.setText(titulo.toUpperCase());
        //
        List<JLabel> equiposVisit; 
        equiposVisit = new ArrayList();
        List<JLabel> equiposLocal;
        equiposLocal = new ArrayList();
        List<JLabel> estadios;
        estadios = new ArrayList();
        List<JLabel> fechas;
        fechas= new ArrayList();
        //
        equiposVisit.add(equipoVisit1);
        equiposVisit.add(equipoVisit2);
        equiposVisit.add(equipoVisit3);
        equiposVisit.add(equipoVisit4);
        equiposVisit.add(equipoVisit5);
        equiposVisit.add(equipoVisit6);
        //
        equiposLocal.add(equipoLocal1);
        equiposLocal.add(equipoLocal2);
        equiposLocal.add(equipoLocal3);
        equiposLocal.add(equipoLocal4);
        equiposLocal.add(equipoLocal5);
        equiposLocal.add(equipoLocal6);
        //
        estadios.add(estadioPartido1);
        estadios.add(estadioPartido2);
        estadios.add(estadioPartido3);
        estadios.add(estadioPartido4);
        estadios.add(estadioPartido5);
        estadios.add(estadioPartido6);
        //
        fechas.add(fechaPartido1);
        fechas.add(fechaPartido2);
        fechas.add(fechaPartido3);
        fechas.add(fechaPartido4);
        fechas.add(fechaPartido5);
        fechas.add(fechaPartido6);
        //
        golesEquipoLocal.add(golesEquipoLocal1);
        golesEquipoLocal.add(golesEquipoLocal2);
        golesEquipoLocal.add(golesEquipoLocal3);
        golesEquipoLocal.add(golesEquipoLocal4);
        golesEquipoLocal.add(golesEquipoLocal5);
        golesEquipoLocal.add(golesEquipoLocal6);
        //
        golesEquipoVisit.add(golesEquipoVisit1);
        golesEquipoVisit.add(golesEquipoVisit2);
        golesEquipoVisit.add(golesEquipoVisit3);
        golesEquipoVisit.add(golesEquipoVisit4);
        golesEquipoVisit.add(golesEquipoVisit5);
        golesEquipoVisit.add(golesEquipoVisit6);
        //
        //
        Collections.sort(partidos,new Comparator<Partido>() {
            @Override
            public int compare(Partido o1, Partido o2) {
                return o1.getFechaYHora().isBefore(o2.getFechaYHora()) ? -1 :1 ; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        
        //
        int i = 0;
        JLabel txt = new JLabel();
        for (Partido partido : partidos) {
            idDePartido.add(partido.getId());
            
            equiposVisit.get(i).setText(partido.getEquipo2().getNombre());
            equiposLocal.get(i).setText(partido.getEquipo1().getNombre());
            
            estadios.get(i).setText(partido.getEstadio().getNombre());
            
            fechas.get(i).setText(partido.getFechaYHora().toString());
            
            golesEquipoLocal.get(i).setText(String.valueOf(partido.getGolesEquipo1()));
            golesEquipoVisit.get(i).setText(String.valueOf(partido.getGolesEquipo2()));
            
            i++;
            
        }
        
        
    
    };
    
      private void cargarGrupo(char letragrupo){
        Grupo grupoA = grupoRepository.get(letragrupo);
        ArrayList<Equipo> equiposGrupo = grupoA.getEquipos();       
        String titulo = "Grupo " + letragrupo;
        grupo1.setText(titulo);
        ArrayList<JLabel> equipos = new ArrayList();
        equipos.add(equipo1);
        equipos.add(equipo2);
        equipos.add(equipo3);
        equipos.add(equipo4);
        //
        int i= 0;
        for(Equipo equipo : equiposGrupo ){
            equipos.get(i).setText(equipo.getNombre());   
            i++;
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

        jButton1 = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        logoTop = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        panelAFila1 = new javax.swing.JPanel();
        fechaPartido1 = new javax.swing.JLabel();
        equipoLocal1 = new javax.swing.JLabel();
        equipoVisit1 = new javax.swing.JLabel();
        estadioPartido1 = new javax.swing.JLabel();
        jSeparatorA1 = new javax.swing.JSeparator();
        golesEquipoLocal1 = new javax.swing.JFormattedTextField();
        golesEquipoVisit1 = new javax.swing.JFormattedTextField();
        guionA1 = new javax.swing.JLabel();
        panelAFila2 = new javax.swing.JPanel();
        fechaPartido2 = new javax.swing.JLabel();
        equipoLocal2 = new javax.swing.JLabel();
        equipoVisit2 = new javax.swing.JLabel();
        estadioPartido2 = new javax.swing.JLabel();
        jSeparatorA2 = new javax.swing.JSeparator();
        golesEquipoLocal2 = new javax.swing.JFormattedTextField();
        golesEquipoVisit2 = new javax.swing.JFormattedTextField();
        guionA2 = new javax.swing.JLabel();
        panelAFila3 = new javax.swing.JPanel();
        fechaPartido3 = new javax.swing.JLabel();
        equipoLocal3 = new javax.swing.JLabel();
        equipoVisit3 = new javax.swing.JLabel();
        estadioPartido3 = new javax.swing.JLabel();
        jSeparatorA3 = new javax.swing.JSeparator();
        golesEquipoLocal3 = new javax.swing.JFormattedTextField();
        golesEquipoVisit3 = new javax.swing.JFormattedTextField();
        guionA3 = new javax.swing.JLabel();
        panelAFila4 = new javax.swing.JPanel();
        fechaPartido4 = new javax.swing.JLabel();
        equipoLocal4 = new javax.swing.JLabel();
        equipoVisit4 = new javax.swing.JLabel();
        estadioPartido4 = new javax.swing.JLabel();
        jSeparatorA4 = new javax.swing.JSeparator();
        golesEquipoLocal4 = new javax.swing.JFormattedTextField();
        golesEquipoVisit4 = new javax.swing.JFormattedTextField();
        guionA4 = new javax.swing.JLabel();
        panelAFila5 = new javax.swing.JPanel();
        fechaPartido5 = new javax.swing.JLabel();
        equipoLocal5 = new javax.swing.JLabel();
        equipoVisit5 = new javax.swing.JLabel();
        estadioPartido5 = new javax.swing.JLabel();
        jSeparatorA5 = new javax.swing.JSeparator();
        golesEquipoLocal5 = new javax.swing.JFormattedTextField();
        golesEquipoVisit5 = new javax.swing.JFormattedTextField();
        guionA5 = new javax.swing.JLabel();
        panelAFila6 = new javax.swing.JPanel();
        fechaPartido6 = new javax.swing.JLabel();
        equipoLocal6 = new javax.swing.JLabel();
        equipoVisit6 = new javax.swing.JLabel();
        estadioPartido6 = new javax.swing.JLabel();
        jSeparatorA6 = new javax.swing.JSeparator();
        golesEquipoLocal6 = new javax.swing.JFormattedTextField();
        golesEquipoVisit6 = new javax.swing.JFormattedTextField();
        guionA6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        equipo1 = new javax.swing.JLabel();
        equipo2 = new javax.swing.JLabel();
        equipo3 = new javax.swing.JLabel();
        equipo4 = new javax.swing.JLabel();
        grupo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 16, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitulo.setText("Grupo A");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        logoTop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/qatar_2022_logo.png"))); // NOI18N
        logoTop.setText("jLabel1");
        getContentPane().add(logoTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 151, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fechaPartido1.setText("FechaPartido");

        equipoLocal1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        equipoLocal1.setText("Equipo Local");

        equipoVisit1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        equipoVisit1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        equipoVisit1.setText("Equipo Visitante");
        equipoVisit1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        estadioPartido1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        estadioPartido1.setText("NombreEstadio");

        golesEquipoLocal1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        golesEquipoLocal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                golesEquipoLocal1ActionPerformed(evt);
            }
        });

        golesEquipoVisit1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionA1.setText("-");

        javax.swing.GroupLayout panelAFila1Layout = new javax.swing.GroupLayout(panelAFila1);
        panelAFila1.setLayout(panelAFila1Layout);
        panelAFila1Layout.setHorizontalGroup(
            panelAFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAFila1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorA1)
                    .addGroup(panelAFila1Layout.createSequentialGroup()
                        .addComponent(fechaPartido1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(estadioPartido1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAFila1Layout.createSequentialGroup()
                        .addComponent(equipoLocal1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesEquipoLocal1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionA1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesEquipoVisit1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(equipoVisit1)))
                .addContainerGap())
        );
        panelAFila1Layout.setVerticalGroup(
            panelAFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAFila1Layout.createSequentialGroup()
                .addGroup(panelAFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAFila1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fechaPartido1))
                    .addGroup(panelAFila1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(estadioPartido1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(equipoVisit1)
                            .addComponent(equipoLocal1)
                            .addComponent(golesEquipoLocal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesEquipoVisit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionA1))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(panelAFila1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 530, -1));

        panelAFila2.setPreferredSize(new java.awt.Dimension(432, 83));

        fechaPartido2.setText("FechaPartido");

        equipoLocal2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        equipoLocal2.setText("Equipo Local");

        equipoVisit2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        equipoVisit2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        equipoVisit2.setText("Equipo Visitante");
        equipoVisit2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        estadioPartido2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        estadioPartido2.setText("NombreEstadio");

        golesEquipoLocal2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesEquipoVisit2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionA2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionA2.setText("-");

        javax.swing.GroupLayout panelAFila2Layout = new javax.swing.GroupLayout(panelAFila2);
        panelAFila2.setLayout(panelAFila2Layout);
        panelAFila2Layout.setHorizontalGroup(
            panelAFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAFila2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorA2)
                    .addGroup(panelAFila2Layout.createSequentialGroup()
                        .addComponent(fechaPartido2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(estadioPartido2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAFila2Layout.createSequentialGroup()
                        .addComponent(equipoLocal2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesEquipoLocal2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionA2, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesEquipoVisit2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(equipoVisit2)))
                .addContainerGap())
        );
        panelAFila2Layout.setVerticalGroup(
            panelAFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAFila2Layout.createSequentialGroup()
                .addGroup(panelAFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAFila2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fechaPartido2))
                    .addGroup(panelAFila2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(estadioPartido2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(equipoVisit2)
                            .addComponent(equipoLocal2)
                            .addComponent(golesEquipoLocal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesEquipoVisit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionA2))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(panelAFila2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 95, 530, -1));

        fechaPartido3.setText("FechaPartido");

        equipoLocal3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        equipoLocal3.setText("Equipo Local");

        equipoVisit3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        equipoVisit3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        equipoVisit3.setText("Equipo Visitante");
        equipoVisit3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        estadioPartido3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        estadioPartido3.setText("NombreEstadio");

        golesEquipoLocal3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesEquipoVisit3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionA3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionA3.setText("-");

        javax.swing.GroupLayout panelAFila3Layout = new javax.swing.GroupLayout(panelAFila3);
        panelAFila3.setLayout(panelAFila3Layout);
        panelAFila3Layout.setHorizontalGroup(
            panelAFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAFila3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorA3)
                    .addGroup(panelAFila3Layout.createSequentialGroup()
                        .addComponent(fechaPartido3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(estadioPartido3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAFila3Layout.createSequentialGroup()
                        .addComponent(equipoLocal3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesEquipoLocal3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionA3, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesEquipoVisit3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(equipoVisit3)))
                .addContainerGap())
        );
        panelAFila3Layout.setVerticalGroup(
            panelAFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAFila3Layout.createSequentialGroup()
                .addGroup(panelAFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAFila3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fechaPartido3))
                    .addGroup(panelAFila3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(estadioPartido3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(equipoVisit3)
                            .addComponent(equipoLocal3)
                            .addComponent(golesEquipoLocal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesEquipoVisit3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionA3))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(panelAFila3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 178, 530, -1));

        fechaPartido4.setText("FechaPartido");

        equipoLocal4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        equipoLocal4.setText("Equipo Local");

        equipoVisit4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        equipoVisit4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        equipoVisit4.setText("Equipo Visitante");
        equipoVisit4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        estadioPartido4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        estadioPartido4.setText("NombreEstadio");

        golesEquipoLocal4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesEquipoVisit4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionA4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionA4.setText("-");

        javax.swing.GroupLayout panelAFila4Layout = new javax.swing.GroupLayout(panelAFila4);
        panelAFila4.setLayout(panelAFila4Layout);
        panelAFila4Layout.setHorizontalGroup(
            panelAFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAFila4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorA4)
                    .addGroup(panelAFila4Layout.createSequentialGroup()
                        .addComponent(fechaPartido4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(estadioPartido4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAFila4Layout.createSequentialGroup()
                        .addComponent(equipoLocal4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesEquipoLocal4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionA4, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesEquipoVisit4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(equipoVisit4)))
                .addContainerGap())
        );
        panelAFila4Layout.setVerticalGroup(
            panelAFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAFila4Layout.createSequentialGroup()
                .addGroup(panelAFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAFila4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fechaPartido4))
                    .addGroup(panelAFila4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(estadioPartido4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(equipoVisit4)
                            .addComponent(equipoLocal4)
                            .addComponent(golesEquipoLocal4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesEquipoVisit4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionA4))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(panelAFila4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 267, 530, -1));

        fechaPartido5.setText("FechaPartido");

        equipoLocal5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        equipoLocal5.setText("Equipo Local");

        equipoVisit5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        equipoVisit5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        equipoVisit5.setText("Equipo Visitante");
        equipoVisit5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        estadioPartido5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        estadioPartido5.setText("NombreEstadio");

        golesEquipoLocal5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesEquipoVisit5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionA5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionA5.setText("-");

        javax.swing.GroupLayout panelAFila5Layout = new javax.swing.GroupLayout(panelAFila5);
        panelAFila5.setLayout(panelAFila5Layout);
        panelAFila5Layout.setHorizontalGroup(
            panelAFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAFila5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorA5)
                    .addGroup(panelAFila5Layout.createSequentialGroup()
                        .addComponent(fechaPartido5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(estadioPartido5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAFila5Layout.createSequentialGroup()
                        .addComponent(equipoLocal5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesEquipoLocal5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionA5, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesEquipoVisit5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(equipoVisit5)))
                .addContainerGap())
        );
        panelAFila5Layout.setVerticalGroup(
            panelAFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAFila5Layout.createSequentialGroup()
                .addGroup(panelAFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAFila5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fechaPartido5))
                    .addGroup(panelAFila5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(estadioPartido5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(equipoVisit5)
                            .addComponent(equipoLocal5)
                            .addComponent(golesEquipoLocal5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesEquipoVisit5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionA5))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(panelAFila5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 356, 530, -1));

        fechaPartido6.setText("FechaPartido");

        equipoLocal6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        equipoLocal6.setText("Equipo Local");

        equipoVisit6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        equipoVisit6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        equipoVisit6.setText("Equipo Visitante");
        equipoVisit6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        estadioPartido6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        estadioPartido6.setText("NombreEstadio");

        golesEquipoLocal6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesEquipoVisit6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionA6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionA6.setText("-");

        javax.swing.GroupLayout panelAFila6Layout = new javax.swing.GroupLayout(panelAFila6);
        panelAFila6.setLayout(panelAFila6Layout);
        panelAFila6Layout.setHorizontalGroup(
            panelAFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAFila6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorA6)
                    .addGroup(panelAFila6Layout.createSequentialGroup()
                        .addComponent(fechaPartido6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(estadioPartido6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAFila6Layout.createSequentialGroup()
                        .addComponent(equipoLocal6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesEquipoLocal6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionA6, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesEquipoVisit6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(equipoVisit6)))
                .addContainerGap())
        );
        panelAFila6Layout.setVerticalGroup(
            panelAFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAFila6Layout.createSequentialGroup()
                .addGroup(panelAFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAFila6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fechaPartido6))
                    .addGroup(panelAFila6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(estadioPartido6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(equipoVisit6)
                            .addComponent(equipoLocal6)
                            .addComponent(golesEquipoLocal6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesEquipoVisit6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionA6))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorA6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(panelAFila6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 445, 530, -1));

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 560, 300));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "G", "E", "P", "G+", "G-", "D/F", "P"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(20);
        jScrollPane2.setViewportView(jTable1);

        equipo1.setText("jLabel1");

        equipo2.setText("jLabel2");

        equipo3.setText("jLabel3");

        equipo4.setText("jLabel4");

        grupo1.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equipo4)
                            .addComponent(equipo1)
                            .addComponent(equipo2)
                            .addComponent(equipo3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(grupo1)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grupo1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(equipo1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(equipo2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(equipo3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(equipo4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 510, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        VentanaFaseGrupos ventanaFaseGrupos = new VentanaFaseGrupos();
        ventanaFaseGrupos.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void golesEquipoLocal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_golesEquipoLocal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_golesEquipoLocal1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            Grupo grupo = grupoRepository.get(letraGrupo);
            int i = 0;
            for(Integer id : idDePartido ){
             for(Partido p : partidoRepository.findBy(Fase.DE_GRUPOS, grupo)){
                 if(p.getId() == id){
                     p.setGolesEquipo1(Integer.parseInt(golesEquipoLocal.get(i).getText()));
                     p.setGolesEquipo2(Integer.parseInt(golesEquipoVisit.get(i).getText()));
                 }
             }
             i++;
         }
            
            try {
                partidoRepository.guardarGolesPartido();
                JOptionPane.showMessageDialog(this, "Se ha guardado con exito!", "Fixture Qatar 2022", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
                System.err.println(e.getMessage());
                JOptionPane.showMessageDialog(this, "Se a producido un error", "Fixture Qatar 2022", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(GrupoConstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GrupoConstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GrupoConstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GrupoConstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GrupoConstructor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel equipo1;
    private javax.swing.JLabel equipo2;
    private javax.swing.JLabel equipo3;
    private javax.swing.JLabel equipo4;
    private javax.swing.JLabel equipoLocal1;
    private javax.swing.JLabel equipoLocal2;
    private javax.swing.JLabel equipoLocal3;
    private javax.swing.JLabel equipoLocal4;
    private javax.swing.JLabel equipoLocal5;
    private javax.swing.JLabel equipoLocal6;
    private javax.swing.JLabel equipoVisit1;
    private javax.swing.JLabel equipoVisit2;
    private javax.swing.JLabel equipoVisit3;
    private javax.swing.JLabel equipoVisit4;
    private javax.swing.JLabel equipoVisit5;
    private javax.swing.JLabel equipoVisit6;
    private javax.swing.JLabel estadioPartido1;
    private javax.swing.JLabel estadioPartido2;
    private javax.swing.JLabel estadioPartido3;
    private javax.swing.JLabel estadioPartido4;
    private javax.swing.JLabel estadioPartido5;
    private javax.swing.JLabel estadioPartido6;
    private javax.swing.JLabel fechaPartido1;
    private javax.swing.JLabel fechaPartido2;
    private javax.swing.JLabel fechaPartido3;
    private javax.swing.JLabel fechaPartido4;
    private javax.swing.JLabel fechaPartido5;
    private javax.swing.JLabel fechaPartido6;
    private javax.swing.JFormattedTextField golesEquipoLocal1;
    private javax.swing.JFormattedTextField golesEquipoLocal2;
    private javax.swing.JFormattedTextField golesEquipoLocal3;
    private javax.swing.JFormattedTextField golesEquipoLocal4;
    private javax.swing.JFormattedTextField golesEquipoLocal5;
    private javax.swing.JFormattedTextField golesEquipoLocal6;
    private javax.swing.JFormattedTextField golesEquipoVisit1;
    private javax.swing.JFormattedTextField golesEquipoVisit2;
    private javax.swing.JFormattedTextField golesEquipoVisit3;
    private javax.swing.JFormattedTextField golesEquipoVisit4;
    private javax.swing.JFormattedTextField golesEquipoVisit5;
    private javax.swing.JFormattedTextField golesEquipoVisit6;
    private javax.swing.JLabel grupo1;
    private javax.swing.JLabel guionA1;
    private javax.swing.JLabel guionA2;
    private javax.swing.JLabel guionA3;
    private javax.swing.JLabel guionA4;
    private javax.swing.JLabel guionA5;
    private javax.swing.JLabel guionA6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparatorA1;
    private javax.swing.JSeparator jSeparatorA2;
    private javax.swing.JSeparator jSeparatorA3;
    private javax.swing.JSeparator jSeparatorA4;
    private javax.swing.JSeparator jSeparatorA5;
    private javax.swing.JSeparator jSeparatorA6;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logoTop;
    private javax.swing.JPanel panelAFila1;
    private javax.swing.JPanel panelAFila2;
    private javax.swing.JPanel panelAFila3;
    private javax.swing.JPanel panelAFila4;
    private javax.swing.JPanel panelAFila5;
    private javax.swing.JPanel panelAFila6;
    // End of variables declaration//GEN-END:variables
}
