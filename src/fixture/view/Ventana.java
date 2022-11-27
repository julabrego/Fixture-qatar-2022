/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fixture.view;

import fixture.model.Equipo;
import fixture.exceptions.GolesNegativosFixtureException;
import fixture.model.Fase;
import fixture.model.Grupo;
import fixture.model.Partido;
import fixture.model.types.IdsPartidosConResultados;
import fixture.repository.EquipoRepository;
import fixture.repository.GrupoRepository;
import fixture.repository.PartidoRepository;
import java.awt.HeadlessException;
import fixture.service.FixtureService;
import java.awt.Image;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author abreg
 */
public class Ventana extends javax.swing.JFrame {

    private GrupoRepository grupoRepository;
    private PartidoRepository partidoRepository;
    private EquipoRepository equipoRepository;

    private ImageIcon logoImage;

    // Preparo arreglos Para leer los campos de grupo A
    private ArrayList<Integer> idsPartidosGrupoA = new ArrayList<Integer>();
    private JFormattedTextField[] golesLocalGrupoA = new JFormattedTextField[6];
    private JFormattedTextField[] golesVisitantesGrupoA = new JFormattedTextField[6];

    // Preparo arreglos para leer los campos de grupo B
    private ArrayList<Integer> idsPartidosGrupoB = new ArrayList<Integer>();
    private JFormattedTextField[] golesLocalGrupoB = new JFormattedTextField[6];
    private JFormattedTextField[] golesVisitantesGrupoB = new JFormattedTextField[6];

    // Preparo arreglos para leer los campos de grupo C
    private ArrayList<Integer> idsPartidosGrupoC = new ArrayList<Integer>();
    private JFormattedTextField[] golesLocalGrupoC = new JFormattedTextField[6];
    private JFormattedTextField[] golesVisitantesGrupoC = new JFormattedTextField[6];

    // Preparo arreglos para leer los campos de grupo D
    private ArrayList<Integer> idsPartidosGrupoD = new ArrayList<Integer>();
    private JFormattedTextField[] golesLocalGrupoD = new JFormattedTextField[6];
    private JFormattedTextField[] golesVisitantesGrupoD = new JFormattedTextField[6];

    // Preparo arreglos para leer los campos de grupo E
    private ArrayList<Integer> idsPartidosGrupoE = new ArrayList<Integer>();
    private JFormattedTextField[] golesLocalGrupoE = new JFormattedTextField[6];
    private JFormattedTextField[] golesVisitantesGrupoE = new JFormattedTextField[6];

    // Preparo arreglos para leer los campos de grupo F
    private ArrayList<Integer> idsPartidosGrupoF = new ArrayList<Integer>();
    private JFormattedTextField[] golesLocalGrupoF = new JFormattedTextField[6];
    private JFormattedTextField[] golesVisitantesGrupoF = new JFormattedTextField[6];

    // Preparo arreglos para leer los campos de grupo G
    private ArrayList<Integer> idsPartidosGrupoG = new ArrayList<Integer>();
    private JFormattedTextField[] golesLocalGrupoG = new JFormattedTextField[6];
    private JFormattedTextField[] golesVisitantesGrupoG = new JFormattedTextField[6];

    // Preparo arreglos para leer los campos de grupo H
    private ArrayList<Integer> idsPartidosGrupoH = new ArrayList<Integer>();
    private JFormattedTextField[] golesLocalGrupoH = new JFormattedTextField[6];
    private JFormattedTextField[] golesVisitantesGrupoH = new JFormattedTextField[6];

    // Preparo arreglos para leer los campos de octavos
    private ArrayList<Integer> idsPartidosOctavos = new ArrayList<Integer>();
    private JFormattedTextField[] golesLocalOctavos = new JFormattedTextField[8];
    private JFormattedTextField[] golesVisitantesOctavos = new JFormattedTextField[8];

    // Preparo arreglos para leer los campos de cuartos
    private ArrayList<Integer> idsPartidosCuartos = new ArrayList<Integer>();
    private JFormattedTextField[] golesLocalCuartos = new JFormattedTextField[4];
    private JFormattedTextField[] golesVisitantesCuartos = new JFormattedTextField[4];

    // Preparo arreglos para leer los campos de semifinales
    private ArrayList<Integer> idsPartidosSemifinales = new ArrayList<Integer>();
    private JFormattedTextField[] golesLocalSemifinales = new JFormattedTextField[2];
    private JFormattedTextField[] golesVisitantesSemifinales = new JFormattedTextField[2];

    // Preparo arreglos para leer los campos de tercer puesto
    private ArrayList<Integer> idsPartidosTercerPuesto = new ArrayList<Integer>();
    private JFormattedTextField[] golesLocalTercerPuesto = new JFormattedTextField[1];
    private JFormattedTextField[] golesVisitantesTercerPuesto = new JFormattedTextField[1];

    // Preparo arreglos para leer los campos de final
    private ArrayList<Integer> idsPartidosFinal = new ArrayList<Integer>();
    private JFormattedTextField[] golesLocalFinal = new JFormattedTextField[1];
    private JFormattedTextField[] golesVisitantesFinal = new JFormattedTextField[1];

    private HashMap<Character, IdsPartidosConResultados> lectorDeDatosDePartidos = new HashMap();

    // Defino la variable que va a contener las tablas de posiciones
    JFrame ventanaTablaDePosiciones;

    FixtureService fixtureService = new FixtureService();

    public Ventana() {

        initComponents();

        cargarRepositorios();

        loadPartidosGrupoA();

        loadPartidosGrupoB();

        loadPartidosGrupoC();

        loadPartidosGrupoD();

        loadPartidosGrupoE();

        loadPartidosGrupoF();

        loadPartidosGrupoG();

        loadPartidosGrupoH();

        loadPartidosOctavos();

        loadPartidosCuartos();

        loadPartidosSemifinales();

        loadPartidosTercerPuesto();

        loadPartidosFinal();
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
        panelGrupoA = new javax.swing.JPanel();
        jScrollPaneA = new javax.swing.JScrollPane();
        panelInteriorA = new javax.swing.JPanel();
        panelAFila1 = new javax.swing.JPanel();
        lblFechaPartidoA1 = new javax.swing.JLabel();
        lblEquipoLocalA1 = new javax.swing.JLabel();
        lblEquipoVisitanteA1 = new javax.swing.JLabel();
        lblNombreEstadioA1 = new javax.swing.JLabel();
        jSeparatorA1 = new javax.swing.JSeparator();
        golesField1_A1 = new javax.swing.JFormattedTextField();
        golesField2_A1 = new javax.swing.JFormattedTextField();
        guionA1 = new javax.swing.JLabel();
        panelAFila2 = new javax.swing.JPanel();
        lblFechaPartidoA2 = new javax.swing.JLabel();
        lblEquipoLocalA2 = new javax.swing.JLabel();
        lblEquipoVisitanteA2 = new javax.swing.JLabel();
        lblNombreEstadioA2 = new javax.swing.JLabel();
        jSeparatorA2 = new javax.swing.JSeparator();
        golesField1_A2 = new javax.swing.JFormattedTextField();
        golesField2_A2 = new javax.swing.JFormattedTextField();
        guionA2 = new javax.swing.JLabel();
        panelAFila3 = new javax.swing.JPanel();
        lblFechaPartidoA3 = new javax.swing.JLabel();
        lblEquipoLocalA3 = new javax.swing.JLabel();
        lblEquipoVisitanteA3 = new javax.swing.JLabel();
        lblNombreEstadioA3 = new javax.swing.JLabel();
        jSeparatorA3 = new javax.swing.JSeparator();
        golesField1_A3 = new javax.swing.JFormattedTextField();
        golesField2_A3 = new javax.swing.JFormattedTextField();
        guionA3 = new javax.swing.JLabel();
        panelAFila4 = new javax.swing.JPanel();
        lblFechaPartidoA4 = new javax.swing.JLabel();
        lblEquipoLocalA4 = new javax.swing.JLabel();
        lblEquipoVisitanteA4 = new javax.swing.JLabel();
        lblNombreEstadioA4 = new javax.swing.JLabel();
        jSeparatorA4 = new javax.swing.JSeparator();
        golesField1_A4 = new javax.swing.JFormattedTextField();
        golesField2_A4 = new javax.swing.JFormattedTextField();
        guionA4 = new javax.swing.JLabel();
        panelAFila5 = new javax.swing.JPanel();
        lblFechaPartidoA5 = new javax.swing.JLabel();
        lblEquipoLocalA5 = new javax.swing.JLabel();
        lblEquipoVisitanteA5 = new javax.swing.JLabel();
        lblNombreEstadioA5 = new javax.swing.JLabel();
        jSeparatorA5 = new javax.swing.JSeparator();
        golesField1_A5 = new javax.swing.JFormattedTextField();
        golesField2_A5 = new javax.swing.JFormattedTextField();
        guionA5 = new javax.swing.JLabel();
        panelAFila6 = new javax.swing.JPanel();
        lblFechaPartidoA6 = new javax.swing.JLabel();
        lblEquipoLocalA6 = new javax.swing.JLabel();
        lblEquipoVisitanteA6 = new javax.swing.JLabel();
        lblNombreEstadioA6 = new javax.swing.JLabel();
        jSeparatorA6 = new javax.swing.JSeparator();
        golesField1_A6 = new javax.swing.JFormattedTextField();
        golesField2_A6 = new javax.swing.JFormattedTextField();
        guionA6 = new javax.swing.JLabel();
        guardarBtnA = new javax.swing.JButton();
        btnVerTablaDePoscionesA = new javax.swing.JButton();
        panelGrupoB = new javax.swing.JPanel();
        jScrollPaneB = new javax.swing.JScrollPane();
        panelInteriorB = new javax.swing.JPanel();
        panelBFila1 = new javax.swing.JPanel();
        lblFechaPartidoB1 = new javax.swing.JLabel();
        lblEquipoLocalB1 = new javax.swing.JLabel();
        lblEquipoVisitanteB1 = new javax.swing.JLabel();
        lblNombreEstadioB1 = new javax.swing.JLabel();
        jSeparatorB1 = new javax.swing.JSeparator();
        golesField1_B1 = new javax.swing.JFormattedTextField();
        golesField2_B1 = new javax.swing.JFormattedTextField();
        guionA7 = new javax.swing.JLabel();
        panelBFila2 = new javax.swing.JPanel();
        lblFechaPartidoB2 = new javax.swing.JLabel();
        lblEquipoLocalB2 = new javax.swing.JLabel();
        lblEquipoVisitanteB2 = new javax.swing.JLabel();
        lblNombreEstadioB2 = new javax.swing.JLabel();
        jSeparatorB2 = new javax.swing.JSeparator();
        golesField1_B2 = new javax.swing.JFormattedTextField();
        golesField2_B2 = new javax.swing.JFormattedTextField();
        guionB2 = new javax.swing.JLabel();
        panelBFila3 = new javax.swing.JPanel();
        lblFechaPartidoB3 = new javax.swing.JLabel();
        lblEquipoLocalB3 = new javax.swing.JLabel();
        lblEquipoVisitanteB3 = new javax.swing.JLabel();
        lblNombreEstadioB3 = new javax.swing.JLabel();
        jSeparatorB3 = new javax.swing.JSeparator();
        golesField1_B3 = new javax.swing.JFormattedTextField();
        golesField2_B3 = new javax.swing.JFormattedTextField();
        guionB3 = new javax.swing.JLabel();
        panelBFila4 = new javax.swing.JPanel();
        lblFechaPartidoB4 = new javax.swing.JLabel();
        lblEquipoLocalB4 = new javax.swing.JLabel();
        lblEquipoVisitanteB4 = new javax.swing.JLabel();
        lblNombreEstadioB4 = new javax.swing.JLabel();
        jSeparatorB4 = new javax.swing.JSeparator();
        golesField1_B4 = new javax.swing.JFormattedTextField();
        golesField2_B4 = new javax.swing.JFormattedTextField();
        guionB4 = new javax.swing.JLabel();
        panelBFila5 = new javax.swing.JPanel();
        lblFechaPartidoB5 = new javax.swing.JLabel();
        lblEquipoLocalB5 = new javax.swing.JLabel();
        lblEquipoVisitanteB5 = new javax.swing.JLabel();
        lblNombreEstadioB5 = new javax.swing.JLabel();
        jSeparatorB5 = new javax.swing.JSeparator();
        golesField1_B5 = new javax.swing.JFormattedTextField();
        golesField2_B5 = new javax.swing.JFormattedTextField();
        guionB5 = new javax.swing.JLabel();
        panelBFila6 = new javax.swing.JPanel();
        lblFechaPartidoB6 = new javax.swing.JLabel();
        lblEquipoLocalB6 = new javax.swing.JLabel();
        lblEquipoVisitanteB6 = new javax.swing.JLabel();
        lblNombreEstadioB6 = new javax.swing.JLabel();
        jSeparatorB6 = new javax.swing.JSeparator();
        golesField1_B6 = new javax.swing.JFormattedTextField();
        golesField2_B6 = new javax.swing.JFormattedTextField();
        guionB6 = new javax.swing.JLabel();
        guardarBtnB = new javax.swing.JButton();
        btnVerTablaDePoscionesB = new javax.swing.JButton();
        panelGrupoC = new javax.swing.JPanel();
        jScrollPaneC = new javax.swing.JScrollPane();
        panelInteriorC = new javax.swing.JPanel();
        panelCFila1 = new javax.swing.JPanel();
        lblFechaPartidoC1 = new javax.swing.JLabel();
        lblEquipoLocalC1 = new javax.swing.JLabel();
        lblEquipoVisitanteC1 = new javax.swing.JLabel();
        lblNombreEstadioC1 = new javax.swing.JLabel();
        jSeparatorC1 = new javax.swing.JSeparator();
        golesField1_C1 = new javax.swing.JFormattedTextField();
        golesField2_C1 = new javax.swing.JFormattedTextField();
        guionC1 = new javax.swing.JLabel();
        panelCFila2 = new javax.swing.JPanel();
        lblFechaPartidoC2 = new javax.swing.JLabel();
        lblEquipoLocalC2 = new javax.swing.JLabel();
        lblEquipoVisitanteC2 = new javax.swing.JLabel();
        lblNombreEstadioC2 = new javax.swing.JLabel();
        jSeparatorC2 = new javax.swing.JSeparator();
        golesField1_C2 = new javax.swing.JFormattedTextField();
        golesField2_C2 = new javax.swing.JFormattedTextField();
        guionC2 = new javax.swing.JLabel();
        panelCFila3 = new javax.swing.JPanel();
        lblFechaPartidoC3 = new javax.swing.JLabel();
        lblEquipoLocalC3 = new javax.swing.JLabel();
        lblEquipoVisitanteC3 = new javax.swing.JLabel();
        lblNombreEstadioC3 = new javax.swing.JLabel();
        jSeparatorC3 = new javax.swing.JSeparator();
        golesField1_C3 = new javax.swing.JFormattedTextField();
        golesField2_C3 = new javax.swing.JFormattedTextField();
        guionC3 = new javax.swing.JLabel();
        panelCFila4 = new javax.swing.JPanel();
        lblFechaPartidoC4 = new javax.swing.JLabel();
        lblEquipoLocalC4 = new javax.swing.JLabel();
        lblEquipoVisitanteC4 = new javax.swing.JLabel();
        lblNombreEstadioC4 = new javax.swing.JLabel();
        jSeparatorC4 = new javax.swing.JSeparator();
        golesField1_C4 = new javax.swing.JFormattedTextField();
        golesField2_C4 = new javax.swing.JFormattedTextField();
        guionC4 = new javax.swing.JLabel();
        panelCFila5 = new javax.swing.JPanel();
        lblFechaPartidoC5 = new javax.swing.JLabel();
        lblEquipoLocalC5 = new javax.swing.JLabel();
        lblEquipoVisitanteC5 = new javax.swing.JLabel();
        lblNombreEstadioC5 = new javax.swing.JLabel();
        jSeparatorC5 = new javax.swing.JSeparator();
        golesField1_C5 = new javax.swing.JFormattedTextField();
        golesField2_C5 = new javax.swing.JFormattedTextField();
        guionC5 = new javax.swing.JLabel();
        panelCFila6 = new javax.swing.JPanel();
        lblFechaPartidoC6 = new javax.swing.JLabel();
        lblEquipoLocalC6 = new javax.swing.JLabel();
        lblEquipoVisitanteC6 = new javax.swing.JLabel();
        lblNombreEstadioC6 = new javax.swing.JLabel();
        jSeparatorC6 = new javax.swing.JSeparator();
        golesField1_C6 = new javax.swing.JFormattedTextField();
        golesField2_C6 = new javax.swing.JFormattedTextField();
        guionC6 = new javax.swing.JLabel();
        guardarBtnC = new javax.swing.JButton();
        btnVerTablaDePoscionesC = new javax.swing.JButton();
        panelGrupoD = new javax.swing.JPanel();
        jScrollPaneD = new javax.swing.JScrollPane();
        panelInteriorD = new javax.swing.JPanel();
        panelDFila1 = new javax.swing.JPanel();
        lblFechaPartidoD1 = new javax.swing.JLabel();
        lblEquipoLocalD1 = new javax.swing.JLabel();
        lblEquipoVisitanteD1 = new javax.swing.JLabel();
        lblNombreEstadioD1 = new javax.swing.JLabel();
        jSeparatorD1 = new javax.swing.JSeparator();
        golesField1_D1 = new javax.swing.JFormattedTextField();
        golesField2_D1 = new javax.swing.JFormattedTextField();
        guionD1 = new javax.swing.JLabel();
        panelDFila2 = new javax.swing.JPanel();
        lblFechaPartidoD2 = new javax.swing.JLabel();
        lblEquipoLocalD2 = new javax.swing.JLabel();
        lblEquipoVisitanteD2 = new javax.swing.JLabel();
        lblNombreEstadioD2 = new javax.swing.JLabel();
        jSeparatorD2 = new javax.swing.JSeparator();
        golesField1_D2 = new javax.swing.JFormattedTextField();
        golesField2_D2 = new javax.swing.JFormattedTextField();
        guionD2 = new javax.swing.JLabel();
        panelDFila3 = new javax.swing.JPanel();
        lblFechaPartidoD3 = new javax.swing.JLabel();
        lblEquipoLocalD3 = new javax.swing.JLabel();
        lblEquipoVisitanteD3 = new javax.swing.JLabel();
        lblNombreEstadioD3 = new javax.swing.JLabel();
        jSeparatorD3 = new javax.swing.JSeparator();
        golesField1_D3 = new javax.swing.JFormattedTextField();
        golesField2_D3 = new javax.swing.JFormattedTextField();
        guionD3 = new javax.swing.JLabel();
        panelDFila4 = new javax.swing.JPanel();
        lblFechaPartidoD4 = new javax.swing.JLabel();
        lblEquipoLocalD4 = new javax.swing.JLabel();
        lblEquipoVisitanteD4 = new javax.swing.JLabel();
        lblNombreEstadioD4 = new javax.swing.JLabel();
        jSeparatorD4 = new javax.swing.JSeparator();
        golesField1_D4 = new javax.swing.JFormattedTextField();
        golesField2_D4 = new javax.swing.JFormattedTextField();
        guionD4 = new javax.swing.JLabel();
        panelDFila5 = new javax.swing.JPanel();
        lblFechaPartidoD5 = new javax.swing.JLabel();
        lblEquipoLocalD5 = new javax.swing.JLabel();
        lblEquipoVisitanteD5 = new javax.swing.JLabel();
        lblNombreEstadioD5 = new javax.swing.JLabel();
        jSeparatorD5 = new javax.swing.JSeparator();
        golesField1_D5 = new javax.swing.JFormattedTextField();
        golesField2_D5 = new javax.swing.JFormattedTextField();
        guionD5 = new javax.swing.JLabel();
        panelDFila6 = new javax.swing.JPanel();
        lblFechaPartidoD6 = new javax.swing.JLabel();
        lblEquipoLocalD6 = new javax.swing.JLabel();
        lblEquipoVisitanteD6 = new javax.swing.JLabel();
        lblNombreEstadioD6 = new javax.swing.JLabel();
        jSeparatorD6 = new javax.swing.JSeparator();
        golesField1_D6 = new javax.swing.JFormattedTextField();
        golesField2_D6 = new javax.swing.JFormattedTextField();
        guionD6 = new javax.swing.JLabel();
        guardarBtnD = new javax.swing.JButton();
        btnVerTablaDePoscionesD = new javax.swing.JButton();
        panelGrupoE = new javax.swing.JPanel();
        jScrollPaneE = new javax.swing.JScrollPane();
        panelInteriorE = new javax.swing.JPanel();
        panelEFila1 = new javax.swing.JPanel();
        lblFechaPartidoE1 = new javax.swing.JLabel();
        lblEquipoLocalE1 = new javax.swing.JLabel();
        lblEquipoVisitanteE1 = new javax.swing.JLabel();
        lblNombreEstadioE1 = new javax.swing.JLabel();
        jSeparatorE1 = new javax.swing.JSeparator();
        golesField1_E1 = new javax.swing.JFormattedTextField();
        golesField2_E1 = new javax.swing.JFormattedTextField();
        guionE1 = new javax.swing.JLabel();
        panelEFila2 = new javax.swing.JPanel();
        lblFechaPartidoE2 = new javax.swing.JLabel();
        lblEquipoLocalE2 = new javax.swing.JLabel();
        lblEquipoVisitanteE2 = new javax.swing.JLabel();
        lblNombreEstadioE2 = new javax.swing.JLabel();
        jSeparatorE2 = new javax.swing.JSeparator();
        golesField1_E2 = new javax.swing.JFormattedTextField();
        golesField2_E2 = new javax.swing.JFormattedTextField();
        guionE2 = new javax.swing.JLabel();
        panelEFila3 = new javax.swing.JPanel();
        lblFechaPartidoE3 = new javax.swing.JLabel();
        lblEquipoLocalE3 = new javax.swing.JLabel();
        lblEquipoVisitanteE3 = new javax.swing.JLabel();
        lblNombreEstadioE3 = new javax.swing.JLabel();
        jSeparatorE3 = new javax.swing.JSeparator();
        golesField1_E3 = new javax.swing.JFormattedTextField();
        golesField2_E3 = new javax.swing.JFormattedTextField();
        guionE3 = new javax.swing.JLabel();
        panelEFila4 = new javax.swing.JPanel();
        lblFechaPartidoE4 = new javax.swing.JLabel();
        lblEquipoLocalE4 = new javax.swing.JLabel();
        lblEquipoVisitanteE4 = new javax.swing.JLabel();
        lblNombreEstadioE4 = new javax.swing.JLabel();
        jSeparatorE4 = new javax.swing.JSeparator();
        golesField1_E4 = new javax.swing.JFormattedTextField();
        golesField2_E4 = new javax.swing.JFormattedTextField();
        guionE4 = new javax.swing.JLabel();
        panelEFila5 = new javax.swing.JPanel();
        lblFechaPartidoE5 = new javax.swing.JLabel();
        lblEquipoLocalE5 = new javax.swing.JLabel();
        lblEquipoVisitanteE5 = new javax.swing.JLabel();
        lblNombreEstadioE5 = new javax.swing.JLabel();
        jSeparatorE5 = new javax.swing.JSeparator();
        golesField1_E5 = new javax.swing.JFormattedTextField();
        golesField2_E5 = new javax.swing.JFormattedTextField();
        guionE5 = new javax.swing.JLabel();
        panelEFila6 = new javax.swing.JPanel();
        lblFechaPartidoE6 = new javax.swing.JLabel();
        lblEquipoLocalE6 = new javax.swing.JLabel();
        lblEquipoVisitanteE6 = new javax.swing.JLabel();
        lblNombreEstadioE6 = new javax.swing.JLabel();
        jSeparatorE6 = new javax.swing.JSeparator();
        golesField1_E6 = new javax.swing.JFormattedTextField();
        golesField2_E6 = new javax.swing.JFormattedTextField();
        guionE6 = new javax.swing.JLabel();
        guardarBtnE = new javax.swing.JButton();
        btnVerTablaDePoscionesE = new javax.swing.JButton();
        panelGrupoF = new javax.swing.JPanel();
        jScrollPaneF = new javax.swing.JScrollPane();
        panelInteriorF = new javax.swing.JPanel();
        panelFFila1 = new javax.swing.JPanel();
        lblFechaPartidoF1 = new javax.swing.JLabel();
        lblEquipoLocalF1 = new javax.swing.JLabel();
        lblEquipoVisitanteF1 = new javax.swing.JLabel();
        lblNombreEstadioF1 = new javax.swing.JLabel();
        jSeparatorF1 = new javax.swing.JSeparator();
        golesField1_F1 = new javax.swing.JFormattedTextField();
        golesField2_F1 = new javax.swing.JFormattedTextField();
        guionF1 = new javax.swing.JLabel();
        panelFFila2 = new javax.swing.JPanel();
        lblFechaPartidoF2 = new javax.swing.JLabel();
        lblEquipoLocalF2 = new javax.swing.JLabel();
        lblEquipoVisitanteF2 = new javax.swing.JLabel();
        lblNombreEstadioF2 = new javax.swing.JLabel();
        jSeparatorF2 = new javax.swing.JSeparator();
        golesField1_F2 = new javax.swing.JFormattedTextField();
        golesField2_F2 = new javax.swing.JFormattedTextField();
        guionF2 = new javax.swing.JLabel();
        panelFFila3 = new javax.swing.JPanel();
        lblFechaPartidoF3 = new javax.swing.JLabel();
        lblEquipoLocalF3 = new javax.swing.JLabel();
        lblEquipoVisitanteF3 = new javax.swing.JLabel();
        lblNombreEstadioF3 = new javax.swing.JLabel();
        jSeparatorF3 = new javax.swing.JSeparator();
        golesField1_F3 = new javax.swing.JFormattedTextField();
        golesField2_F3 = new javax.swing.JFormattedTextField();
        guionF3 = new javax.swing.JLabel();
        panelFFila4 = new javax.swing.JPanel();
        lblFechaPartidoF4 = new javax.swing.JLabel();
        lblEquipoLocalF4 = new javax.swing.JLabel();
        lblEquipoVisitanteF4 = new javax.swing.JLabel();
        lblNombreEstadioF4 = new javax.swing.JLabel();
        jSeparatorF4 = new javax.swing.JSeparator();
        golesField1_F4 = new javax.swing.JFormattedTextField();
        golesField2_F4 = new javax.swing.JFormattedTextField();
        guionF4 = new javax.swing.JLabel();
        panelFFila5 = new javax.swing.JPanel();
        lblFechaPartidoF5 = new javax.swing.JLabel();
        lblEquipoLocalF5 = new javax.swing.JLabel();
        lblEquipoVisitanteF5 = new javax.swing.JLabel();
        lblNombreEstadioF5 = new javax.swing.JLabel();
        jSeparatorF5 = new javax.swing.JSeparator();
        golesField1_F5 = new javax.swing.JFormattedTextField();
        golesField2_F5 = new javax.swing.JFormattedTextField();
        guionF5 = new javax.swing.JLabel();
        panelFFila6 = new javax.swing.JPanel();
        lblFechaPartidoF6 = new javax.swing.JLabel();
        lblEquipoLocalF6 = new javax.swing.JLabel();
        lblEquipoVisitanteF6 = new javax.swing.JLabel();
        lblNombreEstadioF6 = new javax.swing.JLabel();
        jSeparatorF6 = new javax.swing.JSeparator();
        golesField1_F6 = new javax.swing.JFormattedTextField();
        golesField2_F6 = new javax.swing.JFormattedTextField();
        guionF6 = new javax.swing.JLabel();
        guardarBtnF = new javax.swing.JButton();
        btnVerTablaDePoscionesF = new javax.swing.JButton();
        panelGrupoG = new javax.swing.JPanel();
        jScrollPaneG = new javax.swing.JScrollPane();
        panelInteriorG = new javax.swing.JPanel();
        panelGFila1 = new javax.swing.JPanel();
        lblFechaPartidoG1 = new javax.swing.JLabel();
        lblEquipoLocalG1 = new javax.swing.JLabel();
        lblEquipoVisitanteG1 = new javax.swing.JLabel();
        lblNombreEstadioG1 = new javax.swing.JLabel();
        jSeparatorG1 = new javax.swing.JSeparator();
        golesField1_G1 = new javax.swing.JFormattedTextField();
        golesField2_G1 = new javax.swing.JFormattedTextField();
        guionG1 = new javax.swing.JLabel();
        panelGFila2 = new javax.swing.JPanel();
        lblFechaPartidoG2 = new javax.swing.JLabel();
        lblEquipoLocalG2 = new javax.swing.JLabel();
        lblEquipoVisitanteG2 = new javax.swing.JLabel();
        lblNombreEstadioG2 = new javax.swing.JLabel();
        jSeparatorG2 = new javax.swing.JSeparator();
        golesField1_G2 = new javax.swing.JFormattedTextField();
        golesField2_G2 = new javax.swing.JFormattedTextField();
        guionG2 = new javax.swing.JLabel();
        panelGFila3 = new javax.swing.JPanel();
        lblFechaPartidoG3 = new javax.swing.JLabel();
        lblEquipoLocalG3 = new javax.swing.JLabel();
        lblEquipoVisitanteG3 = new javax.swing.JLabel();
        lblNombreEstadioG3 = new javax.swing.JLabel();
        jSeparatorG3 = new javax.swing.JSeparator();
        golesField1_G3 = new javax.swing.JFormattedTextField();
        golesField2_G3 = new javax.swing.JFormattedTextField();
        guionG3 = new javax.swing.JLabel();
        panelGFila4 = new javax.swing.JPanel();
        lblFechaPartidoG4 = new javax.swing.JLabel();
        lblEquipoLocalG4 = new javax.swing.JLabel();
        lblEquipoVisitanteG4 = new javax.swing.JLabel();
        lblNombreEstadioG4 = new javax.swing.JLabel();
        jSeparatorG4 = new javax.swing.JSeparator();
        golesField1_G4 = new javax.swing.JFormattedTextField();
        golesField2_G4 = new javax.swing.JFormattedTextField();
        guionG4 = new javax.swing.JLabel();
        panelGFila5 = new javax.swing.JPanel();
        lblFechaPartidoG5 = new javax.swing.JLabel();
        lblEquipoLocalG5 = new javax.swing.JLabel();
        lblEquipoVisitanteG5 = new javax.swing.JLabel();
        lblNombreEstadioG5 = new javax.swing.JLabel();
        jSeparatorG5 = new javax.swing.JSeparator();
        golesField1_G5 = new javax.swing.JFormattedTextField();
        golesField2_G5 = new javax.swing.JFormattedTextField();
        guionG5 = new javax.swing.JLabel();
        panelGFila6 = new javax.swing.JPanel();
        lblFechaPartidoG6 = new javax.swing.JLabel();
        lblEquipoLocalG6 = new javax.swing.JLabel();
        lblEquipoVisitanteG6 = new javax.swing.JLabel();
        lblNombreEstadioG6 = new javax.swing.JLabel();
        jSeparatorG6 = new javax.swing.JSeparator();
        golesField1_G6 = new javax.swing.JFormattedTextField();
        golesField2_G6 = new javax.swing.JFormattedTextField();
        guionG6 = new javax.swing.JLabel();
        guardarBtnG = new javax.swing.JButton();
        btnVerTablaDePoscionesG = new javax.swing.JButton();
        panelGrupoH = new javax.swing.JPanel();
        jScrollPaneH = new javax.swing.JScrollPane();
        panelInteriorH = new javax.swing.JPanel();
        panelHFila1 = new javax.swing.JPanel();
        lblFechaPartidoH1 = new javax.swing.JLabel();
        lblEquipoLocalH1 = new javax.swing.JLabel();
        lblEquipoVisitanteH1 = new javax.swing.JLabel();
        lblNombreEstadioH1 = new javax.swing.JLabel();
        jSeparatorH1 = new javax.swing.JSeparator();
        golesField1_H1 = new javax.swing.JFormattedTextField();
        golesField2_H1 = new javax.swing.JFormattedTextField();
        guionH1 = new javax.swing.JLabel();
        panelHFila2 = new javax.swing.JPanel();
        lblFechaPartidoH2 = new javax.swing.JLabel();
        lblEquipoLocalH2 = new javax.swing.JLabel();
        lblEquipoVisitanteH2 = new javax.swing.JLabel();
        lblNombreEstadioH2 = new javax.swing.JLabel();
        jSeparatorH2 = new javax.swing.JSeparator();
        golesField1_H2 = new javax.swing.JFormattedTextField();
        golesField2_H2 = new javax.swing.JFormattedTextField();
        guionH2 = new javax.swing.JLabel();
        panelHFila3 = new javax.swing.JPanel();
        lblFechaPartidoH3 = new javax.swing.JLabel();
        lblEquipoLocalH3 = new javax.swing.JLabel();
        lblEquipoVisitanteH3 = new javax.swing.JLabel();
        lblNombreEstadioH3 = new javax.swing.JLabel();
        jSeparatorH3 = new javax.swing.JSeparator();
        golesField1_H3 = new javax.swing.JFormattedTextField();
        golesField2_H3 = new javax.swing.JFormattedTextField();
        guionAH3 = new javax.swing.JLabel();
        panelHFila4 = new javax.swing.JPanel();
        lblFechaPartidoH4 = new javax.swing.JLabel();
        lblEquipoLocalH4 = new javax.swing.JLabel();
        lblEquipoVisitanteH4 = new javax.swing.JLabel();
        lblNombreEstadioH4 = new javax.swing.JLabel();
        jSeparatorH4 = new javax.swing.JSeparator();
        golesField1_H4 = new javax.swing.JFormattedTextField();
        golesField2_H4 = new javax.swing.JFormattedTextField();
        guionH4 = new javax.swing.JLabel();
        panelHFila5 = new javax.swing.JPanel();
        lblFechaPartidoH5 = new javax.swing.JLabel();
        lblEquipoLocalH5 = new javax.swing.JLabel();
        lblEquipoVisitanteH5 = new javax.swing.JLabel();
        lblNombreEstadioH5 = new javax.swing.JLabel();
        jSeparatorH5 = new javax.swing.JSeparator();
        golesField1_H5 = new javax.swing.JFormattedTextField();
        golesField2_H5 = new javax.swing.JFormattedTextField();
        guionH5 = new javax.swing.JLabel();
        panelHFila6 = new javax.swing.JPanel();
        lblFechaPartidoH6 = new javax.swing.JLabel();
        lblEquipoLocalH6 = new javax.swing.JLabel();
        lblEquipoVisitanteH6 = new javax.swing.JLabel();
        lblNombreEstadioH6 = new javax.swing.JLabel();
        jSeparatorH6 = new javax.swing.JSeparator();
        golesField1_H6 = new javax.swing.JFormattedTextField();
        golesField2_H6 = new javax.swing.JFormattedTextField();
        guionH6 = new javax.swing.JLabel();
        guardarBtnH = new javax.swing.JButton();
        btnVerTablaDePoscionesH = new javax.swing.JButton();
        panelOctavos = new javax.swing.JPanel();
        jScrollPaneOctavos = new javax.swing.JScrollPane();
        panelInteriorOctavos = new javax.swing.JPanel();
        panelOctavosFila1 = new javax.swing.JPanel();
        lblFechaPartidoOctavos1 = new javax.swing.JLabel();
        lblEquipoLocalOctavos1 = new javax.swing.JLabel();
        lblEquipoVisitanteOctavos1 = new javax.swing.JLabel();
        lblNombreEstadioOctavos1 = new javax.swing.JLabel();
        jSeparatorOctavos1 = new javax.swing.JSeparator();
        golesField1_Octavos1 = new javax.swing.JFormattedTextField();
        golesField2_Octavos1 = new javax.swing.JFormattedTextField();
        guionOctavos1 = new javax.swing.JLabel();
        label1roA = new javax.swing.JLabel();
        label2doB = new javax.swing.JLabel();
        penalesField1_Octavos1 = new javax.swing.JFormattedTextField();
        penalesField2_Octavos1 = new javax.swing.JFormattedTextField();
        panelOctavosFila2 = new javax.swing.JPanel();
        lblFechaPartidoOctavos2 = new javax.swing.JLabel();
        lblEquipoLocalOctavos2 = new javax.swing.JLabel();
        lblEquipoVisitanteOctavos2 = new javax.swing.JLabel();
        lblNombreEstadioOctavos2 = new javax.swing.JLabel();
        jSeparatorOctavos2 = new javax.swing.JSeparator();
        golesField1_Octavos2 = new javax.swing.JFormattedTextField();
        golesField2_Octavos2 = new javax.swing.JFormattedTextField();
        guionOctavos2 = new javax.swing.JLabel();
        label1roC = new javax.swing.JLabel();
        label2doD = new javax.swing.JLabel();
        penalesField1_Octavos2 = new javax.swing.JFormattedTextField();
        penalesField2_Octavos2 = new javax.swing.JFormattedTextField();
        panelOctavosFila3 = new javax.swing.JPanel();
        lblFechaPartidoOctavos3 = new javax.swing.JLabel();
        lblEquipoLocalOctavos3 = new javax.swing.JLabel();
        lblEquipoVisitanteOctavos3 = new javax.swing.JLabel();
        lblNombreEstadioOctavos3 = new javax.swing.JLabel();
        jSeparatorOctavos3 = new javax.swing.JSeparator();
        golesField1_Octavos3 = new javax.swing.JFormattedTextField();
        golesField2_Octavos3 = new javax.swing.JFormattedTextField();
        guionOctavos3 = new javax.swing.JLabel();
        label1roB = new javax.swing.JLabel();
        label2doA = new javax.swing.JLabel();
        penalesField1_Octavos3 = new javax.swing.JFormattedTextField();
        penalesField2_Octavos3 = new javax.swing.JFormattedTextField();
        panelOctavosFila4 = new javax.swing.JPanel();
        lblFechaPartidoOctavos4 = new javax.swing.JLabel();
        lblEquipoLocalOctavos4 = new javax.swing.JLabel();
        lblEquipoVisitanteOctavos4 = new javax.swing.JLabel();
        lblNombreEstadioOctavos4 = new javax.swing.JLabel();
        jSeparatorOctavos4 = new javax.swing.JSeparator();
        golesField1_Octavos4 = new javax.swing.JFormattedTextField();
        golesField2_Octavos4 = new javax.swing.JFormattedTextField();
        guionOctavos4 = new javax.swing.JLabel();
        label1roD = new javax.swing.JLabel();
        label2doC = new javax.swing.JLabel();
        penalesField1_Octavos4 = new javax.swing.JFormattedTextField();
        penalesField2_Octavos4 = new javax.swing.JFormattedTextField();
        panelOctavosFila5 = new javax.swing.JPanel();
        lblFechaPartidoOctavos5 = new javax.swing.JLabel();
        lblEquipoLocalOctavos5 = new javax.swing.JLabel();
        lblEquipoVisitanteOctavos5 = new javax.swing.JLabel();
        lblNombreEstadioOctavos5 = new javax.swing.JLabel();
        jSeparatorOctavos5 = new javax.swing.JSeparator();
        golesField1_Octavos5 = new javax.swing.JFormattedTextField();
        golesField2_Octavos5 = new javax.swing.JFormattedTextField();
        guionOctavos5 = new javax.swing.JLabel();
        label1roE = new javax.swing.JLabel();
        label2doF = new javax.swing.JLabel();
        penalesField1_Octavos5 = new javax.swing.JFormattedTextField();
        penalesField2_Octavos5 = new javax.swing.JFormattedTextField();
        panelOctavosFila6 = new javax.swing.JPanel();
        lblFechaPartidoOctavos6 = new javax.swing.JLabel();
        lblEquipoLocalOctavos6 = new javax.swing.JLabel();
        lblEquipoVisitanteOctavos6 = new javax.swing.JLabel();
        lblNombreEstadioOctavos6 = new javax.swing.JLabel();
        jSeparatorOctavos6 = new javax.swing.JSeparator();
        golesField1_Octavos6 = new javax.swing.JFormattedTextField();
        golesField2_Octavos6 = new javax.swing.JFormattedTextField();
        guionOctavos6 = new javax.swing.JLabel();
        label1roG = new javax.swing.JLabel();
        label2doH = new javax.swing.JLabel();
        penalesField1_Octavos6 = new javax.swing.JFormattedTextField();
        penalesField2_Octavos6 = new javax.swing.JFormattedTextField();
        panelOctavosFila7 = new javax.swing.JPanel();
        lblFechaPartidoOctavos7 = new javax.swing.JLabel();
        lblEquipoLocalOctavos7 = new javax.swing.JLabel();
        lblEquipoVisitanteOctavos7 = new javax.swing.JLabel();
        lblNombreEstadioOctavos7 = new javax.swing.JLabel();
        jSeparatorOctavos7 = new javax.swing.JSeparator();
        golesField1_Octavos7 = new javax.swing.JFormattedTextField();
        golesField2_Octavos7 = new javax.swing.JFormattedTextField();
        guionOctavos7 = new javax.swing.JLabel();
        label1roF = new javax.swing.JLabel();
        label2doE = new javax.swing.JLabel();
        penalesField1_Octavos7 = new javax.swing.JFormattedTextField();
        penalesField12_Octavos7 = new javax.swing.JFormattedTextField();
        panelOctavosFila8 = new javax.swing.JPanel();
        lblFechaPartidoOctavos8 = new javax.swing.JLabel();
        lblEquipoLocalOctavos8 = new javax.swing.JLabel();
        lblEquipoVisitanteOctavos8 = new javax.swing.JLabel();
        lblNombreEstadioOctavos8 = new javax.swing.JLabel();
        jSeparatorOctavos8 = new javax.swing.JSeparator();
        golesField1_Octavos8 = new javax.swing.JFormattedTextField();
        golesField2_Octavos8 = new javax.swing.JFormattedTextField();
        guionOctavos8 = new javax.swing.JLabel();
        label1roH = new javax.swing.JLabel();
        label2doG = new javax.swing.JLabel();
        penalesField1_Octavos8 = new javax.swing.JFormattedTextField();
        penalesField2_Octavos8 = new javax.swing.JFormattedTextField();
        guardarBtnOctavos = new javax.swing.JButton();
        panelCuartos = new javax.swing.JPanel();
        jScrollPaneCuartos = new javax.swing.JScrollPane();
        panelInteriorCuartos = new javax.swing.JPanel();
        panelCuartosFila1 = new javax.swing.JPanel();
        lblFechaPartidoCuartos1 = new javax.swing.JLabel();
        lblEquipoLocalCuartos1 = new javax.swing.JLabel();
        lblEquipoVisitanteCuartos1 = new javax.swing.JLabel();
        lblNombreEstadioCuartos1 = new javax.swing.JLabel();
        jSeparatorCuartos1 = new javax.swing.JSeparator();
        golesField1_cuartos1 = new javax.swing.JFormattedTextField();
        golesField2_cuartos1 = new javax.swing.JFormattedTextField();
        guionCuartos1 = new javax.swing.JLabel();
        penalesField1_cuartos1 = new javax.swing.JFormattedTextField();
        penalesField2_cuartos1 = new javax.swing.JFormattedTextField();
        panelCuartosFila2 = new javax.swing.JPanel();
        lblFechaPartidoCuartos2 = new javax.swing.JLabel();
        lblEquipoLocalCuartos2 = new javax.swing.JLabel();
        lblEquipoVisitanteCuartos2 = new javax.swing.JLabel();
        lblNombreEstadioCuartos2 = new javax.swing.JLabel();
        jSeparatorCuartos2 = new javax.swing.JSeparator();
        golesField1_cuartos2 = new javax.swing.JFormattedTextField();
        golesField2_cuartos2 = new javax.swing.JFormattedTextField();
        guionCuartos2 = new javax.swing.JLabel();
        penalesField1_cuartos2 = new javax.swing.JFormattedTextField();
        penalesField2_cuartos2 = new javax.swing.JFormattedTextField();
        panelCuartosFila3 = new javax.swing.JPanel();
        lblFechaPartidoCuartos3 = new javax.swing.JLabel();
        lblEquipoLocalCuartos3 = new javax.swing.JLabel();
        lblEquipoVisitanteCuartos3 = new javax.swing.JLabel();
        lblNombreEstadioCuartos3 = new javax.swing.JLabel();
        jSeparatorCuartos3 = new javax.swing.JSeparator();
        golesField1_cuartos3 = new javax.swing.JFormattedTextField();
        golesField2_cuartos3 = new javax.swing.JFormattedTextField();
        guionCuartos3 = new javax.swing.JLabel();
        penalesField1_cuartos3 = new javax.swing.JFormattedTextField();
        penalesField2_cuartos3 = new javax.swing.JFormattedTextField();
        panelCuartosFila4 = new javax.swing.JPanel();
        lblFechaPartidoCuartos4 = new javax.swing.JLabel();
        lblEquipoLocalCuartos4 = new javax.swing.JLabel();
        lblEquipoVisitanteCuartos4 = new javax.swing.JLabel();
        lblNombreEstadioCuartos4 = new javax.swing.JLabel();
        jSeparatorCuartos4 = new javax.swing.JSeparator();
        golesField1_cuartos4 = new javax.swing.JFormattedTextField();
        golesField2_cuartos4 = new javax.swing.JFormattedTextField();
        guionCuartos4 = new javax.swing.JLabel();
        penalesField1_cuartos4 = new javax.swing.JFormattedTextField();
        penalesField2_cuartos4 = new javax.swing.JFormattedTextField();
        guardarBtnCuartos = new javax.swing.JButton();
        panelSemifinales = new javax.swing.JPanel();
        jScrollPaneSemifinales = new javax.swing.JScrollPane();
        panelInteriorSemifinales = new javax.swing.JPanel();
        panelSemifinalesFila1 = new javax.swing.JPanel();
        lblFechaPartidoSemifinales1 = new javax.swing.JLabel();
        lblEquipoLocalSemifinales1 = new javax.swing.JLabel();
        lblEquipoVisitanteSemifinales1 = new javax.swing.JLabel();
        lblNombreEstadioSemifinales1 = new javax.swing.JLabel();
        jSeparatorSemifinales1 = new javax.swing.JSeparator();
        golesField1_semifinales1 = new javax.swing.JFormattedTextField();
        golesField2_semifinales1 = new javax.swing.JFormattedTextField();
        guionSemifinales1 = new javax.swing.JLabel();
        penalesField1_semifinales1 = new javax.swing.JFormattedTextField();
        penalesField2_semifinales1 = new javax.swing.JFormattedTextField();
        panelSemifinalesFila2 = new javax.swing.JPanel();
        lblFechaPartidoSemifinales2 = new javax.swing.JLabel();
        lblEquipoLocalSemifinales2 = new javax.swing.JLabel();
        lblEquipoVisitanteSemifinales2 = new javax.swing.JLabel();
        lblNombreEstadioSemifinales2 = new javax.swing.JLabel();
        jSeparatorSemifinales2 = new javax.swing.JSeparator();
        golesField1_semifinales2 = new javax.swing.JFormattedTextField();
        golesField2_semifinales2 = new javax.swing.JFormattedTextField();
        guionSemifinales2 = new javax.swing.JLabel();
        penalesField1_semifinales2 = new javax.swing.JFormattedTextField();
        penalesField2_semifinales2 = new javax.swing.JFormattedTextField();
        guardarBtnSemifinales = new javax.swing.JButton();
        panelTercerPuesto = new javax.swing.JPanel();
        jScrollPaneTercerPuesto = new javax.swing.JScrollPane();
        panelInteriorTercerPuesto = new javax.swing.JPanel();
        javax.swing.JPanel panelTercerPuestoFila1 = new javax.swing.JPanel();
        lblFechaPartidoTercerPuesto1 = new javax.swing.JLabel();
        lblEquipoLocalTercerPuesto1 = new javax.swing.JLabel();
        lblEquipoVisitanteTercerPuesto1 = new javax.swing.JLabel();
        lblNombreEstadioTercerPuesto1 = new javax.swing.JLabel();
        jSeparatorTercerPuesto1 = new javax.swing.JSeparator();
        golesField1_tercerPuesto1 = new javax.swing.JFormattedTextField();
        golesField2_tercerPuesto1 = new javax.swing.JFormattedTextField();
        guionTercerPuesto1 = new javax.swing.JLabel();
        penalesField1_tercerPuesto1 = new javax.swing.JFormattedTextField();
        penalesField2_tercerPuesto1 = new javax.swing.JFormattedTextField();
        guardarBtnTercerPuesto = new javax.swing.JButton();
        panelFinal = new javax.swing.JPanel();
        jScrollPaneFinal = new javax.swing.JScrollPane();
        panelInteriorFinal = new javax.swing.JPanel();
        javax.swing.JPanel panelFinalFila1 = new javax.swing.JPanel();
        lblFechaPartidoFinal1 = new javax.swing.JLabel();
        lblEquipoLocalFinal1 = new javax.swing.JLabel();
        lblEquipoVisitanteFinal1 = new javax.swing.JLabel();
        lblNombreEstadioFinal1 = new javax.swing.JLabel();
        jSeparatorFinal1 = new javax.swing.JSeparator();
        golesField1_final1 = new javax.swing.JFormattedTextField();
        golesField2_final1 = new javax.swing.JFormattedTextField();
        guionFinal1 = new javax.swing.JLabel();
        penalesField1_final1 = new javax.swing.JFormattedTextField();
        penalesField2_final1 = new javax.swing.JFormattedTextField();
        guardarBtnFinal = new javax.swing.JButton();
        panelHeader = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelSubtitulo = new javax.swing.JLabel();
        labelLogo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fixture interactivo - Qatar 2022");
        setBounds(new java.awt.Rectangle(0, 0, 1000, 800));
        setMinimumSize(null);
        setSize(new java.awt.Dimension(800, 800));

        panelMain.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelMain.setPreferredSize(new java.awt.Dimension(1280, 720));

        panelBody.setPreferredSize(new java.awt.Dimension(1280, 263));

        tabbedPane.setMaximumSize(panelBody.getMinimumSize());

        panelGrupoA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInteriorA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFechaPartidoA1.setText("FechaPartido");

        lblEquipoLocalA1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalA1.setText("Equipo Local");

        lblEquipoVisitanteA1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteA1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteA1.setText("Equipo Visitante");
        lblEquipoVisitanteA1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioA1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioA1.setText("NombreEstadio");

        golesField1_A1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_A1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

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
                        .addComponent(lblFechaPartidoA1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioA1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAFila1Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalA1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_A1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_A1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteA1)))
                .addContainerGap())
        );
        panelAFila1Layout.setVerticalGroup(
            panelAFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAFila1Layout.createSequentialGroup()
                .addGroup(panelAFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAFila1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoA1))
                    .addGroup(panelAFila1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioA1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteA1)
                            .addComponent(lblEquipoLocalA1)
                            .addComponent(golesField1_A1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_A1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionA1))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorA.add(panelAFila1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 720, 90));

        lblFechaPartidoA2.setText("FechaPartido");

        lblEquipoLocalA2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalA2.setText("Equipo Local");

        lblEquipoVisitanteA2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteA2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteA2.setText("Equipo Visitante");
        lblEquipoVisitanteA2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioA2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioA2.setText("NombreEstadio");

        golesField1_A2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_A2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

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
                        .addComponent(lblFechaPartidoA2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioA2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAFila2Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalA2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_A2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_A2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteA2)))
                .addContainerGap())
        );
        panelAFila2Layout.setVerticalGroup(
            panelAFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAFila2Layout.createSequentialGroup()
                .addGroup(panelAFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAFila2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoA2))
                    .addGroup(panelAFila2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioA2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteA2)
                            .addComponent(lblEquipoLocalA2)
                            .addComponent(golesField1_A2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_A2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionA2))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorA.add(panelAFila2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 720, 90));

        lblFechaPartidoA3.setText("FechaPartido");

        lblEquipoLocalA3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalA3.setText("Equipo Local");

        lblEquipoVisitanteA3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteA3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteA3.setText("Equipo Visitante");
        lblEquipoVisitanteA3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioA3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioA3.setText("NombreEstadio");

        golesField1_A3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_A3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

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
                        .addComponent(lblFechaPartidoA3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioA3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAFila3Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalA3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_A3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionA3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_A3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteA3)))
                .addContainerGap())
        );
        panelAFila3Layout.setVerticalGroup(
            panelAFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAFila3Layout.createSequentialGroup()
                .addGroup(panelAFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAFila3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoA3))
                    .addGroup(panelAFila3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioA3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteA3)
                            .addComponent(lblEquipoLocalA3)
                            .addComponent(golesField1_A3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_A3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionA3))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorA.add(panelAFila3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 720, 90));

        lblFechaPartidoA4.setText("FechaPartido");

        lblEquipoLocalA4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalA4.setText("Equipo Local");

        lblEquipoVisitanteA4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteA4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteA4.setText("Equipo Visitante");
        lblEquipoVisitanteA4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioA4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioA4.setText("NombreEstadio");

        golesField1_A4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_A4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

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
                        .addComponent(lblFechaPartidoA4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioA4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAFila4Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalA4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_A4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionA4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_A4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteA4)))
                .addContainerGap())
        );
        panelAFila4Layout.setVerticalGroup(
            panelAFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAFila4Layout.createSequentialGroup()
                .addGroup(panelAFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAFila4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoA4))
                    .addGroup(panelAFila4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioA4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteA4)
                            .addComponent(lblEquipoLocalA4)
                            .addComponent(golesField1_A4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_A4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionA4))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorA.add(panelAFila4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 720, 90));

        lblFechaPartidoA5.setText("FechaPartido");

        lblEquipoLocalA5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalA5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalA5.setText("Equipo Local");

        lblEquipoVisitanteA5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteA5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteA5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteA5.setText("Equipo Visitante");
        lblEquipoVisitanteA5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioA5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioA5.setText("NombreEstadio");

        golesField1_A5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_A5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

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
                        .addComponent(lblFechaPartidoA5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioA5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAFila5Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalA5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_A5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionA5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_A5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteA5)))
                .addContainerGap())
        );
        panelAFila5Layout.setVerticalGroup(
            panelAFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAFila5Layout.createSequentialGroup()
                .addGroup(panelAFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAFila5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoA5))
                    .addGroup(panelAFila5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioA5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteA5)
                            .addComponent(lblEquipoLocalA5)
                            .addComponent(golesField1_A5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_A5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionA5))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorA.add(panelAFila5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 720, 90));

        lblFechaPartidoA6.setText("FechaPartido");

        lblEquipoLocalA6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalA6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalA6.setText("Equipo Local");

        lblEquipoVisitanteA6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteA6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteA6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteA6.setText("Equipo Visitante");
        lblEquipoVisitanteA6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioA6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioA6.setText("NombreEstadio");

        golesField1_A6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_A6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

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
                        .addComponent(lblFechaPartidoA6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioA6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAFila6Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalA6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_A6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionA6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_A6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteA6)))
                .addContainerGap())
        );
        panelAFila6Layout.setVerticalGroup(
            panelAFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAFila6Layout.createSequentialGroup()
                .addGroup(panelAFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAFila6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoA6))
                    .addGroup(panelAFila6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioA6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteA6)
                            .addComponent(lblEquipoLocalA6)
                            .addComponent(golesField1_A6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_A6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionA6))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorA6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorA.add(panelAFila6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 720, 90));

        jScrollPaneA.setViewportView(panelInteriorA);

        panelGrupoA.add(jScrollPaneA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 770, 420));

        guardarBtnA.setText("Guardar");
        guardarBtnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnAActionPerformed(evt);
            }
        });
        panelGrupoA.add(guardarBtnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, -1, -1));

        btnVerTablaDePoscionesA.setText("Ver tabla de posiciones");
        btnVerTablaDePoscionesA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTablaDePoscionesAActionPerformed(evt);
            }
        });
        panelGrupoA.add(btnVerTablaDePoscionesA, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, -1, -1));

        tabbedPane.addTab("A", panelGrupoA);

        panelGrupoB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInteriorB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFechaPartidoB1.setText("FechaPartido");

        lblEquipoLocalB1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalB1.setText("Equipo Local");

        lblEquipoVisitanteB1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteB1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteB1.setText("Equipo Visitante");
        lblEquipoVisitanteB1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioB1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioB1.setText("NombreEstadio");

        golesField1_B1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_B1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionA7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionA7.setText("-");

        javax.swing.GroupLayout panelBFila1Layout = new javax.swing.GroupLayout(panelBFila1);
        panelBFila1.setLayout(panelBFila1Layout);
        panelBFila1Layout.setHorizontalGroup(
            panelBFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBFila1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorB1)
                    .addGroup(panelBFila1Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoB1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioB1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBFila1Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalB1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_B1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionA7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_B1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteB1)))
                .addContainerGap())
        );
        panelBFila1Layout.setVerticalGroup(
            panelBFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBFila1Layout.createSequentialGroup()
                .addGroup(panelBFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBFila1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoB1))
                    .addGroup(panelBFila1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioB1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteB1)
                            .addComponent(lblEquipoLocalB1)
                            .addComponent(golesField1_B1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_B1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionA7))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorB.add(panelBFila1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 730, 90));

        lblFechaPartidoB2.setText("FechaPartido");

        lblEquipoLocalB2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalB2.setText("Equipo Local");

        lblEquipoVisitanteB2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteB2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteB2.setText("Equipo Visitante");
        lblEquipoVisitanteB2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioB2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioB2.setText("NombreEstadio");

        golesField1_B2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_B2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionB2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionB2.setText("-");

        javax.swing.GroupLayout panelBFila2Layout = new javax.swing.GroupLayout(panelBFila2);
        panelBFila2.setLayout(panelBFila2Layout);
        panelBFila2Layout.setHorizontalGroup(
            panelBFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBFila2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorB2)
                    .addGroup(panelBFila2Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoB2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioB2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBFila2Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalB2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_B2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_B2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteB2)))
                .addContainerGap())
        );
        panelBFila2Layout.setVerticalGroup(
            panelBFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBFila2Layout.createSequentialGroup()
                .addGroup(panelBFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBFila2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoB2))
                    .addGroup(panelBFila2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioB2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteB2)
                            .addComponent(lblEquipoLocalB2)
                            .addComponent(golesField1_B2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_B2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionB2))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorB.add(panelBFila2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 730, 90));

        lblFechaPartidoB3.setText("FechaPartido");

        lblEquipoLocalB3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalB3.setText("Equipo Local");

        lblEquipoVisitanteB3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteB3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteB3.setText("Equipo Visitante");
        lblEquipoVisitanteB3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioB3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioB3.setText("NombreEstadio");

        golesField1_B3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_B3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionB3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionB3.setText("-");

        javax.swing.GroupLayout panelBFila3Layout = new javax.swing.GroupLayout(panelBFila3);
        panelBFila3.setLayout(panelBFila3Layout);
        panelBFila3Layout.setHorizontalGroup(
            panelBFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBFila3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorB3)
                    .addGroup(panelBFila3Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoB3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioB3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBFila3Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalB3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_B3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionB3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_B3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteB3)))
                .addContainerGap())
        );
        panelBFila3Layout.setVerticalGroup(
            panelBFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBFila3Layout.createSequentialGroup()
                .addGroup(panelBFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBFila3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoB3))
                    .addGroup(panelBFila3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioB3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteB3)
                            .addComponent(lblEquipoLocalB3)
                            .addComponent(golesField1_B3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_B3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionB3))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorB.add(panelBFila3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 730, 90));

        lblFechaPartidoB4.setText("FechaPartido");

        lblEquipoLocalB4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalB4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalB4.setText("Equipo Local");

        lblEquipoVisitanteB4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteB4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteB4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteB4.setText("Equipo Visitante");
        lblEquipoVisitanteB4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioB4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioB4.setText("NombreEstadio");

        golesField1_B4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_B4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionB4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionB4.setText("-");

        javax.swing.GroupLayout panelBFila4Layout = new javax.swing.GroupLayout(panelBFila4);
        panelBFila4.setLayout(panelBFila4Layout);
        panelBFila4Layout.setHorizontalGroup(
            panelBFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBFila4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorB4)
                    .addGroup(panelBFila4Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoB4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioB4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBFila4Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalB4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_B4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionB4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_B4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteB4)))
                .addContainerGap())
        );
        panelBFila4Layout.setVerticalGroup(
            panelBFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBFila4Layout.createSequentialGroup()
                .addGroup(panelBFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBFila4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoB4))
                    .addGroup(panelBFila4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioB4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteB4)
                            .addComponent(lblEquipoLocalB4)
                            .addComponent(golesField1_B4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_B4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionB4))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorB4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorB.add(panelBFila4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 730, 90));

        lblFechaPartidoB5.setText("FechaPartido");

        lblEquipoLocalB5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalB5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalB5.setText("Equipo Local");

        lblEquipoVisitanteB5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteB5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteB5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteB5.setText("Equipo Visitante");
        lblEquipoVisitanteB5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioB5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioB5.setText("NombreEstadio");

        golesField1_B5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_B5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionB5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionB5.setText("-");

        javax.swing.GroupLayout panelBFila5Layout = new javax.swing.GroupLayout(panelBFila5);
        panelBFila5.setLayout(panelBFila5Layout);
        panelBFila5Layout.setHorizontalGroup(
            panelBFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBFila5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorB5)
                    .addGroup(panelBFila5Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoB5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioB5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBFila5Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalB5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_B5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionB5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_B5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteB5)))
                .addContainerGap())
        );
        panelBFila5Layout.setVerticalGroup(
            panelBFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBFila5Layout.createSequentialGroup()
                .addGroup(panelBFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBFila5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoB5))
                    .addGroup(panelBFila5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioB5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteB5)
                            .addComponent(lblEquipoLocalB5)
                            .addComponent(golesField1_B5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_B5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionB5))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorB5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorB.add(panelBFila5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 730, 90));

        lblFechaPartidoB6.setText("FechaPartido");

        lblEquipoLocalB6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalB6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalB6.setText("Equipo Local");

        lblEquipoVisitanteB6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteB6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteB6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteB6.setText("Equipo Visitante");
        lblEquipoVisitanteB6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioB6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioB6.setText("NombreEstadio");

        golesField1_B6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_B6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionB6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionB6.setText("-");

        javax.swing.GroupLayout panelBFila6Layout = new javax.swing.GroupLayout(panelBFila6);
        panelBFila6.setLayout(panelBFila6Layout);
        panelBFila6Layout.setHorizontalGroup(
            panelBFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBFila6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorB6)
                    .addGroup(panelBFila6Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoB6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioB6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBFila6Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalB6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_B6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionB6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_B6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteB6)))
                .addContainerGap())
        );
        panelBFila6Layout.setVerticalGroup(
            panelBFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBFila6Layout.createSequentialGroup()
                .addGroup(panelBFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBFila6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoB6))
                    .addGroup(panelBFila6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioB6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteB6)
                            .addComponent(lblEquipoLocalB6)
                            .addComponent(golesField1_B6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_B6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionB6))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorB6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorB.add(panelBFila6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 730, 90));

        jScrollPaneB.setViewportView(panelInteriorB);

        panelGrupoB.add(jScrollPaneB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 770, 420));

        guardarBtnB.setText("Guardar");
        guardarBtnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnBActionPerformed(evt);
            }
        });
        panelGrupoB.add(guardarBtnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, -1, -1));

        btnVerTablaDePoscionesB.setText("Ver tabla de posiciones");
        btnVerTablaDePoscionesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTablaDePoscionesBActionPerformed(evt);
            }
        });
        panelGrupoB.add(btnVerTablaDePoscionesB, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, -1, -1));

        tabbedPane.addTab("B", panelGrupoB);

        panelGrupoC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInteriorC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFechaPartidoC1.setText("FechaPartido");

        lblEquipoLocalC1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalC1.setText("Equipo Local");

        lblEquipoVisitanteC1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteC1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteC1.setText("Equipo Visitante");
        lblEquipoVisitanteC1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioC1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioC1.setText("NombreEstadio");

        golesField1_C1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_C1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionC1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionC1.setText("-");

        javax.swing.GroupLayout panelCFila1Layout = new javax.swing.GroupLayout(panelCFila1);
        panelCFila1.setLayout(panelCFila1Layout);
        panelCFila1Layout.setHorizontalGroup(
            panelCFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCFila1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorC1)
                    .addGroup(panelCFila1Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioC1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCFila1Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_C1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_C1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteC1)))
                .addContainerGap())
        );
        panelCFila1Layout.setVerticalGroup(
            panelCFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCFila1Layout.createSequentialGroup()
                .addGroup(panelCFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCFila1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoC1))
                    .addGroup(panelCFila1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteC1)
                            .addComponent(lblEquipoLocalC1)
                            .addComponent(golesField1_C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionC1))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorC.add(panelCFila1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 730, 90));

        lblFechaPartidoC2.setText("FechaPartido");

        lblEquipoLocalC2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalC2.setText("Equipo Local");

        lblEquipoVisitanteC2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteC2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteC2.setText("Equipo Visitante");
        lblEquipoVisitanteC2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioC2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioC2.setText("NombreEstadio");

        golesField1_C2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_C2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionC2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionC2.setText("-");

        javax.swing.GroupLayout panelCFila2Layout = new javax.swing.GroupLayout(panelCFila2);
        panelCFila2.setLayout(panelCFila2Layout);
        panelCFila2Layout.setHorizontalGroup(
            panelCFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCFila2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorC2)
                    .addGroup(panelCFila2Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioC2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCFila2Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_C2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionC2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_C2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteC2)))
                .addContainerGap())
        );
        panelCFila2Layout.setVerticalGroup(
            panelCFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCFila2Layout.createSequentialGroup()
                .addGroup(panelCFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCFila2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoC2))
                    .addGroup(panelCFila2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteC2)
                            .addComponent(lblEquipoLocalC2)
                            .addComponent(golesField1_C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionC2))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorC.add(panelCFila2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 730, 90));

        lblFechaPartidoC3.setText("FechaPartido");

        lblEquipoLocalC3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalC3.setText("Equipo Local");

        lblEquipoVisitanteC3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteC3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteC3.setText("Equipo Visitante");
        lblEquipoVisitanteC3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioC3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioC3.setText("NombreEstadio");

        golesField1_C3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_C3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionC3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionC3.setText("-");

        javax.swing.GroupLayout panelCFila3Layout = new javax.swing.GroupLayout(panelCFila3);
        panelCFila3.setLayout(panelCFila3Layout);
        panelCFila3Layout.setHorizontalGroup(
            panelCFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCFila3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorC3)
                    .addGroup(panelCFila3Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioC3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCFila3Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_C3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionC3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_C3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteC3)))
                .addContainerGap())
        );
        panelCFila3Layout.setVerticalGroup(
            panelCFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCFila3Layout.createSequentialGroup()
                .addGroup(panelCFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCFila3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoC3))
                    .addGroup(panelCFila3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteC3)
                            .addComponent(lblEquipoLocalC3)
                            .addComponent(golesField1_C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionC3))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorC.add(panelCFila3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 730, 90));

        lblFechaPartidoC4.setText("FechaPartido");

        lblEquipoLocalC4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalC4.setText("Equipo Local");

        lblEquipoVisitanteC4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteC4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteC4.setText("Equipo Visitante");
        lblEquipoVisitanteC4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioC4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioC4.setText("NombreEstadio");

        golesField1_C4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_C4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionC4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionC4.setText("-");

        javax.swing.GroupLayout panelCFila4Layout = new javax.swing.GroupLayout(panelCFila4);
        panelCFila4.setLayout(panelCFila4Layout);
        panelCFila4Layout.setHorizontalGroup(
            panelCFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCFila4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorC4)
                    .addGroup(panelCFila4Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoC4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioC4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCFila4Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalC4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_C4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionC4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_C4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteC4)))
                .addContainerGap())
        );
        panelCFila4Layout.setVerticalGroup(
            panelCFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCFila4Layout.createSequentialGroup()
                .addGroup(panelCFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCFila4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoC4))
                    .addGroup(panelCFila4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioC4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteC4)
                            .addComponent(lblEquipoLocalC4)
                            .addComponent(golesField1_C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionC4))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorC4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorC.add(panelCFila4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 730, 90));

        lblFechaPartidoC5.setText("FechaPartido");

        lblEquipoLocalC5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalC5.setText("Equipo Local");

        lblEquipoVisitanteC5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteC5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteC5.setText("Equipo Visitante");
        lblEquipoVisitanteC5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioC5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioC5.setText("NombreEstadio");

        golesField1_C5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_C5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionC5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionC5.setText("-");

        javax.swing.GroupLayout panelCFila5Layout = new javax.swing.GroupLayout(panelCFila5);
        panelCFila5.setLayout(panelCFila5Layout);
        panelCFila5Layout.setHorizontalGroup(
            panelCFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCFila5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorC5)
                    .addGroup(panelCFila5Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoC5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioC5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCFila5Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalC5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_C5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionC5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_C5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteC5)))
                .addContainerGap())
        );
        panelCFila5Layout.setVerticalGroup(
            panelCFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCFila5Layout.createSequentialGroup()
                .addGroup(panelCFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCFila5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoC5))
                    .addGroup(panelCFila5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioC5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteC5)
                            .addComponent(lblEquipoLocalC5)
                            .addComponent(golesField1_C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionC5))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorC5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorC.add(panelCFila5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 730, 90));

        lblFechaPartidoC6.setText("FechaPartido");

        lblEquipoLocalC6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalC6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalC6.setText("Equipo Local");

        lblEquipoVisitanteC6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteC6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteC6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteC6.setText("Equipo Visitante");
        lblEquipoVisitanteC6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioC6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioC6.setText("NombreEstadio");

        golesField1_C6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_C6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionC6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionC6.setText("-");

        javax.swing.GroupLayout panelCFila6Layout = new javax.swing.GroupLayout(panelCFila6);
        panelCFila6.setLayout(panelCFila6Layout);
        panelCFila6Layout.setHorizontalGroup(
            panelCFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCFila6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorC6)
                    .addGroup(panelCFila6Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoC6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioC6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCFila6Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalC6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_C6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionC6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_C6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteC6)))
                .addContainerGap())
        );
        panelCFila6Layout.setVerticalGroup(
            panelCFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCFila6Layout.createSequentialGroup()
                .addGroup(panelCFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCFila6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoC6))
                    .addGroup(panelCFila6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioC6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteC6)
                            .addComponent(lblEquipoLocalC6)
                            .addComponent(golesField1_C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionC6))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorC6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorC.add(panelCFila6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 730, 90));

        jScrollPaneC.setViewportView(panelInteriorC);

        panelGrupoC.add(jScrollPaneC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 770, 420));

        guardarBtnC.setText("Guardar");
        guardarBtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnCActionPerformed(evt);
            }
        });
        panelGrupoC.add(guardarBtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, -1, -1));

        btnVerTablaDePoscionesC.setText("Ver tabla de posiciones");
        btnVerTablaDePoscionesC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTablaDePoscionesCActionPerformed(evt);
            }
        });
        panelGrupoC.add(btnVerTablaDePoscionesC, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, -1, -1));

        tabbedPane.addTab("C", panelGrupoC);

        panelGrupoD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInteriorD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFechaPartidoD1.setText("FechaPartido");

        lblEquipoLocalD1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalD1.setText("Equipo Local");

        lblEquipoVisitanteD1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteD1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteD1.setText("Equipo Visitante");
        lblEquipoVisitanteD1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioD1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioD1.setText("NombreEstadio");

        golesField1_D1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_D1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionD1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionD1.setText("-");

        javax.swing.GroupLayout panelDFila1Layout = new javax.swing.GroupLayout(panelDFila1);
        panelDFila1.setLayout(panelDFila1Layout);
        panelDFila1Layout.setHorizontalGroup(
            panelDFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDFila1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorD1)
                    .addGroup(panelDFila1Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoD1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioD1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDFila1Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalD1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_D1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_D1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteD1)))
                .addContainerGap())
        );
        panelDFila1Layout.setVerticalGroup(
            panelDFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDFila1Layout.createSequentialGroup()
                .addGroup(panelDFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDFila1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoD1))
                    .addGroup(panelDFila1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioD1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteD1)
                            .addComponent(lblEquipoLocalD1)
                            .addComponent(golesField1_D1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_D1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionD1))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorD.add(panelDFila1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 730, 90));

        lblFechaPartidoD2.setText("FechaPartido");

        lblEquipoLocalD2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalD2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalD2.setText("Equipo Local");

        lblEquipoVisitanteD2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteD2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteD2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteD2.setText("Equipo Visitante");
        lblEquipoVisitanteD2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioD2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioD2.setText("NombreEstadio");

        golesField1_D2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_D2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionD2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionD2.setText("-");

        javax.swing.GroupLayout panelDFila2Layout = new javax.swing.GroupLayout(panelDFila2);
        panelDFila2.setLayout(panelDFila2Layout);
        panelDFila2Layout.setHorizontalGroup(
            panelDFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDFila2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorD2)
                    .addGroup(panelDFila2Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoD2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioD2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDFila2Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalD2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_D2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionD2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_D2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteD2)))
                .addContainerGap())
        );
        panelDFila2Layout.setVerticalGroup(
            panelDFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDFila2Layout.createSequentialGroup()
                .addGroup(panelDFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDFila2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoD2))
                    .addGroup(panelDFila2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioD2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteD2)
                            .addComponent(lblEquipoLocalD2)
                            .addComponent(golesField1_D2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_D2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionD2))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorD.add(panelDFila2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 730, 90));

        lblFechaPartidoD3.setText("FechaPartido");

        lblEquipoLocalD3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalD3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalD3.setText("Equipo Local");

        lblEquipoVisitanteD3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteD3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteD3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteD3.setText("Equipo Visitante");
        lblEquipoVisitanteD3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioD3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioD3.setText("NombreEstadio");

        golesField1_D3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_D3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionD3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionD3.setText("-");

        javax.swing.GroupLayout panelDFila3Layout = new javax.swing.GroupLayout(panelDFila3);
        panelDFila3.setLayout(panelDFila3Layout);
        panelDFila3Layout.setHorizontalGroup(
            panelDFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDFila3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorD3)
                    .addGroup(panelDFila3Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoD3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioD3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDFila3Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalD3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_D3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionD3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_D3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteD3)))
                .addContainerGap())
        );
        panelDFila3Layout.setVerticalGroup(
            panelDFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDFila3Layout.createSequentialGroup()
                .addGroup(panelDFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDFila3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoD3))
                    .addGroup(panelDFila3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioD3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteD3)
                            .addComponent(lblEquipoLocalD3)
                            .addComponent(golesField1_D3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_D3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionD3))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorD.add(panelDFila3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 730, 90));

        lblFechaPartidoD4.setText("FechaPartido");

        lblEquipoLocalD4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalD4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalD4.setText("Equipo Local");

        lblEquipoVisitanteD4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteD4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteD4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteD4.setText("Equipo Visitante");
        lblEquipoVisitanteD4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioD4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioD4.setText("NombreEstadio");

        golesField1_D4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_D4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionD4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionD4.setText("-");

        javax.swing.GroupLayout panelDFila4Layout = new javax.swing.GroupLayout(panelDFila4);
        panelDFila4.setLayout(panelDFila4Layout);
        panelDFila4Layout.setHorizontalGroup(
            panelDFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDFila4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorD4)
                    .addGroup(panelDFila4Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoD4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioD4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDFila4Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalD4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_D4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionD4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_D4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteD4)))
                .addContainerGap())
        );
        panelDFila4Layout.setVerticalGroup(
            panelDFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDFila4Layout.createSequentialGroup()
                .addGroup(panelDFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDFila4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoD4))
                    .addGroup(panelDFila4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioD4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteD4)
                            .addComponent(lblEquipoLocalD4)
                            .addComponent(golesField1_D4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_D4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionD4))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorD4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorD.add(panelDFila4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 730, 90));

        lblFechaPartidoD5.setText("FechaPartido");

        lblEquipoLocalD5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalD5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalD5.setText("Equipo Local");

        lblEquipoVisitanteD5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteD5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteD5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteD5.setText("Equipo Visitante");
        lblEquipoVisitanteD5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioD5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioD5.setText("NombreEstadio");

        golesField1_D5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_D5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionD5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionD5.setText("-");

        javax.swing.GroupLayout panelDFila5Layout = new javax.swing.GroupLayout(panelDFila5);
        panelDFila5.setLayout(panelDFila5Layout);
        panelDFila5Layout.setHorizontalGroup(
            panelDFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDFila5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorD5)
                    .addGroup(panelDFila5Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoD5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioD5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDFila5Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalD5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_D5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionD5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_D5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteD5)))
                .addContainerGap())
        );
        panelDFila5Layout.setVerticalGroup(
            panelDFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDFila5Layout.createSequentialGroup()
                .addGroup(panelDFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDFila5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoD5))
                    .addGroup(panelDFila5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioD5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteD5)
                            .addComponent(lblEquipoLocalD5)
                            .addComponent(golesField1_D5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_D5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionD5))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorD5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorD.add(panelDFila5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 730, 90));

        lblFechaPartidoD6.setText("FechaPartido");

        lblEquipoLocalD6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalD6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalD6.setText("Equipo Local");

        lblEquipoVisitanteD6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteD6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteD6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteD6.setText("Equipo Visitante");
        lblEquipoVisitanteD6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioD6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioD6.setText("NombreEstadio");

        golesField1_D6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_D6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionD6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionD6.setText("-");

        javax.swing.GroupLayout panelDFila6Layout = new javax.swing.GroupLayout(panelDFila6);
        panelDFila6.setLayout(panelDFila6Layout);
        panelDFila6Layout.setHorizontalGroup(
            panelDFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDFila6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorD6)
                    .addGroup(panelDFila6Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoD6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioD6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDFila6Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalD6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_D6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionD6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_D6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteD6)))
                .addContainerGap())
        );
        panelDFila6Layout.setVerticalGroup(
            panelDFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDFila6Layout.createSequentialGroup()
                .addGroup(panelDFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDFila6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoD6))
                    .addGroup(panelDFila6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioD6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteD6)
                            .addComponent(lblEquipoLocalD6)
                            .addComponent(golesField1_D6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_D6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionD6))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorD6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorD.add(panelDFila6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 730, 90));

        jScrollPaneD.setViewportView(panelInteriorD);

        panelGrupoD.add(jScrollPaneD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 770, 420));

        guardarBtnD.setText("Guardar");
        guardarBtnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnDActionPerformed(evt);
            }
        });
        panelGrupoD.add(guardarBtnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, -1, -1));

        btnVerTablaDePoscionesD.setText("Ver tabla de posiciones");
        btnVerTablaDePoscionesD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTablaDePoscionesDActionPerformed(evt);
            }
        });
        panelGrupoD.add(btnVerTablaDePoscionesD, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, -1, -1));

        tabbedPane.addTab("D", panelGrupoD);

        panelGrupoE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInteriorE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFechaPartidoE1.setText("FechaPartido");

        lblEquipoLocalE1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalE1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalE1.setText("Equipo Local");

        lblEquipoVisitanteE1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteE1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteE1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteE1.setText("Equipo Visitante");
        lblEquipoVisitanteE1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioE1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioE1.setText("NombreEstadio");

        golesField1_E1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_E1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionE1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionE1.setText("-");

        javax.swing.GroupLayout panelEFila1Layout = new javax.swing.GroupLayout(panelEFila1);
        panelEFila1.setLayout(panelEFila1Layout);
        panelEFila1Layout.setHorizontalGroup(
            panelEFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEFila1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorE1)
                    .addGroup(panelEFila1Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoE1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioE1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEFila1Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalE1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_E1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_E1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteE1)))
                .addContainerGap())
        );
        panelEFila1Layout.setVerticalGroup(
            panelEFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEFila1Layout.createSequentialGroup()
                .addGroup(panelEFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEFila1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoE1))
                    .addGroup(panelEFila1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioE1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteE1)
                            .addComponent(lblEquipoLocalE1)
                            .addComponent(golesField1_E1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_E1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionE1))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorE.add(panelEFila1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 730, 90));

        lblFechaPartidoE2.setText("FechaPartido");

        lblEquipoLocalE2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalE2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalE2.setText("Equipo Local");

        lblEquipoVisitanteE2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteE2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteE2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteE2.setText("Equipo Visitante");
        lblEquipoVisitanteE2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioE2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioE2.setText("NombreEstadio");

        golesField1_E2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_E2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionE2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionE2.setText("-");

        javax.swing.GroupLayout panelEFila2Layout = new javax.swing.GroupLayout(panelEFila2);
        panelEFila2.setLayout(panelEFila2Layout);
        panelEFila2Layout.setHorizontalGroup(
            panelEFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEFila2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorE2)
                    .addGroup(panelEFila2Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoE2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioE2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEFila2Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalE2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_E2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionE2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_E2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteE2)))
                .addContainerGap())
        );
        panelEFila2Layout.setVerticalGroup(
            panelEFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEFila2Layout.createSequentialGroup()
                .addGroup(panelEFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEFila2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoE2))
                    .addGroup(panelEFila2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioE2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteE2)
                            .addComponent(lblEquipoLocalE2)
                            .addComponent(golesField1_E2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_E2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionE2))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorE.add(panelEFila2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 730, 90));

        lblFechaPartidoE3.setText("FechaPartido");

        lblEquipoLocalE3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalE3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalE3.setText("Equipo Local");

        lblEquipoVisitanteE3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteE3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteE3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteE3.setText("Equipo Visitante");
        lblEquipoVisitanteE3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioE3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioE3.setText("NombreEstadio");

        golesField1_E3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_E3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionE3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionE3.setText("-");

        javax.swing.GroupLayout panelEFila3Layout = new javax.swing.GroupLayout(panelEFila3);
        panelEFila3.setLayout(panelEFila3Layout);
        panelEFila3Layout.setHorizontalGroup(
            panelEFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEFila3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorE3)
                    .addGroup(panelEFila3Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoE3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioE3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEFila3Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalE3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_E3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionE3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_E3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteE3)))
                .addContainerGap())
        );
        panelEFila3Layout.setVerticalGroup(
            panelEFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEFila3Layout.createSequentialGroup()
                .addGroup(panelEFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEFila3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoE3))
                    .addGroup(panelEFila3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioE3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteE3)
                            .addComponent(lblEquipoLocalE3)
                            .addComponent(golesField1_E3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_E3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionE3))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorE3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorE.add(panelEFila3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 730, 90));

        lblFechaPartidoE4.setText("FechaPartido");

        lblEquipoLocalE4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalE4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalE4.setText("Equipo Local");

        lblEquipoVisitanteE4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteE4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteE4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteE4.setText("Equipo Visitante");
        lblEquipoVisitanteE4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioE4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioE4.setText("NombreEstadio");

        golesField1_E4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_E4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionE4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionE4.setText("-");

        javax.swing.GroupLayout panelEFila4Layout = new javax.swing.GroupLayout(panelEFila4);
        panelEFila4.setLayout(panelEFila4Layout);
        panelEFila4Layout.setHorizontalGroup(
            panelEFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEFila4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorE4)
                    .addGroup(panelEFila4Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoE4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioE4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEFila4Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalE4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_E4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionE4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_E4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteE4)))
                .addContainerGap())
        );
        panelEFila4Layout.setVerticalGroup(
            panelEFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEFila4Layout.createSequentialGroup()
                .addGroup(panelEFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEFila4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoE4))
                    .addGroup(panelEFila4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioE4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteE4)
                            .addComponent(lblEquipoLocalE4)
                            .addComponent(golesField1_E4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_E4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionE4))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorE4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorE.add(panelEFila4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 730, 90));

        lblFechaPartidoE5.setText("FechaPartido");

        lblEquipoLocalE5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalE5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalE5.setText("Equipo Local");

        lblEquipoVisitanteE5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteE5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteE5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteE5.setText("Equipo Visitante");
        lblEquipoVisitanteE5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioE5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioE5.setText("NombreEstadio");

        golesField1_E5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_E5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionE5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionE5.setText("-");

        javax.swing.GroupLayout panelEFila5Layout = new javax.swing.GroupLayout(panelEFila5);
        panelEFila5.setLayout(panelEFila5Layout);
        panelEFila5Layout.setHorizontalGroup(
            panelEFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEFila5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorE5)
                    .addGroup(panelEFila5Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoE5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioE5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEFila5Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalE5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_E5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionE5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_E5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteE5)))
                .addContainerGap())
        );
        panelEFila5Layout.setVerticalGroup(
            panelEFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEFila5Layout.createSequentialGroup()
                .addGroup(panelEFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEFila5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoE5))
                    .addGroup(panelEFila5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioE5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteE5)
                            .addComponent(lblEquipoLocalE5)
                            .addComponent(golesField1_E5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_E5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionE5))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorE5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorE.add(panelEFila5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 730, 90));

        lblFechaPartidoE6.setText("FechaPartido");

        lblEquipoLocalE6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalE6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalE6.setText("Equipo Local");

        lblEquipoVisitanteE6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteE6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteE6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteE6.setText("Equipo Visitante");
        lblEquipoVisitanteE6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioE6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioE6.setText("NombreEstadio");

        golesField1_E6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_E6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionE6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionE6.setText("-");

        javax.swing.GroupLayout panelEFila6Layout = new javax.swing.GroupLayout(panelEFila6);
        panelEFila6.setLayout(panelEFila6Layout);
        panelEFila6Layout.setHorizontalGroup(
            panelEFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEFila6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorE6)
                    .addGroup(panelEFila6Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoE6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioE6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEFila6Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalE6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_E6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionE6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_E6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteE6)))
                .addContainerGap())
        );
        panelEFila6Layout.setVerticalGroup(
            panelEFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEFila6Layout.createSequentialGroup()
                .addGroup(panelEFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEFila6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoE6))
                    .addGroup(panelEFila6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioE6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteE6)
                            .addComponent(lblEquipoLocalE6)
                            .addComponent(golesField1_E6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_E6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionE6))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorE6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorE.add(panelEFila6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 730, 90));

        jScrollPaneE.setViewportView(panelInteriorE);

        panelGrupoE.add(jScrollPaneE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 770, 420));

        guardarBtnE.setText("Guardar");
        guardarBtnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnEActionPerformed(evt);
            }
        });
        panelGrupoE.add(guardarBtnE, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, -1, -1));

        btnVerTablaDePoscionesE.setText("Ver tabla de posiciones");
        btnVerTablaDePoscionesE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTablaDePoscionesEActionPerformed(evt);
            }
        });
        panelGrupoE.add(btnVerTablaDePoscionesE, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, -1, -1));

        tabbedPane.addTab("E", panelGrupoE);

        panelGrupoF.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInteriorF.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFechaPartidoF1.setText("FechaPartido");

        lblEquipoLocalF1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalF1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalF1.setText("Equipo Local");

        lblEquipoVisitanteF1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteF1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteF1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteF1.setText("Equipo Visitante");
        lblEquipoVisitanteF1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioF1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioF1.setText("NombreEstadio");

        golesField1_F1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_F1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionF1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionF1.setText("-");

        javax.swing.GroupLayout panelFFila1Layout = new javax.swing.GroupLayout(panelFFila1);
        panelFFila1.setLayout(panelFFila1Layout);
        panelFFila1Layout.setHorizontalGroup(
            panelFFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFFila1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorF1)
                    .addGroup(panelFFila1Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoF1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioF1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFFila1Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalF1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_F1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionF1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_F1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteF1)))
                .addContainerGap())
        );
        panelFFila1Layout.setVerticalGroup(
            panelFFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFFila1Layout.createSequentialGroup()
                .addGroup(panelFFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFFila1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoF1))
                    .addGroup(panelFFila1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioF1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteF1)
                            .addComponent(lblEquipoLocalF1)
                            .addComponent(golesField1_F1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_F1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionF1))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorF.add(panelFFila1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 730, 90));

        lblFechaPartidoF2.setText("FechaPartido");

        lblEquipoLocalF2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalF2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalF2.setText("Equipo Local");

        lblEquipoVisitanteF2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteF2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteF2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteF2.setText("Equipo Visitante");
        lblEquipoVisitanteF2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioF2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioF2.setText("NombreEstadio");

        golesField1_F2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_F2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionF2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionF2.setText("-");

        javax.swing.GroupLayout panelFFila2Layout = new javax.swing.GroupLayout(panelFFila2);
        panelFFila2.setLayout(panelFFila2Layout);
        panelFFila2Layout.setHorizontalGroup(
            panelFFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFFila2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorF2)
                    .addGroup(panelFFila2Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoF2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioF2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFFila2Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalF2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_F2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionF2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_F2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteF2)))
                .addContainerGap())
        );
        panelFFila2Layout.setVerticalGroup(
            panelFFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFFila2Layout.createSequentialGroup()
                .addGroup(panelFFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFFila2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoF2))
                    .addGroup(panelFFila2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioF2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteF2)
                            .addComponent(lblEquipoLocalF2)
                            .addComponent(golesField1_F2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_F2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionF2))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorF.add(panelFFila2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 730, 90));

        lblFechaPartidoF3.setText("FechaPartido");

        lblEquipoLocalF3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalF3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalF3.setText("Equipo Local");

        lblEquipoVisitanteF3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteF3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteF3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteF3.setText("Equipo Visitante");
        lblEquipoVisitanteF3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioF3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioF3.setText("NombreEstadio");

        golesField1_F3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_F3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionF3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionF3.setText("-");

        javax.swing.GroupLayout panelFFila3Layout = new javax.swing.GroupLayout(panelFFila3);
        panelFFila3.setLayout(panelFFila3Layout);
        panelFFila3Layout.setHorizontalGroup(
            panelFFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFFila3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorF3)
                    .addGroup(panelFFila3Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoF3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioF3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFFila3Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalF3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_F3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionF3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_F3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteF3)))
                .addContainerGap())
        );
        panelFFila3Layout.setVerticalGroup(
            panelFFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFFila3Layout.createSequentialGroup()
                .addGroup(panelFFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFFila3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoF3))
                    .addGroup(panelFFila3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioF3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteF3)
                            .addComponent(lblEquipoLocalF3)
                            .addComponent(golesField1_F3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_F3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionF3))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorF.add(panelFFila3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 730, 90));

        lblFechaPartidoF4.setText("FechaPartido");

        lblEquipoLocalF4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalF4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalF4.setText("Equipo Local");

        lblEquipoVisitanteF4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteF4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteF4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteF4.setText("Equipo Visitante");
        lblEquipoVisitanteF4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioF4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioF4.setText("NombreEstadio");

        golesField1_F4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_F4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionF4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionF4.setText("-");

        javax.swing.GroupLayout panelFFila4Layout = new javax.swing.GroupLayout(panelFFila4);
        panelFFila4.setLayout(panelFFila4Layout);
        panelFFila4Layout.setHorizontalGroup(
            panelFFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFFila4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorF4)
                    .addGroup(panelFFila4Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoF4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioF4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFFila4Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalF4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_F4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionF4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_F4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteF4)))
                .addContainerGap())
        );
        panelFFila4Layout.setVerticalGroup(
            panelFFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFFila4Layout.createSequentialGroup()
                .addGroup(panelFFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFFila4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoF4))
                    .addGroup(panelFFila4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioF4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteF4)
                            .addComponent(lblEquipoLocalF4)
                            .addComponent(golesField1_F4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_F4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionF4))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorF.add(panelFFila4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 730, 90));

        lblFechaPartidoF5.setText("FechaPartido");

        lblEquipoLocalF5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalF5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalF5.setText("Equipo Local");

        lblEquipoVisitanteF5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteF5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteF5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteF5.setText("Equipo Visitante");
        lblEquipoVisitanteF5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioF5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioF5.setText("NombreEstadio");

        golesField1_F5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_F5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionF5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionF5.setText("-");

        javax.swing.GroupLayout panelFFila5Layout = new javax.swing.GroupLayout(panelFFila5);
        panelFFila5.setLayout(panelFFila5Layout);
        panelFFila5Layout.setHorizontalGroup(
            panelFFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFFila5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorF5)
                    .addGroup(panelFFila5Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoF5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioF5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFFila5Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalF5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_F5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionF5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_F5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteF5)))
                .addContainerGap())
        );
        panelFFila5Layout.setVerticalGroup(
            panelFFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFFila5Layout.createSequentialGroup()
                .addGroup(panelFFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFFila5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoF5))
                    .addGroup(panelFFila5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioF5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteF5)
                            .addComponent(lblEquipoLocalF5)
                            .addComponent(golesField1_F5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_F5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionF5))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorF.add(panelFFila5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 730, 90));

        lblFechaPartidoF6.setText("FechaPartido");

        lblEquipoLocalF6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalF6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalF6.setText("Equipo Local");

        lblEquipoVisitanteF6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteF6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteF6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteF6.setText("Equipo Visitante");
        lblEquipoVisitanteF6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioF6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioF6.setText("NombreEstadio");

        golesField1_F6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_F6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionF6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionF6.setText("-");

        javax.swing.GroupLayout panelFFila6Layout = new javax.swing.GroupLayout(panelFFila6);
        panelFFila6.setLayout(panelFFila6Layout);
        panelFFila6Layout.setHorizontalGroup(
            panelFFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFFila6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorF6)
                    .addGroup(panelFFila6Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoF6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioF6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFFila6Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalF6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_F6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionF6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_F6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteF6)))
                .addContainerGap())
        );
        panelFFila6Layout.setVerticalGroup(
            panelFFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFFila6Layout.createSequentialGroup()
                .addGroup(panelFFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFFila6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoF6))
                    .addGroup(panelFFila6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioF6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteF6)
                            .addComponent(lblEquipoLocalF6)
                            .addComponent(golesField1_F6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_F6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionF6))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorF6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorF.add(panelFFila6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 730, 90));

        jScrollPaneF.setViewportView(panelInteriorF);

        panelGrupoF.add(jScrollPaneF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 770, 420));

        guardarBtnF.setText("Guardar");
        guardarBtnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnFActionPerformed(evt);
            }
        });
        panelGrupoF.add(guardarBtnF, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, -1, -1));

        btnVerTablaDePoscionesF.setText("Ver tabla de posiciones");
        btnVerTablaDePoscionesF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTablaDePoscionesFActionPerformed(evt);
            }
        });
        panelGrupoF.add(btnVerTablaDePoscionesF, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, -1, -1));

        tabbedPane.addTab("F", panelGrupoF);

        panelGrupoG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInteriorG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFechaPartidoG1.setText("FechaPartido");

        lblEquipoLocalG1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalG1.setText("Equipo Local");

        lblEquipoVisitanteG1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteG1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteG1.setText("Equipo Visitante");
        lblEquipoVisitanteG1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioG1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioG1.setText("NombreEstadio");

        golesField1_G1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_G1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionG1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionG1.setText("-");

        javax.swing.GroupLayout panelGFila1Layout = new javax.swing.GroupLayout(panelGFila1);
        panelGFila1.setLayout(panelGFila1Layout);
        panelGFila1Layout.setHorizontalGroup(
            panelGFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGFila1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorG1)
                    .addGroup(panelGFila1Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoG1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioG1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGFila1Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalG1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_G1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionG1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_G1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteG1)))
                .addContainerGap())
        );
        panelGFila1Layout.setVerticalGroup(
            panelGFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGFila1Layout.createSequentialGroup()
                .addGroup(panelGFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGFila1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoG1))
                    .addGroup(panelGFila1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioG1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteG1)
                            .addComponent(lblEquipoLocalG1)
                            .addComponent(golesField1_G1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_G1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionG1))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorG.add(panelGFila1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 720, 90));

        lblFechaPartidoG2.setText("FechaPartido");

        lblEquipoLocalG2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalG2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalG2.setText("Equipo Local");

        lblEquipoVisitanteG2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteG2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteG2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteG2.setText("Equipo Visitante");
        lblEquipoVisitanteG2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioG2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioG2.setText("NombreEstadio");

        golesField1_G2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_G2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionG2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionG2.setText("-");

        javax.swing.GroupLayout panelGFila2Layout = new javax.swing.GroupLayout(panelGFila2);
        panelGFila2.setLayout(panelGFila2Layout);
        panelGFila2Layout.setHorizontalGroup(
            panelGFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGFila2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorG2)
                    .addGroup(panelGFila2Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoG2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioG2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGFila2Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalG2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_G2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionG2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_G2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteG2)))
                .addContainerGap())
        );
        panelGFila2Layout.setVerticalGroup(
            panelGFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGFila2Layout.createSequentialGroup()
                .addGroup(panelGFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGFila2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoG2))
                    .addGroup(panelGFila2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioG2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteG2)
                            .addComponent(lblEquipoLocalG2)
                            .addComponent(golesField1_G2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_G2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionG2))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorG.add(panelGFila2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 720, 90));

        lblFechaPartidoG3.setText("FechaPartido");

        lblEquipoLocalG3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalG3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalG3.setText("Equipo Local");

        lblEquipoVisitanteG3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteG3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteG3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteG3.setText("Equipo Visitante");
        lblEquipoVisitanteG3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioG3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioG3.setText("NombreEstadio");

        golesField1_G3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_G3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionG3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionG3.setText("-");

        javax.swing.GroupLayout panelGFila3Layout = new javax.swing.GroupLayout(panelGFila3);
        panelGFila3.setLayout(panelGFila3Layout);
        panelGFila3Layout.setHorizontalGroup(
            panelGFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGFila3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorG3)
                    .addGroup(panelGFila3Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoG3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioG3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGFila3Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalG3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_G3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionG3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_G3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteG3)))
                .addContainerGap())
        );
        panelGFila3Layout.setVerticalGroup(
            panelGFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGFila3Layout.createSequentialGroup()
                .addGroup(panelGFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGFila3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoG3))
                    .addGroup(panelGFila3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioG3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteG3)
                            .addComponent(lblEquipoLocalG3)
                            .addComponent(golesField1_G3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_G3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionG3))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorG.add(panelGFila3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 720, 90));

        lblFechaPartidoG4.setText("FechaPartido");

        lblEquipoLocalG4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalG4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalG4.setText("Equipo Local");

        lblEquipoVisitanteG4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteG4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteG4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteG4.setText("Equipo Visitante");
        lblEquipoVisitanteG4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioG4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioG4.setText("NombreEstadio");

        golesField1_G4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_G4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionG4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionG4.setText("-");

        javax.swing.GroupLayout panelGFila4Layout = new javax.swing.GroupLayout(panelGFila4);
        panelGFila4.setLayout(panelGFila4Layout);
        panelGFila4Layout.setHorizontalGroup(
            panelGFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGFila4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorG4)
                    .addGroup(panelGFila4Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoG4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioG4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGFila4Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalG4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_G4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionG4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_G4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteG4)))
                .addContainerGap())
        );
        panelGFila4Layout.setVerticalGroup(
            panelGFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGFila4Layout.createSequentialGroup()
                .addGroup(panelGFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGFila4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoG4))
                    .addGroup(panelGFila4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioG4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteG4)
                            .addComponent(lblEquipoLocalG4)
                            .addComponent(golesField1_G4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_G4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionG4))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorG4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorG.add(panelGFila4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 720, 90));

        lblFechaPartidoG5.setText("FechaPartido");

        lblEquipoLocalG5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalG5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalG5.setText("Equipo Local");

        lblEquipoVisitanteG5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteG5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteG5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteG5.setText("Equipo Visitante");
        lblEquipoVisitanteG5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioG5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioG5.setText("NombreEstadio");

        golesField1_G5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_G5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionG5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionG5.setText("-");

        javax.swing.GroupLayout panelGFila5Layout = new javax.swing.GroupLayout(panelGFila5);
        panelGFila5.setLayout(panelGFila5Layout);
        panelGFila5Layout.setHorizontalGroup(
            panelGFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGFila5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorG5)
                    .addGroup(panelGFila5Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoG5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioG5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGFila5Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalG5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_G5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionG5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_G5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteG5)))
                .addContainerGap())
        );
        panelGFila5Layout.setVerticalGroup(
            panelGFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGFila5Layout.createSequentialGroup()
                .addGroup(panelGFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGFila5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoG5))
                    .addGroup(panelGFila5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioG5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteG5)
                            .addComponent(lblEquipoLocalG5)
                            .addComponent(golesField1_G5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_G5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionG5))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorG5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorG.add(panelGFila5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 720, 90));

        lblFechaPartidoG6.setText("FechaPartido");

        lblEquipoLocalG6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalG6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalG6.setText("Equipo Local");

        lblEquipoVisitanteG6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteG6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteG6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteG6.setText("Equipo Visitante");
        lblEquipoVisitanteG6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioG6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioG6.setText("NombreEstadio");

        golesField1_G6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_G6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionG6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionG6.setText("-");

        javax.swing.GroupLayout panelGFila6Layout = new javax.swing.GroupLayout(panelGFila6);
        panelGFila6.setLayout(panelGFila6Layout);
        panelGFila6Layout.setHorizontalGroup(
            panelGFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGFila6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorG6)
                    .addGroup(panelGFila6Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoG6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioG6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGFila6Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalG6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_G6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionG6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_G6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteG6)))
                .addContainerGap())
        );
        panelGFila6Layout.setVerticalGroup(
            panelGFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGFila6Layout.createSequentialGroup()
                .addGroup(panelGFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGFila6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoG6))
                    .addGroup(panelGFila6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioG6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteG6)
                            .addComponent(lblEquipoLocalG6)
                            .addComponent(golesField1_G6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_G6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionG6))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorG6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorG.add(panelGFila6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 720, 90));

        jScrollPaneG.setViewportView(panelInteriorG);

        panelGrupoG.add(jScrollPaneG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 770, 420));

        guardarBtnG.setText("Guardar");
        guardarBtnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnGActionPerformed(evt);
            }
        });
        panelGrupoG.add(guardarBtnG, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, -1, -1));

        btnVerTablaDePoscionesG.setText("Ver tabla de posiciones");
        btnVerTablaDePoscionesG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTablaDePoscionesGActionPerformed(evt);
            }
        });
        panelGrupoG.add(btnVerTablaDePoscionesG, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, -1, -1));

        tabbedPane.addTab("G", panelGrupoG);

        panelGrupoH.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInteriorH.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFechaPartidoH1.setText("FechaPartido");

        lblEquipoLocalH1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalH1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalH1.setText("Equipo Local");

        lblEquipoVisitanteH1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteH1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteH1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteH1.setText("Equipo Visitante");
        lblEquipoVisitanteH1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioH1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioH1.setText("NombreEstadio");

        golesField1_H1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_H1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionH1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionH1.setText("-");

        javax.swing.GroupLayout panelHFila1Layout = new javax.swing.GroupLayout(panelHFila1);
        panelHFila1.setLayout(panelHFila1Layout);
        panelHFila1Layout.setHorizontalGroup(
            panelHFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHFila1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorH1)
                    .addGroup(panelHFila1Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoH1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioH1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHFila1Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalH1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_H1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionH1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_H1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteH1)))
                .addContainerGap())
        );
        panelHFila1Layout.setVerticalGroup(
            panelHFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHFila1Layout.createSequentialGroup()
                .addGroup(panelHFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHFila1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoH1))
                    .addGroup(panelHFila1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioH1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelHFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteH1)
                            .addComponent(lblEquipoLocalH1)
                            .addComponent(golesField1_H1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_H1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionH1))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorH.add(panelHFila1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 720, 90));

        lblFechaPartidoH2.setText("FechaPartido");

        lblEquipoLocalH2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalH2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalH2.setText("Equipo Local");

        lblEquipoVisitanteH2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteH2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteH2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteH2.setText("Equipo Visitante");
        lblEquipoVisitanteH2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioH2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioH2.setText("NombreEstadio");

        golesField1_H2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_H2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionH2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionH2.setText("-");

        javax.swing.GroupLayout panelHFila2Layout = new javax.swing.GroupLayout(panelHFila2);
        panelHFila2.setLayout(panelHFila2Layout);
        panelHFila2Layout.setHorizontalGroup(
            panelHFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHFila2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorH2)
                    .addGroup(panelHFila2Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoH2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioH2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHFila2Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalH2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_H2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionH2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_H2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteH2)))
                .addContainerGap())
        );
        panelHFila2Layout.setVerticalGroup(
            panelHFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHFila2Layout.createSequentialGroup()
                .addGroup(panelHFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHFila2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoH2))
                    .addGroup(panelHFila2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioH2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelHFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteH2)
                            .addComponent(lblEquipoLocalH2)
                            .addComponent(golesField1_H2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_H2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionH2))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorH2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorH.add(panelHFila2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 720, 90));

        lblFechaPartidoH3.setText("FechaPartido");

        lblEquipoLocalH3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalH3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalH3.setText("Equipo Local");

        lblEquipoVisitanteH3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteH3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteH3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteH3.setText("Equipo Visitante");
        lblEquipoVisitanteH3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioH3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioH3.setText("NombreEstadio");

        golesField1_H3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_H3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionAH3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionAH3.setText("-");

        javax.swing.GroupLayout panelHFila3Layout = new javax.swing.GroupLayout(panelHFila3);
        panelHFila3.setLayout(panelHFila3Layout);
        panelHFila3Layout.setHorizontalGroup(
            panelHFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHFila3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorH3)
                    .addGroup(panelHFila3Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoH3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioH3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHFila3Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalH3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_H3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionAH3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_H3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteH3)))
                .addContainerGap())
        );
        panelHFila3Layout.setVerticalGroup(
            panelHFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHFila3Layout.createSequentialGroup()
                .addGroup(panelHFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHFila3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoH3))
                    .addGroup(panelHFila3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioH3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelHFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteH3)
                            .addComponent(lblEquipoLocalH3)
                            .addComponent(golesField1_H3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_H3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionAH3))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorH3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorH.add(panelHFila3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 720, 90));

        lblFechaPartidoH4.setText("FechaPartido");

        lblEquipoLocalH4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalH4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalH4.setText("Equipo Local");

        lblEquipoVisitanteH4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteH4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteH4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteH4.setText("Equipo Visitante");
        lblEquipoVisitanteH4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioH4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioH4.setText("NombreEstadio");

        golesField1_H4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_H4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionH4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionH4.setText("-");

        javax.swing.GroupLayout panelHFila4Layout = new javax.swing.GroupLayout(panelHFila4);
        panelHFila4.setLayout(panelHFila4Layout);
        panelHFila4Layout.setHorizontalGroup(
            panelHFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHFila4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorH4)
                    .addGroup(panelHFila4Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoH4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioH4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHFila4Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalH4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_H4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionH4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_H4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteH4)))
                .addContainerGap())
        );
        panelHFila4Layout.setVerticalGroup(
            panelHFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHFila4Layout.createSequentialGroup()
                .addGroup(panelHFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHFila4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoH4))
                    .addGroup(panelHFila4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioH4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelHFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteH4)
                            .addComponent(lblEquipoLocalH4)
                            .addComponent(golesField1_H4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_H4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionH4))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorH4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorH.add(panelHFila4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 720, 90));

        lblFechaPartidoH5.setText("FechaPartido");

        lblEquipoLocalH5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalH5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalH5.setText("Equipo Local");

        lblEquipoVisitanteH5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteH5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteH5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteH5.setText("Equipo Visitante");
        lblEquipoVisitanteH5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioH5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioH5.setText("NombreEstadio");

        golesField1_H5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_H5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionH5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionH5.setText("-");

        javax.swing.GroupLayout panelHFila5Layout = new javax.swing.GroupLayout(panelHFila5);
        panelHFila5.setLayout(panelHFila5Layout);
        panelHFila5Layout.setHorizontalGroup(
            panelHFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHFila5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorH5)
                    .addGroup(panelHFila5Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoH5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioH5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHFila5Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalH5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_H5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionH5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_H5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteH5)))
                .addContainerGap())
        );
        panelHFila5Layout.setVerticalGroup(
            panelHFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHFila5Layout.createSequentialGroup()
                .addGroup(panelHFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHFila5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoH5))
                    .addGroup(panelHFila5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioH5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelHFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteH5)
                            .addComponent(lblEquipoLocalH5)
                            .addComponent(golesField1_H5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_H5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionH5))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorH5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorH.add(panelHFila5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 720, 90));

        lblFechaPartidoH6.setText("FechaPartido");

        lblEquipoLocalH6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalH6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalH6.setText("Equipo Local");

        lblEquipoVisitanteH6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteH6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteH6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteH6.setText("Equipo Visitante");
        lblEquipoVisitanteH6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioH6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioH6.setText("NombreEstadio");

        golesField1_H6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_H6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionH6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionH6.setText("-");

        javax.swing.GroupLayout panelHFila6Layout = new javax.swing.GroupLayout(panelHFila6);
        panelHFila6.setLayout(panelHFila6Layout);
        panelHFila6Layout.setHorizontalGroup(
            panelHFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHFila6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorH6)
                    .addGroup(panelHFila6Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoH6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioH6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHFila6Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalH6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_H6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionH6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_H6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteH6)))
                .addContainerGap())
        );
        panelHFila6Layout.setVerticalGroup(
            panelHFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHFila6Layout.createSequentialGroup()
                .addGroup(panelHFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHFila6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoH6))
                    .addGroup(panelHFila6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioH6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelHFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteH6)
                            .addComponent(lblEquipoLocalH6)
                            .addComponent(golesField1_H6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_H6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionH6))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorH6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorH.add(panelHFila6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 720, 90));

        jScrollPaneH.setViewportView(panelInteriorH);

        panelGrupoH.add(jScrollPaneH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 770, 420));

        guardarBtnH.setText("Guardar");
        guardarBtnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnHActionPerformed(evt);
            }
        });
        panelGrupoH.add(guardarBtnH, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, -1, -1));

        btnVerTablaDePoscionesH.setText("Ver tabla de posiciones");
        btnVerTablaDePoscionesH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTablaDePoscionesHActionPerformed(evt);
            }
        });
        panelGrupoH.add(btnVerTablaDePoscionesH, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, -1, -1));

        tabbedPane.addTab("H", panelGrupoH);

        panelOctavos.setMinimumSize(new java.awt.Dimension(770, 472));
        panelOctavos.setPreferredSize(new java.awt.Dimension(770, 472));
        panelOctavos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPaneOctavos.setPreferredSize(new java.awt.Dimension(742, 562));

        panelInteriorOctavos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFechaPartidoOctavos1.setText("FechaPartido");

        lblEquipoLocalOctavos1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalOctavos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalOctavos1.setText("Equipo Local");

        lblEquipoVisitanteOctavos1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteOctavos1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteOctavos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteOctavos1.setText("Equipo Visitante");
        lblEquipoVisitanteOctavos1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioOctavos1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioOctavos1.setText("NombreEstadio");

        golesField1_Octavos1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_Octavos1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionOctavos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionOctavos1.setText("-");

        label1roA.setText("1ro A");

        label2doB.setText("2do B");

        penalesField1_Octavos1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        penalesField2_Octavos1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout panelOctavosFila1Layout = new javax.swing.GroupLayout(panelOctavosFila1);
        panelOctavosFila1.setLayout(panelOctavosFila1Layout);
        panelOctavosFila1Layout.setHorizontalGroup(
            panelOctavosFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOctavosFila1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOctavosFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorOctavos1)
                    .addGroup(panelOctavosFila1Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoOctavos1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioOctavos1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOctavosFila1Layout.createSequentialGroup()
                        .addComponent(label1roA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEquipoLocalOctavos1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_Octavos1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField1_Octavos1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionOctavos1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField2_Octavos1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_Octavos1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteOctavos1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2doB)
                .addContainerGap())
        );
        panelOctavosFila1Layout.setVerticalGroup(
            panelOctavosFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOctavosFila1Layout.createSequentialGroup()
                .addGroup(panelOctavosFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOctavosFila1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoOctavos1))
                    .addGroup(panelOctavosFila1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioOctavos1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOctavosFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteOctavos1)
                            .addComponent(lblEquipoLocalOctavos1)
                            .addComponent(golesField1_Octavos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_Octavos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionOctavos1)
                            .addComponent(label1roA)
                            .addComponent(label2doB)
                            .addComponent(penalesField1_Octavos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(penalesField2_Octavos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorOctavos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorOctavos.add(panelOctavosFila1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 720, 90));

        lblFechaPartidoOctavos2.setText("FechaPartido");

        lblEquipoLocalOctavos2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalOctavos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalOctavos2.setText("Equipo Local");

        lblEquipoVisitanteOctavos2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteOctavos2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteOctavos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteOctavos2.setText("Equipo Visitante");
        lblEquipoVisitanteOctavos2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioOctavos2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioOctavos2.setText("NombreEstadio");

        golesField1_Octavos2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_Octavos2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionOctavos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionOctavos2.setText("-");

        label1roC.setText("1ro C");

        label2doD.setText("2do D");

        penalesField1_Octavos2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        penalesField2_Octavos2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout panelOctavosFila2Layout = new javax.swing.GroupLayout(panelOctavosFila2);
        panelOctavosFila2.setLayout(panelOctavosFila2Layout);
        panelOctavosFila2Layout.setHorizontalGroup(
            panelOctavosFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOctavosFila2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1roC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOctavosFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorOctavos2)
                    .addGroup(panelOctavosFila2Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoOctavos2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioOctavos2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOctavosFila2Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalOctavos2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_Octavos2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField1_Octavos2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionOctavos2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField2_Octavos2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_Octavos2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteOctavos2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2doD)
                .addContainerGap())
        );
        panelOctavosFila2Layout.setVerticalGroup(
            panelOctavosFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOctavosFila2Layout.createSequentialGroup()
                .addGroup(panelOctavosFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOctavosFila2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoOctavos2))
                    .addGroup(panelOctavosFila2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioOctavos2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOctavosFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteOctavos2)
                            .addComponent(lblEquipoLocalOctavos2)
                            .addComponent(golesField1_Octavos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_Octavos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionOctavos2)
                            .addComponent(label1roC)
                            .addComponent(label2doD)
                            .addComponent(penalesField1_Octavos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(penalesField2_Octavos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorOctavos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorOctavos.add(panelOctavosFila2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 720, 90));

        lblFechaPartidoOctavos3.setText("FechaPartido");

        lblEquipoLocalOctavos3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalOctavos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalOctavos3.setText("Equipo Local");

        lblEquipoVisitanteOctavos3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteOctavos3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteOctavos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteOctavos3.setText("Equipo Visitante");
        lblEquipoVisitanteOctavos3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioOctavos3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioOctavos3.setText("NombreEstadio");

        golesField1_Octavos3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_Octavos3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionOctavos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionOctavos3.setText("-");

        label1roB.setText("1ro B");

        label2doA.setText("2do A");

        penalesField1_Octavos3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        penalesField2_Octavos3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout panelOctavosFila3Layout = new javax.swing.GroupLayout(panelOctavosFila3);
        panelOctavosFila3.setLayout(panelOctavosFila3Layout);
        panelOctavosFila3Layout.setHorizontalGroup(
            panelOctavosFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOctavosFila3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOctavosFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorOctavos3)
                    .addGroup(panelOctavosFila3Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoOctavos3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioOctavos3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOctavosFila3Layout.createSequentialGroup()
                        .addComponent(label1roB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEquipoLocalOctavos3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_Octavos3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField1_Octavos3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionOctavos3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField2_Octavos3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_Octavos3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteOctavos3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2doA)))
                .addContainerGap())
        );
        panelOctavosFila3Layout.setVerticalGroup(
            panelOctavosFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOctavosFila3Layout.createSequentialGroup()
                .addGroup(panelOctavosFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOctavosFila3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoOctavos3))
                    .addGroup(panelOctavosFila3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioOctavos3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOctavosFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteOctavos3)
                            .addComponent(lblEquipoLocalOctavos3)
                            .addComponent(golesField1_Octavos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_Octavos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionOctavos3)
                            .addComponent(label1roB)
                            .addComponent(label2doA)
                            .addComponent(penalesField1_Octavos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(penalesField2_Octavos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorOctavos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorOctavos.add(panelOctavosFila3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 720, 90));

        lblFechaPartidoOctavos4.setText("FechaPartido");

        lblEquipoLocalOctavos4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalOctavos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalOctavos4.setText("Equipo Local");

        lblEquipoVisitanteOctavos4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteOctavos4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteOctavos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteOctavos4.setText("Equipo Visitante");
        lblEquipoVisitanteOctavos4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioOctavos4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioOctavos4.setText("NombreEstadio");

        golesField1_Octavos4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_Octavos4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionOctavos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionOctavos4.setText("-");

        label1roD.setText("1ro D");

        label2doC.setText("2do C");

        penalesField1_Octavos4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        penalesField2_Octavos4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout panelOctavosFila4Layout = new javax.swing.GroupLayout(panelOctavosFila4);
        panelOctavosFila4.setLayout(panelOctavosFila4Layout);
        panelOctavosFila4Layout.setHorizontalGroup(
            panelOctavosFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOctavosFila4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOctavosFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorOctavos4)
                    .addGroup(panelOctavosFila4Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoOctavos4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioOctavos4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOctavosFila4Layout.createSequentialGroup()
                        .addComponent(label1roD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEquipoLocalOctavos4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_Octavos4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField1_Octavos4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionOctavos4, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField2_Octavos4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_Octavos4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteOctavos4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2doC)))
                .addContainerGap())
        );
        panelOctavosFila4Layout.setVerticalGroup(
            panelOctavosFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOctavosFila4Layout.createSequentialGroup()
                .addGroup(panelOctavosFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOctavosFila4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoOctavos4))
                    .addGroup(panelOctavosFila4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioOctavos4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOctavosFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteOctavos4)
                            .addComponent(lblEquipoLocalOctavos4)
                            .addComponent(golesField1_Octavos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_Octavos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionOctavos4)
                            .addComponent(label1roD)
                            .addComponent(label2doC)
                            .addComponent(penalesField1_Octavos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(penalesField2_Octavos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorOctavos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorOctavos.add(panelOctavosFila4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 720, 90));

        lblFechaPartidoOctavos5.setText("FechaPartido");

        lblEquipoLocalOctavos5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalOctavos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalOctavos5.setText("Equipo Local");

        lblEquipoVisitanteOctavos5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteOctavos5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteOctavos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteOctavos5.setText("Equipo Visitante");
        lblEquipoVisitanteOctavos5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioOctavos5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioOctavos5.setText("NombreEstadio");

        golesField1_Octavos5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_Octavos5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionOctavos5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionOctavos5.setText("-");

        label1roE.setText("1ro E");

        label2doF.setText("2do F");

        penalesField1_Octavos5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        penalesField2_Octavos5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout panelOctavosFila5Layout = new javax.swing.GroupLayout(panelOctavosFila5);
        panelOctavosFila5.setLayout(panelOctavosFila5Layout);
        panelOctavosFila5Layout.setHorizontalGroup(
            panelOctavosFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOctavosFila5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOctavosFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorOctavos5)
                    .addGroup(panelOctavosFila5Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoOctavos5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioOctavos5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOctavosFila5Layout.createSequentialGroup()
                        .addComponent(label1roE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEquipoLocalOctavos5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_Octavos5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField1_Octavos5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionOctavos5, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField2_Octavos5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_Octavos5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteOctavos5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2doF)))
                .addContainerGap())
        );
        panelOctavosFila5Layout.setVerticalGroup(
            panelOctavosFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOctavosFila5Layout.createSequentialGroup()
                .addGroup(panelOctavosFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOctavosFila5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoOctavos5))
                    .addGroup(panelOctavosFila5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioOctavos5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOctavosFila5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteOctavos5)
                            .addComponent(lblEquipoLocalOctavos5)
                            .addComponent(golesField1_Octavos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_Octavos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionOctavos5)
                            .addComponent(label1roE)
                            .addComponent(label2doF)
                            .addComponent(penalesField1_Octavos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(penalesField2_Octavos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorOctavos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorOctavos.add(panelOctavosFila5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 720, 90));

        lblFechaPartidoOctavos6.setText("FechaPartido");

        lblEquipoLocalOctavos6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalOctavos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalOctavos6.setText("Equipo Local");

        lblEquipoVisitanteOctavos6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteOctavos6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteOctavos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteOctavos6.setText("Equipo Visitante");
        lblEquipoVisitanteOctavos6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioOctavos6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioOctavos6.setText("NombreEstadio");

        golesField1_Octavos6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_Octavos6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionOctavos6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionOctavos6.setText("-");

        label1roG.setText("1ro G");

        label2doH.setText("2do H");

        penalesField1_Octavos6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        penalesField2_Octavos6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout panelOctavosFila6Layout = new javax.swing.GroupLayout(panelOctavosFila6);
        panelOctavosFila6.setLayout(panelOctavosFila6Layout);
        panelOctavosFila6Layout.setHorizontalGroup(
            panelOctavosFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOctavosFila6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOctavosFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorOctavos6)
                    .addGroup(panelOctavosFila6Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoOctavos6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioOctavos6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOctavosFila6Layout.createSequentialGroup()
                        .addComponent(label1roG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEquipoLocalOctavos6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_Octavos6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField1_Octavos6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionOctavos6, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField2_Octavos6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_Octavos6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteOctavos6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2doH)))
                .addContainerGap())
        );
        panelOctavosFila6Layout.setVerticalGroup(
            panelOctavosFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOctavosFila6Layout.createSequentialGroup()
                .addGroup(panelOctavosFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOctavosFila6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoOctavos6))
                    .addGroup(panelOctavosFila6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioOctavos6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOctavosFila6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteOctavos6)
                            .addComponent(lblEquipoLocalOctavos6)
                            .addComponent(golesField1_Octavos6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_Octavos6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionOctavos6)
                            .addComponent(label1roG)
                            .addComponent(label2doH)
                            .addComponent(penalesField1_Octavos6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(penalesField2_Octavos6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorOctavos6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorOctavos.add(panelOctavosFila6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 720, 90));

        lblFechaPartidoOctavos7.setText("FechaPartido");

        lblEquipoLocalOctavos7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalOctavos7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalOctavos7.setText("Equipo Local");

        lblEquipoVisitanteOctavos7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteOctavos7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteOctavos7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteOctavos7.setText("Equipo Visitante");
        lblEquipoVisitanteOctavos7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioOctavos7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioOctavos7.setText("NombreEstadio");

        golesField1_Octavos7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_Octavos7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionOctavos7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionOctavos7.setText("-");

        label1roF.setText("1ro F");

        label2doE.setText("2do E");

        penalesField1_Octavos7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        penalesField12_Octavos7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout panelOctavosFila7Layout = new javax.swing.GroupLayout(panelOctavosFila7);
        panelOctavosFila7.setLayout(panelOctavosFila7Layout);
        panelOctavosFila7Layout.setHorizontalGroup(
            panelOctavosFila7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOctavosFila7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOctavosFila7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorOctavos7)
                    .addGroup(panelOctavosFila7Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoOctavos7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioOctavos7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOctavosFila7Layout.createSequentialGroup()
                        .addComponent(label1roF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEquipoLocalOctavos7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_Octavos7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField1_Octavos7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionOctavos7, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField12_Octavos7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_Octavos7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteOctavos7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2doE)))
                .addContainerGap())
        );
        panelOctavosFila7Layout.setVerticalGroup(
            panelOctavosFila7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOctavosFila7Layout.createSequentialGroup()
                .addGroup(panelOctavosFila7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOctavosFila7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoOctavos7))
                    .addGroup(panelOctavosFila7Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioOctavos7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOctavosFila7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteOctavos7)
                            .addComponent(lblEquipoLocalOctavos7)
                            .addComponent(golesField1_Octavos7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_Octavos7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionOctavos7)
                            .addComponent(label1roF)
                            .addComponent(label2doE)
                            .addComponent(penalesField1_Octavos7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(penalesField12_Octavos7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorOctavos7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorOctavos.add(panelOctavosFila7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 720, 90));

        lblFechaPartidoOctavos8.setText("FechaPartido");

        lblEquipoLocalOctavos8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalOctavos8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalOctavos8.setText("Equipo Local");

        lblEquipoVisitanteOctavos8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteOctavos8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteOctavos8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteOctavos8.setText("Equipo Visitante");
        lblEquipoVisitanteOctavos8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioOctavos8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioOctavos8.setText("NombreEstadio");

        golesField1_Octavos8.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_Octavos8.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionOctavos8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionOctavos8.setText("-");

        label1roH.setText("1ro H");

        label2doG.setText("2do G");

        penalesField1_Octavos8.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        penalesField2_Octavos8.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout panelOctavosFila8Layout = new javax.swing.GroupLayout(panelOctavosFila8);
        panelOctavosFila8.setLayout(panelOctavosFila8Layout);
        panelOctavosFila8Layout.setHorizontalGroup(
            panelOctavosFila8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOctavosFila8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOctavosFila8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorOctavos8)
                    .addGroup(panelOctavosFila8Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoOctavos8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioOctavos8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOctavosFila8Layout.createSequentialGroup()
                        .addComponent(label1roH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEquipoLocalOctavos8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_Octavos8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField1_Octavos8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionOctavos8, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField2_Octavos8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_Octavos8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteOctavos8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2doG)))
                .addContainerGap())
        );
        panelOctavosFila8Layout.setVerticalGroup(
            panelOctavosFila8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOctavosFila8Layout.createSequentialGroup()
                .addGroup(panelOctavosFila8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOctavosFila8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoOctavos8))
                    .addGroup(panelOctavosFila8Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioOctavos8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOctavosFila8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteOctavos8)
                            .addComponent(lblEquipoLocalOctavos8)
                            .addComponent(golesField1_Octavos8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_Octavos8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionOctavos8)
                            .addComponent(label1roH)
                            .addComponent(label2doG)
                            .addComponent(penalesField1_Octavos8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(penalesField2_Octavos8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorOctavos8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorOctavos.add(panelOctavosFila8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 720, 90));

        jScrollPaneOctavos.setViewportView(panelInteriorOctavos);

        panelOctavos.add(jScrollPaneOctavos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 770, 420));

        guardarBtnOctavos.setText("Guardar");
        guardarBtnOctavos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnOctavosActionPerformed(evt);
            }
        });
        panelOctavos.add(guardarBtnOctavos, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, -1, -1));

        tabbedPane.addTab("OCTAVOS", panelOctavos);

        panelCuartos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInteriorCuartos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFechaPartidoCuartos1.setText("FechaPartido");

        lblEquipoLocalCuartos1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalCuartos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalCuartos1.setText("Equipo Local");

        lblEquipoVisitanteCuartos1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteCuartos1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteCuartos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteCuartos1.setText("Equipo Visitante");
        lblEquipoVisitanteCuartos1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioCuartos1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioCuartos1.setText("NombreEstadio");

        golesField1_cuartos1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_cuartos1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionCuartos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionCuartos1.setText("-");

        penalesField1_cuartos1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        penalesField2_cuartos1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout panelCuartosFila1Layout = new javax.swing.GroupLayout(panelCuartosFila1);
        panelCuartosFila1.setLayout(panelCuartosFila1Layout);
        panelCuartosFila1Layout.setHorizontalGroup(
            panelCuartosFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuartosFila1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCuartosFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorCuartos1)
                    .addGroup(panelCuartosFila1Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoCuartos1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioCuartos1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuartosFila1Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalCuartos1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_cuartos1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField1_cuartos1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionCuartos1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField2_cuartos1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_cuartos1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteCuartos1)))
                .addContainerGap())
        );
        panelCuartosFila1Layout.setVerticalGroup(
            panelCuartosFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuartosFila1Layout.createSequentialGroup()
                .addGroup(panelCuartosFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuartosFila1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoCuartos1))
                    .addGroup(panelCuartosFila1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioCuartos1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCuartosFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteCuartos1)
                            .addComponent(lblEquipoLocalCuartos1)
                            .addComponent(golesField1_cuartos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_cuartos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionCuartos1)
                            .addComponent(penalesField1_cuartos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(penalesField2_cuartos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorCuartos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorCuartos.add(panelCuartosFila1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 720, 90));

        lblFechaPartidoCuartos2.setText("FechaPartido");

        lblEquipoLocalCuartos2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalCuartos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalCuartos2.setText("Equipo Local");

        lblEquipoVisitanteCuartos2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteCuartos2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteCuartos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteCuartos2.setText("Equipo Visitante");
        lblEquipoVisitanteCuartos2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioCuartos2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioCuartos2.setText("NombreEstadio");

        golesField1_cuartos2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_cuartos2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionCuartos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionCuartos2.setText("-");

        penalesField1_cuartos2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        penalesField2_cuartos2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout panelCuartosFila2Layout = new javax.swing.GroupLayout(panelCuartosFila2);
        panelCuartosFila2.setLayout(panelCuartosFila2Layout);
        panelCuartosFila2Layout.setHorizontalGroup(
            panelCuartosFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuartosFila2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCuartosFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorCuartos2)
                    .addGroup(panelCuartosFila2Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoCuartos2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioCuartos2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuartosFila2Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalCuartos2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_cuartos2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField1_cuartos2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionCuartos2, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField2_cuartos2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_cuartos2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteCuartos2)))
                .addContainerGap())
        );
        panelCuartosFila2Layout.setVerticalGroup(
            panelCuartosFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuartosFila2Layout.createSequentialGroup()
                .addGroup(panelCuartosFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuartosFila2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoCuartos2))
                    .addGroup(panelCuartosFila2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioCuartos2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCuartosFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteCuartos2)
                            .addComponent(lblEquipoLocalCuartos2)
                            .addComponent(golesField1_cuartos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_cuartos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionCuartos2)
                            .addComponent(penalesField1_cuartos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(penalesField2_cuartos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorCuartos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorCuartos.add(panelCuartosFila2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 720, 90));

        lblFechaPartidoCuartos3.setText("FechaPartido");

        lblEquipoLocalCuartos3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalCuartos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalCuartos3.setText("Equipo Local");

        lblEquipoVisitanteCuartos3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteCuartos3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteCuartos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteCuartos3.setText("Equipo Visitante");
        lblEquipoVisitanteCuartos3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioCuartos3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioCuartos3.setText("NombreEstadio");

        golesField1_cuartos3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_cuartos3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionCuartos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionCuartos3.setText("-");

        penalesField1_cuartos3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        penalesField2_cuartos3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout panelCuartosFila3Layout = new javax.swing.GroupLayout(panelCuartosFila3);
        panelCuartosFila3.setLayout(panelCuartosFila3Layout);
        panelCuartosFila3Layout.setHorizontalGroup(
            panelCuartosFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuartosFila3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCuartosFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorCuartos3)
                    .addGroup(panelCuartosFila3Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoCuartos3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioCuartos3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuartosFila3Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalCuartos3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_cuartos3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField1_cuartos3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionCuartos3, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField2_cuartos3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_cuartos3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteCuartos3)))
                .addContainerGap())
        );
        panelCuartosFila3Layout.setVerticalGroup(
            panelCuartosFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuartosFila3Layout.createSequentialGroup()
                .addGroup(panelCuartosFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuartosFila3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoCuartos3))
                    .addGroup(panelCuartosFila3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioCuartos3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCuartosFila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteCuartos3)
                            .addComponent(lblEquipoLocalCuartos3)
                            .addComponent(golesField1_cuartos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_cuartos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionCuartos3)
                            .addComponent(penalesField1_cuartos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(penalesField2_cuartos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorCuartos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorCuartos.add(panelCuartosFila3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 720, 90));

        lblFechaPartidoCuartos4.setText("FechaPartido");

        lblEquipoLocalCuartos4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalCuartos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalCuartos4.setText("Equipo Local");

        lblEquipoVisitanteCuartos4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteCuartos4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteCuartos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteCuartos4.setText("Equipo Visitante");
        lblEquipoVisitanteCuartos4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioCuartos4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioCuartos4.setText("NombreEstadio");

        golesField1_cuartos4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_cuartos4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionCuartos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionCuartos4.setText("-");

        penalesField1_cuartos4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        penalesField2_cuartos4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout panelCuartosFila4Layout = new javax.swing.GroupLayout(panelCuartosFila4);
        panelCuartosFila4.setLayout(panelCuartosFila4Layout);
        panelCuartosFila4Layout.setHorizontalGroup(
            panelCuartosFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuartosFila4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCuartosFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorCuartos4)
                    .addGroup(panelCuartosFila4Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoCuartos4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioCuartos4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuartosFila4Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalCuartos4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_cuartos4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField1_cuartos4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionCuartos4, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField2_cuartos4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_cuartos4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteCuartos4)))
                .addContainerGap())
        );
        panelCuartosFila4Layout.setVerticalGroup(
            panelCuartosFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuartosFila4Layout.createSequentialGroup()
                .addGroup(panelCuartosFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuartosFila4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoCuartos4))
                    .addGroup(panelCuartosFila4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioCuartos4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCuartosFila4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteCuartos4)
                            .addComponent(lblEquipoLocalCuartos4)
                            .addComponent(golesField1_cuartos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_cuartos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionCuartos4)
                            .addComponent(penalesField1_cuartos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(penalesField2_cuartos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorCuartos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorCuartos.add(panelCuartosFila4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 720, 90));

        jScrollPaneCuartos.setViewportView(panelInteriorCuartos);

        panelCuartos.add(jScrollPaneCuartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 770, 420));

        guardarBtnCuartos.setText("Guardar");
        guardarBtnCuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnCuartosActionPerformed(evt);
            }
        });
        panelCuartos.add(guardarBtnCuartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, -1, -1));

        tabbedPane.addTab("CUARTOS", panelCuartos);

        panelSemifinales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInteriorSemifinales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFechaPartidoSemifinales1.setText("FechaPartido");

        lblEquipoLocalSemifinales1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalSemifinales1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalSemifinales1.setText("Equipo Local");

        lblEquipoVisitanteSemifinales1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteSemifinales1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteSemifinales1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteSemifinales1.setText("Equipo Visitante");
        lblEquipoVisitanteSemifinales1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioSemifinales1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioSemifinales1.setText("NombreEstadio");

        golesField1_semifinales1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_semifinales1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionSemifinales1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionSemifinales1.setText("-");

        penalesField1_semifinales1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        penalesField2_semifinales1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout panelSemifinalesFila1Layout = new javax.swing.GroupLayout(panelSemifinalesFila1);
        panelSemifinalesFila1.setLayout(panelSemifinalesFila1Layout);
        panelSemifinalesFila1Layout.setHorizontalGroup(
            panelSemifinalesFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSemifinalesFila1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSemifinalesFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorSemifinales1)
                    .addGroup(panelSemifinalesFila1Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoSemifinales1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioSemifinales1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSemifinalesFila1Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalSemifinales1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_semifinales1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField1_semifinales1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionSemifinales1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField2_semifinales1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_semifinales1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteSemifinales1)))
                .addContainerGap())
        );
        panelSemifinalesFila1Layout.setVerticalGroup(
            panelSemifinalesFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSemifinalesFila1Layout.createSequentialGroup()
                .addGroup(panelSemifinalesFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSemifinalesFila1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoSemifinales1))
                    .addGroup(panelSemifinalesFila1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioSemifinales1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSemifinalesFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteSemifinales1)
                            .addComponent(lblEquipoLocalSemifinales1)
                            .addComponent(golesField1_semifinales1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_semifinales1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionSemifinales1)
                            .addComponent(penalesField1_semifinales1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(penalesField2_semifinales1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorSemifinales1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorSemifinales.add(panelSemifinalesFila1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 720, 90));

        lblFechaPartidoSemifinales2.setText("FechaPartido");

        lblEquipoLocalSemifinales2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalSemifinales2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalSemifinales2.setText("Equipo Local");

        lblEquipoVisitanteSemifinales2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteSemifinales2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteSemifinales2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteSemifinales2.setText("Equipo Visitante");
        lblEquipoVisitanteSemifinales2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioSemifinales2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioSemifinales2.setText("NombreEstadio");

        golesField1_semifinales2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_semifinales2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionSemifinales2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionSemifinales2.setText("-");

        penalesField1_semifinales2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        penalesField2_semifinales2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout panelSemifinalesFila2Layout = new javax.swing.GroupLayout(panelSemifinalesFila2);
        panelSemifinalesFila2.setLayout(panelSemifinalesFila2Layout);
        panelSemifinalesFila2Layout.setHorizontalGroup(
            panelSemifinalesFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSemifinalesFila2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSemifinalesFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorSemifinales2)
                    .addGroup(panelSemifinalesFila2Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoSemifinales2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioSemifinales2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSemifinalesFila2Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalSemifinales2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_semifinales2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField1_semifinales2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionSemifinales2, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField2_semifinales2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_semifinales2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteSemifinales2)))
                .addContainerGap())
        );
        panelSemifinalesFila2Layout.setVerticalGroup(
            panelSemifinalesFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSemifinalesFila2Layout.createSequentialGroup()
                .addGroup(panelSemifinalesFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSemifinalesFila2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoSemifinales2))
                    .addGroup(panelSemifinalesFila2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioSemifinales2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSemifinalesFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteSemifinales2)
                            .addComponent(lblEquipoLocalSemifinales2)
                            .addComponent(golesField1_semifinales2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_semifinales2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionSemifinales2)
                            .addComponent(penalesField1_semifinales2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(penalesField2_semifinales2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorSemifinales2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorSemifinales.add(panelSemifinalesFila2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 720, 90));

        jScrollPaneSemifinales.setViewportView(panelInteriorSemifinales);

        panelSemifinales.add(jScrollPaneSemifinales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 770, 420));

        guardarBtnSemifinales.setText("Guardar");
        guardarBtnSemifinales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnSemifinalesActionPerformed(evt);
            }
        });
        panelSemifinales.add(guardarBtnSemifinales, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, -1, -1));

        tabbedPane.addTab("SEMIFINALES", panelSemifinales);

        panelTercerPuesto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInteriorTercerPuesto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFechaPartidoTercerPuesto1.setText("FechaPartido");

        lblEquipoLocalTercerPuesto1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalTercerPuesto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalTercerPuesto1.setText("Equipo Local");

        lblEquipoVisitanteTercerPuesto1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteTercerPuesto1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteTercerPuesto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteTercerPuesto1.setText("Equipo Visitante");
        lblEquipoVisitanteTercerPuesto1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioTercerPuesto1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioTercerPuesto1.setText("NombreEstadio");

        golesField1_tercerPuesto1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_tercerPuesto1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionTercerPuesto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionTercerPuesto1.setText("-");

        penalesField1_tercerPuesto1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        penalesField2_tercerPuesto1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout panelTercerPuestoFila1Layout = new javax.swing.GroupLayout(panelTercerPuestoFila1);
        panelTercerPuestoFila1.setLayout(panelTercerPuestoFila1Layout);
        panelTercerPuestoFila1Layout.setHorizontalGroup(
            panelTercerPuestoFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTercerPuestoFila1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTercerPuestoFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorTercerPuesto1)
                    .addGroup(panelTercerPuestoFila1Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoTercerPuesto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioTercerPuesto1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTercerPuestoFila1Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalTercerPuesto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_tercerPuesto1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField1_tercerPuesto1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionTercerPuesto1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField2_tercerPuesto1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_tercerPuesto1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteTercerPuesto1)))
                .addContainerGap())
        );
        panelTercerPuestoFila1Layout.setVerticalGroup(
            panelTercerPuestoFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTercerPuestoFila1Layout.createSequentialGroup()
                .addGroup(panelTercerPuestoFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTercerPuestoFila1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoTercerPuesto1))
                    .addGroup(panelTercerPuestoFila1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioTercerPuesto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelTercerPuestoFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteTercerPuesto1)
                            .addComponent(lblEquipoLocalTercerPuesto1)
                            .addComponent(golesField1_tercerPuesto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_tercerPuesto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionTercerPuesto1)
                            .addComponent(penalesField1_tercerPuesto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(penalesField2_tercerPuesto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorTercerPuesto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorTercerPuesto.add(panelTercerPuestoFila1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 720, 90));

        jScrollPaneTercerPuesto.setViewportView(panelInteriorTercerPuesto);

        panelTercerPuesto.add(jScrollPaneTercerPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 770, 420));

        guardarBtnTercerPuesto.setText("Guardar");
        guardarBtnTercerPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnTercerPuestoActionPerformed(evt);
            }
        });
        panelTercerPuesto.add(guardarBtnTercerPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, -1, -1));

        tabbedPane.addTab("3er PUESTO", panelTercerPuesto);

        panelFinal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInteriorFinal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFechaPartidoFinal1.setText("FechaPartido");

        lblEquipoLocalFinal1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoLocalFinal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoLocalFinal1.setText("Equipo Local");

        lblEquipoVisitanteFinal1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEquipoVisitanteFinal1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipoVisitanteFinal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img/banderas/placeholder.png"))); // NOI18N
        lblEquipoVisitanteFinal1.setText("Equipo Visitante");
        lblEquipoVisitanteFinal1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNombreEstadioFinal1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstadioFinal1.setText("NombreEstadio");

        golesField1_final1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        golesField2_final1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        guionFinal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guionFinal1.setText("-");

        penalesField1_final1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        penalesField2_final1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout panelFinalFila1Layout = new javax.swing.GroupLayout(panelFinalFila1);
        panelFinalFila1.setLayout(panelFinalFila1Layout);
        panelFinalFila1Layout.setHorizontalGroup(
            panelFinalFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFinalFila1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFinalFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorFinal1)
                    .addGroup(panelFinalFila1Layout.createSequentialGroup()
                        .addComponent(lblFechaPartidoFinal1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreEstadioFinal1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFinalFila1Layout.createSequentialGroup()
                        .addComponent(lblEquipoLocalFinal1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesField1_final1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField1_final1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guionFinal1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penalesField2_final1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesField2_final1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEquipoVisitanteFinal1)))
                .addContainerGap())
        );
        panelFinalFila1Layout.setVerticalGroup(
            panelFinalFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFinalFila1Layout.createSequentialGroup()
                .addGroup(panelFinalFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFinalFila1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaPartidoFinal1))
                    .addGroup(panelFinalFila1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreEstadioFinal1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFinalFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipoVisitanteFinal1)
                            .addComponent(lblEquipoLocalFinal1)
                            .addComponent(golesField1_final1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesField2_final1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guionFinal1)
                            .addComponent(penalesField1_final1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(penalesField2_final1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparatorFinal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInteriorFinal.add(panelFinalFila1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 720, 90));

        jScrollPaneFinal.setViewportView(panelInteriorFinal);

        panelFinal.add(jScrollPaneFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 770, 420));

        guardarBtnFinal.setText("Guardar");
        guardarBtnFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnFinalActionPerformed(evt);
            }
        });
        panelFinal.add(guardarBtnFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, -1, -1));

        tabbedPane.addTab("FINAL", panelFinal);

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelHeaderLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(labelLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(611, Short.MAX_VALUE)))
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
            .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelBody, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBody, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void guardarBtnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnAActionPerformed

        Grupo grupoA = grupoRepository.get('a');

        leerGolesDeGrupoYGuardarCambios(grupoA);

    }//GEN-LAST:event_guardarBtnAActionPerformed

    private void guardarBtnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnBActionPerformed
        Grupo grupoB = grupoRepository.get('b');

        leerGolesDeGrupoYGuardarCambios(grupoB);
    }//GEN-LAST:event_guardarBtnBActionPerformed

    private void guardarBtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnCActionPerformed
        Grupo grupoC = grupoRepository.get('c');

        leerGolesDeGrupoYGuardarCambios(grupoC);
    }//GEN-LAST:event_guardarBtnCActionPerformed

    private void guardarBtnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnDActionPerformed
        Grupo grupoD = grupoRepository.get('d');

        leerGolesDeGrupoYGuardarCambios(grupoD);
    }//GEN-LAST:event_guardarBtnDActionPerformed

    private void guardarBtnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnEActionPerformed
        Grupo grupoE = grupoRepository.get('e');

        leerGolesDeGrupoYGuardarCambios(grupoE);
    }//GEN-LAST:event_guardarBtnEActionPerformed

    private void guardarBtnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnFActionPerformed
        Grupo grupoF = grupoRepository.get('f');

        leerGolesDeGrupoYGuardarCambios(grupoF);
    }//GEN-LAST:event_guardarBtnFActionPerformed

    private void guardarBtnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnGActionPerformed
        Grupo grupoG = grupoRepository.get('g');

        leerGolesDeGrupoYGuardarCambios(grupoG);
    }//GEN-LAST:event_guardarBtnGActionPerformed

    private void guardarBtnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnHActionPerformed
        Grupo grupoH = grupoRepository.get('h');

        leerGolesDeGrupoYGuardarCambios(grupoH);
    }//GEN-LAST:event_guardarBtnHActionPerformed

    private void btnVerTablaDePoscionesAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTablaDePoscionesAActionPerformed
        Grupo grupo = grupoRepository.get('a');
        crearYCompletarTablaDePosiciones(grupo);
    }//GEN-LAST:event_btnVerTablaDePoscionesAActionPerformed

    private void btnVerTablaDePoscionesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTablaDePoscionesBActionPerformed
        Grupo grupo = grupoRepository.get('b');
        crearYCompletarTablaDePosiciones(grupo);
    }//GEN-LAST:event_btnVerTablaDePoscionesBActionPerformed

    private void btnVerTablaDePoscionesCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTablaDePoscionesCActionPerformed
        Grupo grupo = grupoRepository.get('c');
        crearYCompletarTablaDePosiciones(grupo);
    }//GEN-LAST:event_btnVerTablaDePoscionesCActionPerformed

    private void btnVerTablaDePoscionesDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTablaDePoscionesDActionPerformed
        Grupo grupo = grupoRepository.get('d');
        crearYCompletarTablaDePosiciones(grupo);
    }//GEN-LAST:event_btnVerTablaDePoscionesDActionPerformed

    private void btnVerTablaDePoscionesEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTablaDePoscionesEActionPerformed
        Grupo grupo = grupoRepository.get('e');
        crearYCompletarTablaDePosiciones(grupo);
    }//GEN-LAST:event_btnVerTablaDePoscionesEActionPerformed

    private void btnVerTablaDePoscionesFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTablaDePoscionesFActionPerformed
        Grupo grupo = grupoRepository.get('f');
        crearYCompletarTablaDePosiciones(grupo);
    }//GEN-LAST:event_btnVerTablaDePoscionesFActionPerformed

    private void btnVerTablaDePoscionesGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTablaDePoscionesGActionPerformed
        Grupo grupo = grupoRepository.get('g');
        crearYCompletarTablaDePosiciones(grupo);
    }//GEN-LAST:event_btnVerTablaDePoscionesGActionPerformed

    private void btnVerTablaDePoscionesHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTablaDePoscionesHActionPerformed
        Grupo grupo = grupoRepository.get('h');
        crearYCompletarTablaDePosiciones(grupo);
    }//GEN-LAST:event_btnVerTablaDePoscionesHActionPerformed

    private void guardarBtnOctavosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnOctavosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarBtnOctavosActionPerformed

    private void guardarBtnCuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnCuartosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarBtnCuartosActionPerformed

    private void guardarBtnSemifinalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnSemifinalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarBtnSemifinalesActionPerformed

    private void guardarBtnTercerPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnTercerPuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarBtnTercerPuestoActionPerformed

    private void guardarBtnFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarBtnFinalActionPerformed

    private void crearYCompletarTablaDePosiciones(Grupo grupo) {
        ventanaTablaDePosiciones = new TablaDePosiciones((grupo));
        ventanaTablaDePosiciones.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        ventanaTablaDePosiciones.setLocationRelativeTo(null);
        ventanaTablaDePosiciones.setVisible(true);
    }

    private void leerGolesDeGrupoYGuardarCambios(Grupo grupo) {
        HashSet<Equipo> equiposGrupoActualizados = new HashSet();

        // Para guardar correctamente el dato tengo que trabajar sobre EquipoRepository
        for (Equipo equipoGrupo : grupo.getEquipos()) {
            Equipo equipoEncontrado = equipoRepository.find(equipoGrupo.getId());

            // Antes de actualizar los valores para la tabla de cada equipo hay que limpiarlos
            equipoEncontrado.limpiarDatosDePartidos();

            // esta lista (HashSet) va a ser la encargada que gestionar los datos de Equipos en el repositorio correspondiente
            equiposGrupoActualizados.add(equipoEncontrado);
        }

        // Busco el array conteniendo los ids de partidos y los campos de formulario del grupo que corresponda
        ArrayList<Integer> listadoDeIds = new ArrayList();
        JFormattedTextField[] golesLocal = {};
        JFormattedTextField[] golesVisitante = {};

        switch (grupo.getLetra()) {
            case 'a':
                listadoDeIds = idsPartidosGrupoA;
                golesLocal = golesLocalGrupoA;
                golesVisitante = golesVisitantesGrupoA;
                break;
            case 'b':
                listadoDeIds = idsPartidosGrupoB;
                golesLocal = golesLocalGrupoB;
                golesVisitante = golesVisitantesGrupoB;
                break;
            case 'c':
                listadoDeIds = idsPartidosGrupoC;
                golesLocal = golesLocalGrupoC;
                golesVisitante = golesVisitantesGrupoC;
                break;
            case 'd':
                listadoDeIds = idsPartidosGrupoD;
                golesLocal = golesLocalGrupoD;
                golesVisitante = golesVisitantesGrupoD;
                break;
            case 'e':
                listadoDeIds = idsPartidosGrupoE;
                golesLocal = golesLocalGrupoE;
                golesVisitante = golesVisitantesGrupoE;
                break;
            case 'f':
                listadoDeIds = idsPartidosGrupoF;
                golesLocal = golesLocalGrupoF;
                golesVisitante = golesVisitantesGrupoF;
                break;
            case 'g':
                listadoDeIds = idsPartidosGrupoG;
                golesLocal = golesLocalGrupoG;
                golesVisitante = golesVisitantesGrupoG;
                break;
            case 'h':
                listadoDeIds = idsPartidosGrupoH;
                golesLocal = golesLocalGrupoH;
                golesVisitante = golesVisitantesGrupoH;
                break;
        }

        int i = 0;
        for (Integer id : listadoDeIds) {
            for (Partido p : partidoRepository.findBy(Fase.DE_GRUPOS, grupo)) {
                if (p.getId() == id) {
                    p.setGolesEquipo1(Integer.parseInt(golesLocal[i].getText()));
                    p.setGolesEquipo2(Integer.parseInt(golesVisitante[i].getText()));

                    // Equipos que jugaron el partido
                    Equipo equipo1 = p.getEquipo1(); // A este nivel el objeto referencia al de GrupoRepository
                    Equipo equipo2 = p.getEquipo2(); // A este nivel el objeto referencia al de GrupoRepository

                    // Hago que equipo1 y equipo2 referencien a los equipos recuperados de EquipoRepository
                    for (Equipo equipoAActualizar : equiposGrupoActualizados) {
                        if (equipoAActualizar.getId().equals(p.getEquipo1().getId())) {
                            equipo1 = equipoAActualizar;
                        }

                        if (equipoAActualizar.getId().equals(p.getEquipo2().getId())) {
                            equipo2 = equipoAActualizar;
                        }
                    }

                    actualizarValoresDeEquipo(equipo1, equipo2, p, equiposGrupoActualizados);
                }
            }
            i++;
        }

        guardarCambios(grupo, equiposGrupoActualizados);
    }

    private void guardarCambios(Grupo grupo, HashSet<Equipo> equiposGrupoActualizados) throws HeadlessException {
        try {
            fixtureService.validarGoles(partidoRepository.findBy(Fase.DE_GRUPOS, grupo));
            partidoRepository.guardarPartidosEnArchivo();

            // Guardo los datos y puntaje de equipos actualizados
            for (Equipo equipoGrupo : equiposGrupoActualizados) {
                equipoRepository.actualizarDatosDeEquiopoEnArchivo(equipoGrupo);
            }

            JOptionPane.showMessageDialog(this, "Guardado con éxito", this.getTitle(), JOptionPane.INFORMATION_MESSAGE);

        } catch (GolesNegativosFixtureException ex) {
            JOptionPane.showMessageDialog(this, "" + ex.getMessage() + " (" + ex.getEquipo().getNombre() + ")", this.getTitle(), JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            System.out.println("ERROR GENERICO");
        }
    }

    private void actualizarValoresDeEquipo(Equipo equipo1, Equipo equipo2, Partido p, HashSet<Equipo> equiposGrupoActualizados) {
        // Agrego un partido jugado a cada equipo
        equipo1.setPartidosJugados(equipo1.getPartidosJugados() + 1);
        equipo2.setPartidosJugados(equipo2.getPartidosJugados() + 1);

        // Sumo ganados / perdidos / empatados a cada equipo según corresponda
        if (p.getGolesEquipo1() > p.getGolesEquipo2()) {
            // Ganó equipo local
            // Sumo 1 a sus partidos ganados
            equipo1.setPartidosGanados(equipo1.getPartidosGanados() + 1);

            // Sumo 1 a partidos perdidos al equipo 2
            equipo2.setPartidosPerdidos(equipo2.getPartidosPerdidos() + 1);
        } else if (p.getGolesEquipo1() < p.getGolesEquipo2()) {
            // Ganó equipo visitante
            // Sumo 1 a sus partidos ganados
            equipo2.setPartidosGanados(equipo2.getPartidosGanados() + 1);

            // Sumo 1 a partidos perdidos al equipo 1
            equipo1.setPartidosPerdidos(equipo1.getPartidosPerdidos() + 1);
        } else {
            // Empataron
            // Sumo 1 a los partidos empatados de ambos
            equipo1.setPartidosEmpatados(equipo1.getPartidosEmpatados() + 1);
            equipo2.setPartidosEmpatados(equipo2.getPartidosEmpatados() + 1);
        }

        // Sumo los goles hechos y en contra de ambos equipos
        equipo1.setGolesHechos(equipo1.getGolesHechos() + p.getGolesEquipo1());
        equipo1.setGolesEnContra(equipo1.getGolesEnContra() + p.getGolesEquipo2());
        equipo2.setGolesHechos(equipo2.getGolesHechos() + p.getGolesEquipo2());
        equipo2.setGolesEnContra(equipo2.getGolesEnContra() + p.getGolesEquipo1());

        // Se calculan los puntos de cada equipo
        equipo1.calcularPuntos();
        equipo2.calcularPuntos();

        // Agrego los equipos modificados al listado que voy a usar para guardar en archivo
        equiposGrupoActualizados.add(equipo1);
        equiposGrupoActualizados.add(equipo2);
    }

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
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerTablaDePoscionesA;
    private javax.swing.JButton btnVerTablaDePoscionesB;
    private javax.swing.JButton btnVerTablaDePoscionesC;
    private javax.swing.JButton btnVerTablaDePoscionesD;
    private javax.swing.JButton btnVerTablaDePoscionesE;
    private javax.swing.JButton btnVerTablaDePoscionesF;
    private javax.swing.JButton btnVerTablaDePoscionesG;
    private javax.swing.JButton btnVerTablaDePoscionesH;
    private javax.swing.JFormattedTextField golesField1_A1;
    private javax.swing.JFormattedTextField golesField1_A2;
    private javax.swing.JFormattedTextField golesField1_A3;
    private javax.swing.JFormattedTextField golesField1_A4;
    private javax.swing.JFormattedTextField golesField1_A5;
    private javax.swing.JFormattedTextField golesField1_A6;
    private javax.swing.JFormattedTextField golesField1_B1;
    private javax.swing.JFormattedTextField golesField1_B2;
    private javax.swing.JFormattedTextField golesField1_B3;
    private javax.swing.JFormattedTextField golesField1_B4;
    private javax.swing.JFormattedTextField golesField1_B5;
    private javax.swing.JFormattedTextField golesField1_B6;
    private javax.swing.JFormattedTextField golesField1_C1;
    private javax.swing.JFormattedTextField golesField1_C2;
    private javax.swing.JFormattedTextField golesField1_C3;
    private javax.swing.JFormattedTextField golesField1_C4;
    private javax.swing.JFormattedTextField golesField1_C5;
    private javax.swing.JFormattedTextField golesField1_C6;
    private javax.swing.JFormattedTextField golesField1_D1;
    private javax.swing.JFormattedTextField golesField1_D2;
    private javax.swing.JFormattedTextField golesField1_D3;
    private javax.swing.JFormattedTextField golesField1_D4;
    private javax.swing.JFormattedTextField golesField1_D5;
    private javax.swing.JFormattedTextField golesField1_D6;
    private javax.swing.JFormattedTextField golesField1_E1;
    private javax.swing.JFormattedTextField golesField1_E2;
    private javax.swing.JFormattedTextField golesField1_E3;
    private javax.swing.JFormattedTextField golesField1_E4;
    private javax.swing.JFormattedTextField golesField1_E5;
    private javax.swing.JFormattedTextField golesField1_E6;
    private javax.swing.JFormattedTextField golesField1_F1;
    private javax.swing.JFormattedTextField golesField1_F2;
    private javax.swing.JFormattedTextField golesField1_F3;
    private javax.swing.JFormattedTextField golesField1_F4;
    private javax.swing.JFormattedTextField golesField1_F5;
    private javax.swing.JFormattedTextField golesField1_F6;
    private javax.swing.JFormattedTextField golesField1_G1;
    private javax.swing.JFormattedTextField golesField1_G2;
    private javax.swing.JFormattedTextField golesField1_G3;
    private javax.swing.JFormattedTextField golesField1_G4;
    private javax.swing.JFormattedTextField golesField1_G5;
    private javax.swing.JFormattedTextField golesField1_G6;
    private javax.swing.JFormattedTextField golesField1_H1;
    private javax.swing.JFormattedTextField golesField1_H2;
    private javax.swing.JFormattedTextField golesField1_H3;
    private javax.swing.JFormattedTextField golesField1_H4;
    private javax.swing.JFormattedTextField golesField1_H5;
    private javax.swing.JFormattedTextField golesField1_H6;
    private javax.swing.JFormattedTextField golesField1_Octavos1;
    private javax.swing.JFormattedTextField golesField1_Octavos2;
    private javax.swing.JFormattedTextField golesField1_Octavos3;
    private javax.swing.JFormattedTextField golesField1_Octavos4;
    private javax.swing.JFormattedTextField golesField1_Octavos5;
    private javax.swing.JFormattedTextField golesField1_Octavos6;
    private javax.swing.JFormattedTextField golesField1_Octavos7;
    private javax.swing.JFormattedTextField golesField1_Octavos8;
    private javax.swing.JFormattedTextField golesField1_cuartos1;
    private javax.swing.JFormattedTextField golesField1_cuartos2;
    private javax.swing.JFormattedTextField golesField1_cuartos3;
    private javax.swing.JFormattedTextField golesField1_cuartos4;
    private javax.swing.JFormattedTextField golesField1_final1;
    private javax.swing.JFormattedTextField golesField1_semifinales1;
    private javax.swing.JFormattedTextField golesField1_semifinales2;
    private javax.swing.JFormattedTextField golesField1_tercerPuesto1;
    private javax.swing.JFormattedTextField golesField2_A1;
    private javax.swing.JFormattedTextField golesField2_A2;
    private javax.swing.JFormattedTextField golesField2_A3;
    private javax.swing.JFormattedTextField golesField2_A4;
    private javax.swing.JFormattedTextField golesField2_A5;
    private javax.swing.JFormattedTextField golesField2_A6;
    private javax.swing.JFormattedTextField golesField2_B1;
    private javax.swing.JFormattedTextField golesField2_B2;
    private javax.swing.JFormattedTextField golesField2_B3;
    private javax.swing.JFormattedTextField golesField2_B4;
    private javax.swing.JFormattedTextField golesField2_B5;
    private javax.swing.JFormattedTextField golesField2_B6;
    private javax.swing.JFormattedTextField golesField2_C1;
    private javax.swing.JFormattedTextField golesField2_C2;
    private javax.swing.JFormattedTextField golesField2_C3;
    private javax.swing.JFormattedTextField golesField2_C4;
    private javax.swing.JFormattedTextField golesField2_C5;
    private javax.swing.JFormattedTextField golesField2_C6;
    private javax.swing.JFormattedTextField golesField2_D1;
    private javax.swing.JFormattedTextField golesField2_D2;
    private javax.swing.JFormattedTextField golesField2_D3;
    private javax.swing.JFormattedTextField golesField2_D4;
    private javax.swing.JFormattedTextField golesField2_D5;
    private javax.swing.JFormattedTextField golesField2_D6;
    private javax.swing.JFormattedTextField golesField2_E1;
    private javax.swing.JFormattedTextField golesField2_E2;
    private javax.swing.JFormattedTextField golesField2_E3;
    private javax.swing.JFormattedTextField golesField2_E4;
    private javax.swing.JFormattedTextField golesField2_E5;
    private javax.swing.JFormattedTextField golesField2_E6;
    private javax.swing.JFormattedTextField golesField2_F1;
    private javax.swing.JFormattedTextField golesField2_F2;
    private javax.swing.JFormattedTextField golesField2_F3;
    private javax.swing.JFormattedTextField golesField2_F4;
    private javax.swing.JFormattedTextField golesField2_F5;
    private javax.swing.JFormattedTextField golesField2_F6;
    private javax.swing.JFormattedTextField golesField2_G1;
    private javax.swing.JFormattedTextField golesField2_G2;
    private javax.swing.JFormattedTextField golesField2_G3;
    private javax.swing.JFormattedTextField golesField2_G4;
    private javax.swing.JFormattedTextField golesField2_G5;
    private javax.swing.JFormattedTextField golesField2_G6;
    private javax.swing.JFormattedTextField golesField2_H1;
    private javax.swing.JFormattedTextField golesField2_H2;
    private javax.swing.JFormattedTextField golesField2_H3;
    private javax.swing.JFormattedTextField golesField2_H4;
    private javax.swing.JFormattedTextField golesField2_H5;
    private javax.swing.JFormattedTextField golesField2_H6;
    private javax.swing.JFormattedTextField golesField2_Octavos1;
    private javax.swing.JFormattedTextField golesField2_Octavos2;
    private javax.swing.JFormattedTextField golesField2_Octavos3;
    private javax.swing.JFormattedTextField golesField2_Octavos4;
    private javax.swing.JFormattedTextField golesField2_Octavos5;
    private javax.swing.JFormattedTextField golesField2_Octavos6;
    private javax.swing.JFormattedTextField golesField2_Octavos7;
    private javax.swing.JFormattedTextField golesField2_Octavos8;
    private javax.swing.JFormattedTextField golesField2_cuartos1;
    private javax.swing.JFormattedTextField golesField2_cuartos2;
    private javax.swing.JFormattedTextField golesField2_cuartos3;
    private javax.swing.JFormattedTextField golesField2_cuartos4;
    private javax.swing.JFormattedTextField golesField2_final1;
    private javax.swing.JFormattedTextField golesField2_semifinales1;
    private javax.swing.JFormattedTextField golesField2_semifinales2;
    private javax.swing.JFormattedTextField golesField2_tercerPuesto1;
    private javax.swing.JButton guardarBtnA;
    private javax.swing.JButton guardarBtnB;
    private javax.swing.JButton guardarBtnC;
    private javax.swing.JButton guardarBtnCuartos;
    private javax.swing.JButton guardarBtnD;
    private javax.swing.JButton guardarBtnE;
    private javax.swing.JButton guardarBtnF;
    private javax.swing.JButton guardarBtnFinal;
    private javax.swing.JButton guardarBtnG;
    private javax.swing.JButton guardarBtnH;
    private javax.swing.JButton guardarBtnOctavos;
    private javax.swing.JButton guardarBtnSemifinales;
    private javax.swing.JButton guardarBtnTercerPuesto;
    private javax.swing.JLabel guionA1;
    private javax.swing.JLabel guionA2;
    private javax.swing.JLabel guionA3;
    private javax.swing.JLabel guionA4;
    private javax.swing.JLabel guionA5;
    private javax.swing.JLabel guionA6;
    private javax.swing.JLabel guionA7;
    private javax.swing.JLabel guionAH3;
    private javax.swing.JLabel guionB2;
    private javax.swing.JLabel guionB3;
    private javax.swing.JLabel guionB4;
    private javax.swing.JLabel guionB5;
    private javax.swing.JLabel guionB6;
    private javax.swing.JLabel guionC1;
    private javax.swing.JLabel guionC2;
    private javax.swing.JLabel guionC3;
    private javax.swing.JLabel guionC4;
    private javax.swing.JLabel guionC5;
    private javax.swing.JLabel guionC6;
    private javax.swing.JLabel guionCuartos1;
    private javax.swing.JLabel guionCuartos2;
    private javax.swing.JLabel guionCuartos3;
    private javax.swing.JLabel guionCuartos4;
    private javax.swing.JLabel guionD1;
    private javax.swing.JLabel guionD2;
    private javax.swing.JLabel guionD3;
    private javax.swing.JLabel guionD4;
    private javax.swing.JLabel guionD5;
    private javax.swing.JLabel guionD6;
    private javax.swing.JLabel guionE1;
    private javax.swing.JLabel guionE2;
    private javax.swing.JLabel guionE3;
    private javax.swing.JLabel guionE4;
    private javax.swing.JLabel guionE5;
    private javax.swing.JLabel guionE6;
    private javax.swing.JLabel guionF1;
    private javax.swing.JLabel guionF2;
    private javax.swing.JLabel guionF3;
    private javax.swing.JLabel guionF4;
    private javax.swing.JLabel guionF5;
    private javax.swing.JLabel guionF6;
    private javax.swing.JLabel guionFinal1;
    private javax.swing.JLabel guionG1;
    private javax.swing.JLabel guionG2;
    private javax.swing.JLabel guionG3;
    private javax.swing.JLabel guionG4;
    private javax.swing.JLabel guionG5;
    private javax.swing.JLabel guionG6;
    private javax.swing.JLabel guionH1;
    private javax.swing.JLabel guionH2;
    private javax.swing.JLabel guionH4;
    private javax.swing.JLabel guionH5;
    private javax.swing.JLabel guionH6;
    private javax.swing.JLabel guionOctavos1;
    private javax.swing.JLabel guionOctavos2;
    private javax.swing.JLabel guionOctavos3;
    private javax.swing.JLabel guionOctavos4;
    private javax.swing.JLabel guionOctavos5;
    private javax.swing.JLabel guionOctavos6;
    private javax.swing.JLabel guionOctavos7;
    private javax.swing.JLabel guionOctavos8;
    private javax.swing.JLabel guionSemifinales1;
    private javax.swing.JLabel guionSemifinales2;
    private javax.swing.JLabel guionTercerPuesto1;
    private javax.swing.JScrollPane jScrollPaneA;
    private javax.swing.JScrollPane jScrollPaneB;
    private javax.swing.JScrollPane jScrollPaneC;
    private javax.swing.JScrollPane jScrollPaneCuartos;
    private javax.swing.JScrollPane jScrollPaneD;
    private javax.swing.JScrollPane jScrollPaneE;
    private javax.swing.JScrollPane jScrollPaneF;
    private javax.swing.JScrollPane jScrollPaneFinal;
    private javax.swing.JScrollPane jScrollPaneG;
    private javax.swing.JScrollPane jScrollPaneH;
    private javax.swing.JScrollPane jScrollPaneOctavos;
    private javax.swing.JScrollPane jScrollPaneSemifinales;
    private javax.swing.JScrollPane jScrollPaneTercerPuesto;
    private javax.swing.JSeparator jSeparatorA1;
    private javax.swing.JSeparator jSeparatorA2;
    private javax.swing.JSeparator jSeparatorA3;
    private javax.swing.JSeparator jSeparatorA4;
    private javax.swing.JSeparator jSeparatorA5;
    private javax.swing.JSeparator jSeparatorA6;
    private javax.swing.JSeparator jSeparatorB1;
    private javax.swing.JSeparator jSeparatorB2;
    private javax.swing.JSeparator jSeparatorB3;
    private javax.swing.JSeparator jSeparatorB4;
    private javax.swing.JSeparator jSeparatorB5;
    private javax.swing.JSeparator jSeparatorB6;
    private javax.swing.JSeparator jSeparatorC1;
    private javax.swing.JSeparator jSeparatorC2;
    private javax.swing.JSeparator jSeparatorC3;
    private javax.swing.JSeparator jSeparatorC4;
    private javax.swing.JSeparator jSeparatorC5;
    private javax.swing.JSeparator jSeparatorC6;
    private javax.swing.JSeparator jSeparatorCuartos1;
    private javax.swing.JSeparator jSeparatorCuartos2;
    private javax.swing.JSeparator jSeparatorCuartos3;
    private javax.swing.JSeparator jSeparatorCuartos4;
    private javax.swing.JSeparator jSeparatorD1;
    private javax.swing.JSeparator jSeparatorD2;
    private javax.swing.JSeparator jSeparatorD3;
    private javax.swing.JSeparator jSeparatorD4;
    private javax.swing.JSeparator jSeparatorD5;
    private javax.swing.JSeparator jSeparatorD6;
    private javax.swing.JSeparator jSeparatorE1;
    private javax.swing.JSeparator jSeparatorE2;
    private javax.swing.JSeparator jSeparatorE3;
    private javax.swing.JSeparator jSeparatorE4;
    private javax.swing.JSeparator jSeparatorE5;
    private javax.swing.JSeparator jSeparatorE6;
    private javax.swing.JSeparator jSeparatorF1;
    private javax.swing.JSeparator jSeparatorF2;
    private javax.swing.JSeparator jSeparatorF3;
    private javax.swing.JSeparator jSeparatorF4;
    private javax.swing.JSeparator jSeparatorF5;
    private javax.swing.JSeparator jSeparatorF6;
    private javax.swing.JSeparator jSeparatorFinal1;
    private javax.swing.JSeparator jSeparatorG1;
    private javax.swing.JSeparator jSeparatorG2;
    private javax.swing.JSeparator jSeparatorG3;
    private javax.swing.JSeparator jSeparatorG4;
    private javax.swing.JSeparator jSeparatorG5;
    private javax.swing.JSeparator jSeparatorG6;
    private javax.swing.JSeparator jSeparatorH1;
    private javax.swing.JSeparator jSeparatorH2;
    private javax.swing.JSeparator jSeparatorH3;
    private javax.swing.JSeparator jSeparatorH4;
    private javax.swing.JSeparator jSeparatorH5;
    private javax.swing.JSeparator jSeparatorH6;
    private javax.swing.JSeparator jSeparatorOctavos1;
    private javax.swing.JSeparator jSeparatorOctavos2;
    private javax.swing.JSeparator jSeparatorOctavos3;
    private javax.swing.JSeparator jSeparatorOctavos4;
    private javax.swing.JSeparator jSeparatorOctavos5;
    private javax.swing.JSeparator jSeparatorOctavos6;
    private javax.swing.JSeparator jSeparatorOctavos7;
    private javax.swing.JSeparator jSeparatorOctavos8;
    private javax.swing.JSeparator jSeparatorSemifinales1;
    private javax.swing.JSeparator jSeparatorSemifinales2;
    private javax.swing.JSeparator jSeparatorTercerPuesto1;
    private javax.swing.JLabel label1roA;
    private javax.swing.JLabel label1roB;
    private javax.swing.JLabel label1roC;
    private javax.swing.JLabel label1roD;
    private javax.swing.JLabel label1roE;
    private javax.swing.JLabel label1roF;
    private javax.swing.JLabel label1roG;
    private javax.swing.JLabel label1roH;
    private javax.swing.JLabel label2doA;
    private javax.swing.JLabel label2doB;
    private javax.swing.JLabel label2doC;
    private javax.swing.JLabel label2doD;
    private javax.swing.JLabel label2doE;
    private javax.swing.JLabel label2doF;
    private javax.swing.JLabel label2doG;
    private javax.swing.JLabel label2doH;
    private javax.swing.JLabel labelLogo1;
    private javax.swing.JLabel labelSubtitulo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel lblEquipoLocalA1;
    private javax.swing.JLabel lblEquipoLocalA2;
    private javax.swing.JLabel lblEquipoLocalA3;
    private javax.swing.JLabel lblEquipoLocalA4;
    private javax.swing.JLabel lblEquipoLocalA5;
    private javax.swing.JLabel lblEquipoLocalA6;
    private javax.swing.JLabel lblEquipoLocalB1;
    private javax.swing.JLabel lblEquipoLocalB2;
    private javax.swing.JLabel lblEquipoLocalB3;
    private javax.swing.JLabel lblEquipoLocalB4;
    private javax.swing.JLabel lblEquipoLocalB5;
    private javax.swing.JLabel lblEquipoLocalB6;
    private javax.swing.JLabel lblEquipoLocalC1;
    private javax.swing.JLabel lblEquipoLocalC2;
    private javax.swing.JLabel lblEquipoLocalC3;
    private javax.swing.JLabel lblEquipoLocalC4;
    private javax.swing.JLabel lblEquipoLocalC5;
    private javax.swing.JLabel lblEquipoLocalC6;
    private javax.swing.JLabel lblEquipoLocalCuartos1;
    private javax.swing.JLabel lblEquipoLocalCuartos2;
    private javax.swing.JLabel lblEquipoLocalCuartos3;
    private javax.swing.JLabel lblEquipoLocalCuartos4;
    private javax.swing.JLabel lblEquipoLocalD1;
    private javax.swing.JLabel lblEquipoLocalD2;
    private javax.swing.JLabel lblEquipoLocalD3;
    private javax.swing.JLabel lblEquipoLocalD4;
    private javax.swing.JLabel lblEquipoLocalD5;
    private javax.swing.JLabel lblEquipoLocalD6;
    private javax.swing.JLabel lblEquipoLocalE1;
    private javax.swing.JLabel lblEquipoLocalE2;
    private javax.swing.JLabel lblEquipoLocalE3;
    private javax.swing.JLabel lblEquipoLocalE4;
    private javax.swing.JLabel lblEquipoLocalE5;
    private javax.swing.JLabel lblEquipoLocalE6;
    private javax.swing.JLabel lblEquipoLocalF1;
    private javax.swing.JLabel lblEquipoLocalF2;
    private javax.swing.JLabel lblEquipoLocalF3;
    private javax.swing.JLabel lblEquipoLocalF4;
    private javax.swing.JLabel lblEquipoLocalF5;
    private javax.swing.JLabel lblEquipoLocalF6;
    private javax.swing.JLabel lblEquipoLocalFinal1;
    private javax.swing.JLabel lblEquipoLocalG1;
    private javax.swing.JLabel lblEquipoLocalG2;
    private javax.swing.JLabel lblEquipoLocalG3;
    private javax.swing.JLabel lblEquipoLocalG4;
    private javax.swing.JLabel lblEquipoLocalG5;
    private javax.swing.JLabel lblEquipoLocalG6;
    private javax.swing.JLabel lblEquipoLocalH1;
    private javax.swing.JLabel lblEquipoLocalH2;
    private javax.swing.JLabel lblEquipoLocalH3;
    private javax.swing.JLabel lblEquipoLocalH4;
    private javax.swing.JLabel lblEquipoLocalH5;
    private javax.swing.JLabel lblEquipoLocalH6;
    private javax.swing.JLabel lblEquipoLocalOctavos1;
    private javax.swing.JLabel lblEquipoLocalOctavos2;
    private javax.swing.JLabel lblEquipoLocalOctavos3;
    private javax.swing.JLabel lblEquipoLocalOctavos4;
    private javax.swing.JLabel lblEquipoLocalOctavos5;
    private javax.swing.JLabel lblEquipoLocalOctavos6;
    private javax.swing.JLabel lblEquipoLocalOctavos7;
    private javax.swing.JLabel lblEquipoLocalOctavos8;
    private javax.swing.JLabel lblEquipoLocalSemifinales1;
    private javax.swing.JLabel lblEquipoLocalSemifinales2;
    private javax.swing.JLabel lblEquipoLocalTercerPuesto1;
    private javax.swing.JLabel lblEquipoVisitanteA1;
    private javax.swing.JLabel lblEquipoVisitanteA2;
    private javax.swing.JLabel lblEquipoVisitanteA3;
    private javax.swing.JLabel lblEquipoVisitanteA4;
    private javax.swing.JLabel lblEquipoVisitanteA5;
    private javax.swing.JLabel lblEquipoVisitanteA6;
    private javax.swing.JLabel lblEquipoVisitanteB1;
    private javax.swing.JLabel lblEquipoVisitanteB2;
    private javax.swing.JLabel lblEquipoVisitanteB3;
    private javax.swing.JLabel lblEquipoVisitanteB4;
    private javax.swing.JLabel lblEquipoVisitanteB5;
    private javax.swing.JLabel lblEquipoVisitanteB6;
    private javax.swing.JLabel lblEquipoVisitanteC1;
    private javax.swing.JLabel lblEquipoVisitanteC2;
    private javax.swing.JLabel lblEquipoVisitanteC3;
    private javax.swing.JLabel lblEquipoVisitanteC4;
    private javax.swing.JLabel lblEquipoVisitanteC5;
    private javax.swing.JLabel lblEquipoVisitanteC6;
    private javax.swing.JLabel lblEquipoVisitanteCuartos1;
    private javax.swing.JLabel lblEquipoVisitanteCuartos2;
    private javax.swing.JLabel lblEquipoVisitanteCuartos3;
    private javax.swing.JLabel lblEquipoVisitanteCuartos4;
    private javax.swing.JLabel lblEquipoVisitanteD1;
    private javax.swing.JLabel lblEquipoVisitanteD2;
    private javax.swing.JLabel lblEquipoVisitanteD3;
    private javax.swing.JLabel lblEquipoVisitanteD4;
    private javax.swing.JLabel lblEquipoVisitanteD5;
    private javax.swing.JLabel lblEquipoVisitanteD6;
    private javax.swing.JLabel lblEquipoVisitanteE1;
    private javax.swing.JLabel lblEquipoVisitanteE2;
    private javax.swing.JLabel lblEquipoVisitanteE3;
    private javax.swing.JLabel lblEquipoVisitanteE4;
    private javax.swing.JLabel lblEquipoVisitanteE5;
    private javax.swing.JLabel lblEquipoVisitanteE6;
    private javax.swing.JLabel lblEquipoVisitanteF1;
    private javax.swing.JLabel lblEquipoVisitanteF2;
    private javax.swing.JLabel lblEquipoVisitanteF3;
    private javax.swing.JLabel lblEquipoVisitanteF4;
    private javax.swing.JLabel lblEquipoVisitanteF5;
    private javax.swing.JLabel lblEquipoVisitanteF6;
    private javax.swing.JLabel lblEquipoVisitanteFinal1;
    private javax.swing.JLabel lblEquipoVisitanteG1;
    private javax.swing.JLabel lblEquipoVisitanteG2;
    private javax.swing.JLabel lblEquipoVisitanteG3;
    private javax.swing.JLabel lblEquipoVisitanteG4;
    private javax.swing.JLabel lblEquipoVisitanteG5;
    private javax.swing.JLabel lblEquipoVisitanteG6;
    private javax.swing.JLabel lblEquipoVisitanteH1;
    private javax.swing.JLabel lblEquipoVisitanteH2;
    private javax.swing.JLabel lblEquipoVisitanteH3;
    private javax.swing.JLabel lblEquipoVisitanteH4;
    private javax.swing.JLabel lblEquipoVisitanteH5;
    private javax.swing.JLabel lblEquipoVisitanteH6;
    private javax.swing.JLabel lblEquipoVisitanteOctavos1;
    private javax.swing.JLabel lblEquipoVisitanteOctavos2;
    private javax.swing.JLabel lblEquipoVisitanteOctavos3;
    private javax.swing.JLabel lblEquipoVisitanteOctavos4;
    private javax.swing.JLabel lblEquipoVisitanteOctavos5;
    private javax.swing.JLabel lblEquipoVisitanteOctavos6;
    private javax.swing.JLabel lblEquipoVisitanteOctavos7;
    private javax.swing.JLabel lblEquipoVisitanteOctavos8;
    private javax.swing.JLabel lblEquipoVisitanteSemifinales1;
    private javax.swing.JLabel lblEquipoVisitanteSemifinales2;
    private javax.swing.JLabel lblEquipoVisitanteTercerPuesto1;
    private javax.swing.JLabel lblFechaPartidoA1;
    private javax.swing.JLabel lblFechaPartidoA2;
    private javax.swing.JLabel lblFechaPartidoA3;
    private javax.swing.JLabel lblFechaPartidoA4;
    private javax.swing.JLabel lblFechaPartidoA5;
    private javax.swing.JLabel lblFechaPartidoA6;
    private javax.swing.JLabel lblFechaPartidoB1;
    private javax.swing.JLabel lblFechaPartidoB2;
    private javax.swing.JLabel lblFechaPartidoB3;
    private javax.swing.JLabel lblFechaPartidoB4;
    private javax.swing.JLabel lblFechaPartidoB5;
    private javax.swing.JLabel lblFechaPartidoB6;
    private javax.swing.JLabel lblFechaPartidoC1;
    private javax.swing.JLabel lblFechaPartidoC2;
    private javax.swing.JLabel lblFechaPartidoC3;
    private javax.swing.JLabel lblFechaPartidoC4;
    private javax.swing.JLabel lblFechaPartidoC5;
    private javax.swing.JLabel lblFechaPartidoC6;
    private javax.swing.JLabel lblFechaPartidoCuartos1;
    private javax.swing.JLabel lblFechaPartidoCuartos2;
    private javax.swing.JLabel lblFechaPartidoCuartos3;
    private javax.swing.JLabel lblFechaPartidoCuartos4;
    private javax.swing.JLabel lblFechaPartidoD1;
    private javax.swing.JLabel lblFechaPartidoD2;
    private javax.swing.JLabel lblFechaPartidoD3;
    private javax.swing.JLabel lblFechaPartidoD4;
    private javax.swing.JLabel lblFechaPartidoD5;
    private javax.swing.JLabel lblFechaPartidoD6;
    private javax.swing.JLabel lblFechaPartidoE1;
    private javax.swing.JLabel lblFechaPartidoE2;
    private javax.swing.JLabel lblFechaPartidoE3;
    private javax.swing.JLabel lblFechaPartidoE4;
    private javax.swing.JLabel lblFechaPartidoE5;
    private javax.swing.JLabel lblFechaPartidoE6;
    private javax.swing.JLabel lblFechaPartidoF1;
    private javax.swing.JLabel lblFechaPartidoF2;
    private javax.swing.JLabel lblFechaPartidoF3;
    private javax.swing.JLabel lblFechaPartidoF4;
    private javax.swing.JLabel lblFechaPartidoF5;
    private javax.swing.JLabel lblFechaPartidoF6;
    private javax.swing.JLabel lblFechaPartidoFinal1;
    private javax.swing.JLabel lblFechaPartidoG1;
    private javax.swing.JLabel lblFechaPartidoG2;
    private javax.swing.JLabel lblFechaPartidoG3;
    private javax.swing.JLabel lblFechaPartidoG4;
    private javax.swing.JLabel lblFechaPartidoG5;
    private javax.swing.JLabel lblFechaPartidoG6;
    private javax.swing.JLabel lblFechaPartidoH1;
    private javax.swing.JLabel lblFechaPartidoH2;
    private javax.swing.JLabel lblFechaPartidoH3;
    private javax.swing.JLabel lblFechaPartidoH4;
    private javax.swing.JLabel lblFechaPartidoH5;
    private javax.swing.JLabel lblFechaPartidoH6;
    private javax.swing.JLabel lblFechaPartidoOctavos1;
    private javax.swing.JLabel lblFechaPartidoOctavos2;
    private javax.swing.JLabel lblFechaPartidoOctavos3;
    private javax.swing.JLabel lblFechaPartidoOctavos4;
    private javax.swing.JLabel lblFechaPartidoOctavos5;
    private javax.swing.JLabel lblFechaPartidoOctavos6;
    private javax.swing.JLabel lblFechaPartidoOctavos7;
    private javax.swing.JLabel lblFechaPartidoOctavos8;
    private javax.swing.JLabel lblFechaPartidoSemifinales1;
    private javax.swing.JLabel lblFechaPartidoSemifinales2;
    private javax.swing.JLabel lblFechaPartidoTercerPuesto1;
    private javax.swing.JLabel lblNombreEstadioA1;
    private javax.swing.JLabel lblNombreEstadioA2;
    private javax.swing.JLabel lblNombreEstadioA3;
    private javax.swing.JLabel lblNombreEstadioA4;
    private javax.swing.JLabel lblNombreEstadioA5;
    private javax.swing.JLabel lblNombreEstadioA6;
    private javax.swing.JLabel lblNombreEstadioB1;
    private javax.swing.JLabel lblNombreEstadioB2;
    private javax.swing.JLabel lblNombreEstadioB3;
    private javax.swing.JLabel lblNombreEstadioB4;
    private javax.swing.JLabel lblNombreEstadioB5;
    private javax.swing.JLabel lblNombreEstadioB6;
    private javax.swing.JLabel lblNombreEstadioC1;
    private javax.swing.JLabel lblNombreEstadioC2;
    private javax.swing.JLabel lblNombreEstadioC3;
    private javax.swing.JLabel lblNombreEstadioC4;
    private javax.swing.JLabel lblNombreEstadioC5;
    private javax.swing.JLabel lblNombreEstadioC6;
    private javax.swing.JLabel lblNombreEstadioCuartos1;
    private javax.swing.JLabel lblNombreEstadioCuartos2;
    private javax.swing.JLabel lblNombreEstadioCuartos3;
    private javax.swing.JLabel lblNombreEstadioCuartos4;
    private javax.swing.JLabel lblNombreEstadioD1;
    private javax.swing.JLabel lblNombreEstadioD2;
    private javax.swing.JLabel lblNombreEstadioD3;
    private javax.swing.JLabel lblNombreEstadioD4;
    private javax.swing.JLabel lblNombreEstadioD5;
    private javax.swing.JLabel lblNombreEstadioD6;
    private javax.swing.JLabel lblNombreEstadioE1;
    private javax.swing.JLabel lblNombreEstadioE2;
    private javax.swing.JLabel lblNombreEstadioE3;
    private javax.swing.JLabel lblNombreEstadioE4;
    private javax.swing.JLabel lblNombreEstadioE5;
    private javax.swing.JLabel lblNombreEstadioE6;
    private javax.swing.JLabel lblNombreEstadioF1;
    private javax.swing.JLabel lblNombreEstadioF2;
    private javax.swing.JLabel lblNombreEstadioF3;
    private javax.swing.JLabel lblNombreEstadioF4;
    private javax.swing.JLabel lblNombreEstadioF5;
    private javax.swing.JLabel lblNombreEstadioF6;
    private javax.swing.JLabel lblNombreEstadioFinal1;
    private javax.swing.JLabel lblNombreEstadioG1;
    private javax.swing.JLabel lblNombreEstadioG2;
    private javax.swing.JLabel lblNombreEstadioG3;
    private javax.swing.JLabel lblNombreEstadioG4;
    private javax.swing.JLabel lblNombreEstadioG5;
    private javax.swing.JLabel lblNombreEstadioG6;
    private javax.swing.JLabel lblNombreEstadioH1;
    private javax.swing.JLabel lblNombreEstadioH2;
    private javax.swing.JLabel lblNombreEstadioH3;
    private javax.swing.JLabel lblNombreEstadioH4;
    private javax.swing.JLabel lblNombreEstadioH5;
    private javax.swing.JLabel lblNombreEstadioH6;
    private javax.swing.JLabel lblNombreEstadioOctavos1;
    private javax.swing.JLabel lblNombreEstadioOctavos2;
    private javax.swing.JLabel lblNombreEstadioOctavos3;
    private javax.swing.JLabel lblNombreEstadioOctavos4;
    private javax.swing.JLabel lblNombreEstadioOctavos5;
    private javax.swing.JLabel lblNombreEstadioOctavos6;
    private javax.swing.JLabel lblNombreEstadioOctavos7;
    private javax.swing.JLabel lblNombreEstadioOctavos8;
    private javax.swing.JLabel lblNombreEstadioSemifinales1;
    private javax.swing.JLabel lblNombreEstadioSemifinales2;
    private javax.swing.JLabel lblNombreEstadioTercerPuesto1;
    private javax.swing.JPanel panelAFila1;
    private javax.swing.JPanel panelAFila2;
    private javax.swing.JPanel panelAFila3;
    private javax.swing.JPanel panelAFila4;
    private javax.swing.JPanel panelAFila5;
    private javax.swing.JPanel panelAFila6;
    private javax.swing.JPanel panelBFila1;
    private javax.swing.JPanel panelBFila2;
    private javax.swing.JPanel panelBFila3;
    private javax.swing.JPanel panelBFila4;
    private javax.swing.JPanel panelBFila5;
    private javax.swing.JPanel panelBFila6;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelCFila1;
    private javax.swing.JPanel panelCFila2;
    private javax.swing.JPanel panelCFila3;
    private javax.swing.JPanel panelCFila4;
    private javax.swing.JPanel panelCFila5;
    private javax.swing.JPanel panelCFila6;
    private javax.swing.JPanel panelCuartos;
    private javax.swing.JPanel panelCuartosFila1;
    private javax.swing.JPanel panelCuartosFila2;
    private javax.swing.JPanel panelCuartosFila3;
    private javax.swing.JPanel panelCuartosFila4;
    private javax.swing.JPanel panelDFila1;
    private javax.swing.JPanel panelDFila2;
    private javax.swing.JPanel panelDFila3;
    private javax.swing.JPanel panelDFila4;
    private javax.swing.JPanel panelDFila5;
    private javax.swing.JPanel panelDFila6;
    private javax.swing.JPanel panelEFila1;
    private javax.swing.JPanel panelEFila2;
    private javax.swing.JPanel panelEFila3;
    private javax.swing.JPanel panelEFila4;
    private javax.swing.JPanel panelEFila5;
    private javax.swing.JPanel panelEFila6;
    private javax.swing.JPanel panelFFila1;
    private javax.swing.JPanel panelFFila2;
    private javax.swing.JPanel panelFFila3;
    private javax.swing.JPanel panelFFila4;
    private javax.swing.JPanel panelFFila5;
    private javax.swing.JPanel panelFFila6;
    private javax.swing.JPanel panelFinal;
    private javax.swing.JPanel panelGFila1;
    private javax.swing.JPanel panelGFila2;
    private javax.swing.JPanel panelGFila3;
    private javax.swing.JPanel panelGFila4;
    private javax.swing.JPanel panelGFila5;
    private javax.swing.JPanel panelGFila6;
    private javax.swing.JPanel panelGrupoA;
    private javax.swing.JPanel panelGrupoB;
    private javax.swing.JPanel panelGrupoC;
    private javax.swing.JPanel panelGrupoD;
    private javax.swing.JPanel panelGrupoE;
    private javax.swing.JPanel panelGrupoF;
    private javax.swing.JPanel panelGrupoG;
    private javax.swing.JPanel panelGrupoH;
    private javax.swing.JPanel panelHFila1;
    private javax.swing.JPanel panelHFila2;
    private javax.swing.JPanel panelHFila3;
    private javax.swing.JPanel panelHFila4;
    private javax.swing.JPanel panelHFila5;
    private javax.swing.JPanel panelHFila6;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelInteriorA;
    private javax.swing.JPanel panelInteriorB;
    private javax.swing.JPanel panelInteriorC;
    private javax.swing.JPanel panelInteriorCuartos;
    private javax.swing.JPanel panelInteriorD;
    private javax.swing.JPanel panelInteriorE;
    private javax.swing.JPanel panelInteriorF;
    private javax.swing.JPanel panelInteriorFinal;
    private javax.swing.JPanel panelInteriorG;
    private javax.swing.JPanel panelInteriorH;
    private javax.swing.JPanel panelInteriorOctavos;
    private javax.swing.JPanel panelInteriorSemifinales;
    private javax.swing.JPanel panelInteriorTercerPuesto;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelOctavos;
    private javax.swing.JPanel panelOctavosFila1;
    private javax.swing.JPanel panelOctavosFila2;
    private javax.swing.JPanel panelOctavosFila3;
    private javax.swing.JPanel panelOctavosFila4;
    private javax.swing.JPanel panelOctavosFila5;
    private javax.swing.JPanel panelOctavosFila6;
    private javax.swing.JPanel panelOctavosFila7;
    private javax.swing.JPanel panelOctavosFila8;
    private javax.swing.JPanel panelSemifinales;
    private javax.swing.JPanel panelSemifinalesFila1;
    private javax.swing.JPanel panelSemifinalesFila2;
    private javax.swing.JPanel panelTercerPuesto;
    private javax.swing.JFormattedTextField penalesField12_Octavos7;
    private javax.swing.JFormattedTextField penalesField1_Octavos1;
    private javax.swing.JFormattedTextField penalesField1_Octavos2;
    private javax.swing.JFormattedTextField penalesField1_Octavos3;
    private javax.swing.JFormattedTextField penalesField1_Octavos4;
    private javax.swing.JFormattedTextField penalesField1_Octavos5;
    private javax.swing.JFormattedTextField penalesField1_Octavos6;
    private javax.swing.JFormattedTextField penalesField1_Octavos7;
    private javax.swing.JFormattedTextField penalesField1_Octavos8;
    private javax.swing.JFormattedTextField penalesField1_cuartos1;
    private javax.swing.JFormattedTextField penalesField1_cuartos2;
    private javax.swing.JFormattedTextField penalesField1_cuartos3;
    private javax.swing.JFormattedTextField penalesField1_cuartos4;
    private javax.swing.JFormattedTextField penalesField1_final1;
    private javax.swing.JFormattedTextField penalesField1_semifinales1;
    private javax.swing.JFormattedTextField penalesField1_semifinales2;
    private javax.swing.JFormattedTextField penalesField1_tercerPuesto1;
    private javax.swing.JFormattedTextField penalesField2_Octavos1;
    private javax.swing.JFormattedTextField penalesField2_Octavos2;
    private javax.swing.JFormattedTextField penalesField2_Octavos3;
    private javax.swing.JFormattedTextField penalesField2_Octavos4;
    private javax.swing.JFormattedTextField penalesField2_Octavos5;
    private javax.swing.JFormattedTextField penalesField2_Octavos6;
    private javax.swing.JFormattedTextField penalesField2_Octavos8;
    private javax.swing.JFormattedTextField penalesField2_cuartos1;
    private javax.swing.JFormattedTextField penalesField2_cuartos2;
    private javax.swing.JFormattedTextField penalesField2_cuartos3;
    private javax.swing.JFormattedTextField penalesField2_cuartos4;
    private javax.swing.JFormattedTextField penalesField2_final1;
    private javax.swing.JFormattedTextField penalesField2_semifinales1;
    private javax.swing.JFormattedTextField penalesField2_semifinales2;
    private javax.swing.JFormattedTextField penalesField2_tercerPuesto1;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables

    private void loadPartidosGrupoA() {

        javax.swing.JLabel[] fechasA = {
            lblFechaPartidoA1,
            lblFechaPartidoA2,
            lblFechaPartidoA3,
            lblFechaPartidoA4,
            lblFechaPartidoA5,
            lblFechaPartidoA6,};

        javax.swing.JLabel[] equipoLocales = {
            lblEquipoLocalA1,
            lblEquipoLocalA2,
            lblEquipoLocalA3,
            lblEquipoLocalA4,
            lblEquipoLocalA5,
            lblEquipoLocalA6
        };

        javax.swing.JLabel[] estadiosA = {
            lblNombreEstadioA1,
            lblNombreEstadioA2,
            lblNombreEstadioA3,
            lblNombreEstadioA4,
            lblNombreEstadioA5,
            lblNombreEstadioA6,};

        javax.swing.JLabel[] equiposVisitantes = {
            lblEquipoVisitanteA1,
            lblEquipoVisitanteA2,
            lblEquipoVisitanteA3,
            lblEquipoVisitanteA4,
            lblEquipoVisitanteA5,
            lblEquipoVisitanteA6,};

        golesLocalGrupoA[0] = golesField1_A1;
        golesLocalGrupoA[1] = golesField1_A2;
        golesLocalGrupoA[2] = golesField1_A3;
        golesLocalGrupoA[3] = golesField1_A4;
        golesLocalGrupoA[4] = golesField1_A5;
        golesLocalGrupoA[5] = golesField1_A6;

        golesVisitantesGrupoA[0] = golesField2_A1;
        golesVisitantesGrupoA[1] = golesField2_A2;
        golesVisitantesGrupoA[2] = golesField2_A3;
        golesVisitantesGrupoA[3] = golesField2_A4;
        golesVisitantesGrupoA[4] = golesField2_A5;
        golesVisitantesGrupoA[5] = golesField2_A6;

        Grupo grupoA = grupoRepository.get('a');

        ArrayList<Partido> partidos = partidoRepository.findBy(Fase.DE_GRUPOS, grupoA);

        Collections.sort(partidos, new Comparator<Partido>() {
            @Override
            public int compare(Partido p1, Partido p2) {
                return p1.getFechaYHora().isBefore(p2.getFechaYHora()) ? -1 : 1;
            }
        });

        List<Partido> partidosOrdenados = partidos.stream()
                .sorted(Comparator.comparing(Partido::getFechaYHora))
                .collect(Collectors.toList());

        int i = 0;
        for (Partido p : partidosOrdenados) {

            // Lleno listado de ids de partido, para poder ubicar los goles y escribirlos en los fields
            idsPartidosGrupoA.add(p.getId());

            // Fecha con formato
            fechasA[i].setText(p.getFechaYHora().format(DateTimeFormatter.ofPattern("d MMM uuuu - hh:mm")));

            equipoLocales[i].setText(p.getEquipo1().getNombre());

            // Bandera equipo local
            ImageIcon imagenEquipoLocal = new ImageIcon("src/static/img/banderas/" + p.getEquipo1().getId() + ".png");

            // Achico la imagen
            ImageIcon imagenEquipoLocalAchicada = new ImageIcon(imagenEquipoLocal.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equipoLocales[i].setIcon(imagenEquipoLocalAchicada);

            estadiosA[i].setText("Estadio " + p.getEstadio().getNombre());

            equiposVisitantes[i].setText(p.getEquipo2().getNombre());

            // Bandera equipo visitante
            ImageIcon imagenEquipoVisitante = new ImageIcon("src/static/img/banderas/" + p.getEquipo2().getId() + ".png");

            // Achico la imagen
            ImageIcon imagenEquipoVisitanteAchicada = new ImageIcon(imagenEquipoVisitante.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equiposVisitantes[i].setIcon(imagenEquipoVisitanteAchicada);
            equiposVisitantes[i].setHorizontalTextPosition(JLabel.LEFT);

            // Escribo los goles en los fields
            golesLocalGrupoA[i].setText(String.valueOf(p.getGolesEquipo1()));
            golesVisitantesGrupoA[i].setText(String.valueOf(p.getGolesEquipo2()));

            i++;
        }
    }

    private void loadPartidosGrupoB() {

        javax.swing.JLabel[] fechasB = {
            lblFechaPartidoB1,
            lblFechaPartidoB2,
            lblFechaPartidoB3,
            lblFechaPartidoB4,
            lblFechaPartidoB5,
            lblFechaPartidoB6,};

        javax.swing.JLabel[] equipoLocalesB = {
            lblEquipoLocalB1,
            lblEquipoLocalB2,
            lblEquipoLocalB3,
            lblEquipoLocalB4,
            lblEquipoLocalB5,
            lblEquipoLocalB6
        };

        javax.swing.JLabel[] estadiosB = {
            lblNombreEstadioB1,
            lblNombreEstadioB2,
            lblNombreEstadioB3,
            lblNombreEstadioB4,
            lblNombreEstadioB5,
            lblNombreEstadioB6,};

        javax.swing.JLabel[] equiposVisitantesB = {
            lblEquipoVisitanteB1,
            lblEquipoVisitanteB2,
            lblEquipoVisitanteB3,
            lblEquipoVisitanteB4,
            lblEquipoVisitanteB5,
            lblEquipoVisitanteB6,};

        golesLocalGrupoB[0] = golesField1_B1;
        golesLocalGrupoB[1] = golesField1_B2;
        golesLocalGrupoB[2] = golesField1_B3;
        golesLocalGrupoB[3] = golesField1_B4;
        golesLocalGrupoB[4] = golesField1_B5;
        golesLocalGrupoB[5] = golesField1_B6;

        golesVisitantesGrupoB[0] = golesField2_B1;
        golesVisitantesGrupoB[1] = golesField2_B2;
        golesVisitantesGrupoB[2] = golesField2_B3;
        golesVisitantesGrupoB[3] = golesField2_B4;
        golesVisitantesGrupoB[4] = golesField2_B5;
        golesVisitantesGrupoB[5] = golesField2_B6;

        Grupo grupoB = grupoRepository.get('b');

        ArrayList<Partido> partidos = partidoRepository.findBy(Fase.DE_GRUPOS, grupoB);

        Collections.sort(partidos, new Comparator<Partido>() {
            @Override
            public int compare(Partido p1, Partido p2) {
                return p1.getFechaYHora().isBefore(p2.getFechaYHora()) ? -1 : 1;
            }
        });

        List<Partido> partidosOrdenados = partidos.stream()
                .sorted(Comparator.comparing(Partido::getFechaYHora))
                .collect(Collectors.toList());

        int i = 0;
        for (Partido p : partidosOrdenados) {

            // Lleno listado de ids de partido, para poder ubicar los goles y escribirlos en los fields
            idsPartidosGrupoB.add(p.getId());

            // Fecha con formato
            fechasB[i].setText(p.getFechaYHora().format(DateTimeFormatter.ofPattern("d MMM uuuu - hh:mm")));

            equipoLocalesB[i].setText(p.getEquipo1().getNombre());

            // Bandera equipo local
            ImageIcon imagenEquipoLocal = new ImageIcon("src/static/img/banderas/" + p.getEquipo1().getId() + ".png");

            // Achico la imagen
            ImageIcon imagenEquipoLocalAchicada = new ImageIcon(imagenEquipoLocal.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equipoLocalesB[i].setIcon(imagenEquipoLocalAchicada);

            estadiosB[i].setText("Estadio " + p.getEstadio().getNombre());

            equiposVisitantesB[i].setText(p.getEquipo2().getNombre());

            // Bandera equipo visitante
            ImageIcon imagenEquipoVisitante = new ImageIcon("src/static/img/banderas/" + p.getEquipo2().getId() + ".png");

            // Achico la imagen
            ImageIcon imagenEquipoVisitanteAchicada = new ImageIcon(imagenEquipoVisitante.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equiposVisitantesB[i].setIcon(imagenEquipoVisitanteAchicada);
            equiposVisitantesB[i].setHorizontalTextPosition(JLabel.LEFT);

            // Escribo los goles en los fields
            golesLocalGrupoB[i].setText(String.valueOf(p.getGolesEquipo1()));
            golesVisitantesGrupoB[i].setText(String.valueOf(p.getGolesEquipo2()));

            i++;
        }
    }

    private void loadPartidosGrupoC() {

        javax.swing.JLabel[] fechasC = {
            lblFechaPartidoC1,
            lblFechaPartidoC2,
            lblFechaPartidoC3,
            lblFechaPartidoC4,
            lblFechaPartidoC5,
            lblFechaPartidoC6,};

        javax.swing.JLabel[] equipoLocalesC = {
            lblEquipoLocalC1,
            lblEquipoLocalC2,
            lblEquipoLocalC3,
            lblEquipoLocalC4,
            lblEquipoLocalC5,
            lblEquipoLocalC6
        };

        javax.swing.JLabel[] estadiosC = {
            lblNombreEstadioC1,
            lblNombreEstadioC2,
            lblNombreEstadioC3,
            lblNombreEstadioC4,
            lblNombreEstadioC5,
            lblNombreEstadioC6,};

        javax.swing.JLabel[] equiposVisitantesC = {
            lblEquipoVisitanteC1,
            lblEquipoVisitanteC2,
            lblEquipoVisitanteC3,
            lblEquipoVisitanteC4,
            lblEquipoVisitanteC5,
            lblEquipoVisitanteC6,};

        golesLocalGrupoC[0] = golesField1_C1;
        golesLocalGrupoC[1] = golesField1_C2;
        golesLocalGrupoC[2] = golesField1_C3;
        golesLocalGrupoC[3] = golesField1_C4;
        golesLocalGrupoC[4] = golesField1_C5;
        golesLocalGrupoC[5] = golesField1_C6;

        golesVisitantesGrupoC[0] = golesField2_C1;
        golesVisitantesGrupoC[1] = golesField2_C2;
        golesVisitantesGrupoC[2] = golesField2_C3;
        golesVisitantesGrupoC[3] = golesField2_C4;
        golesVisitantesGrupoC[4] = golesField2_C5;
        golesVisitantesGrupoC[5] = golesField2_C6;

        Grupo grupoC = grupoRepository.get('c');

        ArrayList<Partido> partidos = partidoRepository.findBy(Fase.DE_GRUPOS, grupoC);

        Collections.sort(partidos, new Comparator<Partido>() {
            @Override
            public int compare(Partido p1, Partido p2) {
                return p1.getFechaYHora().isBefore(p2.getFechaYHora()) ? -1 : 1;
            }
        });

        List<Partido> partidosOrdenados = partidos.stream()
                .sorted(Comparator.comparing(Partido::getFechaYHora))
                .collect(Collectors.toList());

        System.out.println(partidos);
        int i = 0;
        for (Partido p : partidosOrdenados) {

            // Lleno listado de ids de partido, para poder ubicar los goles y escribirlos en los fields
            idsPartidosGrupoC.add(p.getId());

            // Fecha con formato
            fechasC[i].setText(p.getFechaYHora().format(DateTimeFormatter.ofPattern("d MMM uuuu - hh:mm")));

            equipoLocalesC[i].setText(p.getEquipo1().getNombre());

            // Bandera equipo local
            ImageIcon imagenEquipoLocal = new ImageIcon("src/static/img/banderas/" + p.getEquipo1().getId() + ".png");

            // Achico la imagen
            ImageIcon imagenEquipoLocalAchicada = new ImageIcon(imagenEquipoLocal.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equipoLocalesC[i].setIcon(imagenEquipoLocalAchicada);

            estadiosC[i].setText("Estadio " + p.getEstadio().getNombre());

            equiposVisitantesC[i].setText(p.getEquipo2().getNombre());

            // Bandera equipo visitante
            ImageIcon imagenEquipoVisitante = new ImageIcon("src/static/img/banderas/" + p.getEquipo2().getId() + ".png");

            // Achico la imagen
            ImageIcon imagenEquipoVisitanteAchicada = new ImageIcon(imagenEquipoVisitante.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equiposVisitantesC[i].setIcon(imagenEquipoVisitanteAchicada);
            equiposVisitantesC[i].setHorizontalTextPosition(JLabel.LEFT);

            // Escribo los goles en los fields
            golesLocalGrupoC[i].setText(String.valueOf(p.getGolesEquipo1()));
            golesVisitantesGrupoC[i].setText(String.valueOf(p.getGolesEquipo2()));

            i++;
        }
    }

    private void loadPartidosGrupoD() {

        javax.swing.JLabel[] fechasD = {
            lblFechaPartidoD1,
            lblFechaPartidoD2,
            lblFechaPartidoD3,
            lblFechaPartidoD4,
            lblFechaPartidoD5,
            lblFechaPartidoD6,};

        javax.swing.JLabel[] equipoLocalesD = {
            lblEquipoLocalD1,
            lblEquipoLocalD2,
            lblEquipoLocalD3,
            lblEquipoLocalD4,
            lblEquipoLocalD5,
            lblEquipoLocalD6
        };

        javax.swing.JLabel[] estadiosD = {
            lblNombreEstadioD1,
            lblNombreEstadioD2,
            lblNombreEstadioD3,
            lblNombreEstadioD4,
            lblNombreEstadioD5,
            lblNombreEstadioD6,};

        javax.swing.JLabel[] equiposVisitantesD = {
            lblEquipoVisitanteD1,
            lblEquipoVisitanteD2,
            lblEquipoVisitanteD3,
            lblEquipoVisitanteD4,
            lblEquipoVisitanteD5,
            lblEquipoVisitanteD6,};

        golesLocalGrupoD[0] = golesField1_D1;
        golesLocalGrupoD[1] = golesField1_D2;
        golesLocalGrupoD[2] = golesField1_D3;
        golesLocalGrupoD[3] = golesField1_D4;
        golesLocalGrupoD[4] = golesField1_D5;
        golesLocalGrupoD[5] = golesField1_D6;

        golesVisitantesGrupoD[0] = golesField2_D1;
        golesVisitantesGrupoD[1] = golesField2_D2;
        golesVisitantesGrupoD[2] = golesField2_D3;
        golesVisitantesGrupoD[3] = golesField2_D4;
        golesVisitantesGrupoD[4] = golesField2_D5;
        golesVisitantesGrupoD[5] = golesField2_D6;

        Grupo grupoD = grupoRepository.get('d');

        ArrayList<Partido> partidos = partidoRepository.findBy(Fase.DE_GRUPOS, grupoD);

        Collections.sort(partidos, new Comparator<Partido>() {
            @Override
            public int compare(Partido p1, Partido p2) {
                return p1.getFechaYHora().isBefore(p2.getFechaYHora()) ? -1 : 1;
            }
        });

        List<Partido> partidosOrdenados = partidos.stream()
                .sorted(Comparator.comparing(Partido::getFechaYHora))
                .collect(Collectors.toList());

        System.out.println(partidos);
        int i = 0;
        for (Partido p : partidosOrdenados) {

            // Lleno listado de ids de partido, para poder ubicar los goles y escribirlos en los fields
            idsPartidosGrupoD.add(p.getId());

            // Fecha con formato
            fechasD[i].setText(p.getFechaYHora().format(DateTimeFormatter.ofPattern("d MMM uuuu - hh:mm")));

            equipoLocalesD[i].setText(p.getEquipo1().getNombre());

            // Bandera equipo local
            ImageIcon imagenEquipoLocal = new ImageIcon("src/static/img/banderas/" + p.getEquipo1().getId() + ".png");

            // Achico la imagen
            ImageIcon imagenEquipoLocalAchicada = new ImageIcon(imagenEquipoLocal.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equipoLocalesD[i].setIcon(imagenEquipoLocalAchicada);

            estadiosD[i].setText("Estadio " + p.getEstadio().getNombre());

            equiposVisitantesD[i].setText(p.getEquipo2().getNombre());

            // Bandera equipo visitante
            ImageIcon imagenEquipoVisitante = new ImageIcon("src/static/img/banderas/" + p.getEquipo2().getId() + ".png");

            // Achico la imagen
            ImageIcon imagenEquipoVisitanteAchicada = new ImageIcon(imagenEquipoVisitante.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equiposVisitantesD[i].setIcon(imagenEquipoVisitanteAchicada);
            equiposVisitantesD[i].setHorizontalTextPosition(JLabel.LEFT);

            // Escribo los goles en los fields
            golesLocalGrupoD[i].setText(String.valueOf(p.getGolesEquipo1()));
            golesVisitantesGrupoD[i].setText(String.valueOf(p.getGolesEquipo2()));

            i++;
        }
    }

    private void loadPartidosGrupoE() {

        javax.swing.JLabel[] fechasE = {
            lblFechaPartidoE1,
            lblFechaPartidoE2,
            lblFechaPartidoE3,
            lblFechaPartidoE4,
            lblFechaPartidoE5,
            lblFechaPartidoE6,};

        javax.swing.JLabel[] equipoLocalesE = {
            lblEquipoLocalE1,
            lblEquipoLocalE2,
            lblEquipoLocalE3,
            lblEquipoLocalE4,
            lblEquipoLocalE5,
            lblEquipoLocalE6
        };

        javax.swing.JLabel[] estadiosE = {
            lblNombreEstadioE1,
            lblNombreEstadioE2,
            lblNombreEstadioE3,
            lblNombreEstadioE4,
            lblNombreEstadioE5,
            lblNombreEstadioE6,};

        javax.swing.JLabel[] equiposVisitantesE = {
            lblEquipoVisitanteE1,
            lblEquipoVisitanteE2,
            lblEquipoVisitanteE3,
            lblEquipoVisitanteE4,
            lblEquipoVisitanteE5,
            lblEquipoVisitanteE6,};

        golesLocalGrupoE[0] = golesField1_E1;
        golesLocalGrupoE[1] = golesField1_E2;
        golesLocalGrupoE[2] = golesField1_E3;
        golesLocalGrupoE[3] = golesField1_E4;
        golesLocalGrupoE[4] = golesField1_E5;
        golesLocalGrupoE[5] = golesField1_E6;

        golesVisitantesGrupoE[0] = golesField2_E1;
        golesVisitantesGrupoE[1] = golesField2_E2;
        golesVisitantesGrupoE[2] = golesField2_E3;
        golesVisitantesGrupoE[3] = golesField2_E4;
        golesVisitantesGrupoE[4] = golesField2_E5;
        golesVisitantesGrupoE[5] = golesField2_E6;

        Grupo grupoE = grupoRepository.get('e');

        ArrayList<Partido> partidos = partidoRepository.findBy(Fase.DE_GRUPOS, grupoE);

        Collections.sort(partidos, new Comparator<Partido>() {
            @Override
            public int compare(Partido p1, Partido p2) {
                return p1.getFechaYHora().isBefore(p2.getFechaYHora()) ? -1 : 1;
            }
        });

        List<Partido> partidosOrdenados = partidos.stream()
                .sorted(Comparator.comparing(Partido::getFechaYHora))
                .collect(Collectors.toList());

        System.out.println(partidos);
        int i = 0;
        for (Partido p : partidosOrdenados) {

            // Lleno listado de ids de partido, para poder ubicar los goles y escribirlos en los fields
            idsPartidosGrupoE.add(p.getId());

            // Fecha con formato
            fechasE[i].setText(p.getFechaYHora().format(DateTimeFormatter.ofPattern("d MMM uuuu - hh:mm")));

            equipoLocalesE[i].setText(p.getEquipo1().getNombre());

            // Bandera equipo local
            ImageIcon imagenEquipoLocal = new ImageIcon("src/static/img/banderas/" + p.getEquipo1().getId() + ".png");

            // Achico la imagen
            ImageIcon imagenEquipoLocalAchicada = new ImageIcon(imagenEquipoLocal.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equipoLocalesE[i].setIcon(imagenEquipoLocalAchicada);

            estadiosE[i].setText("Estadio " + p.getEstadio().getNombre());

            equiposVisitantesE[i].setText(p.getEquipo2().getNombre());

            // Bandera equipo visitante
            ImageIcon imagenEquipoVisitante = new ImageIcon("src/static/img/banderas/" + p.getEquipo2().getId() + ".png");

            // Achico la imagen
            ImageIcon imagenEquipoVisitanteAchicada = new ImageIcon(imagenEquipoVisitante.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equiposVisitantesE[i].setIcon(imagenEquipoVisitanteAchicada);
            equiposVisitantesE[i].setHorizontalTextPosition(JLabel.LEFT);

            // Escribo los goles en los fields
            golesLocalGrupoE[i].setText(String.valueOf(p.getGolesEquipo1()));
            golesVisitantesGrupoE[i].setText(String.valueOf(p.getGolesEquipo2()));

            i++;
        }
    }

    private void loadPartidosGrupoF() {

        javax.swing.JLabel[] fechasF = {
            lblFechaPartidoF1,
            lblFechaPartidoF2,
            lblFechaPartidoF3,
            lblFechaPartidoF4,
            lblFechaPartidoF5,
            lblFechaPartidoF6,};

        javax.swing.JLabel[] equipoLocalesF = {
            lblEquipoLocalF1,
            lblEquipoLocalF2,
            lblEquipoLocalF3,
            lblEquipoLocalF4,
            lblEquipoLocalF5,
            lblEquipoLocalF6
        };

        javax.swing.JLabel[] estadiosF = {
            lblNombreEstadioF1,
            lblNombreEstadioF2,
            lblNombreEstadioF3,
            lblNombreEstadioF4,
            lblNombreEstadioF5,
            lblNombreEstadioF6,};

        javax.swing.JLabel[] equiposVisitantesF = {
            lblEquipoVisitanteF1,
            lblEquipoVisitanteF2,
            lblEquipoVisitanteF3,
            lblEquipoVisitanteF4,
            lblEquipoVisitanteF5,
            lblEquipoVisitanteF6,};

        golesLocalGrupoF[0] = golesField1_F1;
        golesLocalGrupoF[1] = golesField1_F2;
        golesLocalGrupoF[2] = golesField1_F3;
        golesLocalGrupoF[3] = golesField1_F4;
        golesLocalGrupoF[4] = golesField1_F5;
        golesLocalGrupoF[5] = golesField1_F6;

        golesVisitantesGrupoF[0] = golesField2_F1;
        golesVisitantesGrupoF[1] = golesField2_F2;
        golesVisitantesGrupoF[2] = golesField2_F3;
        golesVisitantesGrupoF[3] = golesField2_F4;
        golesVisitantesGrupoF[4] = golesField2_F5;
        golesVisitantesGrupoF[5] = golesField2_F6;

        Grupo grupoF = grupoRepository.get('f');

        ArrayList<Partido> partidos = partidoRepository.findBy(Fase.DE_GRUPOS, grupoF);

        Collections.sort(partidos, new Comparator<Partido>() {
            @Override
            public int compare(Partido p1, Partido p2) {
                return p1.getFechaYHora().isBefore(p2.getFechaYHora()) ? -1 : 1;
            }
        });

        List<Partido> partidosOrdenados = partidos.stream()
                .sorted(Comparator.comparing(Partido::getFechaYHora))
                .collect(Collectors.toList());

        System.out.println(partidos);
        int i = 0;
        for (Partido p : partidosOrdenados) {

            // Lleno listado de ids de partido, para poder ubicar los goles y escribirlos en los fields
            idsPartidosGrupoF.add(p.getId());

            // Fecha con formato
            fechasF[i].setText(p.getFechaYHora().format(DateTimeFormatter.ofPattern("d MMM uuuu - hh:mm")));

            equipoLocalesF[i].setText(p.getEquipo1().getNombre());

            // Bandera equipo local
            ImageIcon imagenEquipoLocal = new ImageIcon("src/static/img/banderas/" + p.getEquipo1().getId() + ".png");

            // Achico la imagen
            ImageIcon imagenEquipoLocalAchicada = new ImageIcon(imagenEquipoLocal.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equipoLocalesF[i].setIcon(imagenEquipoLocalAchicada);

            estadiosF[i].setText("Estadio " + p.getEstadio().getNombre());

            equiposVisitantesF[i].setText(p.getEquipo2().getNombre());

            // Bandera equipo visitante
            ImageIcon imagenEquipoVisitante = new ImageIcon("src/static/img/banderas/" + p.getEquipo2().getId() + ".png");

            // Achico la imagen
            ImageIcon imagenEquipoVisitanteAchicada = new ImageIcon(imagenEquipoVisitante.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equiposVisitantesF[i].setIcon(imagenEquipoVisitanteAchicada);
            equiposVisitantesF[i].setHorizontalTextPosition(JLabel.LEFT);

            // Escribo los goles en los fields
            golesLocalGrupoF[i].setText(String.valueOf(p.getGolesEquipo1()));
            golesVisitantesGrupoF[i].setText(String.valueOf(p.getGolesEquipo2()));

            i++;
        }
    }

    private void loadPartidosGrupoG() {

        javax.swing.JLabel[] fechasG = {
            lblFechaPartidoG1,
            lblFechaPartidoG2,
            lblFechaPartidoG3,
            lblFechaPartidoG4,
            lblFechaPartidoG5,
            lblFechaPartidoG6,};

        javax.swing.JLabel[] equipoLocalesG = {
            lblEquipoLocalG1,
            lblEquipoLocalG2,
            lblEquipoLocalG3,
            lblEquipoLocalG4,
            lblEquipoLocalG5,
            lblEquipoLocalG6
        };

        javax.swing.JLabel[] estadiosG = {
            lblNombreEstadioG1,
            lblNombreEstadioG2,
            lblNombreEstadioG3,
            lblNombreEstadioG4,
            lblNombreEstadioG5,
            lblNombreEstadioG6,};

        javax.swing.JLabel[] equiposVisitantesG = {
            lblEquipoVisitanteG1,
            lblEquipoVisitanteG2,
            lblEquipoVisitanteG3,
            lblEquipoVisitanteG4,
            lblEquipoVisitanteG5,
            lblEquipoVisitanteG6,};

        golesLocalGrupoG[0] = golesField1_G1;
        golesLocalGrupoG[1] = golesField1_G2;
        golesLocalGrupoG[2] = golesField1_G3;
        golesLocalGrupoG[3] = golesField1_G4;
        golesLocalGrupoG[4] = golesField1_G5;
        golesLocalGrupoG[5] = golesField1_G6;

        golesVisitantesGrupoG[0] = golesField2_G1;
        golesVisitantesGrupoG[1] = golesField2_G2;
        golesVisitantesGrupoG[2] = golesField2_G3;
        golesVisitantesGrupoG[3] = golesField2_G4;
        golesVisitantesGrupoG[4] = golesField2_G5;
        golesVisitantesGrupoG[5] = golesField2_G6;

        Grupo grupoG = grupoRepository.get('g');

        ArrayList<Partido> partidos = partidoRepository.findBy(Fase.DE_GRUPOS, grupoG);

        Collections.sort(partidos, new Comparator<Partido>() {
            @Override
            public int compare(Partido p1, Partido p2) {
                return p1.getFechaYHora().isBefore(p2.getFechaYHora()) ? -1 : 1;
            }
        });

        List<Partido> partidosOrdenados = partidos.stream()
                .sorted(Comparator.comparing(Partido::getFechaYHora))
                .collect(Collectors.toList());

        System.out.println(partidos);
        int i = 0;
        for (Partido p : partidosOrdenados) {

            // Lleno listado de ids de partido, para poder ubicar los goles y escribirlos en los fields
            idsPartidosGrupoG.add(p.getId());

            // Fecha con formato
            fechasG[i].setText(p.getFechaYHora().format(DateTimeFormatter.ofPattern("d MMM uuuu - hh:mm")));

            equipoLocalesG[i].setText(p.getEquipo1().getNombre());

            // Bandera equipo local
            ImageIcon imagenEquipoLocal = new ImageIcon("src/static/img/banderas/" + p.getEquipo1().getId() + ".png");

            // Achico la imagen
            ImageIcon imagenEquipoLocalAchicada = new ImageIcon(imagenEquipoLocal.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equipoLocalesG[i].setIcon(imagenEquipoLocalAchicada);

            estadiosG[i].setText("Estadio " + p.getEstadio().getNombre());

            equiposVisitantesG[i].setText(p.getEquipo2().getNombre());

            // Bandera equipo visitante
            ImageIcon imagenEquipoVisitante = new ImageIcon("src/static/img/banderas/" + p.getEquipo2().getId() + ".png");

            // Achico la imagen
            ImageIcon imagenEquipoVisitanteAchicada = new ImageIcon(imagenEquipoVisitante.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equiposVisitantesG[i].setIcon(imagenEquipoVisitanteAchicada);
            equiposVisitantesG[i].setHorizontalTextPosition(JLabel.LEFT);

            // Escribo los goles en los fields
            golesLocalGrupoG[i].setText(String.valueOf(p.getGolesEquipo1()));
            golesVisitantesGrupoG[i].setText(String.valueOf(p.getGolesEquipo2()));

            i++;
        }
    }

    private void loadPartidosGrupoH() {

        javax.swing.JLabel[] fechasH = {
            lblFechaPartidoH1,
            lblFechaPartidoH2,
            lblFechaPartidoH3,
            lblFechaPartidoH4,
            lblFechaPartidoH5,
            lblFechaPartidoH6,};

        javax.swing.JLabel[] equipoLocalesH = {
            lblEquipoLocalH1,
            lblEquipoLocalH2,
            lblEquipoLocalH3,
            lblEquipoLocalH4,
            lblEquipoLocalH5,
            lblEquipoLocalH6
        };

        javax.swing.JLabel[] estadiosH = {
            lblNombreEstadioH1,
            lblNombreEstadioH2,
            lblNombreEstadioH3,
            lblNombreEstadioH4,
            lblNombreEstadioH5,
            lblNombreEstadioH6,};

        javax.swing.JLabel[] equiposVisitantesH = {
            lblEquipoVisitanteH1,
            lblEquipoVisitanteH2,
            lblEquipoVisitanteH3,
            lblEquipoVisitanteH4,
            lblEquipoVisitanteH5,
            lblEquipoVisitanteH6,};

        golesLocalGrupoH[0] = golesField1_H1;
        golesLocalGrupoH[1] = golesField1_H2;
        golesLocalGrupoH[2] = golesField1_H3;
        golesLocalGrupoH[3] = golesField1_H4;
        golesLocalGrupoH[4] = golesField1_H5;
        golesLocalGrupoH[5] = golesField1_H6;

        golesVisitantesGrupoH[0] = golesField2_H1;
        golesVisitantesGrupoH[1] = golesField2_H2;
        golesVisitantesGrupoH[2] = golesField2_H3;
        golesVisitantesGrupoH[3] = golesField2_H4;
        golesVisitantesGrupoH[4] = golesField2_H5;
        golesVisitantesGrupoH[5] = golesField2_H6;

        Grupo grupoH = grupoRepository.get('h');

        ArrayList<Partido> partidos = partidoRepository.findBy(Fase.DE_GRUPOS, grupoH);

        Collections.sort(partidos, new Comparator<Partido>() {
            @Override
            public int compare(Partido p1, Partido p2) {
                return p1.getFechaYHora().isBefore(p2.getFechaYHora()) ? -1 : 1;
            }
        });

        List<Partido> partidosOrdenados = partidos.stream()
                .sorted(Comparator.comparing(Partido::getFechaYHora))
                .collect(Collectors.toList());

        System.out.println(partidos);
        int i = 0;
        for (Partido p : partidosOrdenados) {

            // Lleno listado de ids de partido, para poder ubicar los goles y escribirlos en los fields
            idsPartidosGrupoH.add(p.getId());

            // Fecha con formato
            fechasH[i].setText(p.getFechaYHora().format(DateTimeFormatter.ofPattern("d MMM uuuu - hh:mm")));

            equipoLocalesH[i].setText(p.getEquipo1().getNombre());

            // Bandera equipo local
            ImageIcon imagenEquipoLocal = new ImageIcon("src/static/img/banderas/" + p.getEquipo1().getId() + ".png");

            // Achico la imagen
            ImageIcon imagenEquipoLocalAchicada = new ImageIcon(imagenEquipoLocal.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equipoLocalesH[i].setIcon(imagenEquipoLocalAchicada);

            estadiosH[i].setText("Estadio " + p.getEstadio().getNombre());

            equiposVisitantesH[i].setText(p.getEquipo2().getNombre());

            // Bandera equipo visitante
            ImageIcon imagenEquipoVisitante = new ImageIcon("src/static/img/banderas/" + p.getEquipo2().getId() + ".png");

            // Achico la imagen
            ImageIcon imagenEquipoVisitanteAchicada = new ImageIcon(imagenEquipoVisitante.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equiposVisitantesH[i].setIcon(imagenEquipoVisitanteAchicada);
            equiposVisitantesH[i].setHorizontalTextPosition(JLabel.LEFT);

            // Escribo los goles en los fields
            golesLocalGrupoH[i].setText(String.valueOf(p.getGolesEquipo1()));
            golesVisitantesGrupoH[i].setText(String.valueOf(p.getGolesEquipo2()));

            i++;
        }
    }

    private void loadPartidosOctavos() {

        javax.swing.JLabel[] fechasOctavos = {
            lblFechaPartidoOctavos1,
            lblFechaPartidoOctavos2,
            lblFechaPartidoOctavos3,
            lblFechaPartidoOctavos4,
            lblFechaPartidoOctavos5,
            lblFechaPartidoOctavos6,
            lblFechaPartidoOctavos7,
            lblFechaPartidoOctavos8,};

        javax.swing.JLabel[] equipoLocalesOctavos = {
            lblEquipoLocalOctavos1,
            lblEquipoLocalOctavos2,
            lblEquipoLocalOctavos3,
            lblEquipoLocalOctavos4,
            lblEquipoLocalOctavos5,
            lblEquipoLocalOctavos6,
            lblEquipoLocalOctavos7,
            lblEquipoLocalOctavos8,};

        javax.swing.JLabel[] estadiosOctavos = {
            lblNombreEstadioOctavos1,
            lblNombreEstadioOctavos2,
            lblNombreEstadioOctavos3,
            lblNombreEstadioOctavos4,
            lblNombreEstadioOctavos5,
            lblNombreEstadioOctavos6,
            lblNombreEstadioOctavos7,
            lblNombreEstadioOctavos8,};

        javax.swing.JLabel[] equiposVisitantesOctavos = {
            lblEquipoVisitanteOctavos1,
            lblEquipoVisitanteOctavos2,
            lblEquipoVisitanteOctavos3,
            lblEquipoVisitanteOctavos4,
            lblEquipoVisitanteOctavos5,
            lblEquipoVisitanteOctavos6,
            lblEquipoVisitanteOctavos7,
            lblEquipoVisitanteOctavos8,};

        golesLocalOctavos[0] = golesField1_Octavos1;
        golesLocalOctavos[1] = golesField1_Octavos2;
        golesLocalOctavos[2] = golesField1_Octavos3;
        golesLocalOctavos[3] = golesField1_Octavos4;
        golesLocalOctavos[4] = golesField1_Octavos5;
        golesLocalOctavos[5] = golesField1_Octavos6;
        golesLocalOctavos[6] = golesField1_Octavos7;
        golesLocalOctavos[7] = golesField1_Octavos8;

        golesVisitantesOctavos[0] = golesField2_Octavos1;
        golesVisitantesOctavos[1] = golesField2_Octavos2;
        golesVisitantesOctavos[2] = golesField2_Octavos3;
        golesVisitantesOctavos[3] = golesField2_Octavos4;
        golesVisitantesOctavos[4] = golesField2_Octavos5;
        golesVisitantesOctavos[5] = golesField2_Octavos6;
        golesVisitantesOctavos[6] = golesField2_Octavos7;
        golesVisitantesOctavos[7] = golesField2_Octavos8;

        ArrayList<Partido> partidos = partidoRepository.findBy(Fase.OCTAVOS);

        Collections.sort(partidos, new Comparator<Partido>() {
            @Override
            public int compare(Partido p1, Partido p2) {
                return p1.getFechaYHora().isBefore(p2.getFechaYHora()) ? -1 : 1;
            }
        });

        List<Partido> partidosOrdenados = partidos.stream()
                .sorted(Comparator.comparing(Partido::getFechaYHora))
                .collect(Collectors.toList());

        System.out.println(partidos);
        int i = 0;
        for (Partido p : partidosOrdenados) {

            // Lleno listado de ids de partido, para poder ubicar los goles y escribirlos en los fields
            idsPartidosOctavos.add(p.getId());

            // Fecha con formato
            fechasOctavos[i].setText(p.getFechaYHora().format(DateTimeFormatter.ofPattern("d MMM uuuu - hh:mm")));

            // Nombre equipo local
            String nombreEquipoLocal = p.getEquipo1() != null ? p.getEquipo1().getNombre() : "?";
            equipoLocalesOctavos[i].setText(nombreEquipoLocal);

            // Bandera equipo local
            String pathBanderaEquipoLocal = p.getEquipo1() != null ? "src/static/img/banderas/" + p.getEquipo1().getId() + ".png" : "src/static/img/banderas/placeholder.png";
            ImageIcon imagenEquipoLocal = new ImageIcon(pathBanderaEquipoLocal);

            // Achico la imagen
            ImageIcon imagenEquipoLocalAchicada = new ImageIcon(imagenEquipoLocal.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equipoLocalesOctavos[i].setIcon(imagenEquipoLocalAchicada);

            estadiosOctavos[i].setText("Estadio " + p.getEstadio().getNombre());

            // Nombre equipo visitante
            String nombreEquipoVisitante = p.getEquipo2() != null ? p.getEquipo2().getNombre() : "?";
            equiposVisitantesOctavos[i].setText(nombreEquipoVisitante);

            // Bandera equipo visitante
            String pathBanderaEquipoVisitante = p.getEquipo2() != null ? "src/static/img/banderas/" + p.getEquipo2().getId() + ".png" : "src/static/img/banderas/placeholder.png";
            ImageIcon imagenEquipoVisitante = new ImageIcon(pathBanderaEquipoVisitante);

            // Achico la imagen
            ImageIcon imagenEquipoVisitanteAchicada = new ImageIcon(imagenEquipoVisitante.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equiposVisitantesOctavos[i].setIcon(imagenEquipoVisitanteAchicada);
            equiposVisitantesOctavos[i].setHorizontalTextPosition(JLabel.LEFT);

            // Si los equipos no están definidos deshabilito los campos
            if (p.getEquipo1() == null || p.getEquipo2() == null) {
                golesLocalOctavos[i].setEnabled(false);
                golesVisitantesOctavos[i].setEnabled(false);
            } else {
                // Escribo los goles en los fields
                golesLocalOctavos[i].setText(String.valueOf(p.getGolesEquipo1()));
                golesVisitantesOctavos[i].setText(String.valueOf(p.getGolesEquipo2()));
            }

            i++;
        }
    }

    private void loadPartidosCuartos() {

        javax.swing.JLabel[] fechasCuartos = {
            lblFechaPartidoCuartos1,
            lblFechaPartidoCuartos2,
            lblFechaPartidoCuartos3,
            lblFechaPartidoCuartos4,};

        javax.swing.JLabel[] equipoLocalesCuartos = {
            lblEquipoLocalCuartos1,
            lblEquipoLocalCuartos2,
            lblEquipoLocalCuartos3,
            lblEquipoLocalCuartos4,};

        javax.swing.JLabel[] estadiosCuartos = {
            lblNombreEstadioCuartos1,
            lblNombreEstadioCuartos2,
            lblNombreEstadioCuartos3,
            lblNombreEstadioCuartos4,};

        javax.swing.JLabel[] equiposVisitantesCuartos = {
            lblEquipoVisitanteCuartos1,
            lblEquipoVisitanteCuartos2,
            lblEquipoVisitanteCuartos3,
            lblEquipoVisitanteCuartos4,};

        golesLocalCuartos[0] = golesField1_cuartos1;
        golesLocalCuartos[1] = golesField1_cuartos2;
        golesLocalCuartos[2] = golesField1_cuartos3;
        golesLocalCuartos[3] = golesField1_cuartos4;

        golesVisitantesCuartos[0] = golesField2_cuartos1;
        golesVisitantesCuartos[1] = golesField2_cuartos2;
        golesVisitantesCuartos[2] = golesField2_cuartos3;
        golesVisitantesCuartos[3] = golesField2_cuartos4;

        ArrayList<Partido> partidos = partidoRepository.findBy(Fase.CUARTOS);

        Collections.sort(partidos, new Comparator<Partido>() {
            @Override
            public int compare(Partido p1, Partido p2) {
                return p1.getFechaYHora().isBefore(p2.getFechaYHora()) ? -1 : 1;
            }
        });

        List<Partido> partidosOrdenados = partidos.stream()
                .sorted(Comparator.comparing(Partido::getFechaYHora))
                .collect(Collectors.toList());

        System.out.println(partidos);
        int i = 0;
        for (Partido p : partidosOrdenados) {

            // Lleno listado de ids de partido, para poder ubicar los goles y escribirlos en los fields
            idsPartidosCuartos.add(p.getId());

            // Fecha con formato
            fechasCuartos[i].setText(p.getFechaYHora().format(DateTimeFormatter.ofPattern("d MMM uuuu - hh:mm")));

            // Nombre equipo local
            String nombreEquipoLocal = p.getEquipo1() != null ? p.getEquipo1().getNombre() : "?";
            equipoLocalesCuartos[i].setText(nombreEquipoLocal);

            // Bandera equipo local
            String pathBanderaEquipoLocal = p.getEquipo1() != null ? "src/static/img/banderas/" + p.getEquipo1().getId() + ".png" : "src/static/img/banderas/placeholder.png";
            ImageIcon imagenEquipoLocal = new ImageIcon(pathBanderaEquipoLocal);

            // Achico la imagen
            ImageIcon imagenEquipoLocalAchicada = new ImageIcon(imagenEquipoLocal.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equipoLocalesCuartos[i].setIcon(imagenEquipoLocalAchicada);

            estadiosCuartos[i].setText("Estadio " + p.getEstadio().getNombre());

            // Nombre equipo visitante
            String nombreEquipoVisitante = p.getEquipo2() != null ? p.getEquipo2().getNombre() : "?";
            equiposVisitantesCuartos[i].setText(nombreEquipoVisitante);

            // Bandera equipo visitante
            String pathBanderaEquipoVisitante = p.getEquipo2() != null ? "src/static/img/banderas/" + p.getEquipo2().getId() + ".png" : "src/static/img/banderas/placeholder.png";
            ImageIcon imagenEquipoVisitante = new ImageIcon(pathBanderaEquipoVisitante);

            // Achico la imagen
            ImageIcon imagenEquipoVisitanteAchicada = new ImageIcon(imagenEquipoVisitante.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equiposVisitantesCuartos[i].setIcon(imagenEquipoVisitanteAchicada);
            equiposVisitantesCuartos[i].setHorizontalTextPosition(JLabel.LEFT);

            // Si los equipos no están definidos deshabilito los campos
            if (p.getEquipo1() == null || p.getEquipo2() == null) {
                golesLocalCuartos[i].setEnabled(false);
                golesVisitantesCuartos[i].setEnabled(false);
            } else {
                // Escribo los goles en los fields
                golesLocalCuartos[i].setText(String.valueOf(p.getGolesEquipo1()));
                golesVisitantesCuartos[i].setText(String.valueOf(p.getGolesEquipo2()));
            }

            i++;
        }
    }

    private void loadPartidosSemifinales() {

        javax.swing.JLabel[] fechasSemifinales = {
            lblFechaPartidoSemifinales1,
            lblFechaPartidoSemifinales2,};

        javax.swing.JLabel[] equipoLocalesSemifinales = {
            lblEquipoLocalSemifinales1,
            lblEquipoLocalSemifinales2,};

        javax.swing.JLabel[] estadiosSemifinales = {
            lblNombreEstadioSemifinales1,
            lblNombreEstadioSemifinales2,};

        javax.swing.JLabel[] equiposVisitantesSemifinales = {
            lblEquipoVisitanteSemifinales1,
            lblEquipoVisitanteSemifinales2,};

        golesLocalSemifinales[0] = golesField1_semifinales1;
        golesLocalSemifinales[1] = golesField1_semifinales2;

        golesVisitantesSemifinales[0] = golesField2_semifinales1;
        golesVisitantesSemifinales[1] = golesField2_semifinales2;

        ArrayList<Partido> partidos = partidoRepository.findBy(Fase.SEMIFINALES);

        Collections.sort(partidos, new Comparator<Partido>() {
            @Override
            public int compare(Partido p1, Partido p2) {
                return p1.getFechaYHora().isBefore(p2.getFechaYHora()) ? -1 : 1;
            }
        });

        List<Partido> partidosOrdenados = partidos.stream()
                .sorted(Comparator.comparing(Partido::getFechaYHora))
                .collect(Collectors.toList());

        System.out.println(partidos);
        int i = 0;
        for (Partido p : partidosOrdenados) {

            // Lleno listado de ids de partido, para poder ubicar los goles y escribirlos en los fields
            idsPartidosSemifinales.add(p.getId());

            // Fecha con formato
            fechasSemifinales[i].setText(p.getFechaYHora().format(DateTimeFormatter.ofPattern("d MMM uuuu - hh:mm")));

            // Nombre equipo local
            String nombreEquipoLocal = p.getEquipo1() != null ? p.getEquipo1().getNombre() : "?";
            equipoLocalesSemifinales[i].setText(nombreEquipoLocal);

            // Bandera equipo local
            String pathBanderaEquipoLocal = p.getEquipo1() != null ? "src/static/img/banderas/" + p.getEquipo1().getId() + ".png" : "src/static/img/banderas/placeholder.png";
            ImageIcon imagenEquipoLocal = new ImageIcon(pathBanderaEquipoLocal);

            // Achico la imagen
            ImageIcon imagenEquipoLocalAchicada = new ImageIcon(imagenEquipoLocal.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equipoLocalesSemifinales[i].setIcon(imagenEquipoLocalAchicada);

            estadiosSemifinales[i].setText("Estadio " + p.getEstadio().getNombre());

            // Nombre equipo visitante
            String nombreEquipoVisitante = p.getEquipo2() != null ? p.getEquipo2().getNombre() : "?";
            equiposVisitantesSemifinales[i].setText(nombreEquipoVisitante);

            // Bandera equipo visitante
            String pathBanderaEquipoVisitante = p.getEquipo2() != null ? "src/static/img/banderas/" + p.getEquipo2().getId() + ".png" : "src/static/img/banderas/placeholder.png";
            ImageIcon imagenEquipoVisitante = new ImageIcon(pathBanderaEquipoVisitante);

            // Achico la imagen
            ImageIcon imagenEquipoVisitanteAchicada = new ImageIcon(imagenEquipoVisitante.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equiposVisitantesSemifinales[i].setIcon(imagenEquipoVisitanteAchicada);
            equiposVisitantesSemifinales[i].setHorizontalTextPosition(JLabel.LEFT);

            // Si los equipos no están definidos deshabilito los campos
            if (p.getEquipo1() == null || p.getEquipo2() == null) {
                golesLocalSemifinales[i].setEnabled(false);
                golesVisitantesSemifinales[i].setEnabled(false);
            } else {
                // Escribo los goles en los fields
                golesLocalSemifinales[i].setText(String.valueOf(p.getGolesEquipo1()));
                golesVisitantesSemifinales[i].setText(String.valueOf(p.getGolesEquipo2()));
            }

            i++;
        }
    }

    private void loadPartidosTercerPuesto() {

        javax.swing.JLabel[] fechasTercerPuesto = {
            lblFechaPartidoTercerPuesto1,};

        javax.swing.JLabel[] equipoLocalesTercerPuesto = {
            lblEquipoLocalTercerPuesto1,};

        javax.swing.JLabel[] estadiosTercerPuesto = {
            lblNombreEstadioTercerPuesto1,};

        javax.swing.JLabel[] equiposVisitantesTercerPuesto = {
            lblEquipoVisitanteTercerPuesto1,};

        golesLocalTercerPuesto[0] = golesField1_tercerPuesto1;

        golesVisitantesTercerPuesto[0] = golesField2_tercerPuesto1;

        ArrayList<Partido> partidos = partidoRepository.findBy(Fase.TERCER_PUESTO);

        Collections.sort(partidos, new Comparator<Partido>() {
            @Override
            public int compare(Partido p1, Partido p2) {
                return p1.getFechaYHora().isBefore(p2.getFechaYHora()) ? -1 : 1;
            }
        });

        List<Partido> partidosOrdenados = partidos.stream()
                .sorted(Comparator.comparing(Partido::getFechaYHora))
                .collect(Collectors.toList());

        System.out.println(partidos);
        int i = 0;
        for (Partido p : partidosOrdenados) {

            // Lleno listado de ids de partido, para poder ubicar los goles y escribirlos en los fields
            idsPartidosTercerPuesto.add(p.getId());

            // Fecha con formato
            fechasTercerPuesto[i].setText(p.getFechaYHora().format(DateTimeFormatter.ofPattern("d MMM uuuu - hh:mm")));

            // Nombre equipo local
            String nombreEquipoLocal = p.getEquipo1() != null ? p.getEquipo1().getNombre() : "?";
            equipoLocalesTercerPuesto[i].setText(nombreEquipoLocal);

            // Bandera equipo local
            String pathBanderaEquipoLocal = p.getEquipo1() != null ? "src/static/img/banderas/" + p.getEquipo1().getId() + ".png" : "src/static/img/banderas/placeholder.png";
            ImageIcon imagenEquipoLocal = new ImageIcon(pathBanderaEquipoLocal);

            // Achico la imagen
            ImageIcon imagenEquipoLocalAchicada = new ImageIcon(imagenEquipoLocal.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equipoLocalesTercerPuesto[i].setIcon(imagenEquipoLocalAchicada);

            estadiosTercerPuesto[i].setText("Estadio " + p.getEstadio().getNombre());

            // Nombre equipo visitante
            String nombreEquipoVisitante = p.getEquipo2() != null ? p.getEquipo2().getNombre() : "?";
            equiposVisitantesTercerPuesto[i].setText(nombreEquipoVisitante);

            // Bandera equipo visitante
            String pathBanderaEquipoVisitante = p.getEquipo2() != null ? "src/static/img/banderas/" + p.getEquipo2().getId() + ".png" : "src/static/img/banderas/placeholder.png";
            ImageIcon imagenEquipoVisitante = new ImageIcon(pathBanderaEquipoVisitante);

            // Achico la imagen
            ImageIcon imagenEquipoVisitanteAchicada = new ImageIcon(imagenEquipoVisitante.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equiposVisitantesTercerPuesto[i].setIcon(imagenEquipoVisitanteAchicada);
            equiposVisitantesTercerPuesto[i].setHorizontalTextPosition(JLabel.LEFT);

            // Si los equipos no están definidos deshabilito los campos
            if (p.getEquipo1() == null || p.getEquipo2() == null) {
                golesLocalTercerPuesto[i].setEnabled(false);
                golesVisitantesTercerPuesto[i].setEnabled(false);
            } else {
                // Escribo los goles en los fields
                golesLocalTercerPuesto[i].setText(String.valueOf(p.getGolesEquipo1()));
                golesVisitantesTercerPuesto[i].setText(String.valueOf(p.getGolesEquipo2()));
            }

            i++;
        }
    }

    private void loadPartidosFinal() {

        javax.swing.JLabel[] fechasFinal = {
            lblFechaPartidoFinal1,};

        javax.swing.JLabel[] equipoLocalesFinal = {
            lblEquipoLocalFinal1,};

        javax.swing.JLabel[] estadiosFinal = {
            lblNombreEstadioFinal1,};

        javax.swing.JLabel[] equiposVisitantesFinal = {
            lblEquipoVisitanteFinal1,};

        golesLocalFinal[0] = golesField1_final1;

        golesVisitantesFinal[0] = golesField2_final1;

        ArrayList<Partido> partidos = partidoRepository.findBy(Fase.FINAL);

        Collections.sort(partidos, new Comparator<Partido>() {
            @Override
            public int compare(Partido p1, Partido p2) {
                return p1.getFechaYHora().isBefore(p2.getFechaYHora()) ? -1 : 1;
            }
        });

        List<Partido> partidosOrdenados = partidos.stream()
                .sorted(Comparator.comparing(Partido::getFechaYHora))
                .collect(Collectors.toList());

        System.out.println(partidos);
        int i = 0;
        for (Partido p : partidosOrdenados) {

            // Lleno listado de ids de partido, para poder ubicar los goles y escribirlos en los fields
            idsPartidosFinal.add(p.getId());

            // Fecha con formato
            fechasFinal[i].setText(p.getFechaYHora().format(DateTimeFormatter.ofPattern("d MMM uuuu - hh:mm")));

            // Nombre equipo local
            String nombreEquipoLocal = p.getEquipo1() != null ? p.getEquipo1().getNombre() : "?";
            equipoLocalesFinal[i].setText(nombreEquipoLocal);

            // Bandera equipo local
            String pathBanderaEquipoLocal = p.getEquipo1() != null ? "src/static/img/banderas/" + p.getEquipo1().getId() + ".png" : "src/static/img/banderas/placeholder.png";
            ImageIcon imagenEquipoLocal = new ImageIcon(pathBanderaEquipoLocal);

            // Achico la imagen
            ImageIcon imagenEquipoLocalAchicada = new ImageIcon(imagenEquipoLocal.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equipoLocalesFinal[i].setIcon(imagenEquipoLocalAchicada);

            estadiosFinal[i].setText("Estadio " + p.getEstadio().getNombre());

            // Nombre equipo visitante
            String nombreEquipoVisitante = p.getEquipo2() != null ? p.getEquipo2().getNombre() : "?";
            equiposVisitantesFinal[i].setText(nombreEquipoVisitante);

            // Bandera equipo visitante
            String pathBanderaEquipoVisitante = p.getEquipo2() != null ? "src/static/img/banderas/" + p.getEquipo2().getId() + ".png" : "src/static/img/banderas/placeholder.png";
            ImageIcon imagenEquipoVisitante = new ImageIcon(pathBanderaEquipoVisitante);

            // Achico la imagen
            ImageIcon imagenEquipoVisitanteAchicada = new ImageIcon(imagenEquipoVisitante.getImage().getScaledInstance(50, 33, Image.SCALE_SMOOTH));

            // Vinculo la imagen con el label
            equiposVisitantesFinal[i].setIcon(imagenEquipoVisitanteAchicada);
            equiposVisitantesFinal[i].setHorizontalTextPosition(JLabel.LEFT);

            // Si los equipos no están definidos deshabilito los campos
            if (p.getEquipo1() == null || p.getEquipo2() == null) {
                golesLocalFinal[i].setEnabled(false);
                golesVisitantesFinal[i].setEnabled(false);
            } else {
                // Escribo los goles en los fields
                golesLocalFinal[i].setText(String.valueOf(p.getGolesEquipo1()));
                golesVisitantesFinal[i].setText(String.valueOf(p.getGolesEquipo2()));
            }

            i++;
        }
    }

    private void cargarRepositorios() {

        //GruposMigrations.up();
        //PartidosMigrations.up();
        grupoRepository = new GrupoRepository();
        partidoRepository = new PartidoRepository();
        equipoRepository = new EquipoRepository();
    }
}
