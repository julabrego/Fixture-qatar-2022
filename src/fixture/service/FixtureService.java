/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixture.service;

import fixture.exceptions.FixtureRuntimeException;
import fixture.exceptions.FixtureException;
import fixture.exceptions.GolesNegativosFixtureException;
import fixture.model.Partido;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author miguel.mino
 */
public class FixtureService {
    
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
        FixtureService service = new FixtureService();
        service.metodo();
    }
}
