package mx.alan.shopall.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CompradorRepository {
    @Autowired
    JdbcTemplate jdbc;

    public List<Map<String, Object>> getCompradores() {
        String sql = "Select * from comprador";
        return jdbc.queryForList(sql);
    }

    public Map<String, Object> getCompradorById(String id) {
        String sql = "Select * from comprador where idComprador = "+id;
        return jdbc.queryForMap(sql);
    }
}