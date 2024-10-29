package co.edu.tdea09102024;

public class Persona {
	
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private String direccion;
    private String ciudad;
    private String pais;
    private String telefono;
    private String email;
    private String ocupacion;
    private String estadoCivil;
    private int numeroHijos;
    private String nacionalidad;
    private String idioma;
    private double altura;
    private double peso;
    private String colorOjos;
    private String colorCabello;
    private String tipoSangre;
    private String numeroIdentificacion;

    // Getters y Setters
    
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
    public int getEdad() { 
    return edad; 
    }	    
    public void setEdad(int edad) { 
    this.edad = edad; 
    }
    public String getGenero() { 
    return genero;
    }	    
    public void setGenero(String genero) { 
    this.genero = genero; 
    }
    public String getDireccion() {
    return direccion; 
    }
    public void setDireccion(String direccion) { 
    this.direccion = direccion; 
    }
    public String getCiudad() { 
    return ciudad; 
    }
    public void setCiudad(String ciudad) { 
    this.ciudad = ciudad; 
    }
    public String getPais() { 
    return pais; 
    }
    public void setPais(String pais) { 
    this.pais = pais; 
    }
    public String getTelefono() { 
    return telefono; 
    }
    public void setTelefono(String telefono) { 
    this.telefono = telefono; 
    }
    public String getEmail() { 
    return email; 
    }
    public void setEmail(String email) {
    this.email = email; 
    }
    public String getOcupacion() { 
    return ocupacion; 
    }
    public void setOcupacion(String ocupacion) { 
    this.ocupacion = ocupacion; 
    }
    public String getEstadoCivil() { 
    return estadoCivil; 
    }
    public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil; 
    }
    public int getNumeroHijos() { 
    return numeroHijos; 
    }
    public void setNumeroHijos(int numeroHijos) { 
    this.numeroHijos = numeroHijos; 
    }
    public String getNacionalidad() { 
    return nacionalidad; 
    }
    public void setNacionalidad(String nacionalidad) { 
    this.nacionalidad = nacionalidad; 
    }
    public String getIdioma() { 
    return idioma; 
    }
    public void setIdioma(String idioma) { 
    this.idioma = idioma; 
    }
    public double getAltura() { 
    return altura; 
    }
    public void setAltura(double altura) { 
    this.altura = altura; 
    }
    public double getPeso() {
    return peso; 
    }
    public void setPeso(double peso) { 
    this.peso = peso; 
    }
    public String getColorOjos() { 
    return colorOjos; 
    }
    public void setColorOjos(String colorOjos) { 
    this.colorOjos = colorOjos; 
    }
    public String getColorCabello() { 
    return colorCabello; 
    }
    public void setColorCabello(String colorCabello) { 
    this.colorCabello = colorCabello; 
    }
    public String getTipoSangre() { 
    return tipoSangre; 
    }
    public void setTipoSangre(String tipoSangre) { 
    this.tipoSangre = tipoSangre; 
    }
    public String getNumeroIdentificacion() { 
    return numeroIdentificacion; 
    }
    public void setNumeroIdentificacion(String numeroIdentificacion) { 
    this.numeroIdentificacion = numeroIdentificacion; 
    }

    @Override
    public String toString() {
        
    	return "Persona: " + "nombre ='" + nombre + '\'' + ", apellido ='" + apellido + '\'' +", edad ='" + edad +", genero ='" + genero + '\'' +
                ", direccion ='" + direccion + '\'' +", ciudad ='" + ciudad + '\'' +", pais ='" + pais + '\'' +", telefono ='" + telefono + '\'' +
                ", email ='" + email + '\'' +", ocupacion ='" + ocupacion + '\'' +", estadoCivil ='" + estadoCivil + '\'' +", numeroHijos =" + numeroHijos +
                ", nacionalidad ='" + nacionalidad + '\'' +", idioma ='" + idioma + '\'' +", altura =" + altura +", peso =" + peso +", colorOjos ='" + colorOjos + '\'' +
                ", colorCabello ='" + colorCabello + '\'' +", tipoSangre ='" + tipoSangre + '\'' +", numeroIdentificacion ='" + numeroIdentificacion + '\'' 
                ;	
   }
}

class Caminar {
	
    private double velocidad;
    private double distancia;

    // Getters y Setters
    public double getVelocidad() { 
    return velocidad; 
    }
    public void setVelocidad(double velocidad) { 
    this.velocidad = velocidad; 
    }
    public double getDistancia() { 
    return distancia; 
    }    
    public void setDistancia(double distancia) { 
    this.distancia = distancia;
    }
    
	@Override
	public String toString() {
		
		return "Caminar { " +  "Distancia recorrida = '" + distancia + " Metros"  +  '\'' + " , Tiempo de recorrido = '" + velocidad +  " minutos" +  '\''  +  " }";
	} 
}

class Hablar {
	
    private String idioma;
    private int duracion;
    
    public String getIdioma() { 
    return idioma;    
    }  
    public void setIdioma(String idioma) { 
    this.idioma = idioma; 
    }
    public int getDuracion() { 
    return duracion;     
    } 
    public void setDuracion(int duracion) { 
    this.duracion = duracion; 
    }
    
    @Override
	public String toString() {
    	return "Hablar { " + " Duracion de la conversacion: " + duracion + '\'' + " }";
    }
}
