/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixture.services;

import fixture.model.Equipo;
import fixture.model.Grupo;
import fixture.repository.EquipoRepository;
import fixture.repository.GrupoRepository;
import java.util.HashSet;

/**
 *
 * @author Nico
 */
public class GrupoConstructorServices {
    
    GrupoRepository grupoRepo;
    EquipoRepository equipoRepo;
    
    Grupo grupo;
    HashSet<Equipo> grupoActualizado = new HashSet();
            
    public GrupoConstructorServices() {}
    
    public void cargarDatosEquipo(){
        
    }
    
}
