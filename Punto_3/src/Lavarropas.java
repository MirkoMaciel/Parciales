
public class Lavarropas extends Electrodomestico{

	private String  tipoCarga;
	private Integer capacidadKilo;

	
	public Lavarropas(String  modelo, String color, String marca, Double precio, String  tipoCarga, Integer capacidadKilo) {
		super(modelo, color, marca, precio);
		this.tipoCarga= tipoCarga;
		this.capacidadKilo=capacidadKilo;
		// TODO Auto-generated constructor stub
	}


	public String getTipoCarga() {
		return tipoCarga;
	}


	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}


	public Integer getCapacidadKilo() {
		return capacidadKilo;
	}


	public void setCapacidadKilo(Integer capacidadKilo) {
		this.capacidadKilo = capacidadKilo;
	}
	
	
	
	
	
}
