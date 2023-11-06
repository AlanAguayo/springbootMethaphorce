package mx.tecnm.shopall.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.tecnm.shopall.model.Comprador;
import mx.tecnm.shopall.model.Transaccion;
import mx.tecnm.shopall.repository.TransaccionRepository;

@Service
public class TransaccionService {
    @Autowired
    TransaccionRepository repo;

    public List<Transaccion> getAll(){
        List<Transaccion> transacciones = new ArrayList<>();
        for(Transaccion transaccion : repo.findAll()){
            transacciones.add(transaccion);
        }
        return transacciones;
    }

    public Optional<Transaccion> getOne(int id){
        return repo.findById(id);
    }

    public List<Transaccion> getByComprador(Optional<Comprador> comprador) {
        return repo.findByComprador(comprador);
    }

    public void add(Transaccion transaccion){
        repo.save(transaccion);
    }

    public void update(Transaccion transaccion){
        Optional<Transaccion> result = repo.findById(transaccion.getId());
        if (result.isPresent()) {
            repo.save(transaccion);
        }
    }
 
    public void delete(int id){
        repo.deleteById(id);
    }
}