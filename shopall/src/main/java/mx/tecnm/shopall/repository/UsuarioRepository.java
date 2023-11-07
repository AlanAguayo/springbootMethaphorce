package mx.tecnm.shopall.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import mx.tecnm.shopall.model.Usuario;
import mx.tecnm.shopall.security.UserDetailsImpl;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
    Optional<Usuario> findOneByCorreo(String correo);
}
