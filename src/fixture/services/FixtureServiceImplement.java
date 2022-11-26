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
public class FixtureServiceImplement implements FixtureServices {
        
   private PartidoRepository partidoRepository;
   private GrupoRepository grupoRepository;
   private EquipoRepository equipoRepository;
   //private Grupo grupo;

    public FixtureServiceImplement() {
        instanciarRepositorios();
    }
   
   

   public void instanciarRepositorios(){
       partidoRepository = new PartidoRepository();
       grupoRepository = new GrupoRepository();
       equipoRepository = new EquipoRepository();
   }
    @Override
    public Grupo obtenerGrupo(char caracter) {
       return grupoRepository.get(caracter);
    }

    public ArrayList<Partido> obtenerPartido(Grupo grupo) {
        return partidoRepository.findBy(Fase.DE_GRUPOS,grupo);
    }
    
    public ArrayList<Equipo> obtenerEquiposByGrupo (Grupo grupo){
        return grupo.getEquipos();
        
    };
    
    public Equipo obtenerEquipoById(Equipo equipo){
        return equipoRepository.find(equipo.getId());
    }
    
    public void actualizarDatosDeEquipoEnArchivo(Equipo equipoActualizado){
        equipoRepository.actualizarDatosEquipoEnArchivo(equipoActualizado);
        
    }
    
    public void guardarGolesDePartido(){
        partidoRepository.guardarGolesPartido();
    }

   
    
   
    
}
