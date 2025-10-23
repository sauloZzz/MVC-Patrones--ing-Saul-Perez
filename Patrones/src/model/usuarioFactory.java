package model;

/**
 * Clase que implementa el patrón Factory Method para la creación de usuarios.
 * Permite crear objetos de tipo Usuario sin especificar la clase concreta.
 */
public class UsuarioFactory {

    /**
     * Método de fábrica que crea instancias de Usuario según el tipo especificado.
     *
     * @param tipoUsuario Tipo de usuario (admin, cliente, invitado)
     * @param nombre      Nombre del usuario
     * @param email       Correo electrónico del usuario
     * @return Una instancia concreta de Usuario
     */
    public static Usuario crearUsuario(String tipoUsuario, String nombre, String email) {
        switch (tipoUsuario.toLowerCase()) {
            case "admin":
                return new AdminUsuario(nombre, email);
            case "cliente":
                return new ClienteUsuario(nombre, email);
            case "invitado":
                return new InvitadoUsuario(nombre, email);
            default:
                throw new IllegalArgumentException("Tipo de usuario no válido: " + tipoUsuario);
        }
    }
}
