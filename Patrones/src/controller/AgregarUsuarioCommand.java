package controller;

import model.Usuario;
import model.UsuarioFactory;

import java.util.List;

/**
 * Comando concreto que agrega un usuario a la lista del sistema.
 */
public class AgregarUsuarioCommand implements Command {

    private List<Usuario> listaUsuarios;
    private String tipo, nombre, email;

    public AgregarUsuarioCommand(List<Usuario> listaUsuarios, String tipo, String nombre, String email) {
        this.listaUsuarios = listaUsuarios;
        this.tipo = tipo;
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public void ejecutar() {
        Usuario nuevo = UsuarioFactory.crearUsuario(tipo, nombre, email);
        listaUsuarios.add(nuevo);
        System.out.println("✅ Usuario agregado: " + nuevo);
    }
}
