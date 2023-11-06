package mx.tecnm.shopall.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.tecnm.shopall.model.Tienda;
import mx.tecnm.shopall.repository.TiendaRepository;

@Service
public class TiendaService {
    @Autowired
    TiendaRepository repo;

    public List<Tienda> getAll(){
        List<Tienda> tiendas = new ArrayList<>();
        for(Tienda tienda : repo.findAll()){
            tiendas.add(tienda);
        }
        return tiendas;
    }

    public Optional<Tienda> getOne(int id){
        return repo.findById(id);
    }

    public void add(Tienda tienda){
        repo.save(tienda);
    }

    public void update(Tienda tienda){
        Optional<Tienda> result = repo.findById(tienda.getId());
        if (result.isPresent()) {
            repo.save(tienda);
        }
    }

    public void delete(int id){
        repo.deleteById(id);
    }
}
