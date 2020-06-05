package Congeladora;

public class Proveedor {
	public String nombre_proveedor;
	public String rfc_proveedor;
	public String domicilio_proveedor;
	
	public Proveedor(String nombre_proveedor, String rfc_proveedor, String domicilio_proveedor) {
		super();
		this.nombre_proveedor = nombre_proveedor;
		this.rfc_proveedor = rfc_proveedor;
		this.domicilio_proveedor = domicilio_proveedor;
	}

	/**
	 * @return the nombre_proveedor
	 */
	public String getNombre_proveedor() {
		return nombre_proveedor;
	}

	/**
	 * @param nombre_proveedor the nombre_proveedor to set
	 */
	public void setNombre_proveedor(String nombre_proveedor) {
		this.nombre_proveedor = nombre_proveedor;
	}

	/**
	 * @return the rfc_proveedor
	 */
	public String getRfc_proveedor() {
		return rfc_proveedor;
	}

	/**
	 * @param rfc_proveedor the rfc_proveedor to set
	 */
	public void setRfc_proveedor(String rfc_proveedor) {
		this.rfc_proveedor = rfc_proveedor;
	}

	/**
	 * @return the domicilio_proveedor
	 */
	public String getDomicilio_proveedor() {
		return domicilio_proveedor;
	}

	/**
	 * @param domicilio_proveedor the domicilio_proveedor to set
	 */
	public void setDomicilio_proveedor(String domicilio_proveedor) {
		this.domicilio_proveedor = domicilio_proveedor;
	}
	
	
	

}
