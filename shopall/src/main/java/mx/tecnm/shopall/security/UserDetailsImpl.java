package mx.tecnm.shopall.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import mx.tecnm.shopall.model.Usuario;
import mx.tecnm.shopall.repository.CompradorRepository;
import mx.tecnm.shopall.repository.VendedorRepository;

@AllArgsConstructor
public class UserDetailsImpl implements UserDetails {

    private final Usuario usuario;
    private final VendedorRepository vendedor;
    private final CompradorRepository comprador;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
List<SimpleGrantedAuthority> authorities = new ArrayList<>();
    for (String role : getRoles()) {
        authorities.add(new SimpleGrantedAuthority(role));
    }
    return authorities;    }

    @Override
    public String getPassword() {
        return usuario.getContrasena();
    }

    @Override
    public String getUsername() {
        return usuario.getCorreo();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getNombre() {
        return usuario.getNombre() + " " + usuario.getApellido();
    }

    public Collection<String> getRoles() {

        List<String> roles = new ArrayList<>();
        if (comprador.findById(usuario.getId()).isPresent()) {
            roles.add("comprador");
        }
        if (vendedor.findById(usuario.getId()).isPresent()) {
            roles.add("vendedor");
        }
        return roles;
    }
}
