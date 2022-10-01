

//Modelo precio marca color, capacidad total HELADERA
//Modelo precio marca color y electrico COCINA
//Modelo prceio marca color , tipo de carga y capacidad kg  LAVARROPAS


public class Electrodomestico {

	
	private String modelo;
	private String color;
	private String marca;
	private Double precio;
	
	public Electrodomestico(String modelo, String color, String marca, Double precio) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.marca = marca;
		this.precio = precio;
	}

	public String  getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Modelo: " + modelo + ", Color: " + color + ", Marca: " + marca + ", Precio:" + precio;
	}
	
	
	
	
	
}
