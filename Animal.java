package co.edu.tdea09102024;

public class Animal {
	
	private String tipo;
	private String nombre;
    private int edad;
    
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return " Animal: " + "Tipo de animal: " + tipo + ", " + "nombre de animal: " + nombre + " y, " + "edad del animal: " + edad + " años" + "";
	}
  
}
