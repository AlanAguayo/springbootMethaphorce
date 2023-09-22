package mx.metaphorce.mvnprojectexample.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public abstract class Persona {
    private int id;
    private String nombre;
    
    public abstract void accion();
}
