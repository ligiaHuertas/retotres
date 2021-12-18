/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ciclo4_retotres.repositorio;

import com.ciclo4_retotres.CrudRepository.VegetarianCrudRepository;
import com.ciclo4_retotres.modelo.Vegetarian;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Maria Ligia Huertas Moreno
 */
@Repository
public class VegetarianRepository {
    
    @Autowired
    private VegetarianCrudRepository crudRepository1;
    
    public List<Vegetarian> getAll(){
        return crudRepository1.findAll();
    }
    
    public Optional<Vegetarian> getVegetarian(String reference){
        return crudRepository1.findById(reference);
    }
    
    public Vegetarian save(Vegetarian vegetarian){
        return crudRepository1.save(vegetarian);
    }
    
    public void update(Vegetarian vegetarian){
        crudRepository1.save(vegetarian);      
    }
    
    public void delete(Vegetarian vegetarian){
        crudRepository1.delete(vegetarian);
    }
    
}
