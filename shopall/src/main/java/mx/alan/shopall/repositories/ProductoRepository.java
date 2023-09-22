package mx.alan.shopall.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class ProductoRepository {
    @Autowired
    JdbcTemplate jdbc;

    public List<Map<String, Object>> productos() {
        String sql = "Select * from producto";
        return jdbc.queryForList(sql);
    }

    public Map<String, Object> getProductoById(String id) {
        String sql = "Select * from producto where idProducto = "+id;
        return jdbc.queryForMap(sql);
    }
}