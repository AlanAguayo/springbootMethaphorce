package mx.tecnm.shopall.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mx.tecnm.shopall.model.Producto;
import mx.tecnm.shopall.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoService ser;

    @GetMapping("")
    public List<Producto> getAll(){
        return ser.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Producto> getOne(@PathVariable int id){
        return ser.getOne(id);
    }

    @PostMapping("")
    public String add(@RequestBody Producto body){
        ser.add(body);
        return "Producto agregado";
    }

    @PutMapping("")
    public String update(@RequestBody Producto body) {
        ser.update(body);
        return "Producto editado";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
            ser.delete(id);
            return "Produco eliminado";
    }
}