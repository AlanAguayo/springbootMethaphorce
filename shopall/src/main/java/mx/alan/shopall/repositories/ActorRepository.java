package mx.alan.shopall.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class ActorRepository {
    @Autowired
    JdbcTemplate jdbc;

    public List<Map<String, Object>> getActores() {
        String sql = "Select * from actor";
        return jdbc.queryForList(sql);
    }

    public Map<String, Object> getActorById(String id) {
        String sql = "Select * from actor where idActor = "+id;
        return jdbc.queryForMap(sql);
    }
}
