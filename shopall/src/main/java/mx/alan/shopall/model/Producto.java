package mx.alan.shopall.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private String descripcion;
    private int stock;
    private Vendedor vendedor;
    private Categoria categoria;
}
