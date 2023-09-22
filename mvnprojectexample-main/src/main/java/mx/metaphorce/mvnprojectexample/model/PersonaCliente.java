package mx.metaphorce.mvnprojectexample.model;

public class PersonaCliente extends Persona implements Cliente{

    public PersonaCliente() {
    }

    public PersonaCliente(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public void compra() {
        System.out.println(getNombre().concat(" compra"));
    }

    @Override
    public void accion() {
        compra();
    }
    
}
