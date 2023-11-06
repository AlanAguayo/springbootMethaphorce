package mx.tecnm.shopall.repository;

import mx.tecnm.shopall.model.Carrito;
import mx.tecnm.shopall.model.Comprador;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository 
public interface CarritoRepository extends CrudRepository<Carrito, Integer>{
    List<Carrito> findByComprador(Optional<Comprador> idComprador);

    @Query("SELECT c FROM Carrito c WHERE c.comprador.id = :idComprador ORDER BY c.id DESC limit 1")
    Carrito findLatestCarritoByComprador(@Param("idComprador") int idComprador);
}
 