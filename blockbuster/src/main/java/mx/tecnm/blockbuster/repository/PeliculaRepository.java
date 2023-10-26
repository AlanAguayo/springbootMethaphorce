package mx.tecnm.blockbuster.repository;

import mx.tecnm.blockbuster.model.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula, Integer> {
}
