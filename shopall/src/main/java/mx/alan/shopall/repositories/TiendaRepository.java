package mx.alan.shopall.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class TiendaRepository {
    @Autowired
    JdbcTemplate jdbc;

    public List<Map<String, Object>> getTiendas() {
        String sql = "Select * from tienda";
        return jdbc.queryForList(sql);
    }

    public Map<String, Object> getTiendaById(String id) {
        String sql = "Select * from tienda where idTienda = "+id;
        return jdbc.queryForMap(sql);
    }
}