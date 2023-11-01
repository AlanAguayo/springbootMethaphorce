package mx.tecnm.shopall.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.tecnm.shopall.model.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer>{
    
}
