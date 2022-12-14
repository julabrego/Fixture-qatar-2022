/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixture.service;

import fixture.exceptions.FixtureRuntimeException;
import fixture.exceptions.FixtureException;
import fixture.exceptions.GolesNegativosFixtureException;
import fixture.model.Equipo;
import fixture.model.Fase;
import fixture.model.Grupo;
import fixture.model.Partido;
import fixture.repository.EquipoRepository;
import fixture.repository.GrupoRepository;
import fixture.repository.PartidoRepository;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author miguel.mino
 */
public interface FixtureService   {
    
    Grupo obtenerGrupo(char caracter);
    
    Grupo obtenerGrupoA();
    
    ArrayList<Partido> obtenerPartidosDeFaseGrupo(Grupo grupoA);
    
    ArrayList<Partido> obtenerPartidosDeFaseGrupo(char caracter);
    
    Partido obtenerPartidoPorId(int id);
    
    void metodo();
    
    ArrayList<Partido> obtenerPartidosDeFaseOctavos();
    
    ArrayList<Partido> obtenerPartidosDeFaseCuartos();
    
    ArrayList<Partido> obtenerPartidosDeFaseSemifinal();
    
    ArrayList<Partido> obtenerPartidosDeTercerPuesto();
    
    ArrayList<Partido> obtenerPartidoFinal();
    
    Equipo obtenerEquipoPorId(String id);
    
    void validarGoles(ArrayList<Partido> partidos);
    
    void guardarPartidosEnArchivo();
    
    void actualizarDatosDeEquiopoEnArchivo(Equipo equipoGrupo);
    
    Equipo obtenerEquipo(Equipo equipoGrupo);
    
    ArrayList<Equipo> ordenarEquiposYCompletarOctavos(HashSet<Equipo> e, Grupo grupo, boolean guardandoCambios);
                
    HashSet<Equipo> recuperarDatosDeEquipoDeEquipoRepository(Grupo grupo);
    
    
}
