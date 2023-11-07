package mx.tecnm.shopall.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import mx.tecnm.shopall.model.Usuario;
import mx.tecnm.shopall.repository.CompradorRepository;
import mx.tecnm.shopall.repository.UsuarioRepository;
import mx.tecnm.shopall.repository.VendedorRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService{
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Autowired
    private CompradorRepository compradorRepository;
        
    @Autowired
    private VendedorRepository vendedorRepository;

    @Override
    public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException{
        Usuario usuario = usuarioRepository
        .findOneByCorreo(correo)
        .orElseThrow(()->new UsernameNotFoundException("El usuario no existe"));

        return new UserDetailsImpl(usuario, vendedorRepository, compradorRepository);
    }
}
