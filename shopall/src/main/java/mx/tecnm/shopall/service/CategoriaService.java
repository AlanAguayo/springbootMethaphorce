package mx.tecnm.shopall.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import mx.tecnm.shopall.model.Categoria;
import mx.tecnm.shopall.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository repo;

    public List<Categoria> getAll(){
        List<Categoria> categorias = new ArrayList<>();
        for(Categoria categoria : repo.findAll()){
            categorias.add(categoria);
        }
        return categorias;
    }

    public Optional<Categoria> getOne(int id){
        return repo.findById(id);
    }

    public void add(Categoria categoria){
        repo.save(categoria);
    }

    public void update(Categoria categoria){
        Optional<Categoria> result = repo.findById(categoria.getId());
        if (result.isPresent()) {
            repo.save(categoria);
        }
    }

    public void delete(int id){
        repo.deleteById(id);
    }
}
