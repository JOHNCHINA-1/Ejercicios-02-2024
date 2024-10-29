/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.tdea.interfazfunciones;

/**
 *
 * @author crono
 */
import javax.swing.*;

public class CrearCuenta extends JFrame {
    private JTextField nombreField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton crearCuentaButton;

    public CrearCuenta() {
        setTitle("Crear Cuenta");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        nombreField = new JTextField(20);
        emailField = new JTextField(20);
        passwordField = new JPasswordField(20);
        crearCuentaButton = new JButton("Crear Cuenta");

        panel.add(new JLabel("Nombre:"));
        panel.add(nombreField);
        panel.add(new JLabel("Email:"));
        panel.add(emailField);
        panel.add(new JLabel("Contraseña:"));
        panel.add(passwordField);
        panel.add(crearCuentaButton);

        add(panel);
    }

    public static void main(String[] args) {
        CrearCuenta ventana = new CrearCuenta();
        ventana.setVisible(true);
    }
}