package view;

import model.Usuario;

import java.util.List;

/**
 * Decorador concreto que añade información extra a la vista.
 */
public class VistaDetallada extends VistaDecorator {

    public VistaDetallada(UsuarioVista vista) {
        super(vista);
    }

    @Override
    public void mostrarUsuarios(List<Usuario> usuarios) {
        super.mostrarUsuarios(usuarios);
        vistaDecorada.areaTexto.append("\n--- Información adicional ---\n");
        vistaDecorada.areaTexto.append("Total de usuarios: " + usuarios.size() + "\n");
    }
}
