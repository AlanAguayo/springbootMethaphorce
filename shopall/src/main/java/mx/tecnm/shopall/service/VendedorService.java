package mx.tecnm.shopall.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.tecnm.shopall.model.Vendedor;
import mx.tecnm.shopall.repository.VendedorRepository;

@Service
public class VendedorService {
    @Autowired
    VendedorRepository repo;

    public List<Vendedor> getAll(){
        List<Vendedor> vendedores = new ArrayList<>();
        for(Vendedor vendedor : repo.findAll()){
            vendedores.add(vendedor);
        }
        return vendedores;
    }

    public Optional<Vendedor> getOne(int id){
        return repo.findById(id);
    }

    public void add(Vendedor vendedor){
        repo.save(vendedor);
    }

    public void delete(int id){
        repo.deleteById(id);
    }
}