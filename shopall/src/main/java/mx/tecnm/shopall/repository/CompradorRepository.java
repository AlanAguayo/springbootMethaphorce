package mx.tecnm.shopall.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.tecnm.shopall.model.Comprador;

@Repository
public interface CompradorRepository extends CrudRepository<Comprador, Integer>{
    
}
