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
@Table(name = "tienda")
@JsonInclude(JsonInclude.Include.NON_EMPTY)

public class Tienda implements Serializable{
    @Id
    @Column(name = "id_tienda")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "ubicacion")
    private String ubicacion;

    @Column(name = "contacto")
    private String contacto;

    @ManyToOne
    @JoinColumn(name = "id_vendedor")
    private Vendedor vendedor;
}
