import java.util.ArrayList;
import java.util.Random;

public class GeneradorElectrodomestico {

	Random ran = new Random();
	Cadenas c = new Cadenas();
	
	ArrayList<Heladera> Heladeras = new ArrayList<Heladera>();
	//ArrayList<Heladera> Heladeras = new ArrayList<Heladera>();
	//ArrayList<Heladera> Heladeras = new ArrayList<Heladera>();
	

	
	
	public GeneradorElectrodomestico() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Lavarropas generarLavarropas () {
		
		for (int i = 0 ; i < 10 ; i++) {
			Lavarropas lv = new Lavarropas(c.getModelos().get(1), 
					c.getColores().get(1), 
					c.getMarcas().get(1),
					ran.nextDouble(10000), 
					c.getTipoCarga().get(1), 
					ran.nextInt(50) );	
		}return null;
			
	}
	
	public void generarHeladeras () {
		
		//for (int i = 0 ; i < 2 ; i++) {  //Modelo, color , marca , precio, capa
//			Heladera hl = new Heladera(c.getModelos().get(1), 
//					c.getColores().get(1), 
//					c.getMarcas().get(1),
//					ran.nextDouble(10000), ran.nextDouble(50));		
					Heladeras.add(new Heladera(c.getModelos().get(1), 
							c.getColores().get(1), 
							c.getMarcas().get(1),
							ran.nextDouble(10000), ran.nextDouble(50)));
				
					//}
			
	}
	
	public void generarCocinas() {
		
		for (int i = 0 ; i < 10 ; i++) {
			Cocina cn = new Cocina(c.getModelos().get(1), 
					c.getColores().get(1), 
					c.getMarcas().get(1),
					ran.nextDouble(10000),
					c.getTipoCocina().get(1)
					);	
		}
			
	}
	
	public void imprimir () {
		for (int i = 0 ; i < 1 ; i++) {
			Heladeras.get(i).toString();
		}
	}
	
	
	
	

	
}
