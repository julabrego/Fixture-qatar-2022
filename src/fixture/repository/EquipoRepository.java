package fixture.repository;

import fixture.model.Equipo;
import fixture.repository.filesystem.ObjectIO;
import java.util.ArrayList;

public class EquipoRepository {
    
    ObjectIO objectIO = new ObjectIO();
    ArrayList<Equipo> equipos = new ArrayList();
    
    public EquipoRepository(){
        equipos = (ArrayList<Equipo>) objectIO.ReadObjectFromFile("equipos");
    }
    
    public Equipo find(String idEquipo){
        
        Equipo equipoEncontrado = null;
            for(Equipo equipo: equipos){
                if(equipo.getId().equals(idEquipo)){
                    equipoEncontrado = equipo;
                }
            }
            return equipoEncontrado;      
    }
    
    public void actualizarDatosEquipoEnArchivo(Equipo equipoActualizado){
        for(Equipo equipo : equipos){
            if(equipo.getId().equals(equipoActualizado.getId())){
                equipo = equipoActualizado;
            }
        }
        objectIO.WriteObjectToFile("equipos", equipos);
        
    }
    
    
    
}
