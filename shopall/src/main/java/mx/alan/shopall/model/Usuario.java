package mx.alan.shopall.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Usuario {
    private int idUsuario;
    private String nombre;
    private String apellido;
    private String direccion;
    private String contrasena;
    private int telefono;
    private String correo;
}
