package mx.metaphorce.mvnprojectexample;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import mx.metaphorce.mvnprojectexample.model.ClaseEntityEjemplo;
import mx.metaphorce.mvnprojectexample.model.Peliculas;
import mx.metaphorce.mvnprojectexample.model.PersonaCliente;
import mx.metaphorce.mvnprojectexample.model.PersonaMultiPerfil;
import mx.metaphorce.mvnprojectexample.repository.ActoresPeliculaRepository;
import mx.metaphorce.mvnprojectexample.repository.PersonaRepository;

public class Mvnprojectexample {

    public static void main(String[] args) throws SQLException {
		
		//Testing
        /*
        printSelect();
        printSelectMultiperfil();
        printSelectCliente();
        
        ClaseEntityEjemplo ex = new ClaseEntityEjemplo(1, "nombre","value");
        */
        ActoresPeliculaRepository repo = new ActoresPeliculaRepository();
        Gson g = new Gson();
        String json = g.toJson(repo.getActoresPelicula(1).toString());
        System.out.println(json);
    }
    /* 
    static void printSelect(){
        PersonaRepository p = new PersonaRepository();
        List<Map<String, Object>> resSql = p.getPersonas();
        System.out.println(resSql);
    }
    
    static void printSelectMultiperfil(){
        PersonaRepository p = new PersonaRepository();
        PersonaMultiPerfil resSql = p.getPersonaMultiPerfil(1);
        System.out.println(resSql);
    }
    
    static void printSelectCliente(){
        PersonaRepository p = new PersonaRepository();
        PersonaCliente resSql = p.getPersonaCliente(2);
        System.out.println(resSql);
    }
    
    static void printSelectId(){
        PersonaRepository p = new PersonaRepository();
        Map<String, Object> resSql = p.getPersona(1);
        System.out.println(resSql);
    }
    
    static void hardcode(){
        PersonaMultiPerfil scarlet = new PersonaMultiPerfil(1, "Scarlett Johanson");
        scarlet.accion();
        
        PersonaCliente juan = new PersonaCliente(2, "Juan Perez");
        juan.accion();
    }
    */
}
