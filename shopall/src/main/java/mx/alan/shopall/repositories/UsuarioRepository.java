package mx.alan.shopall.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UsuarioRepository {
    @Autowired
    JdbcTemplate jdbc;

    public List<Map<String, Object>> getUsuarios() {
        String sql = "Select * from usuario";
        return jdbc.queryForList(sql);
    }

    public Map<String, Object> getUsuarioById(String id) {
        String sql = "Select * from usuario where idUsuario = "+id;
        return jdbc.queryForMap(sql);
    }
}
