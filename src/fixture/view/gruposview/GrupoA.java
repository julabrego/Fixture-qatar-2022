/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fixture.view.gruposview;


import fixture.model.Fase;
import fixture.model.Grupo;
import fixture.model.Partido;
import fixture.repository.GrupoRepository;
import fixture.repository.PartidoRepository;
import fixture.repository.migrations.GruposMigrations;
import fixture.repository.migrations.PartidosMigrations;
import fixture.view.VentanaFaseGrupos;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author Nico
 */
public class GrupoA extends javax.swing.JFrame {

    /**
     * Creates new form GrupoA
     */
    private PartidoRepository partidosRepository;
    private GrupoRepository gruposRepository;
    
    public GrupoA() {
        initComponents();
        cargarEquipos();
        cargarEquipoA();
    }
    private void close(){
    WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    public void cargarEquipos(){
       PartidosMigrations.up();
       GruposMigrations.up();
       partidosRepository = new PartidoRepository();
       gruposRepository = new GrupoRepository();
    }
    public void cargarEquipoA(){
        List<JLabel> equiposVisit; 
        equiposVisit = new ArrayList();
        List<JLabel> equiposLocal;
        equiposLocal = new ArrayList();
        List<JLabel> estadios;
        estadios = new ArrayList();
        List<JLabel> fechas;
        fechas= new ArrayList();
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
        
        Grupo grupoA = gruposRepository.get('a');
        ArrayList<Partido> partidos = partidosRepository.findBy(Fase.DE_GRUPOS, grupoA);
        
        
        int i = 0;
        JLabel txt = new JLabel();
        for (Partido partido : partidos) {
            equiposVisit.get(i).setText(partido.getEquipo2().getNombre());
            equiposLocal.get(i).setText(partido.getEquipo1().getNombre());
            estadios.get(i).setText(partido.getEstadio().getNombre());
            fechas.get(i++).setText(partido.getFechaYHora().toString());
            
        }
        
        
    };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoTop = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        equipoLocal1 = new javax.swing.JLabel();
        equipoLocal2 = new javax.swing.JLabel();
        equipoLocal3 = new javax.swing.JLabel();
        equipoLocal4 = new javax.swing.JLabel();
        equipoLocal5 = new javax.swing.JLabel();
        equipoLocal6 = new javax.swing.JLabel();
        fechaPartido1 = new javax.swing.JLabel();
        fechaPartido2 = new javax.swing.JLabel();
        fechaPartido3 = new javax.swing.JLabel();
        fechaPartido4 = new javax.swing.JLabel();
        fechaPartido5 = new javax.swing.JLabel();
        fechaPartido6 = new javax.swing.JLabel();
        equipoVisit1 = new javax.swing.JLabel();
        equipoVisit2 = new javax.swing.JLabel();
        equipoVisit3 = new javax.swing.JLabel();
        equipoVisit4 = new javax.swing.JLabel();
        equipoVisit5 = new javax.swing.JLabel();
        equipoVisit6 = new javax.swing.JLabel();
        estadioPartido1 = new javax.swing.JLabel();
        estadioPartido2 = new javax.swing.JLabel();
        estadioPartido3 = new javax.swing.JLabel();
        estadioPartido4 = new javax.swing.JLabel();
        estadioPartido5 = new javax.swing.JLabel();
        estadioPartido6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(430, 670));
        setResizable(false);
        setSize(new java.awt.Dimension(430, 670));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoTop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/qatar_2022_logo.png"))); // NOI18N
        logoTop.setText("jLabel1");
        getContentPane().add(logoTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 6, 151, -1));

        jPanel1.setBackground(new java.awt.Color(225, 250, 250));

        equipoLocal1.setBackground(new java.awt.Color(0, 0, 0));
        equipoLocal1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        equipoLocal1.setForeground(new java.awt.Color(0, 0, 0));
        equipoLocal1.setText("jLabel2");

        equipoLocal2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        equipoLocal2.setForeground(new java.awt.Color(0, 0, 0));
        equipoLocal2.setText("jLabel3");

        equipoLocal3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        equipoLocal3.setForeground(new java.awt.Color(0, 0, 0));
        equipoLocal3.setText("jLabel4");

        equipoLocal4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        equipoLocal4.setForeground(new java.awt.Color(0, 0, 0));
        equipoLocal4.setText("jLabel5");

        equipoLocal5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        equipoLocal5.setForeground(new java.awt.Color(0, 0, 0));
        equipoLocal5.setText("jLabel6");

        equipoLocal6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        equipoLocal6.setForeground(new java.awt.Color(0, 0, 0));
        equipoLocal6.setText("jLabel7");

        fechaPartido1.setFont(new java.awt.Font("Corbel Light", 0, 12)); // NOI18N
        fechaPartido1.setText("jLabel8");

        fechaPartido2.setFont(new java.awt.Font("Corbel Light", 0, 12)); // NOI18N
        fechaPartido2.setText("jLabel9");

        fechaPartido3.setFont(new java.awt.Font("Corbel Light", 0, 12)); // NOI18N
        fechaPartido3.setText("jLabel10");

        fechaPartido4.setFont(new java.awt.Font("Corbel Light", 0, 12)); // NOI18N
        fechaPartido4.setText("jLabel11");

        fechaPartido5.setFont(new java.awt.Font("Corbel Light", 0, 12)); // NOI18N
        fechaPartido5.setText("jLabel12");

        fechaPartido6.setFont(new java.awt.Font("Corbel Light", 0, 12)); // NOI18N
        fechaPartido6.setText("jLabel13");

        equipoVisit1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        equipoVisit1.setForeground(new java.awt.Color(0, 0, 0));
        equipoVisit1.setText("jLabel14");

        equipoVisit2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        equipoVisit2.setForeground(new java.awt.Color(0, 0, 0));
        equipoVisit2.setText("jLabel15");

        equipoVisit3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        equipoVisit3.setForeground(new java.awt.Color(0, 0, 0));
        equipoVisit3.setText("jLabel16");

        equipoVisit4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        equipoVisit4.setForeground(new java.awt.Color(0, 0, 0));
        equipoVisit4.setText("jLabel17");

        equipoVisit5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        equipoVisit5.setForeground(new java.awt.Color(0, 0, 0));
        equipoVisit5.setText("jLabel18");

        equipoVisit6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        equipoVisit6.setForeground(new java.awt.Color(0, 0, 0));
        equipoVisit6.setText("jLabel19");

        estadioPartido1.setFont(new java.awt.Font("Corbel Light", 0, 12)); // NOI18N
        estadioPartido1.setText("jLabel20");

        estadioPartido2.setFont(new java.awt.Font("Corbel Light", 0, 12)); // NOI18N
        estadioPartido2.setText("jLabel21");

        estadioPartido3.setFont(new java.awt.Font("Corbel Light", 0, 12)); // NOI18N
        estadioPartido3.setText("jLabel22");

        estadioPartido4.setFont(new java.awt.Font("Corbel Light", 0, 12)); // NOI18N
        estadioPartido4.setText("jLabel23");

        estadioPartido5.setFont(new java.awt.Font("Corbel Light", 0, 12)); // NOI18N
        estadioPartido5.setText("jLabel24");

        estadioPartido6.setFont(new java.awt.Font("Corbel Light", 0, 12)); // NOI18N
        estadioPartido6.setText("jLabel25");

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(equipoLocal1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(equipoVisit1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(equipoLocal2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(equipoVisit2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(equipoLocal3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(equipoVisit3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(equipoLocal5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(equipoVisit5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(equipoLocal4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(equipoVisit4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(equipoLocal6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(equipoVisit6)))
                        .addGap(74, 74, 74))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(92, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fechaPartido6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(estadioPartido6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fechaPartido5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(estadioPartido5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fechaPartido4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(estadioPartido4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fechaPartido3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(estadioPartido3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fechaPartido2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(estadioPartido2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fechaPartido1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(estadioPartido1)))
                        .addGap(33, 33, 33))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadioPartido1)
                    .addComponent(fechaPartido1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipoLocal1)
                    .addComponent(equipoVisit1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaPartido2)
                    .addComponent(estadioPartido2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipoLocal2)
                    .addComponent(equipoVisit2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaPartido3)
                    .addComponent(estadioPartido3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipoLocal3)
                    .addComponent(equipoVisit3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaPartido4)
                    .addComponent(estadioPartido4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipoVisit4)
                    .addComponent(equipoLocal4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadioPartido5)
                    .addComponent(fechaPartido5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipoLocal5)
                    .addComponent(equipoVisit5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaPartido6)
                    .addComponent(estadioPartido6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipoLocal6)
                    .addComponent(equipoVisit6))
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 390));

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Grupo A");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 191, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        VentanaFaseGrupos ventanaFaseGrupos = new VentanaFaseGrupos();
        ventanaFaseGrupos.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GrupoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GrupoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GrupoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GrupoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GrupoA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel logoTop;
    // End of variables declaration//GEN-END:variables
}
