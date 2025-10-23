package controller;

import model.Usuario;

import java.util.Iterator;
import java.util.List;

/**
 * Comando concreto que elimina un usuario por email.
 */
public class EliminarUsuarioCommand implements Command {

    private List<Usuario> listaUsuarios;
    private String email;

    public EliminarUsuarioCommand(List<Usuario> listaUsuarios, String email) {
        this.listaUsuarios = listaUsuarios;
        this.email = email;
    }

    @Override
    public void ejecutar() {
        Iterator<Usuario> it = listaUsuarios.iterator();
        boolean eliminado = false;

        while (it.hasNext()) {
            Usuario u = it.next();
            if (u.getEmail().equalsIgnoreCase(email)) {
                it.remove();
                eliminado = true;
                System.out.println("🗑️ Usuario eliminado: " + u);
                break;
            }
        }

        if (!eliminado) {
            System.out.println("⚠️ No se encontró usuario con email: " + email);
        }
    }
}
