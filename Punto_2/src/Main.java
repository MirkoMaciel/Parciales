

public class Main {

	public static void main(String[] args) {

		//Creo la persona, la agrego a una familia, y esa familia la agrego a otro arreglo de familias
//		
//		Random ran = new Random();
//		Nombres n = new Nombres(); // Nombres funciona
//		Integrante i = new Integrante(); // Integrantes funciona
//		Familia f = new Familia();
//		ArrayList<Familia> familias = new Ar	rayList<Familia>();

		
		ArmadoFamilias ar = new ArmadoFamilias();
		for (int i = 0 ; i < 2 ; i++) {
		ar.genFam();
		ar.imprimirFamilias();
		System.out.println();
		}
		
	}
}
		
//		i.setNombre(n.getNombres(ran.nextInt(0, 5)));
//		i.setEdad(ran.nextInt(0, 100)) ;
//		System.out.println(i.getEdad());
//
//		f.setApellido(n.getApellidos(1));
//		f.agregarIntegrantes(i);
//		familias.add(f);
//
//		System.out.println("Familia "+familias.get(0).getApellido());
//		System.out.print("Integrantes: \n"+familias.get(0).integrantes.get(0).getNombre()); //Del arreglo familias en la posicion i, bajo los integrantes en la posicion i y su nombre
//		
//		Integer promedioEdad= 0 ;
//		
//		for (int x = 0; x < familias.size(); x++) {
//			for (int j = 0; j < familias.get(x).integrantes.size(); j++) {
//				promedioEdad = ( promedioEdad + familias.get(x).integrantes.get(j).getEdad() ) / 2;
//			}
//		}
//		System.out.println(promedioEdad);
//	}


//	public void promedioEdades() {
//		for (int i = 0; i < familias.size(); i++) {
//			for (int j = 0; j < familias.get(i).getIntegrante().size(); j++) {
//				promedioEdad = promedioEdad + familias.get(j).integrante.get(j).getEdad();
//			}
//		}
//	}
		
		
//		System.out.println(n.getNombres());
//		System.out.println(n.getApellidos());
//		
//		System.out.print(n.getNombres(0)+" "+n.getNombres(1)+"\n");
//		System.out.print(n.getApellidos(0)+" "+n.getApellidos(1)+"\n");
//		
//		
//		
//		
//		i.setNombre("Mirko");
//		i.setEdad(12);
//		
//		System.out.println(i.getNombre());
//		System.out.println(i.getEdad());

//		i.setNombre(n.getNombres(2));
//		i.setEdad(12);
//		
//		System.out.println(i.getNombre());
//		System.out.println(i.getEdad());


