package controller;

import model.Usuario;
import view.VentanaPrincipal;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Controlador que conecta la vista y el modelo.
 */
public class Controlador implements ActionListener {

    private VentanaPrincipal vista;
    private ArrayList<Usuario> usuarios;

    public Controlador(VentanaPrincipal vista) {
        this.vista = vista;
        this.usuarios = new ArrayList<>();

        // Vincula los botones con acciones
        this.vista.getBtnAgregar().addActionListener(this);
        this.vista.getBtnEliminar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBtnAgregar()) {
            agregarUsuario();
        } else if (e.getSource() == vista.getBtnEliminar()) {
            eliminarUsuario();
        }
    }

    private void agregarUsuario() {
        String nombre = vista.getTxtNombre().getText().trim();
        String email = vista.getTxtEmail().getText().trim();

        // Validaciones
        if (nombre.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Por favor complete los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!email.contains("@") || !email.endsWith(".com")) {
            JOptionPane.showMessageDialog(vista, "El email debe contener '@' y terminar en '.com'.", "Email inválido", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Crear y agregar usuario
        Usuario usuario = new Usuario(nombre, email);
        usuarios.add(usuario);
        vista.getListaUsuarios().addElement(usuario.toString());

        vista.getTxtNombre().setText("");
        vista.getTxtEmail().setText("");
    }

    private void eliminarUsuario() {
        int indice = vista.getListUsuarios().getSelectedIndex();

        if (indice == -1) {
            JOptionPane.showMessageDialog(vista, "Por favor seleccione un usuario dentro de la lista.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        usuarios.remove(indice);
        vista.getListaUsuarios().remove(indice);
    }
}
