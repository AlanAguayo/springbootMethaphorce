package mx.alan.shopall.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class ResenaRepository {
    @Autowired
    JdbcTemplate jdbc;

    public List<Map<String, Object>> getResenas() {
        String sql = "Select * from resena";
        return jdbc.queryForList(sql);
    }

    public Map<String, Object> getResenaById(String id) {
        String sql = "Select * from resena where idResena = "+id;
        return jdbc.queryForMap(sql);
    }
}