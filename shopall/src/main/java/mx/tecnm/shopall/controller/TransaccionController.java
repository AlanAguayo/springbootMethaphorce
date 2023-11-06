package mx.tecnm.shopall.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mx.tecnm.shopall.model.Comprador;
import mx.tecnm.shopall.model.Transaccion;
import mx.tecnm.shopall.service.CompradorService;
import mx.tecnm.shopall.service.TransaccionService;

@RestController
@RequestMapping("/transaccion")
public class TransaccionController {
    @Autowired
    TransaccionService ser;
    @Autowired
    CompradorService serComp;

    @GetMapping("")
    public List<Transaccion> getAll(){
        return ser.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Transaccion> getOne(@PathVariable int id){
        return ser.getOne(id);
    }

    @GetMapping("/comprador/{idComprador}")
    public List<Transaccion> getTransaccionByComprador(@PathVariable int idComprador) {
        Optional<Comprador> comprador = serComp.getOne(idComprador);
        return ser.getByComprador(comprador);
    }

    @PostMapping("")
    public String add(@RequestBody Transaccion body){
        ser.add(body);
        return "Transaccion agregado";
    }

    @PutMapping("")
    public String update(@RequestBody Transaccion body) {
        ser.update(body);
        return "Transaccion editada";
    }
 
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
            ser.delete(id);
            return "Transaccion eliminada";
    }
}