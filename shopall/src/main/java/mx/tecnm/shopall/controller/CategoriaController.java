package mx.tecnm.shopall.controller;

import mx.tecnm.shopall.model.Categoria;
import mx.tecnm.shopall.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    CategoriaService ser;

    @GetMapping("")
    public List<Categoria> getAll(){
        return ser.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Categoria> getOne(@PathVariable int id){
        return ser.getOne(id);
    }

    @PostMapping("")
    public String add(@RequestBody Categoria body){
        ser.add(body);
        return "Actor agregado";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody Categoria body) {
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
