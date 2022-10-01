import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random ran = new Random();
		GeneradorElectrodomestico ge = new GeneradorElectrodomestico();
		ArrayList<Heladera> Heladeras = new ArrayList<Heladera>();
		Cadenas c = new Cadenas();
		
		
		ge.generarHeladeras();
		ge.imprimir();
	
		Heladera hl = new Heladera(c.getModelos().get(1), 
				c.getColores().get(1), 
				c.getMarcas().get(1),
				ran.nextDouble(10000), ran.nextDouble(50));
		
		//		Heladeras.add(new Heladera(c.getModelos().get(1), 
//				c.getColores().get(1), 
//				c.getMarcas().get(1),
//				ran.nextDouble(10000), ran.nextDouble(50)));
	
		hl.toString();
		//Heladeras.get(0).toString();
	}
	

}
