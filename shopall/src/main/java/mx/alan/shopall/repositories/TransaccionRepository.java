package mx.alan.shopall.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class TransaccionRepository {
    @Autowired
    JdbcTemplate jdbc;

    public List<Map<String, Object>> getTransacciones() {
        String sql = "Select * from transaccion";
        return jdbc.queryForList(sql);
    }

    public Map<String, Object> getTransaccionById(String id) {
        String sql = "Select * from transaccion where idTransaccion = "+id;
        return jdbc.queryForMap(sql);
    }
}