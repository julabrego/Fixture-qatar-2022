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
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JOptionPane;

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
    
    public Partido obtenerPartidoPorId(int id){
        return partidoRepository.find(id);
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
    
    @Override
    public ArrayList<Equipo> ordenarEquiposYCompletarOctavos(HashSet<Equipo> e, Grupo grupo, boolean guardandoCambios) {

        ArrayList<Equipo> equipos = new ArrayList(e);

        // Criterios de ordenamiento:
        //  1) Mayor puntaje
        //  2) Mayor diferencia de goles
        //  3) Mayor cantidad de goles totales
        
        // Los ordeno por puntaje
        Collections.sort(equipos, new Comparator<Equipo>() {
            @Override
            public int compare(Equipo e1, Equipo e2) {
                return e1.getPuntos() > e2.getPuntos() ? -1 : 1;
            }
        });

        // Verifico si es necesario reordenar por 
        boolean puntajesIguales = false;
        int auxPuntaje = -1;
        for (Equipo equipo : equipos) {
            if (equipo.getPuntos() == auxPuntaje) {
                puntajesIguales = true;
            }
            auxPuntaje = equipo.getPuntos();
        }

        // Los reordeno por diferencia de goles si encontré dos equipos con igual puntaje
        if (puntajesIguales) {
            Collections.sort(equipos, new Comparator<Equipo>() {
                @Override
                public int compare(Equipo e1, Equipo e2) {
                    int diferenciaDeGolesE1 = e1.getGolesHechos() - e1.getGolesEnContra();
                    int diferenciaDeGolesE2 = e2.getGolesHechos() - e2.getGolesEnContra();

                    if (e1.getPuntos() == e2.getPuntos()) {
                        return diferenciaDeGolesE1 > diferenciaDeGolesE2 ? -1 : 1;
                    }
                    return 0;
                }
            });

            // Verifico is es necesario reordenar por golesHechos
            boolean diferenciaDeGolesIguales = false;
            int auxDiferenciaDeGoles = equipos.get(0).getGolesHechos() - equipos.get(0).getGolesEnContra();
            for (int i = 1; i < equipos.size(); i++) {
                int diferenciaDeGoles = equipos.get(i).getGolesHechos() - equipos.get(i).getGolesEnContra();
                if (diferenciaDeGoles == auxDiferenciaDeGoles) {
                    diferenciaDeGolesIguales = true;
                }
                auxDiferenciaDeGoles = diferenciaDeGoles;
            }

            // Los reordeno por golesHechos si ecuentro dos equipos con igual diferencia de goles
            if (diferenciaDeGolesIguales) {
                Collections.sort(equipos, new Comparator<Equipo>() {
                    @Override
                    public int compare(Equipo e1, Equipo e2) {
                        int diferenciaDeGolesE1 = e1.getGolesHechos() - e1.getGolesEnContra();
                        int diferenciaDeGolesE2 = e2.getGolesHechos() - e2.getGolesEnContra();

                        if (diferenciaDeGolesE1 == diferenciaDeGolesE2) {
                            return e1.getGolesHechos() > e2.getGolesHechos() ? -1 : 1;
                        }
                        return 0;
                    }
                });
            }
        }

        // Este bloque se ejecuta solamente cuando se da click en btn guardar
        // ...
        if (guardandoCambios) {
            
            // Valido si hay que elegir manualmente segundo puesto
            boolean segundoYTerceroIgualPuntos = equipos.get(1).getPuntos() == equipos.get(2).getPuntos();

            int dgSegundo = equipos.get(1).getGolesHechos() - equipos.get(1).getGolesEnContra();
            int dgTercero = equipos.get(2).getGolesHechos() - equipos.get(2).getGolesEnContra();
            boolean segundoYTerceroIgualDG = dgSegundo == dgTercero;

            boolean segundoYTerceroIgualGolesHechos = equipos.get(1).getGolesHechos() == equipos.get(2).getGolesHechos();

            if (segundoYTerceroIgualPuntos && segundoYTerceroIgualDG && segundoYTerceroIgualGolesHechos) {
                Object[] opciones = {equipos.get(1).getNombre(), equipos.get(2).getNombre(), equipos.get(3).getNombre()};
                int seleccion = JOptionPane.showOptionDialog(null, "Debe elegir manualmente el equipo que quedó en 2do puesto", "Selección manual", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[0]);

                switch (seleccion) {
                    case 0:
                        equipos.get(1).setOctavos(true);
                        break;
                    case 1:
                        equipos.get(2).setOctavos(true);
                        Collections.swap(equipos, 2, 1);
                        break;
                    case 2:
                        equipos.get(3).setOctavos(true);
                        Collections.swap(equipos, 3, 1);
                        break;
                }
            }

            // Valido si hay que elegir manualmente primer puesto
            boolean primerYSegundoIgualPuntos = equipos.get(0).getPuntos() == equipos.get(1).getPuntos();

            int dgPrimero = equipos.get(0).getGolesHechos() - equipos.get(0).getGolesEnContra();
            boolean primerYSegundoIgualDG = dgPrimero == dgSegundo;

            boolean primerYSegundoIgualGolesHechos = equipos.get(0).getGolesHechos() == equipos.get(1).getGolesHechos();

            if (primerYSegundoIgualPuntos && primerYSegundoIgualDG && primerYSegundoIgualGolesHechos) {
                Object[] opciones = {equipos.get(0).getNombre(), equipos.get(1).getNombre(), equipos.get(2).getNombre()};
                int seleccion = JOptionPane.showOptionDialog(null, "Debe elegir manualmente el equipo que quedó en 1er puesto", "Selección manual", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[0]);

                switch (seleccion) {
                    case 0:
                        equipos.get(0).setOctavos(true);
                        break;
                    case 1:
                        equipos.get(1).setOctavos(true);
                        Collections.swap(equipos, 1, 0);
                        break;
                    case 2:
                        equipos.get(2).setOctavos(true);
                        Collections.swap(equipos, 2, 0);
                        break;
                }
            }
        }

        // Completar equipos de fase de 8vos
        HashMap<Character, Equipo[]> grupoEquiposPrimerosPuestos = new HashMap<>();
        Equipo[] equiposParaOctavos = {equipos.get(0), equipos.get(1)};

        grupoEquiposPrimerosPuestos.put(grupo.getLetra(), equiposParaOctavos);

        escribirEquiposEnOctavos(grupoEquiposPrimerosPuestos);

        return equipos;
    }
    
    private void escribirEquiposEnOctavos(HashMap<Character, Equipo[]> grupoEquiposPrimerosPuestos) {
        // Dónde ubicar 1er puesto
        // Dónde ubicar 2do puesto
        Character letra = (Character) grupoEquiposPrimerosPuestos.keySet().toArray()[0];

        Partido partidoPrimerPuesto;
        Partido partidoSegundoPuesto;

        // Seteo el booleano de octavos como verdadero
        for (Equipo equipo : grupoEquiposPrimerosPuestos.get(letra)) {
            equipo.setOctavos(true);
        }

        switch (letra) {
            case 'a':
                // Buscar el partido de ID 49
                partidoPrimerPuesto = this.obtenerPartidoPorId(49);

                // Buscar el partido de ID 52
                partidoSegundoPuesto = this.obtenerPartidoPorId(51);

                partidoPrimerPuesto.setEquipo1(grupoEquiposPrimerosPuestos.get('a')[0]);
                partidoSegundoPuesto.setEquipo2(grupoEquiposPrimerosPuestos.get('a')[1]);

                break;

            case 'b':
                // Buscar el partido de ID 52
                partidoPrimerPuesto = this.obtenerPartidoPorId(51);

                // Buscar el partido de ID 49
                partidoSegundoPuesto = this.obtenerPartidoPorId(49);

                partidoPrimerPuesto.setEquipo1(grupoEquiposPrimerosPuestos.get('b')[0]);
                partidoSegundoPuesto.setEquipo2(grupoEquiposPrimerosPuestos.get('b')[1]);

                break;

            case 'c':
                // Buscar el partido de ID 50
                partidoPrimerPuesto = this.obtenerPartidoPorId(50);

                // Buscar el partido de ID 52
                partidoSegundoPuesto = this.obtenerPartidoPorId(52);

                partidoPrimerPuesto.setEquipo1(grupoEquiposPrimerosPuestos.get('c')[0]);
                partidoSegundoPuesto.setEquipo2(grupoEquiposPrimerosPuestos.get('c')[1]);

                break;

            case 'd':
                // Buscar el partido de ID 52
                partidoPrimerPuesto = this.obtenerPartidoPorId(52);

                // Buscar el partido de ID 50
                partidoSegundoPuesto = this.obtenerPartidoPorId(50);

                partidoPrimerPuesto.setEquipo1(grupoEquiposPrimerosPuestos.get('d')[0]);
                partidoSegundoPuesto.setEquipo2(grupoEquiposPrimerosPuestos.get('d')[1]);

                break;

            case 'e':
                // Buscar el partido de ID 53
                partidoPrimerPuesto = this.obtenerPartidoPorId(53);

                // Buscar el partido de ID 55
                partidoSegundoPuesto = this.obtenerPartidoPorId(55);

                partidoPrimerPuesto.setEquipo1(grupoEquiposPrimerosPuestos.get('e')[0]);
                partidoSegundoPuesto.setEquipo2(grupoEquiposPrimerosPuestos.get('e')[1]);

                break;

            case 'f':
                // Buscar el partido de ID 53
                partidoPrimerPuesto = this.obtenerPartidoPorId(55);

                // Buscar el partido de ID 55
                partidoSegundoPuesto = this.obtenerPartidoPorId(53);

                partidoPrimerPuesto.setEquipo1(grupoEquiposPrimerosPuestos.get('f')[0]);
                partidoSegundoPuesto.setEquipo2(grupoEquiposPrimerosPuestos.get('f')[1]);

                break;

            case 'g':
                // Buscar el partido de ID 54
                partidoPrimerPuesto = this.obtenerPartidoPorId(54);

                // Buscar el partido de ID 56
                partidoSegundoPuesto = this.obtenerPartidoPorId(56);

                partidoPrimerPuesto.setEquipo1(grupoEquiposPrimerosPuestos.get('g')[0]);
                partidoSegundoPuesto.setEquipo2(grupoEquiposPrimerosPuestos.get('g')[1]);

                break;

            case 'h':
                // Buscar el partido de ID 56
                partidoPrimerPuesto = this.obtenerPartidoPorId(56);

                // Buscar el partido de ID 54
                partidoSegundoPuesto = this.obtenerPartidoPorId(54);

                partidoPrimerPuesto.setEquipo1(grupoEquiposPrimerosPuestos.get('h')[0]);
                partidoSegundoPuesto.setEquipo2(grupoEquiposPrimerosPuestos.get('h')[1]);

                break;

        }

    }
     
    @Override
    public HashSet<Equipo> recuperarDatosDeEquipoDeEquipoRepository(Grupo grupo) {
        HashSet<Equipo> equiposGrupoActualizados = new HashSet();
        // Para guardar correctamente el dato tengo que trabajar sobre EquipoRepository
        for (Equipo equipoGrupo : grupo.getEquipos()) {
            Equipo equipoEncontrado = this.obtenerEquipo(equipoGrupo);

            // esta lista (HashSet) va a ser la encargada que gestionar los datos de Equipos en el repositorio correspondiente
            equiposGrupoActualizados.add(equipoEncontrado);
        }

        return equiposGrupoActualizados;
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
