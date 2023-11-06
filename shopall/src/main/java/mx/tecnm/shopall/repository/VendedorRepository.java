package mx.tecnm.shopall.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.tecnm.shopall.model.Vendedor;

@Repository
public interface VendedorRepository extends CrudRepository<Vendedor, Integer>{

}
