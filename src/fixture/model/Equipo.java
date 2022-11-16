package fixture.model;

import java.io.Serializable;

public class Equipo implements Serializable{
    private String id;
    private String nombre;
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

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

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
