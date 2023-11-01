package mx.tecnm.shopall.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.tecnm.shopall.model.Transaccion;

@Repository
public interface TransaccionRepository extends CrudRepository<Transaccion, Integer>{
    
}
