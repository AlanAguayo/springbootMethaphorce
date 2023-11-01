package mx.tecnm.shopall.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import mx.tecnm.shopall.model.Categoria;
import mx.tecnm.shopall.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.tecnm.shopall.model.Carrito;
import mx.tecnm.shopall.repository.CarritoRepository;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository repo;

    public List<Categoria> getAll(){
        List<Categoria> actores = new ArrayList<>();
        for(Categoria categoria : repo.findAll()){
            actores.add(categoria);
        }
        return actores;
    }

    public Optional<Categoria> getOne(int id){
        return repo.findById(id);
    }

    public void add(Categoria categoria){
        repo.save(categoria);
    }

    public void update(int id,Categoria categoria){
        Optional<Categoria> result = repo.findById(id);

        if (result.isPresent()) {
            Categoria categoriaAux = result.get();
            categoriaAux.setId(categoria.getId());
            repo.save(categoriaAux);
        }
    }

    public void delete(int id){
        repo.deleteById(id);
    }
}
