package mx.tecnm.shopall.security;

import java.util.Collection;

import lombok.Data;

@Data
public class AuthCredentials {
    private String correo;
    private String contrasena;
    private Collection<String> roles;
}
