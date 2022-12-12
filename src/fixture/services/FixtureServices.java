/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixture.services;

import fixture.model.Equipo;
import fixture.model.Fase;
import fixture.model.Grupo;
import fixture.model.Partido;
import fixture.repository.EquipoRepository;
import fixture.repository.GrupoRepository;
import fixture.repository.PartidoRepository;
import java.util.ArrayList;

/**
 *
 * @author Nico
 */
public interface FixtureServices {
    
    void instanciarRepositorios();
    
    Grupo obtenerGrupo(char caracter);
    
    ArrayList<Partido> obtenerPartido(Grupo grupo);
    
    ArrayList<Partido> obtenerPartidobyFase(Fase fase);
    
    ArrayList<Equipo> obtenerEquiposByGrupo(Grupo grupo);
    
    Equipo obtenerEquipoById(Equipo equipo);
    
    void recuperarEquipoDeEquipoRepository(ArrayList<Equipo> listadoDeEquipos, ArrayList<Equipo> listaDeEquiposACompletar);
    
    void actualizarDatosDeEquipoEnArchivo(Equipo equipoActualizado);
    
    void guardarGolesDePartido();
    
    void ordenarListaTablaDePosiciones(ArrayList<Equipo> lista);
    
    void ordenarPartidosByFecha(ArrayList<Partido> lista);
    
  
    
    
    
    
}
