package fixture.repository;

import fixture.model.Fase;
import fixture.model.Grupo;
import fixture.model.Partido;
import fixture.repository.filesystem.ObjectIO;
import java.util.ArrayList;
import java.util.HashSet;
import static java.util.Objects.nonNull;
import java.util.stream.Collectors;

public class PartidoRepository {

    // Instancia de la "base de datos"
    ObjectIO objectIO = new ObjectIO();
    ArrayList<Partido> partidos;

    // Constructor
    public PartidoRepository() {
        partidos = (ArrayList<Partido>) objectIO.ReadObjectFromFile("partidos");
    }
    
    public void guardarPartidosEnArchivo() {
        objectIO.WriteObjectToFile("partidos",partidos);
    }

    // Traer todos los partidos
    public ArrayList<Partido> findAll() {
        return partidos;
    }

    // Buscar por Fase
    public ArrayList<Partido> findBy(Fase fase) {
        return (ArrayList<Partido>) partidos.stream().filter(partido -> partido.getFase().equals(fase)).collect(Collectors.toList());
    }

    // Buscar por Fase y Grupo
    public ArrayList<Partido> findBy(Fase fase, Grupo grupo) {
        
        ArrayList<Partido> partidosFase = findBy(fase);
        HashSet<Partido> partidosGrupo = new HashSet();

        for (Partido partido : partidosFase) {
            if (nonNull(partido.getEquipo1())) {
                if (grupo.getEquiposIds().contains(partido.getEquipo1().getId())) {
                    partidosGrupo.add(partido);
                }
            }
        }
        
        return (ArrayList<Partido>) partidosGrupo.stream().collect(Collectors.toList());
        
    }
    
    // Buscar un partido
    public Partido find(int id){
        Partido partidoEncontrado = null;
        
        for(Partido partido : partidos){
            if(partido.getId() == id){
                partidoEncontrado = partido;
            }
        }
        
        return partidoEncontrado;
    }
}
