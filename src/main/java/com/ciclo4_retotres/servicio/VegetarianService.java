
package com.ciclo4_retotres.servicio;

import com.ciclo4_retotres.modelo.Vegetarian;
import com.ciclo4_retotres.repositorio.VegetarianRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Maria Ligia Huertas Moreno
 */
@Service
public class VegetarianService {
    @Autowired

     private VegetarianRepository repositorio1;
    
    
    public List<Vegetarian> getAll(){
        return repositorio1.getAll();       
    }
    
    public Optional<Vegetarian> getVegetarian(String reference){
        return repositorio1.getVegetarian(reference);
    }
    
    public Vegetarian save(Vegetarian vegetarian){
        if(vegetarian.getReference()== null){
            return vegetarian;
        }
        return repositorio1.save(vegetarian);
    }
    
    public Vegetarian update(Vegetarian vegetarian){
        if(vegetarian.getReference()!= null){
            Optional<Vegetarian> dbVegetarian = repositorio1.getVegetarian(vegetarian.getReference());
            if(!dbVegetarian.isEmpty()){
                if(vegetarian.getBrand()!= null){
                    dbVegetarian.get().setBrand(vegetarian.getBrand());
                }
                if(vegetarian.getCategory()!= null){
                    dbVegetarian.get().setCategory(vegetarian.getCategory());
                }
                if(vegetarian.getDescription()!= null){
                    dbVegetarian.get().setDescription(vegetarian.getDescription());
                }
                dbVegetarian.get().setAvailability(vegetarian.isAvailability());
                
                if(vegetarian.getPrice()!=0.0){
                    dbVegetarian.get().setPrice(vegetarian.getPrice());
                }
                if(vegetarian.getQuantity()!= 0){
                    dbVegetarian.get().setQuantity(vegetarian.getQuantity());
                }
                if(vegetarian.getPhotography()!= null){
                    dbVegetarian.get().setPhotography(vegetarian.getPhotography());
                }
                repositorio1.update(dbVegetarian.get());
                return dbVegetarian.get();
                
            }else{
                return vegetarian;
            }
        }      
        return vegetarian;
        
    }   
    
    public boolean delete(String reference){
        return getVegetarian(reference).map(vegetarian ->{
            repositorio1.delete(vegetarian);
            return true;
        }).orElse(false);
    }
 
}

