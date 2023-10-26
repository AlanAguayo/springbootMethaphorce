package mx.tecnm.blockbuster.controller;

import mx.tecnm.blockbuster.model.Pelicula;
import mx.tecnm.blockbuster.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {

    @Autowired
    PeliculaService ser;

    @GetMapping("")
    public List<Pelicula> getAll() {
        return ser.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Pelicula> getActor(@PathVariable int id) {
        return ser.getPelicula(id);
    }

    @PostMapping("")
    public String add(@RequestBody Pelicula body) {
        ser.add(body);
        return "Pelicula agregada";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody Pelicula body) {
        ser.update(id, body);
        return "Pelicula editada";
    }

    @DeleteMapping("")
    public String delete(@RequestBody Map<String, Integer> requestBody) {
        Integer id = requestBody.get("id");
        ser.delete(id);
        return "Pelicula eliminada";
    }

}
