package mx.tecnm.shopall.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mx.tecnm.shopall.model.Comprador;
import mx.tecnm.shopall.service.CompradorService;

@RestController
@RequestMapping("/comprador")
public class CompradorController {
    @Autowired
    CompradorService ser;

    @GetMapping("")
    public List<Comprador> getAll(){
        return ser.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Comprador> getOne(@PathVariable int id){
        return ser.getOne(id);
    }

    @PostMapping("")
    public String add(@RequestBody Comprador body){
        ser.add(body);
        return "Comprador agregado";
    }

    @PutMapping("")
    public String update(@RequestBody Comprador body) {
        ser.update(body);
        return "Comprador editado";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
            ser.delete(id);
            return "Comprador eliminado";
    }
}