package mx.tecnm.shopall.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mx.tecnm.shopall.model.Usuario;
import mx.tecnm.shopall.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService ser;

    @GetMapping("")
    public List<Usuario> getAll(){
        return ser.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> getOne(@PathVariable int id){
        return ser.getOne(id);
    }

    @PostMapping("")
    public String add(@RequestBody Usuario body){
        ser.add(body);
        return "Usuario agregado";
    }

    @PutMapping("")
    public String update(@RequestBody Usuario body) {
        ser.update(body);
        return "Usuario editado";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
            ser.delete(id);
            return "Usuario eliminado";
    }
}