
public class Gestion{
	private String nombre;
	private String apellido;
	private int edad;

	public Gestion(String nombre, String apellido , int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	//getter
	public String getNombre(){
		return nombre;
	}

	public String getApellido(){
		return apellido;
	}

	public int getEdad(){
		return edad;
	}

	//Setter
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setApellido(String apellido){
		this.apellido = apellido;
	}

	public void setEdad(int edad){
		this.edad = edad;
	}
	
	@Override 
	public String toString(){
		return nombre + "  " + apellido + "  " + edad;
	  }
}




