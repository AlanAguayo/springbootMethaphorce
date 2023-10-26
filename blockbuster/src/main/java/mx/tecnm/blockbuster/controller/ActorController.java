package mx.tecnm.blockbuster.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import mx.tecnm.blockbuster.model.Actor;
import mx.tecnm.blockbuster.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/actores")
public class ActorController {

    @Autowired
    ActorService ser;

    @GetMapping("")
    public List<Actor> getAll(){
        return ser.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Actor> getActor(@PathVariable int id){
        return ser.getActor(id);
    }

    @PostMapping("")
    public String add(@RequestBody Actor body){
        ser.add(body);
        return "Actor agregado";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody Actor body) {
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
