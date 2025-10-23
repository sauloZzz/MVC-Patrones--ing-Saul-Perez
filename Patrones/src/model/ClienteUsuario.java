package model;

/**
 * Clase concreta que representa un usuario cliente.
 */
public class ClienteUsuario extends Usuario {

    public ClienteUsuario(String nombre, String email) {
        super(nombre, email);
        this.tipo = "Cliente";
    }
}
