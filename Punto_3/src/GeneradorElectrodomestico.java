import java.util.ArrayList;
import java.util.Random;

public class GeneradorElectrodomestico {

	Random ran = new Random();
	Cadenas c = new Cadenas();
	Integer max = 3; //Maximo de electrodomesticos
	
	
	ArrayList<Heladera> Heladeras = new ArrayList<Heladera>();
	ArrayList<Cocina> Cocinas = new ArrayList<Cocina>();
	ArrayList<Lavarropas> Lavarropas = new ArrayList<Lavarropas>();
	
	
	public GeneradorElectrodomestico() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public void generarLavarropas () {
		for (int i = 0 ; i < max ; i++) {
			Lavarropas.add( new Lavarropas(c.getModelos().get(ran.nextInt(c.modelos.size())), 
					c.getColores().get(ran.nextInt(c.colores.size())), 
					c.getMarcas().get(ran.nextInt(c.marcas.size())),
					ran.nextDouble(10000), 
					c.getTipoCarga().get(ran.nextInt(c.tipoCarga.size())), 
					ran.nextInt(20,75) ) ) ;	
		}
			
	}
	
	public void generarHeladeras () {
		
		for (int i = 0 ; i < max ; i++) {  //Modelo, color , marca , precio, capa	
			Heladeras.add(new Heladera(c.getModelos().get(ran.nextInt(c.modelos.size())), 
					c.getColores().get(ran.nextInt(c.colores.size())), 
					c.getMarcas().get(ran.nextInt(c.marcas.size())),
					ran.nextDouble(10000), ran.nextDouble(50)));
		}		
	}
		
	public void generarCocinas() {
		
		for (int i = 0 ; i < max ; i++) {
			Cocinas.add(new Cocina( c.getModelos().get(ran.nextInt(c.modelos.size())), 
					c.getColores().get(ran.nextInt(c.colores.size())), 
					c.getMarcas().get(ran.nextInt(c.marcas.size())),
					ran.nextDouble(10000),
					c.getTipoCocina().get(ran.nextInt(c.tipoCocina.size()))
					));	
		}
			
	}
	
	
	public void imprimir () {
		for (int i = 0 ; i < Heladeras.size() ; i++) {
			System.out.println(Heladeras.get(i).toString());
		}
		System.out.println();
		for (int i = 0 ; i < Cocinas.size() ; i++) {
			System.out.println(Cocinas.get(i).toString());
		}
		System.out.println();
		for (int i = 0 ; i < Lavarropas.size() ; i++) {
			System.out.println(Lavarropas.get(i).toString());
		}
	}
	
	
	
	

	
}
