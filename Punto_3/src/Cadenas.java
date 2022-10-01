import java.util.ArrayList;
import java.util.Arrays;

public class Cadenas {

	ArrayList<String> modelos = new ArrayList<String>(Arrays.asList("Modelo1", "Modelo2", "Modelo3"));
	ArrayList<String> colores = new ArrayList<String>(Arrays.asList("Rojo" , "Verde" , "Amarillo"));
	ArrayList<String> marcas = new ArrayList<String>(Arrays.asList("Samsung", "Marca2", "Marca3"));
	ArrayList<String> tipoCocina = new ArrayList<String>(Arrays.asList("Electrica", "Tradicional" ));
	ArrayList<String> tipoCarga = new ArrayList<String>(Arrays.asList("Frontal", "Trasera" ));
	
	public ArrayList<String> getModelos() {
		return modelos;
	}
	public ArrayList<String> getColores() {
		return colores;
	}
	public ArrayList<String> getMarcas() {
		return marcas;
	}
	public ArrayList<String> getTipoCocina() {
		return tipoCocina;
	}
	public ArrayList<String> getTipoCarga() {
		return tipoCarga;
	}
	
	
	
	
}
