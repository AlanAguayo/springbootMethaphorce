package mx.tecnm.shopall.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Data
@Entity
@Table(name = "transaccion")
@JsonInclude(JsonInclude.Include.NON_EMPTY)

public class Transaccion implements Serializable{
    @Id
    @Column(name = "id_transaccion")
    private int id;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "monto")
    private double monto;

    @Column(name = "fecha")
    private String fecha;

    @ManyToOne
    @JoinColumn(name = "id_comprador")
    private Comprador comprador;
    
    @ManyToOne
    @JoinColumn(name = "id_tipopago")
    private TipoPago tipoPago;
}
