package mx.metaphorce.mvnprojectexample.model;

public class PersonaMultiPerfil extends Persona implements Actor, Productor{

    public PersonaMultiPerfil() {
    }

    public PersonaMultiPerfil(int id, String nombre) {
        super(id, nombre);
    }
    
    @Override
    public void actuar() {
        System.out.println(getNombre().concat(" actuo"));
    }

    @Override
    public String actorCreditos() {
        return getNombre();
    }

    @Override
    public void produce() {
        System.out.println(getNombre().concat(" produjo"));
    }

    @Override
    public String productorCreditos() {
        return getNombre();
    }

    @Override
    public void accion() {
        actuar();
        produce();
    }
    
}
