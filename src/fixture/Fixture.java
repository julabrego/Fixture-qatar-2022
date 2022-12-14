package fixture;

import fixture.model.Partido;
import fixture.repository.PartidoRepository;
import fixture.service.FixtureServiceImpl;
import fixture.view.Ventana;
import java.util.ArrayList;

public class Fixture {

    public static void main(String[] args) {
        Ventana ventana = new Ventana(new FixtureServiceImpl());
        ventana.setVisible(true);
    }

}
