
public class Cocina extends Electrodomestico{

	private String tipoCocina;

	public Cocina(String modelo, String color, String marca, Double precio, String  tipoCocina) {
		super(modelo, color, marca, precio);
		this.tipoCocina= tipoCocina;
	}

	public String getTipoCocina() {
		return tipoCocina;
	}

	public void setTipoCocina(String tipoCocina) {
		this.tipoCocina = tipoCocina;
	}

	@Override
	public String toString() {
		return "Cocina: "+super.toString() +", Tipo cocina:"+ tipoCocina;
	}
	
	
	
	
	
}
