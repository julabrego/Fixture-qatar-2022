/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixture.service;

import fixture.exceptions.FixtureException;
import fixture.exceptions.FixtureRuntimeException;
import fixture.exceptions.GolesNegativosFixtureException;
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
 * @author miguel.mino
 */
public class FixtureServiceImpl implements FixtureService{
  
    private GrupoRepository grupoRepository;
    private PartidoRepository partidoRepository;
    private EquipoRepository equipoRepository;
    
    public FixtureServiceImpl(){
        cargarRepositorios();
    }
    
    private void cargarRepositorios() {
        grupoRepository = new GrupoRepository();
        partidoRepository = new PartidoRepository();
        equipoRepository = new EquipoRepository();
    }
        
    public Grupo obtenerGrupo(char caracter){
        return grupoRepository.get(caracter); 
    }
    
    public Grupo obtenerGrupoA(){
        return obtenerGrupo('a');
    }
    
    public ArrayList<Partido> obtenerPartidosDeFaseGrupo(Grupo grupoA){
        return  partidoRepository.findBy(Fase.DE_GRUPOS, grupoA);
    }
    
    public ArrayList<Partido> obtenerPartidosDeFaseGrupo(char caracter){
        Grupo grupo = grupoRepository.get(caracter);
        return  partidoRepository.findBy(Fase.DE_GRUPOS, grupo);
    }
    
    public ArrayList<Partido> obtenerPartidosDeFaseOctavos(){
        return partidoRepository.findBy(Fase.OCTAVOS);
    }
    
    public ArrayList<Partido> obtenerPartidosDeFaseCuartos(){
         return partidoRepository.findBy(Fase.CUARTOS);
    }
    
    public ArrayList<Partido> obtenerPartidosDeFaseSemifinal(){
         return partidoRepository.findBy(Fase.SEMIFINALES);
    }
    
    public  ArrayList<Partido> obtenerPartidosDeTercerPuesto(){
        return partidoRepository.findBy(Fase.TERCER_PUESTO);
    }
    
    public ArrayList<Partido> obtenerPartidoFinal(){
        return partidoRepository.findBy(Fase.FINAL);
    }
    
    public Equipo obtenerEquipoPorId(String id){
        return equipoRepository.find(id);
    }
    
    public void guardarPartidosEnArchivo(){
        partidoRepository.guardarPartidosEnArchivo();
    }
    
    public void actualizarDatosDeEquiopoEnArchivo(Equipo equipoGrupo){
        equipoRepository.actualizarDatosDeEquiopoEnArchivo(equipoGrupo);
    }
    
    public Equipo obtenerEquipo(Equipo equipoGrupo){
        return equipoRepository.find(equipoGrupo.getId());
    }
    
    public void validarGoles(ArrayList<Partido> partidos){
        
        for(Partido partido : partidos){
            if(partido.getGolesEquipo1() < 0 ){
                throw new GolesNegativosFixtureException(
                        "Los goles de Local no deben ser menores que 0", partido.getEquipo1() );
            }
            
            if( partido.getGolesEquipo2() < 0){
                throw new GolesNegativosFixtureException(
                "Los goles de Visitante no deben ser menores que 0", partido.getEquipo2());
            }
        }
    }
            
            
    public void metodo(){
    
        try{
            metodoConError();
            metodoConErrorChequeda();   
        }catch(FixtureException | FixtureRuntimeException ex){
            
            ex.printStackTrace();
            System.out.println("ocurrio un error FixtureException");
            
        }catch(Exception ex){
            System.out.println("ocurrio un error FixtureException");
        }finally{
            System.out.println("Siempre se ejecuta");
        }
    }

    private void metodoConError() 
    {
       throw new FixtureRuntimeException("Not supported yet."); 
    }
    
    private void metodoConErrorChequeda() throws FixtureException
    {
       throw new FixtureException("Not supported yet."); 
    }
    
    
    public static void main(String [] args){
        FixtureService service = new FixtureServiceImpl();
        service.metodo();
    }
}
