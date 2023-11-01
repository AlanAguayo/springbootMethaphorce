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
@Table(name = "producto")
@JsonInclude(JsonInclude.Include.NON_EMPTY)

public class Producto implements Serializable{
    @Id
    @Column(name = "id_producto")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private double precio;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "stock")
    private int stock;

    @ManyToOne
    @JoinColumn(name = "id_vendedor")
    private Vendedor vendedor;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Categoria categoria;
}
