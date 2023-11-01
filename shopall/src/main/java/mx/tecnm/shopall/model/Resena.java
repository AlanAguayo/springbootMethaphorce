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
@Table(name = "resena")
@JsonInclude(JsonInclude.Include.NON_EMPTY)

public class Resena implements Serializable{
    @Id
    @Column(name = "id_resena")
    private int id;

    @Column(name = "comentario")
    private String comentario;

    @Column(name = "calificacion")
    private int calificacion;

    @Column(name = "fecha")
    private String fecha;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;
    
    @ManyToOne
    @JoinColumn(name = "id_comprador")
    private Comprador comprador;
}
