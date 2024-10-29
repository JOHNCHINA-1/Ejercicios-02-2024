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

public class InicioSesion extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton iniciarSesionButton;

    public InicioSesion() {
        setTitle("Inicio de Sesión");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        emailField = new JTextField(20);
        passwordField = new JPasswordField(20);
        iniciarSesionButton = new JButton("Iniciar Sesión");

        panel.add(new JLabel("Email:"));
        panel.add(emailField);
        panel.add(new JLabel("Contraseña:"));
        panel.add(passwordField);
        panel.add(iniciarSesionButton);

        add(panel);
    }

    public static void main(String[] args) {
        InicioSesion ventana = new InicioSesion();
        ventana.setVisible(true);
    }
}
