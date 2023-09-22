package mx.metaphorce.mvnprojectexample.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mx.metaphorce.mvnprojectexample.model.Actores;
import mx.metaphorce.mvnprojectexample.model.Peliculas;

public class ActoresPeliculaRepository {
    public Peliculas getActoresPelicula(int id) throws SQLException{

            Statement st = con.createStatement();
            String sql = "SELECT * FROM actor join pelicula_actor on pelicula_actor.idActor = actor.idActor join pelicula on pelicula.idPelicula = pelicula.idPelicula where pelicula.idPelicula = "+id;
            ResultSet rs = st.executeQuery(sql);
            Peliculas pel = new Peliculas();
            List<Actores> actores = new ArrayList<>();
            while(rs.next()){
                pel.setIdioma(rs.getString("idioma"));
                pel.setTitulo(rs.getString("titulo"));
                actores.add(new Actores(0, rs.getString("nombre")));
            }
            pel.setActores(actores);
        return pel;
    }

    ConnectionDB conDB = new ConnectionDB();
    Connection con = null;

    public ActoresPeliculaRepository() {
        try {
            con = conDB.createConnection();
        } catch (SQLException ex) {
            System.out.println("ERROR");
        }
    }

    void closeConnection() {
        try {
            conDB.closeConnection(con);
        } catch (SQLException ex) {
            System.out.println("ERROR CLOSING");
        }
    }

}