/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3.Interface;

import Reto3.Modelo.Reservacion;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public interface InterfaceReservacion extends CrudRepository<Reservacion,Integer>{
    
}
