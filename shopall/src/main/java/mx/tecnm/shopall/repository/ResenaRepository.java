package mx.tecnm.shopall.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.tecnm.shopall.model.Resena;

@Repository
public interface ResenaRepository extends CrudRepository<Resena, Integer>{
    
}
