package mx.metaphorce.mvnprojectexample.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.metaphorce.mvnprojectexample.model.PersonaCliente;
import mx.metaphorce.mvnprojectexample.model.PersonaMultiPerfil;

public class PersonaRepository {
    
    ConnectionDB conDB = new ConnectionDB();
    Connection con = null;
    
    public PersonaRepository(){
        try {
            con = conDB.createConnection();
        } catch (SQLException ex) {
            System.out.println("ERROR");
        }
    }
    
    void closeConnection(){
        try {
            conDB.closeConnection(con);
        } catch (SQLException ex) {
            System.out.println("ERROR CLOSING");
        }
    }
    
    public Map<String, Object> getPersona(int id){
        Map<String, Object> result = new HashMap<>();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM blockbuster.persona WHERE id = ".concat("" + id));
            while(rs.next()){
                result.put("id", rs.getInt(1));
                result.put("nombre", rs.getString(2));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public List<Map<String, Object>> getPersonas(){
        List<Map<String, Object>> result = new ArrayList<>();
        try {
            Statement st = conDB.createConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM blockbuster.persona");
            while(rs.next()){
                Map<String, Object> resultRow = new HashMap<>();
                resultRow.put("id", rs.getInt(1));
                resultRow.put("nombre", rs.getString(2));
                result.add(resultRow);
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public PersonaMultiPerfil getPersonaMultiPerfil(int tipo){
        PersonaMultiPerfil p = new PersonaMultiPerfil();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM blockbuster.persona WHERE tipo = ".concat("" + tipo));
            while(rs.next()){
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }
    
    public PersonaCliente getPersonaCliente(int tipo){
        PersonaCliente p = new PersonaCliente();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM blockbuster.persona WHERE tipo = ".concat("" + tipo));
            while(rs.next()){
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }
}
