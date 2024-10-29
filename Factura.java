package co.edu.tdea09102024;

public class Factura {

	private String refFactura;

	public String getRefFactura() {
		return refFactura;
	}

	public void setRefFactura(String refFactura) {
		this.refFactura = refFactura;
	}
	 
	@Override
	public String toString() {
		return " Factura: " + "Referencia de factura: " + refFactura + "";
	}
}
