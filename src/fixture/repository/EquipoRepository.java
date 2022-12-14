package fixture.repository;

import fixture.model.Equipo;
import fixture.model.Fase;
import fixture.model.Partido;
import fixture.repository.filesystem.ObjectIO;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class EquipoRepository {

    // Instancia de la "base de datos"
    ObjectIO objectIO = new ObjectIO();
    private ArrayList<Equipo> equipos;

    // Constructor. Guarda en memoria todos los datos
    public EquipoRepository() {
        equipos = (ArrayList<Equipo>) objectIO.ReadObjectFromFile("equipos");
    }

    // Buscar un equipo por id
    public Equipo find(String id) {
        Equipo equipoEncontrado = null;

        for (Equipo equipo : equipos) {
            if (equipo.getId().equals(id)) {
                equipoEncontrado = equipo;
            }
        }

        return equipoEncontrado;
    }

    public void actualizarDatosDeEquiopoEnArchivo(Equipo equipoActualizado) {
        for (Equipo equipo : equipos) {
            if (equipo.getId().equals(equipoActualizado.getId())) {
                equipo = equipoActualizado;
            }
        }

        objectIO.WriteObjectToFile("equipos", equipos);
    }
}
