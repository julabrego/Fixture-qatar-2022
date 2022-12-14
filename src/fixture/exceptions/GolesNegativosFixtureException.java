/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixture.exceptions;

import fixture.model.Equipo;

/**
 *
 * @author miguel.mino
 */
public class GolesNegativosFixtureException extends FixtureRuntimeException{
    
    private Equipo equipo;

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
    public GolesNegativosFixtureException(String mensaje){
        super(mensaje);
    }
    
    public GolesNegativosFixtureException(String mensaje, Equipo equipo){
        super(mensaje);
        this.equipo = equipo;
    }

    
}
