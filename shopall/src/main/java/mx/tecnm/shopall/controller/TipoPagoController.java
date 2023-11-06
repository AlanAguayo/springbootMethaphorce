package mx.tecnm.shopall.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mx.tecnm.shopall.model.TipoPago;
import mx.tecnm.shopall.service.TipoPagoService;

@RestController
@RequestMapping("/tipopago")
public class TipoPagoController {
    @Autowired
    TipoPagoService ser;

    @GetMapping("")
    public List<TipoPago> getAll(){
        return ser.getAll();
    }

    @GetMapping("/{id}")
    public Optional<TipoPago> getOne(@PathVariable int id){
        return ser.getOne(id);
    }

    @PostMapping("")
    public String add(@RequestBody TipoPago body){
        ser.add(body);
        return "TipoPago agregado";
    }

    @PutMapping("")
    public String update(@RequestBody TipoPago body) {
        ser.update(body);
        return "Tipo pago editado";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
            ser.delete(id);
            return "Tipo pago eliminado";
    }
}