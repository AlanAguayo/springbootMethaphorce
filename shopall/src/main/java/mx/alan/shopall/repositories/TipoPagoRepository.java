package mx.alan.shopall.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class TipoPagoRepository {
    @Autowired
    JdbcTemplate jdbc;

    public List<Map<String, Object>> getTiposPago() {
        String sql = "Select * from tipoPago";
        return jdbc.queryForList(sql);
    }

    public Map<String, Object> getTipoPagoById(String id) {
        String sql = "Select * from tipoPago where idTipoPago = "+id;
        return jdbc.queryForMap(sql);
    }
}