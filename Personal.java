package co.edu.tdea09102024;

public class Personal {

	private String nombre;
	private String apellido;
	private String fechaContratacion;
	private String ocupacion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFechaContratacion() {
		return fechaContratacion;
	}
	public void setFechaContratacion(String fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	
	@Override
	public String toString() {
		return " Personal: " + "Nombre del empleado: " + nombre + ", " + "apellido del empleado: " + apellido + ", " + "fecha de contratacion: " + fechaContratacion + " y, " 
	+ "ocupacion de la persona: " + ocupacion + "";
	}
}
