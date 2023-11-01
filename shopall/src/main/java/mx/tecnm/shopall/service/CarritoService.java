package mx.tecnm.shopall.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.tecnm.shopall.model.Carrito;
import mx.tecnm.shopall.repository.CarritoRepository;

@Service
public class CarritoService {
    @Autowired
    CarritoRepository repo;

    public List<Carrito> getAll(){
        List<Carrito> actores = new ArrayList<>();
        for(Carrito carrito : repo.findAll()){
            actores.add(carrito);
        }
        return actores;
    }

    public Optional<Carrito> getCarrito(int id){
        return repo.findById(id);
    }

    public void add(Carrito actor){
        repo.save(actor);
    }

    public void update(int id,Carrito carrito){
        Optional<Carrito> result = repo.findById(id);

        if (result.isPresent()) {
            Carrito carritoAux = result.get();
            carritoAux.setId(carrito.getId());
            repo.save(carritoAux);
        }
    }

    public void delete(int id){
        repo.deleteById(id);
    }
}
