package mx.tecnm.shopall.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
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
@Table(name = "categoria")
@JsonInclude(JsonInclude.Include.NON_EMPTY)

public class Categoria implements Serializable{
    @Id
    @Column(name = "id_categoria")
    private int id;

    @Column(name = "nombre")
    private String nombre;
}
