/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ciclo4_retotres.CrudRepository;

import com.ciclo4_retotres.modelo.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author Maria ligia huertas moreno
 */
public interface OrderCrudRepository extends MongoRepository<Order,Integer>{
    //retorna ordenes de pedido que coincidan con la zona recibida como parametro
    @Query("{'salesMan.zone': ?=}")
    List<Order> findByZone(final String zone);
    //Retorna las ordenes x status
    @Query("{Status: ?0}")
    List<Order> findByStatus(final String status);
    
     //Para seleccionar la orden con el id maximo
    Optional<Order> findTopByOrderByIdDesc();
    
}
