package co.edu.tdea09102024;

public class Diagnostico {

	 private String fecha;
	 private String descripcion;
	 
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	 
	@Override
	public String toString() {
		return " Diagnostico: " + "Fecha del diagnostico: " + fecha +  " y, " + "descripcion del diagnostico: " + descripcion + "";
	}
}
