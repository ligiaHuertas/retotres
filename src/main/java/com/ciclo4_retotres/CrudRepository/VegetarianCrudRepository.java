/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ciclo4_retotres.CrudRepository;

import com.ciclo4_retotres.modelo.Vegetarian;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author maria ligia huertas moreno
 */
public interface VegetarianCrudRepository extends MongoRepository<Vegetarian,String>{
    
}
