package mx.tecnm.shopall.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.tecnm.shopall.model.TipoPago;

@Repository
public interface TipoPagoRepository extends CrudRepository<TipoPago, Integer>{
    
}
