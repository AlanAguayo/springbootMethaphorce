package mx.alan.shopall.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CarritoRepository {
    @Autowired
    JdbcTemplate jdbc;

    public List<Map<String, Object>> getCarritos() {
        String sql = "Select * from carrito";
        return jdbc.queryForList(sql);
    }

    public Map<String, Object> getCarritoByComprador(String id) {
        String sql = "Select * from carrito where idComprador = "+id;
        return jdbc.queryForMap(sql);
    }
}
