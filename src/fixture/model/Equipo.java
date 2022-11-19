package fixture.model;

import java.io.Serializable;

public class Equipo implements Serializable {

    private String id;
    private String nombre;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
    private int golesHechos;
    private int golesEnContra;
    private int puntos;
    private boolean octavos;
    private boolean cuartos;
    private boolean semifinal;
    private boolean tercerPuesto;
    private boolean finalista;
    private boolean ganador;

    public boolean isOctavos() {
        return octavos;
    }

    public void setOctavos(boolean octavos) {
        this.octavos = octavos;
    }

    public boolean isCuartos() {
        return cuartos;
    }

    public void setCuartos(boolean cuartos) {
        this.cuartos = cuartos;
    }

    public boolean isSemifinal() {
        return semifinal;
    }

    public void setSemifinal(boolean semifinal) {
        this.semifinal = semifinal;
    }

    public boolean isTercerPuesto() {
        return tercerPuesto;
    }

    public void setTercerPuesto(boolean tercerPuesto) {
        this.tercerPuesto = tercerPuesto;
    }

    public boolean isFinalista() {
        return finalista;
    }

    public void setFinalista(boolean finalista) {
        this.finalista = finalista;
    }

    public boolean isGanador() {
        return ganador;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }

    public void calcularPuntos() {
        puntos = 3 * partidosGanados + partidosEmpatados;
    }

    public void printDatosGenerales() {
        System.out.println("Grupo " + nombre);
        System.out.println("Partidos jugados: " + partidosJugados);
        System.out.println("Partidos ganados: " + partidosGanados);
        System.out.println("Partidos perdidos: " + partidosPerdidos);
        System.out.println("Partidos empatados: " + partidosEmpatados);
        System.out.println("Goles hechos: " + golesHechos);
        System.out.println("Goles en contra: " + golesEnContra);
        System.out.println("Octavos: " + octavos);
        System.out.println("Cuartos: " + cuartos);
        System.out.println("Semifinal: " + semifinal);
        System.out.println("Finalista: " + finalista);
        System.out.println("Puntos: " + puntos);
    }

    public void limpiarDatosDePartidos() {
        partidosJugados = partidosGanados = partidosPerdidos = partidosEmpatados = golesHechos = golesEnContra = 0;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getGolesHechos() {
        return golesHechos;
    }

    public void setGolesHechos(int golesHechos) {
        this.golesHechos = golesHechos;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public void setGolesEnContra(int golesEnContra) {
        this.golesEnContra = golesEnContra;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public Equipo(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return getId() + " | " + getNombre();
    }

}
