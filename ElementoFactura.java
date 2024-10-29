package co.edu.tdea09102024;

public class ElementoFactura {

	private String elemento;
    private double precio;
    private int cantidad;
    
	public String getElemento() {
		return elemento;
	}
	public void setElemento(String elemento) {
		this.elemento = elemento;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
    
	@Override
	public String toString() {
		return " Elemento de factura: " + "Nombre del objeto: " + elemento + ", " + "precio del objeto: " + precio + " y, " + "cantidad de objetos: " + cantidad + "";
	}    
}
