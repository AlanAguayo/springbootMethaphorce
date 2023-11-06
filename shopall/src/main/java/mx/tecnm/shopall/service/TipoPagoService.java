package mx.tecnm.shopall.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.tecnm.shopall.model.TipoPago;
import mx.tecnm.shopall.repository.TipoPagoRepository;

@Service
public class TipoPagoService {
    @Autowired
    TipoPagoRepository repo;

    public List<TipoPago> getAll(){
        List<TipoPago> tipoPagos = new ArrayList<>();
        for(TipoPago tipoPago : repo.findAll()){
            tipoPagos.add(tipoPago);
        }
        return tipoPagos;
    }

    public Optional<TipoPago> getOne(int id){
        return repo.findById(id);
    }

    public void add(TipoPago tipoPago){
        repo.save(tipoPago);
    }

    public void update(TipoPago tipoPago){
        Optional<TipoPago> result = repo.findById(tipoPago.getId());
        if (result.isPresent()) {
            repo.save(tipoPago);
        }
    }

    public void delete(int id){
        repo.deleteById(id);
    }
}