package mx.tecnm.shopall.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
@Table(name = "carrito")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Carrito implements Serializable{
    @Id
    @Column(name = "id_carrito")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_comprador")
    private Comprador comprador;

    @ManyToMany
    @JoinTable(name = "carrito_producto", joinColumns = @JoinColumn(name = "id_carrito"), inverseJoinColumns = @JoinColumn(name="id_producto"))
    private List<Producto> productos = new ArrayList<>();
}
