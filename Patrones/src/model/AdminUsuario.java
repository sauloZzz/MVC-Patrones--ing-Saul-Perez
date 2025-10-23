package model;

/**
 * Clase concreta que representa un usuario administrador.
 */
public class AdminUsuario extends Usuario {

    public AdminUsuario(String nombre, String email) {
        super(nombre, email);
        this.tipo = "Administrador";
    }
}
