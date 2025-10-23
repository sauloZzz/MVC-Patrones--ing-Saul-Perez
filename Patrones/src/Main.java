import controller.Controlador;
import view.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        VentanaPrincipal vista = new VentanaPrincipal();
        Controlador controlador = new Controlador(vista);
        vista.setVisible(true);
    }
}
