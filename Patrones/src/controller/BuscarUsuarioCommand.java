package controller;

import model.Usuario;

import java.util.List;

/**
 * Comando concreto que busca un usuario por email.
 */
public class BuscarUsuarioCommand implements Command {

    private List<Usuario> listaUsuarios;
    private String email;

    public BuscarUsuarioCommand(List<Usuario> listaUsuarios, String email) {
        this.listaUsuarios = listaUsuarios;
        this.email = email;
    }

    @Override
    public void ejecutar() {
        for (Usuario u : listaUsuarios) {
            if (u.getEmail().equalsIgnoreCase(email)) {
                System.out.println("🔍 Usuario encontrado: " + u);
                return;
            }
        }
        System.out.println("❌ No se encontró usuario con email: " + email);
    }
}
