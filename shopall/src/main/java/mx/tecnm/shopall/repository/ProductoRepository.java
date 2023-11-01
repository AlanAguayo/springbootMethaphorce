package mx.tecnm.shopall.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.tecnm.shopall.model.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer>{
    
}
