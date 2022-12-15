package fixture.repository.migrations;

import fixture.repository.filesystem.ObjectIO;
import fixture.model.Equipo;
import fixture.model.Grupo;
import java.util.ArrayList;

public class GruposMigrations {

    static  Grupo[] grupos = {
        new Grupo(0, 'a'),
        new Grupo(1, 'b'),
        new Grupo(2, 'c'),
        new Grupo(3, 'd'),
        new Grupo(4, 'e'),
        new Grupo(5, 'f'),
        new Grupo(6, 'g'),
        new Grupo(7, 'h'),};
    

    public static void up() {
        ObjectIO objectIO = new ObjectIO();

        ArrayList<Equipo> equipos = (ArrayList<Equipo>) objectIO.ReadObjectFromFile("equipos");

        ArrayList<Equipo> equiposGrupoA = new ArrayList();

        equiposGrupoA.add(equipos.stream().filter(equipo -> equipo.getId().equals("PAISES_BAJOS")).findAny().orElse(null));
        equiposGrupoA.add(equipos.stream().filter(equipo -> equipo.getId().equals("SENEGAL")).findAny().orElse(null));
        equiposGrupoA.add(equipos.stream().filter(equipo -> equipo.getId().equals("ECUADOR")).findAny().orElse(null));
        equiposGrupoA.add(equipos.stream().filter(equipo -> equipo.getId().equals("QATAR")).findAny().orElse(null));

        ArrayList<Equipo> equiposGrupoB = new ArrayList();
        equiposGrupoB.add(equipos.stream().filter(equipo -> equipo.getId().equals("GALES")).findAny().orElse(null));
        equiposGrupoB.add(equipos.stream().filter(equipo -> equipo.getId().equals("ESTADOS_UNIDOS")).findAny().orElse(null));
        equiposGrupoB.add(equipos.stream().filter(equipo -> equipo.getId().equals("IRAN")).findAny().orElse(null));
        equiposGrupoB.add(equipos.stream().filter(equipo -> equipo.getId().equals("INGLATERRA")).findAny().orElse(null));

        ArrayList<Equipo> equiposGrupoC = new ArrayList();
        equiposGrupoC.add(equipos.stream().filter(equipo -> equipo.getId().equals("POLONIA")).findAny().orElse(null));
        equiposGrupoC.add(equipos.stream().filter(equipo -> equipo.getId().equals("MEXICO")).findAny().orElse(null));
        equiposGrupoC.add(equipos.stream().filter(equipo -> equipo.getId().equals("ARABIA_SAUDITA")).findAny().orElse(null));
        equiposGrupoC.add(equipos.stream().filter(equipo -> equipo.getId().equals("ARGENTINA")).findAny().orElse(null));

        ArrayList<Equipo> equiposGrupoD = new ArrayList();
        equiposGrupoD.add(equipos.stream().filter(equipo -> equipo.getId().equals("AUSTRALIA")).findAny().orElse(null));
        equiposGrupoD.add(equipos.stream().filter(equipo -> equipo.getId().equals("TUNEZ")).findAny().orElse(null));
        equiposGrupoD.add(equipos.stream().filter(equipo -> equipo.getId().equals("DINAMARCA")).findAny().orElse(null));
        equiposGrupoD.add(equipos.stream().filter(equipo -> equipo.getId().equals("FRANCIA")).findAny().orElse(null));

        ArrayList<Equipo> equiposGrupoE = new ArrayList();
        equiposGrupoE.add(equipos.stream().filter(equipo -> equipo.getId().equals("COSTA_RICA")).findAny().orElse(null));
        equiposGrupoE.add(equipos.stream().filter(equipo -> equipo.getId().equals("JAPON")).findAny().orElse(null));
        equiposGrupoE.add(equipos.stream().filter(equipo -> equipo.getId().equals("ALEMANIA")).findAny().orElse(null));
        equiposGrupoE.add(equipos.stream().filter(equipo -> equipo.getId().equals("ESPANA")).findAny().orElse(null));

        ArrayList<Equipo> equiposGrupoF = new ArrayList();
        equiposGrupoF.add(equipos.stream().filter(equipo -> equipo.getId().equals("CROACIA")).findAny().orElse(null));
        equiposGrupoF.add(equipos.stream().filter(equipo -> equipo.getId().equals("MARRUECOS")).findAny().orElse(null));
        equiposGrupoF.add(equipos.stream().filter(equipo -> equipo.getId().equals("CANADA")).findAny().orElse(null));
        equiposGrupoF.add(equipos.stream().filter(equipo -> equipo.getId().equals("BELGICA")).findAny().orElse(null));

        ArrayList<Equipo> equiposGrupoG = new ArrayList();
        equiposGrupoG.add(equipos.stream().filter(equipo -> equipo.getId().equals("CAMERUN")).findAny().orElse(null));
        equiposGrupoG.add(equipos.stream().filter(equipo -> equipo.getId().equals("SUIZA")).findAny().orElse(null));
        equiposGrupoG.add(equipos.stream().filter(equipo -> equipo.getId().equals("SERBIA")).findAny().orElse(null));
        equiposGrupoG.add(equipos.stream().filter(equipo -> equipo.getId().equals("BRASIL")).findAny().orElse(null));

        ArrayList<Equipo> equiposGrupoH = new ArrayList();
        equiposGrupoH.add(equipos.stream().filter(equipo -> equipo.getId().equals("COREA_DEL_SUR")).findAny().orElse(null));
        equiposGrupoH.add(equipos.stream().filter(equipo -> equipo.getId().equals("URUGUAY")).findAny().orElse(null));
        equiposGrupoH.add(equipos.stream().filter(equipo -> equipo.getId().equals("GHANA")).findAny().orElse(null));
        equiposGrupoH.add(equipos.stream().filter(equipo -> equipo.getId().equals("PORTUGAL")).findAny().orElse(null));

        grupos[0].setEquipos(equiposGrupoA);
        grupos[1].setEquipos(equiposGrupoB);
        grupos[2].setEquipos(equiposGrupoC);
        grupos[3].setEquipos(equiposGrupoD);
        grupos[4].setEquipos(equiposGrupoE);
        grupos[5].setEquipos(equiposGrupoF);
        grupos[6].setEquipos(equiposGrupoG);
        grupos[7].setEquipos(equiposGrupoH);

        ArrayList<Grupo> gruposArrayList = new ArrayList();
        
        for(int i = 0 ; i < grupos.length; i++){
            gruposArrayList.add(grupos[i]);
        }
        
        objectIO.WriteObjectToFile("grupos", gruposArrayList);
    }
}
