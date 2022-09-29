import java.util.ArrayList;

public class Familia {

	private String apellido;
	ArrayList<Integrante> integrantes = new ArrayList<Integrante>();

	public Familia() {
		super();
	}

	public ArrayList<Integrante> getFamilias() {
		return integrantes;
	}

	public void setFamilias(ArrayList<Integrante> integrantes) {
		this.integrantes = integrantes;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	

	public void agregarIntegrantes (Integrante persona) {
		this.integrantes.add(persona);
	}
	
	
	
}
