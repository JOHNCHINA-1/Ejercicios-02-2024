package co.edu.tdea09102024;

public class Persona2 {

	private String name;
	private String document;
	private String email;
	private String adress;
	private String number;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return " Persona: " + "Nombre de la persona: " + name + ", " + "documento de la persona: " + document + " ," + "correo electronico de la persona: " + email + ", " 
	+ "direccion de la persona " + adress + ", " + "numero de la persona:" + number + "";
	}
}
