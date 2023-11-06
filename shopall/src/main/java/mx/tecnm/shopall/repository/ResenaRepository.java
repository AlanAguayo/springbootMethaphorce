package mx.tecnm.shopall.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.tecnm.shopall.model.Producto;
import mx.tecnm.shopall.model.Resena;
 
@Repository
public interface ResenaRepository extends CrudRepository<Resena, Integer>{
        List<Resena> findByProducto(Optional<Producto> idProducto);
}
