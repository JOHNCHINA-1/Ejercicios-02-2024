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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApp extends JFrame {
    private JButton crearCuentaButton;
    private JButton inicioSesionButton;

    public MainApp() {
        setTitle("Aplicación Principal");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        crearCuentaButton = new JButton("Crear Cuenta");
        inicioSesionButton = new JButton("Inicio de Sesión");

        crearCuentaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CrearCuenta().setVisible(true);
            }
        });

        inicioSesionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new InicioSesion().setVisible(true);
            }
        });

        panel.add(crearCuentaButton);
        panel.add(inicioSesionButton);

        add(panel);
    }

    public static void main(String[] args) {
        MainApp app = new MainApp();
        app.setVisible(true);
    }
}
