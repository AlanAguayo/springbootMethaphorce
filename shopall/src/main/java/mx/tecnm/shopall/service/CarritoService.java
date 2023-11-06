package mx.tecnm.shopall.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.tecnm.shopall.model.Carrito;
import mx.tecnm.shopall.model.Comprador;
import mx.tecnm.shopall.repository.CarritoRepository;

@Service
public class CarritoService {
    @Autowired
    CarritoRepository repo;

    public List<Carrito> getAll(){
        List<Carrito> carritos = new ArrayList<>();
        for(Carrito carrito : repo.findAll()){
            carritos.add(carrito);
        }
        return carritos;
    }

    public Optional<Carrito> getOne(int id){
        return repo.findById(id);
    }

    public List<Carrito> getCarritosByComprador(Optional<Comprador> idComprador) {
        return repo.findByComprador(idComprador);
    }

    public Carrito getLatestCarritoByCompradorId(int idComprador) {
        return repo.findLatestCarritoByComprador(idComprador);
    } 

    public void add(Carrito carrito){
        repo.save(carrito);
    }

    public void update(Carrito usuario){
        Optional<Carrito> result = repo.findById(usuario.getId());
        if (result.isPresent()) {
            repo.save(usuario);
        }
    }
 
    public void delete(int id){
        repo.deleteById(id);
    }
}
