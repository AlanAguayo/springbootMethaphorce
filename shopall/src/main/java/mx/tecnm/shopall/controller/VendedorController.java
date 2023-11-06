package mx.tecnm.shopall.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mx.tecnm.shopall.model.Vendedor;
import mx.tecnm.shopall.service.VendedorService;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {
    @Autowired
    VendedorService ser;

    @GetMapping("")
    public List<Vendedor> getAll(){
        return ser.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Vendedor> getOne(@PathVariable int id){
        return ser.getOne(id);
    }

    @PostMapping("")
    public String add(@RequestBody Vendedor body){
        ser.add(body);
        return "Vendedor agregado";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
            ser.delete(id);
            return "Vendedor eliminado";
    }
}