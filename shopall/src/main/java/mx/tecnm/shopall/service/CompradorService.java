package mx.tecnm.shopall.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.tecnm.shopall.model.Comprador;
import mx.tecnm.shopall.repository.CompradorRepository;

@Service
public class CompradorService {
    @Autowired
    CompradorRepository repo;

    public List<Comprador> getAll(){
        List<Comprador> compradores = new ArrayList<>();
        for(Comprador comprador : repo.findAll()){
            compradores.add(comprador);
        }
        return compradores;
    }

    public Optional<Comprador> getOne(int id){
        return repo.findById(id);
    }

    public void add(Comprador comprador){
        repo.save(comprador);
    }

    public void update(Comprador comprador){
        Optional<Comprador> result = repo.findById(comprador.getId());
        if (result.isPresent()) {
            repo.save(comprador);
        }
    }

    public void delete(int id){
        repo.deleteById(id);
    }
}
