package Congeladora;

public class Producto extends DetalleRegistro {
	public String talla;
	public String especie;
	public double precio;
	
	public Producto(int cantidad, String talla, String especie, double precio) {
		super(cantidad);
		this.talla = talla;
		this.especie = especie;
		this.precio = precio;
	}

	/**
	 * @return the talla
	 */
	public String getTalla() {
		return talla;
	}

	/**
	 * @param talla the talla to set
	 */
	public void setTalla(String talla) {
		this.talla = talla;
	}

	/**
	 * @return the especie
	 */
	public String getEspecie() {
		return especie;
	}

	/**
	 * @param especie the especie to set
	 */
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
	

}
