
public class Heladera extends Electrodomestico{

	private Double capacidadTotal;

	public Heladera(String modelo, String color, String marca, Double precio, Double capacidadTotal) {
		super(modelo, color, marca, precio);
		this.capacidadTotal= capacidadTotal;
		// TODO Auto-generated constructor stub
	}

	public Double getCapacidadTotal() {
		return capacidadTotal;
	}

	public void setCapacidadTotal(Double capacidadTotal) {
		this.capacidadTotal = capacidadTotal;
	}

	@Override
	public String toString() {
		return "Heladera: "+super.toString()+ ", Capacidad total:" + capacidadTotal;
	}

	
	
	
	
}
