package view;

import model.Usuario;

import javax.swing.*;
import java.util.List;

/**
 * Clase abstracta que implementa el patrón Decorator para la vista.
 * Permite añadir funcionalidad adicional sin modificar la vista base.
 */
public abstract class VistaDecorator extends UsuarioVista {
    protected UsuarioVista vistaDecorada;

    public VistaDecorator(UsuarioVista vista) {
        this.vistaDecorada = vista;
    }

    @Override
    public void mostrarUsuarios(List<Usuario> usuarios) {
        vistaDecorada.mostrarUsuarios(usuarios);
    }
}
