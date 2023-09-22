package mx.alan.shopall.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class VendedorRepository {
    @Autowired
    JdbcTemplate jdbc;

    public List<Map<String, Object>> getVendedores() {
        String sql = "Select * from vendedor";
        return jdbc.queryForList(sql);
    }

    public Map<String, Object> getVendedorById(String id) {
        String sql = "Select * from vendedor where idVendedor = "+id;
        return jdbc.queryForMap(sql);
    }
}