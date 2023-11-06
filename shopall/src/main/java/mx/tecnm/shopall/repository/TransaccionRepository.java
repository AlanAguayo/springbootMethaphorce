package mx.tecnm.shopall.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.tecnm.shopall.model.Comprador;
import mx.tecnm.shopall.model.Transaccion;
 
@Repository
public interface TransaccionRepository extends CrudRepository<Transaccion, Integer>{
    List<Transaccion> findByComprador(Optional<Comprador> idComprador);
}
