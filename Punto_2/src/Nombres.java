import java.util.ArrayList;
import java.util.Arrays;

public class Nombres {

	private ArrayList<String> nombres = new ArrayList<String>(Arrays.asList("Mirko","Eduardo","Felipe","Marcelo","Braulio"));
	private ArrayList<String> apellidos = new ArrayList<String>(Arrays.asList("Perez","Rodrigues","Hernandez","Ronaldo","Dardo"));
	
	
	public Nombres() {
		super();
	}

	public String getNombres(Integer x) {
		return nombres.get(x);
	}
	
	public String getApellidos (Integer x) {
		return apellidos.get(x);
	}
	
	public ArrayList<String> getNombres() {
		return nombres;
	}
	public void setNombres(ArrayList<String> nombres) {
		this.nombres = nombres;
	}
	public ArrayList<String> getApellidos() {
		return apellidos;
	}
	public void setApellidos(ArrayList<String> apellidos) {
		this.apellidos = apellidos;
	}	
	
	
	
}
