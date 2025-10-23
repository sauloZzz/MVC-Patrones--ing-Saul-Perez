package model;

/**
 * Representa un usuario dentro del sistema.
 */
public class Usuario {
    protected String nombre;
    protected String email;
    protected String tipo; // <-- añadimos este campo

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.tipo = "Usuario"; // valor por defecto opcional
    }

    // Constructor que recibe tipo (opcional)
    public Usuario(String nombre, String email, String tipo) {
        this.nombre = nombre;
        this.email = email;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return nombre + " - " + email + " (" + tipo + ")";
    }
}
