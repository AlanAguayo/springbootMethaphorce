package mx.tecnm.blockbuster.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import mx.tecnm.blockbuster.model.Pelicula;
import mx.tecnm.blockbuster.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaService {
    @Autowired
    PeliculaRepository repo;

    public List<Pelicula> getAll(){
        List<Pelicula> peliculas = new ArrayList<>();
        for(Pelicula pelicula : repo.findAll()){
            peliculas.add(pelicula);
        }
        return peliculas;
    }

    public void add(Pelicula pelicula){
        repo.save(pelicula);
    }

    public Optional<Pelicula> getPelicula(int id){
        return repo.findById(id);
    }

    public void update(int id,Pelicula pelicula){
        Optional<Pelicula> result = repo.findById(id);

        if (result.isPresent()) {
            Pelicula peliculaAux = result.get();
            peliculaAux.setTitulo(pelicula.getTitulo());
            peliculaAux.setIdioma(pelicula.getIdioma());
            repo.save(peliculaAux);
        }
    }

    public void delete(int id){
        repo.deleteById(id);
    }
}
