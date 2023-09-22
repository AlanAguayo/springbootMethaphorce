package mx.alan.shopall.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Tienda {
    private int idTienda;
    private String nombre;
    private String descripcion;
    private String ubicacion;
    private String contacto;
    private Vendedor vendedor;
    private Usuario usuario;
}
