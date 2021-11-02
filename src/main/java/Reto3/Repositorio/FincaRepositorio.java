/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3.Repositorio;

import Reto3.Interface.InterfaceFinca;
import Reto3.Modelo.Finca;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */

@Repository
public class FincaRepositorio {
      @Autowired
    private InterfaceFinca crud;

    public List<Finca> getAll(){
        return (List<Finca>) crud.findAll();       
    }
    
    public Optional <Finca> getFinca(int id){
        return crud.findById(id);
    }
    
    public Finca save(Finca finca){
        return crud.save(finca);
    }
     public void delete(Finca finca){
        crud.delete(finca);
    }
    
}
