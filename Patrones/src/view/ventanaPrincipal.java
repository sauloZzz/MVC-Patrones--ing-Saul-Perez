package view;

import javax.swing.*;
import java.awt.*;

/**
 * Vista principal del sistema de gestión de usuarios.
 */
public class VentanaPrincipal extends JFrame {

    private JTextField txtNombre, txtEmail;
    private JButton btnAgregar, btnEliminar;
    private DefaultListModel<String> listaUsuarios;
    private JList<String> listUsuarios;

    public VentanaPrincipal() {
        setTitle("Gestor de Usuarios");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Panel superior (formulario)
        JPanel panelFormulario = new JPanel(new GridLayout(3, 2, 5, 5));
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Datos del Usuario"));

        panelFormulario.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelFormulario.add(txtNombre);

        panelFormulario.add(new JLabel("Email:"));
        txtEmail = new JTextField();
        panelFormulario.add(txtEmail);

        btnAgregar = new JButton("Agregar Usuario");
        btnEliminar = new JButton("Eliminar Usuario");

        panelFormulario.add(btnAgregar);
        panelFormulario.add(btnEliminar);

        add(panelFormulario, BorderLayout.NORTH);

        // Panel inferior (lista)
        listaUsuarios = new DefaultListModel<>();
        listUsuarios = new JList<>(listaUsuarios);
        JScrollPane scroll = new JScrollPane(listUsuarios);
        scroll.setBorder(BorderFactory.createTitledBorder("Usuarios Registrados"));

        add(scroll, BorderLayout.CENTER);
    }

    // Getters para que el controlador acceda
    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public DefaultListModel<String> getListaUsuarios() {
        return listaUsuarios;
    }

    public JList<String> getListUsuarios() {
        return listUsuarios;
    }
}
