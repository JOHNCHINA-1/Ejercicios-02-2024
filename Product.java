package co.edu.tdea;

public class Product {

	private String nombre;
	private int id;
	private String expiration;
	
	
	public Product() {
		super();
	}

	public Product(String nombre, int id, String expiration2) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.expiration = expiration2;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	
	
	
	
}
