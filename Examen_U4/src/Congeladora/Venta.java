package Congeladora;

public class Venta extends Producto implements IVAble16{
	//propiedades
	public int numVenta;
	public String fecha;
	public int cantidad;
	public int totalProductosVendidos;
	public int cantidadBodega;
	
	public Venta(int cantidad, String talla, String especie, double precio) {
		super(cantidad, talla, especie, precio);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Venta(int cantidad, String talla, String especie, double precio, int numVenta, String fecha,
			int totalProductosVendidos, int cantidadBodega) {
		super(cantidad, talla, especie, precio);
		this.numVenta = numVenta;
		this.fecha = fecha;
		this.totalProductosVendidos = totalProductosVendidos;
		this.cantidadBodega = cantidadBodega;
	}



	/**
	 * @return the totalProductosVendidos
	 */
	public int getTotalProductosVendidos() {
		return totalProductosVendidos;
	}

	/**
	 * @param totalProductosVendidos the totalProductosVendidos to set
	 */
	public void setTotalProductosVendidos(int totalProductosVendidos) {
		this.totalProductosVendidos = totalProductosVendidos;
	}



	/**
	 * @return the numVenta
	 */
	public int getNumVenta() {
		return numVenta;
	}


	/**
	 * @param numVenta the numVenta to set
	 */
	public void setNumVenta(int numVenta) {
		this.numVenta = numVenta;
	}


	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}


	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	//metodo
	public double importe(int cantidad, double valorUnitario) {
		double importe = cantidad * valorUnitario;
		return importe;
	}

	
	//metodo
	public double subtotal(double[] importe, int n) {
		double subtotal=0;
		for(int i = 0; i < n; i++){
			subtotal += importe[i];
		}
		return subtotal;
	}
	
	@Override
	public double IVA16(double subtotal) {
		// TODO Auto-generated method stub
		double IVA = subtotal * IVA_16;
		return IVA;
	}
	
	//metodo
	public double total(double subtotal, double IVA) {
		double total = subtotal + IVA;
		return total;
		
	}

	
	
	
	public int cantidadBodega(int cantidad, int cantidadBodega) {
		if(cantidad > cantidadBodega) {
			return cantidadBodega = 0;
		} else {
			return cantidadBodega -= cantidad; 
		}
	}

	//metodo para vender
	public void totalProductosVendidos(int cantidad, int cantidadBodega) {
		if(cantidad > cantidadBodega) {
			totalProductosVendidos += cantidadBodega; 
		} else {
			totalProductosVendidos += cantidad; 
	    }
	}
	
	

	
	
	//metodo
	public boolean haySuficiente(int cantidad) {
		return cantidad <= cantidadBodega;
	}
	
	
	
	

}
