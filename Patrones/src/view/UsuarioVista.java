package view;

import model.Usuario;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Clase base que muestra la lista de usuarios en un JTextArea.
 * Aplica el principio de responsabilidad única (solo mostrar datos).
 */
public class UsuarioVista extends JPanel {

    protected JTextArea areaTexto;

    public UsuarioVista() {
        setLayout(new BorderLayout());
        areaTexto = new JTextArea(15, 40);
        areaTexto.setEditable(false);
        add(new JScrollPane(areaTexto), BorderLayout.CENTER);
    }

    public void mostrarUsuarios(List<Usuario> usuarios) {
        areaTexto.setText("");
        if (usuarios.isEmpty()) {
            areaTexto.setText("No hay usuarios registrados.");
        } else {
            for (Usuario u : usuarios) {
                areaTexto.append(u.toString() + "\n");
            }
        }
    }
}
