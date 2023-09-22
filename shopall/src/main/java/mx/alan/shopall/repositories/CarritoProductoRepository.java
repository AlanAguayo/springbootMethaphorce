package mx.alan.shopall.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CarritoProductoRepository {
    @Autowired
    JdbcTemplate jdbc;

    public List<Map<String, Object>> getCarritosProductos() {
        String sql = "Select * from carrito_producto";
        return jdbc.queryForList(sql);
    }

    public Map<String, Object> getCarritoProductoByCarrito(String id) {
        String sql = "Select * from carrito_producto where idCarrito = "+id;
        return jdbc.queryForMap(sql);
    }
}