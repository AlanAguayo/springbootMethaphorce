package mx.tecnm.blockbuster.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tecnm.blockbuster.model.Actor;
import mx.tecnm.blockbuster.model.Pelicula;
import mx.tecnm.blockbuster.repository.ActorRepository;
import mx.tecnm.blockbuster.repository.PeliculaRepository;

@RestController
@RequestMapping("/peliculas")
public class PeliculaActorController {

    @Autowired
    private PeliculaRepository peliculaRepository;

    @Autowired
    private ActorRepository actorRepository;

    @PostMapping("/agregarCast")
    public String agregarRelacion(@RequestBody Map<String, Integer> body) {
        Pelicula pelicula = peliculaRepository.findById(body.get("id_pelicula")).orElse(null);
        Actor actor = actorRepository.findById(body.get("id_actor")).orElse(null);

        if (pelicula == null || actor == null) {
            return "Pelicula o Actor no encontrados.";
        }

        pelicula.getActores().add(actor);
        peliculaRepository.save(pelicula);

        return "Cast agregada con éxito.";
    }
}
