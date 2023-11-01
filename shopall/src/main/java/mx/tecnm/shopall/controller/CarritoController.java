package mx.tecnm.shopall.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mx.tecnm.shopall.model.Carrito;
import mx.tecnm.shopall.service.CarritoService;

@RestController
@RequestMapping("/carrito")
public class CarritoController {
    @Autowired
    CarritoService ser;

    @GetMapping("")
    public List<Carrito> getAll(){
        return ser.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Carrito> getActor(@PathVariable int id){
        return ser.getCarrito(id);
    }

    @PostMapping("")
    public String add(@RequestBody Carrito body){
        ser.add(body);
        return "Actor agregado";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody Carrito body) {
        ser.update(id,body);
        return "Actor editado";
    }

    @DeleteMapping("")
    public String delete(@RequestBody Map<String, Integer> requestBody) {
        Integer id = requestBody.get("id");
            ser.delete(id);
            return "Actor eliminado";
    }
}
