package mx.tecnm.shopall.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.tecnm.shopall.model.Producto;
import mx.tecnm.shopall.repository.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository repo;

    public List<Producto> getAll(){
        List<Producto> productos = new ArrayList<>();
        for(Producto producto : repo.findAll()){
            productos.add(producto);
        }
        return productos;
    }

    public Optional<Producto> getOne(int id){
        return repo.findById(id);
    }

    public void add(Producto producto){
        repo.save(producto);
    }

    public void update(Producto producto){
        Optional<Producto> result = repo.findById(producto.getId());
        if (result.isPresent()) {
            repo.save(producto);
        }
    }

    public void delete(int id){
        repo.deleteById(id);
    }
}
