package mx.tecnm.shopall.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mx.tecnm.shopall.model.Producto;
import mx.tecnm.shopall.model.Resena;
import mx.tecnm.shopall.service.ProductoService;
import mx.tecnm.shopall.service.ResenaService;

@RestController
@RequestMapping("/resena")
public class ResenaController {
    @Autowired
    ResenaService ser;
    @Autowired
    ProductoService serProd;

    @GetMapping("")
    public List<Resena> getAll(){
        return ser.getAll();
    }

    @GetMapping("/{idProducto}")
    public List<Resena> getByProduct(@PathVariable int idProducto){
        Optional<Producto> producto = serProd.getOne(idProducto);
        return ser.getByProducto(producto);
    }

    @PostMapping("")
    public String add(@RequestBody Resena body){
        ser.add(body);
        return "Resena agregado";
    }

    @PutMapping("")
    public String update(@RequestBody Resena body) {
        ser.update(body);
        return "Resema editado";
    } 

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
            ser.delete(id);
            return "Resena eliminado";
    }
}