package Congeladora;

public class Cliente {
	public String nombre_cliente;
	public String rfc_cliente;
	public String domicilio_cliente;
	
	public Cliente(String nombre_cliente, String rfc_cliente, String domicilio_cliente) {
		super();
		this.nombre_cliente = nombre_cliente;
		this.rfc_cliente = rfc_cliente;
		this.domicilio_cliente = domicilio_cliente;
	}

	/**
	 * @return the nombre_cliente
	 */
	public String getNombre_cliente() {
		return nombre_cliente;
	}

	/**
	 * @param nombre_cliente the nombre_cliente to set
	 */
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	/**
	 * @return the rfc_cliente
	 */
	public String getRfc_cliente() {
		return rfc_cliente;
	}

	/**
	 * @param rfc_cliente the rfc_cliente to set
	 */
	public void setRfc_cliente(String rfc_cliente) {
		this.rfc_cliente = rfc_cliente;
	}

	/**
	 * @return the domicilio_cliente
	 */
	public String getDomicilio_cliente() {
		return domicilio_cliente;
	}

	/**
	 * @param domicilio_cliente the domicilio_cliente to set
	 */
	public void setDomicilio_cliente(String domicilio_cliente) {
		this.domicilio_cliente = domicilio_cliente;
	}
	
	
	

	

}
