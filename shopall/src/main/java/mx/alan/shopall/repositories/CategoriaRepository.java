package mx.alan.shopall.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CategoriaRepository {
    @Autowired
    JdbcTemplate jdbc;

    public List<Map<String, Object>> getCategorias() {
        String sql = "Select * from categoria";
        return jdbc.queryForList(sql);
    }

    public Map<String, Object> getCategoriaById(String id) {
        String sql = "Select * from categoria where idCategoria = "+id;
        return jdbc.queryForMap(sql);
    }
}