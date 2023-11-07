package mx.tecnm.shopall.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import mx.tecnm.shopall.model.Usuario;
import mx.tecnm.shopall.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository repo;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UsuarioService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public List<Usuario> getAll(){
        List<Usuario> usuarios = new ArrayList<>();
        for(Usuario usuario : repo.findAll()){
            usuarios.add(usuario);
        }
        return usuarios;
    }

    public Optional<Usuario> getOne(int id){
        return repo.findById(id);
    }

    public void add(Usuario usuario){
        String encodedPassword = passwordEncoder.encode(usuario.getContrasena());
        usuario.setContrasena(encodedPassword);
        repo.save(usuario);
    }

    public void update(Usuario usuario){
        Optional<Usuario> result = repo.findById(usuario.getId());
        if (result.isPresent()) {
            String encodedPassword = passwordEncoder.encode(usuario.getContrasena());
            usuario.setContrasena(encodedPassword);
            repo.save(usuario);
        }
        
    }

    public void delete(int id){
        repo.deleteById(id);
    }
}