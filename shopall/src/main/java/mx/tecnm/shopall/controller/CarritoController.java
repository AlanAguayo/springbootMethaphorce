package mx.tecnm.shopall.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mx.tecnm.shopall.model.Carrito;
import mx.tecnm.shopall.model.Comprador;
import mx.tecnm.shopall.service.CarritoService;
import mx.tecnm.shopall.service.CompradorService;

@RestController
@RequestMapping("/carrito")
public class CarritoController {
    @Autowired
    CarritoService ser;
    @Autowired
    CompradorService serComp;

    @GetMapping("")
    public List<Carrito> getAll(){
        return ser.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Carrito> getOne(@PathVariable int id){
        return ser.getOne(id);
    }

    @GetMapping("/usuario/historial/{idComprador}")
    public List<Carrito> getByComprador(@PathVariable int idComprador) {
        Optional<Comprador> comprador = serComp.getOne(idComprador);
        return ser.getCarritosByComprador(comprador);
    }

    @GetMapping("/usuario/{idComprador}")
    public Carrito getCarritoByUsuario(@PathVariable int idComprador) {
        return ser.getLatestCarritoByCompradorId(idComprador);
    }

    @PostMapping("")
    public String add(@RequestBody Carrito body){
        ser.add(body);
        return "Carrito agregado";
    }
 
    @PutMapping("")
    public String update(@RequestBody Carrito body) {
        ser.update(body);
        return "Carrito editado";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
            ser.delete(id);
            return "Carrito eliminado";
    }
}
