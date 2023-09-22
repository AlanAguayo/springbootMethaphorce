package mx.metaphorce.mvnprojectexample.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Peliculas {
    private String titulo;
    private String idioma;
    private List<Actores> actores;
}
