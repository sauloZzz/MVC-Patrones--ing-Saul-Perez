package model;

/**
 * Clase concreta que representa un usuario invitado.
 */
public class InvitadoUsuario extends Usuario {

    public InvitadoUsuario(String nombre, String email) {
        super(nombre, email);
        this.tipo = "Invitado";
    }
}
