package fixture.model;

import java.io.Serializable;

public class Equipo implements Serializable{
    private String id;
    private String nombre;
    private int partidosJugados;
    private int golesHechos;
    private int golesRecibidos;
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
    private int puntosDeEquipo;
    private int difDeGoles;
    
    public void imprimirDatosDeEquipo(){
        System.out.println("Equipo: " + nombre);
        System.out.println("Partidos Jugados: " + partidosJugados);
        System.out.println("Partidos Ganados: " + partidosGanados);
        System.out.println("Partidos Empatados: " + partidosEmpatados);
        System.out.println("Partidos Perdidos: " + partidosPerdidos);
        System.out.println("Goles convertidos: " + golesHechos);
        System.out.println("Goles Recibidos: " + golesRecibidos);
        System.out.println("Puntos: " + puntosDeEquipo);
    }
    public int calcularDifDeGoles(){
       return difDeGoles = golesHechos - golesRecibidos;
    }
    
    
    public void calcularPuntos(){
        puntosDeEquipo = 3 * partidosGanados + partidosEmpatados;
    }
    
    
    public void limpiarDatosEquipo(){
       partidosJugados = partidosGanados = partidosEmpatados = partidosPerdidos = golesHechos = golesRecibidos = 0;
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

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
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

    public int getPuntosDeEquipo() {
        return puntosDeEquipo;
    }

    public void setPuntosDeEquipo(int puntosDeEquipo) {
        this.puntosDeEquipo = puntosDeEquipo;
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
