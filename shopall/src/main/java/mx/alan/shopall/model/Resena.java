package mx.alan.shopall.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Resena {
    private int idResena;
    private String comentario;
    private int calificacion;
    private String fecha;
    private Producto producto;
    private Comprador comprador;
}
