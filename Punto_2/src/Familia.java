import java.util.ArrayList;

public class Familia {

	private String apellido;
	private Double promedioEdad;
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

	public Double getPromedioEdad() {
		return promedioEdad;
	}

	public void setPromedioEdad(Double promedioEdad) {
		this.promedioEdad = promedioEdad;
	}
	
	public Double calculoPromedio (ArrayList<Integrante> dato ){
		Double aux = 0.0;
		for (int i = 0 ; i < dato.size() ; i ++){
			aux = aux + dato.get(i).getEdad();
			}return this.promedioEdad = (aux / dato.size());	
	}
	
	
}
