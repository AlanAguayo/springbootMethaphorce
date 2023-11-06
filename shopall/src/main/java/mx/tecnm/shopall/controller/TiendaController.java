package mx.tecnm.shopall.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mx.tecnm.shopall.model.Tienda;
import mx.tecnm.shopall.service.TiendaService;

@RestController
@RequestMapping("/tienda")
public class TiendaController {
    @Autowired
    TiendaService ser;

    @GetMapping("")
    public List<Tienda> getAll(){
        return ser.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Tienda> getOne(@PathVariable int id){
        return ser.getOne(id);
    }

    @PostMapping("")
    public String add(@RequestBody Tienda body){
        ser.add(body);
        return "Tienda agregado";
    }

    @PutMapping("")
    public String update(@RequestBody Tienda body) {
        ser.update(body);
        return "Tienda editado";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
            ser.delete(id);
            return "Tienda eliminado";
    }
}