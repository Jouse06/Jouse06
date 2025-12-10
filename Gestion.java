import java.util.ArrayList;

public class Gestion{
	private String nombre;
	private String apellido;
	private int edad;
	private ArrayList<Gestion> ites;

	public Gestion(String nombre, String apellido , int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.ites = new ArrayList<>();
	}
	
	public void addNombre(Gestion n){
		this.ites.add(n);
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




