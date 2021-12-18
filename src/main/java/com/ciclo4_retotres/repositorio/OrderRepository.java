/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ciclo4_retotres.repositorio;

import com.ciclo4_retotres.CrudRepository.OrderCrudRepository;
import com.ciclo4_retotres.modelo.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Maria LIgia Huertas Moreno
 */
@Repository
public class OrderRepository {
    @Autowired
    private OrderCrudRepository orderCrudRepository;
    

    public List<Order> getAll() {
        return (List<Order>) orderCrudRepository.findAll();
    }

    public Optional<Order> getOrder(int id) {
        return orderCrudRepository.findById(id);
    }

    public Order save(Order order) {
        return orderCrudRepository.save(order);
    }

    public void update(Order order) {
        orderCrudRepository.save(order);
    }

    public void delete(Order order) {
        orderCrudRepository.delete(order);
    }
    public List<Order> findByZone(String zone) {
        return orderCrudRepository.findByZone(zone);
    }
    
     public Optional<Order> lastOrderId(){
        return orderCrudRepository.findTopByOrderByIdDesc();
    }
    
}
