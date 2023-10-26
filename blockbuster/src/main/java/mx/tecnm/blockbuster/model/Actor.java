package mx.tecnm.blockbuster.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
@Table(name = "actor")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Actor implements Serializable {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @ManyToMany
    @JoinTable(name = "pelicula_actor", joinColumns = @JoinColumn(name = "id_actor"), inverseJoinColumns = @JoinColumn(name = "id_pelicula"))
    @JsonIgnore
    private List<Pelicula> peliculas = new ArrayList<>();
}