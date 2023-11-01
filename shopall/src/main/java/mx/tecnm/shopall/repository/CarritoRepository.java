package mx.tecnm.shopall.repository;

import mx.tecnm.shopall.model.Carrito;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoRepository extends CrudRepository<Carrito, Integer>{
    
}
