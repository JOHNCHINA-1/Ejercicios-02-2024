package co.edu.tdea;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;

public class ProductEntry extends JFrame {

	  private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    private JTextField txtProductName;
	    private JTextField txtId;
	    private JTextField txtExpiration;
	    private JTextField txtCost;         // Campo para costo de producción
	    private JTextField txtPrice;        // Campo para precio de venta

	    // Simulación de datos
	    private double totalGanancias = 0.0;
	    private int totalCompras = 0;

	    public static void main(String[] args) {
	        EventQueue.invokeLater(() -> {
	            try {
	                // Cambia el color de fondo y de otros elementos
	                UIManager.put("Panel.background", new Color(245, 245, 245));
	                UIManager.put("Button.background", new Color(72, 133, 237));
	                UIManager.put("Button.foreground", Color.WHITE);
	                UIManager.put("Label.font", new Font("Arial", Font.BOLD, 14));

	                ProductEntry frame = new ProductEntry();
	                frame.setVisible(true);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        });
	    }

	    public ProductEntry() {
	        setTitle("Product Entry Form");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 400, 300);
	        setResizable(false);  // Bloquea el redimensionamiento de la ventana
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
	        setContentPane(contentPane);
	        contentPane.setLayout(new GridLayout(6, 2, 10, 10));

	        // Etiquetas y campos de texto
	        JLabel lblProductName = new JLabel("Product Name:");
	        contentPane.add(lblProductName);
	        txtProductName = new JTextField();
	        contentPane.add(txtProductName);

	        JLabel lblId = new JLabel("ID:");
	        contentPane.add(lblId);
	        txtId = new JTextField();
	        contentPane.add(txtId);

	        JLabel lblExpiration = new JLabel("Expiration:");
	        contentPane.add(lblExpiration);
	        txtExpiration = new JTextField();
	        contentPane.add(txtExpiration);

	        JLabel lblCost = new JLabel("Cost of Production:");
	        contentPane.add(lblCost);
	        txtCost = new JTextField();
	        contentPane.add(txtCost);

	        JLabel lblPrice = new JLabel("Selling Price:");
	        contentPane.add(lblPrice);
	        txtPrice = new JTextField();
	        contentPane.add(txtPrice);

	        // Botón para guardar el producto
	        JButton btnSave = new JButton("Save Product");
	        btnSave.setFont(new Font("Arial", Font.BOLD, 12));
	        btnSave.addActionListener(e -> saveProduct());
	        contentPane.add(btnSave);

	        // Botón para ver reportes
	        JButton btnReports = new JButton("Admin Reports");
	        btnReports.setFont(new Font("Arial", Font.BOLD, 12));
	        btnReports.addActionListener(e -> showAdminReports());
	        contentPane.add(btnReports);
	    }

	    private void saveProduct() {
	        try {
	            String nombre = txtProductName.getText();
	            int id = Integer.parseInt(txtId.getText());
	            String expiration = txtExpiration.getText();
	            double costoProduccion = Double.parseDouble(txtCost.getText());
	            double precioVenta = Double.parseDouble(txtPrice.getText());

	            // Calcula las ganancias
	            double ganancia = precioVenta - costoProduccion;
	            totalGanancias += ganancia;
	            totalCompras++;

	            Product product = new Product(nombre, id, expiration);
	            JOptionPane.showMessageDialog(this, "Product saved successfully:\n" +
	                "Name: " + product.getNombre() + "\n" +
	                "ID: " + product.getId() + "\n" +
	                "Expiration: " + product.getExpiration() + "\n" +
	                "Profit: $" + ganancia);

	            // Limpia los campos después de guardar
	            txtProductName.setText("");
	            txtId.setText("");
	            txtExpiration.setText("");
	            txtCost.setText("");
	            txtPrice.setText("");
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(this, "Please enter valid numeric values for ID, Cost, and Price.",
	                "Input Error", JOptionPane.ERROR_MESSAGE);
	        }
	    }

	    private void showAdminReports() {
	        String report = "Total Earnings: $" + totalGanancias + "\n" +
	                        "Total Purchases: " + totalCompras;
	        JOptionPane.showMessageDialog(this, report, "Admin Reports", JOptionPane.INFORMATION_MESSAGE);
	    }
	}