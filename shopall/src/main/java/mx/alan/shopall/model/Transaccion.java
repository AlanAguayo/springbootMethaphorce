package mx.alan.shopall.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Transaccion {
    private int idTransaccion;
    private String direccion;
    private double monto;
    private String fecha;
    private Comprador comprador;
    private TipoPago tipoPago;
}
