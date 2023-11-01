package mx.tecnm.shopall.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.tecnm.shopall.model.Tienda;

@Repository
public interface TiendaRepository extends CrudRepository<Tienda, Integer>{
    
}
