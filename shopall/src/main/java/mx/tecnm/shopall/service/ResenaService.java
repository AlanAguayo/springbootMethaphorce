package mx.tecnm.shopall.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.tecnm.shopall.model.Producto;
import mx.tecnm.shopall.model.Resena;
import mx.tecnm.shopall.repository.ResenaRepository;

@Service
public class ResenaService {
    @Autowired
    ResenaRepository repo;

    public List<Resena> getAll(){
        List<Resena> resenas = new ArrayList<>();
        for(Resena resena : repo.findAll()){
            resenas.add(resena);
        }
        return resenas;
    }

    public List<Resena> getByProducto(Optional<Producto> producto) {
        return repo.findByProducto(producto);
    }

    public void add(Resena resena){
        repo.save(resena);
    }
 
    public void update(Resena resena){
        Optional<Resena> result = repo.findById(resena.getId());
        if (result.isPresent()) {
            repo.save(resena);
        }
    }

    public void delete(int id){
        repo.deleteById(id);
    }
}