import java.util.ArrayList;
import java.util.Random;

public class ArmadoFamilias {

	Random ran = new Random();
	Nombres nom = new Nombres();
	Integrante inte = new Integrante();
	Familia fami = new Familia();
	ArrayList<Familia> familias = new ArrayList<Familia>();
	
	//private Double promedioEdades;

	public ArmadoFamilias() {
		super();
	}

	public void genFam () {
		fami.setApellido(nom.getApellidos(ran.nextInt(0,5))); //Le asigno apellido a la familia
		for (int i = 0 ; i < ran.nextInt(0,3) ; i++) { //Cantidad de integrantes aleatoria
			inte.setNombre(nom.getNombres(ran.nextInt(0,5))); //Le asigno nombre al integrante
			inte.setEdad(ran.nextInt(100)); //Le asigno edad al integrante
			fami.agregarIntegrantes(inte); //Agrego el integrante a la familia
		}
		familias.add(fami); //La fami la agrego al arreglo de la familias
	}
	
	public void imprimirFamilias () {
		for (int i = 0 ; i < familias.size() ; i++) {
			System.out.println("Familia "+familias.get(i).getApellido());	
			System.out.println("Integrantes:");
			for (int j = 0 ; j < familias.get(i).integrantes.size() ; j++ ) {
				System.out.println(familias.get(i).integrantes.get(j).getNombre()
						+" "+familias.get(i).integrantes.get(j).getEdad() );
				
			}
		}
		
	}
	
//	public Double calculoPromedio () {
//		Double promedioEdad= 0.0;
//		for (int j = 0; j < familias.get(j).integrantes.size(); j++) { //hasta fin cant integrantes
//				promedioEdad = familias.;
//				promedioEdad = promedioEdad + familias.get(j).integrantes.get(j).getEdad() ;
//			}return promedioEdad;
//	}
	
	
}
 