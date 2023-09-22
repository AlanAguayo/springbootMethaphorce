package mx.metaphorce.mvnprojectexample.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static final String urlConnection = "jdbc:mysql://localhost/blockbuster?"
                            + "user=root&password=3312";
    
    public Connection createConnection() throws SQLException{
        Connection con = DriverManager.getConnection(urlConnection);
        return con;
    }
    
    public void closeConnection(Connection con) throws SQLException{
        con.close();
    }
}
