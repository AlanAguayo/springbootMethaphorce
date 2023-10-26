package mx.tecnm.blockbuster.repository;

import mx.tecnm.blockbuster.model.Actor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends CrudRepository<Actor, Integer>{

}