/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixture.exceptions;

import fixture.model.Partido;

/**
 *
 * @author miguel.mino
 */
public class GolesNegativosFixtureException extends FixtureRuntimeException{
    
    private Partido partido ;
    
    public GolesNegativosFixtureException(String mensaje){
        super(mensaje);
    }
    
    public GolesNegativosFixtureException(String mensaje, Partido partido){
        super(mensaje);
        this.partido = partido;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    
}
