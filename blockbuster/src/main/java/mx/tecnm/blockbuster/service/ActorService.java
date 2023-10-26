package mx.tecnm.blockbuster.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import mx.tecnm.blockbuster.model.Actor;
import mx.tecnm.blockbuster.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorService {
    @Autowired
    ActorRepository repo;

    public List<Actor> getAll(){
        List<Actor> actores = new ArrayList<>();
        for(Actor actor : repo.findAll()){
            actores.add(actor);
        }
        return actores;
    }

    public Optional<Actor> getActor(int id){
        return repo.findById(id);
    }

    public void add(Actor actor){
        repo.save(actor);
    }

    public void update(int id,Actor actor){
        Optional<Actor> result = repo.findById(id);

        if (result.isPresent()) {
            Actor actorAux = result.get();
            actorAux.setNombre(actor.getNombre());
            repo.save(actorAux);
        }
    }

    public void delete(int id){
        repo.deleteById(id);
    }
}
