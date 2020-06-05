package Congeladora;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static public ArrayList <String> Clientes= new ArrayList<String>();
	static public ArrayList <String> Vendedores = new ArrayList<String>();
	static public ArrayList <String> Proveedores= new ArrayList<String>();
	static public ArrayList <String> Almacenes= new ArrayList<String>();
	static public ArrayList <String> Productos= new ArrayList<String>();
	static public ArrayList <String> Ventas= new ArrayList<String>();
	static Scanner inputNum = new Scanner(System.in);
	static Scanner inputText = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcint,login=0,pass=0,intentos=1, maximo=3,opc=0;
		String clien,prod,alma,provee,corr,login1="1234",pass1="1234";
		boolean bandera = true;
		
		Usuario u = new Usuario("","");
		Producto p = new Producto(0,"","",0.0);
		Cliente c = new Cliente("","","");
		Almacen a = new Almacen("","");
		Proveedor pr = new Proveedor("","","");
		Vendedor v = new Vendedor(login1,pass1,"","","","",0);
		Venta ven = new Venta(0,"","",0.0,0,"",0,0);
		
		System.out.println("Login: " + login1 + " y " + "Password: " + pass1);
		System.out.println("");
		
		while((login!=1234)||(pass!=1234) && (intentos<maximo)){		
			System.out.print("Introduzca un login: ");
			login=inputNum.nextInt();
			System.out.print("Introduzca su password: ");
			pass=inputNum.nextInt();
			
			if(intentos==3){
				System.out.println("Acceso denegado..");
				System.out.println("");
				intentos=intentos-maximo;
			}
			intentos++;	
			System.out.println("");
			System.out.println("Login y Password... ¡Correctos!");
			System.out.println("");

			do {
				System.out.println("========================");
				System.out.println("Congeladora S.A. de C.V.");
				System.out.println("========================");
				System.out.println("");
				System.out.println("¡Bienvenido!");
				System.out.println("");
				System.out.println("1.Productos.");
				System.out.println("2.Clientes.");
				System.out.println("3.Almacenes.");
				System.out.println("4.Proveedores.");
				System.out.println("5.Vendedores.");
				System.out.println("6.Ventas.");
				System.out.println("7.Salir.");
				System.out.println("");
				System.out.println("Elige tu opción:");
				opc=inputNum.nextInt();
				System.out.println("");
				switch(opc) {
				case 1:
					boolean flag1=true;
					while(flag1) {
						System.out.println("==========");
						System.out.println("Productos:");
						System.out.println("==========");
						System.out.println("");
						System.out.println("1.Registrar nuevos productos.");
						System.out.println("2.Ver listado de productos.");
						System.out.println("3.Editar productos.");
						System.out.println("4.Eliminar productos.");
						System.out.println("5.Menú anterior.");
						System.out.println("");
						System.out.println("Elige tu opción:");
						int opc1=inputNum.nextInt();
						System.out.println("");
						if(opc1==1) {
							System.out.println("Especie:");
							p.setEspecie(inputText.nextLine());
							prod="Especie: "+p.getEspecie()+"\n";
							
							System.out.println("Cantidad:");
							p.setCantidad(inputNum.nextInt());
							prod=prod+"Cantidad: "+p.getCantidad()+"\n";
							
							System.out.println("Talla:");
							p.setTalla(inputText.nextLine());
							prod=prod+"Talla: "+p.getTalla()+"\n";
							
							System.out.println("Precio:");
							p.setPrecio(inputNum.nextDouble());
							prod=prod+"Precio: "+p.getPrecio()+"\n";
							Productos.add(prod);
								
						}else if(opc1==2) {
							if(Productos.isEmpty()) {
								System.out.println("No se ha registrado ningún producto.");
							}else {
								for (int i=0; i<Productos.size();i++) {
									System.out.println("Id. de producto: "+i);
									System.out.println("------------------");
									System.out.print(Productos.get(i));
									System.out.println("\n");
								}
							}
						}else if(opc1==3) {
							if(Productos.isEmpty()) {
								System.out.println("No se ha registrado ningún producto");
							}else{
								for (int i=0; i<Productos.size();i++) {
									System.out.println("Id. de producto: "+i);
									System.out.println("------------------");
									System.out.print(Productos.get(i));
									System.out.println("\n");
								}
								boolean edit=true;
								while(edit) {
									try {
									System.out.println("¿Qué producto desea modificar?");
									int x=inputNum.nextInt();
									
									System.out.println("");
										
									Productos.remove(x);
											
									System.out.println("Especie:");
									p.setEspecie(inputText.nextLine());
									prod="Especie: "+p.getEspecie()+"\n";
									
									System.out.println("Cantidad:");
									p.setCantidad(inputNum.nextInt());
									prod=prod+"Cantidad: "+p.getCantidad()+"\n";
									
									System.out.println("Talla:");
									p.setTalla(inputText.nextLine());
									prod=prod+"Talla: "+p.getTalla()+"\n";
									
									System.out.println("Precio:");
									p.setPrecio(inputNum.nextDouble());
									prod=prod+"Precio: "+p.getPrecio()+"\n";
									
									Productos.add(prod);
										
									edit=false;
							
									}
									catch(Exception InputOutStream) {
										inputText.nextLine();
										System.out.println("");
										System.out.println("Error: Opción inválida");
									}
								}
								System.out.println("");
							}
						}else if(opc1==4) {
							if(Productos.isEmpty()) {
								System.out.println("No se ha registrado ningun producto");
							}else {
								for (int i=0; i<Productos.size();i++) {
									System.out.println("Id. de producto: "+i);
									System.out.println("------------------");
									System.out.print(Productos.get(i));
									System.out.println("\n");
								}
								System.out.println("¿Qué producto desea eliminar?");
								int product=inputNum.nextInt();
								Productos.remove(product);
								System.out.println("");
								System.out.println("¡Producto eliminado!");
								System.out.println("");
							}
						}else if(opc1==5) {
							flag1=false;
						}else {
							System.out.println("¡Seleccione una opción válida!");
							System.out.println("");
						}
					}
					break;
					
				case 2:
					boolean flag2=true;
					while(flag2) {
						System.out.println("=========");
						System.out.println("Clientes:");
						System.out.println("=========");
						System.out.println("");
						System.out.println("1.Registrar nuevos clientes.");
						System.out.println("2.Ver listado de clientes.");
						System.out.println("3.Editar clientes.");
						System.out.println("4.Eliminar clientes.");
						System.out.println("5.Menú anterior.");
						System.out.println("");
						System.out.println("Elige tu opción:");
						int opc1=inputNum.nextInt();
						System.out.println("");
						if(opc1==1) {
							
							System.out.println("Nombre:");
							c.setNombre_cliente(inputText.nextLine());
							clien="Nombre: "+c.getNombre_cliente()+"\n";
							
							System.out.println("RFC:");
							c.setRfc_cliente(inputText.nextLine());
							clien=clien+"RFC: "+c.getRfc_cliente()+"\n";
							
							System.out.println("Domicilio:");
							c.setDomicilio_cliente(inputText.nextLine());
							clien=clien+"Domicilio: "+c.getDomicilio_cliente()+"\n";
							
							Clientes.add(clien);
							System.out.println("");	
						}else if(opc1==2) {
							if(Clientes.isEmpty()) {
								System.out.println("No se ha registrado ningún cliente.");
								System.out.println("");
							}else {
								for (int i=0; i<Clientes.size();i++) {
									
									System.out.println("Id. de cliente: "+i);
									System.out.println("-----------------");
									System.out.print(Clientes.get(i));
									System.out.println("\n");
								}
								
							}
						}else if(opc1==3) {
							if(Clientes.isEmpty()) {
								System.out.println("No se ha registrado ningún cliente.");
								System.out.println("");
							}else{
								for (int i=0; i<Clientes.size();i++) {
									
									System.out.println("Id. de cliente: "+i);
									System.out.println("-----------------");
									System.out.print(Clientes.get(i));
									System.out.println("\n");
								}
								boolean edit=true;
								while(edit) {
									try {
									System.out.println("¿Qué cliente desea modificar?");
									int x=inputNum.nextInt();
									
									System.out.println("");
										
									Clientes.remove(x);
											
									System.out.println("Nombre:");
									c.setNombre_cliente(inputText.nextLine());
									clien="Nombre: "+c.getNombre_cliente()+"\n";
											
									System.out.println("RFC:");
									c.setRfc_cliente(inputText.nextLine());
									clien=clien+"RFC: "+c.getRfc_cliente()+"\n";
											
									System.out.println("Domicilio:");
									c.setDomicilio_cliente(inputText.nextLine());
									clien=clien+"Domicilio: "+c.getDomicilio_cliente()+"\n";
											
									Clientes.add(clien);	
										
									edit=false;
									
			
										
									}
									catch(Exception InputOutStream) {
										inputText.nextLine();
										System.out.println("");
										System.out.println("Error: Opción inválida");
									}
								}
								
								System.out.println("");	
							}
						}else if(opc1==4) {
							if(Clientes.isEmpty()) {
								System.out.println("No se ha registrado ningún cliente.");
								System.out.println("");
							}else {
								for (int i=0; i<Clientes.size();i++) {
									
									System.out.println("Id. de cliente: "+i);
									System.out.println("-----------------");
									System.out.print(Clientes.get(i));
									System.out.println("\n");
								}
								System.out.println("¿Qué cliente desea eliminar?");
								int client=inputNum.nextInt();
								Clientes.remove(client);
								System.out.println("");
								System.out.println("¡Cliente eliminado!");
								System.out.println("");
							}
						}else if(opc1==5) {
							flag2=false;
						}else {
							System.out.println("¡Seleccione una opción válida!");
							System.out.println("");
						}
					}
					break;
					
				case 3:
					boolean flag3=true;
					while(flag3) {
						System.out.println("==========");
						System.out.println("Almacenes:");
						System.out.println("==========");
						System.out.println("");
						System.out.println("1.Registrar nuevo almacen.");
						System.out.println("2.Ver listado de almacenes.");
						System.out.println("3.Editar almacenes.");
						System.out.println("4.Eliminar almacenes.");
						System.out.println("5.Menú anterior.");
						System.out.println("");
						System.out.println("Elige tu opción:");
						int opc1=inputNum.nextInt();
						System.out.println("");
						if(opc1==1) {
							
							System.out.println("Nombre:");
							a.setNombre(inputText.nextLine());
							alma="Nombre: "+a.getNombre()+"\n";
							
							System.out.println("Dirección:");
							a.setUbicacion(inputText.nextLine());
							alma=alma+"Dirección:: "+a.getUbicacion()+"\n";
							
							Almacenes.add(alma);
							
							System.out.println("");	
						}else if(opc1==2) {
							if(Almacenes.isEmpty()) {
								System.out.println("No se ha registrado ningún almacen.");
								System.out.println("");
							}else {
								for (int i=0; i<Almacenes.size();i++) {
									
									System.out.println("Id. de almacen: "+i);
									System.out.println("-----------------");
									System.out.print(Almacenes.get(i));
									System.out.println("\n");
								}
								
							}
						}else if(opc1==3) {
							if(Almacenes.isEmpty()) {
								System.out.println("No se ha registrado ningún almacen.");
								System.out.println("");
							}else{
								for (int i=0; i<Almacenes.size();i++) {
									
									System.out.println("Id. de alamcen: "+i);
									System.out.println("-----------------");
									System.out.print(Almacenes.get(i));
									System.out.println("\n");
								}
								boolean edit=true;
								while(edit) {
									try {
									System.out.println("¿Qué almacen desea modificar?");
									int x=inputNum.nextInt();
									
									System.out.println("");
										
									Almacenes.remove(x);
											
									System.out.println("Nombre:");
									a.setNombre(inputText.nextLine());
									alma="Nombre: "+a.getNombre()+"\n";
									
									System.out.println("Dirección:");
									a.setUbicacion(inputText.nextLine());
									alma=alma+"Dirección:: "+a.getUbicacion()+"\n";
											
									Almacenes.add(alma);	
										
									edit=false;
									
			
										
									}
									catch(Exception InputOutStream) {
										inputText.nextLine();
										System.out.println("");
										System.out.println("Error: Opción inválida");
									}
								}
								
								System.out.println("");	
							}
						}else if(opc1==4) {
							if(Almacenes.isEmpty()) {
								System.out.println("No se ha registrado ningún almacen.");
								System.out.println("");
							}else {
								for (int i=0; i<Almacenes.size();i++) {
									
									System.out.println("Id. de almacen: "+i);
									System.out.println("-----------------");
									System.out.print(Almacenes.get(i));
									System.out.println("\n");
								}
								System.out.println("¿Qué almacen desea eliminar?");
								int almac=inputNum.nextInt();
								Almacenes.remove(almac);
								System.out.println("");
								System.out.println("¡Almacen eliminado!");
								System.out.println("");
							}
						}else if(opc1==5) {
							flag3=false;
						}else {
							System.out.println("¡Seleccione una opción válida!");
							System.out.println("");
						}
					}
					break;
				
				case 4:
					boolean flag4=true;
					while(flag4) {
						System.out.println("============");
						System.out.println("Proveedores:");
						System.out.println("============");
						System.out.println("");
						System.out.println("1.Registrar nuevos proveedores.");
						System.out.println("2.Ver listado de proveedores.");
						System.out.println("3.Editar proveedores.");
						System.out.println("4.Eliminar proveedor.");
						System.out.println("5.Menú anterior.");
						System.out.println("");
						System.out.println("Elige tu opción:");
						int opc1=inputNum.nextInt();
						System.out.println("");
						if(opc1==1) {
							System.out.println("Nombre:");
							pr.setNombre_proveedor(inputText.nextLine());
							provee="Nombre: "+pr.getNombre_proveedor()+"\n";
							
							System.out.println("RFC:");
							pr.setRfc_proveedor(inputText.nextLine());
							provee=provee+"RFC: "+pr.getRfc_proveedor()+"\n";
							
							System.out.println("Domicilio:");
							c.setDomicilio_cliente(inputText.nextLine());
							provee=provee+"Domicilio: "+c.getDomicilio_cliente()+"\n";
							
							Proveedores.add(provee);
							System.out.println("");	
						}else if(opc1==2) {
							if(Proveedores.isEmpty()) {
								System.out.println("No se ha registrado ningún proveedor.");
								System.out.println("");
							}else {
								for (int i=0; i<Proveedores.size();i++) {
									
									System.out.println("Id. de proveedor: "+i);
									System.out.println("-----------------");
									System.out.print(Proveedores.get(i));
									System.out.println("\n");
								}
								
							}
						}else if(opc1==3) {
							if(Proveedores.isEmpty()) {
								System.out.println("No se ha registrado ningún proveedor.");
								System.out.println("");
							}else{
								for (int i=0; i<Proveedores.size();i++) {
									
									System.out.println("Id. de proveedor: "+i);
									System.out.println("-----------------");
									System.out.print(Proveedores.get(i));
									System.out.println("\n");
								}
								boolean edit=true;
								while(edit) {
									try {
									System.out.println("¿Qué proveedor desea modificar?");
									int x=inputNum.nextInt();
									
									System.out.println("");
										
									Proveedores.remove(x);
											
									System.out.println("Nombre:");
									pr.setNombre_proveedor(inputText.nextLine());
									provee="Nombre: "+pr.getNombre_proveedor()+"\n";
									
									System.out.println("RFC:");
									pr.setRfc_proveedor(inputText.nextLine());
									provee=provee+"RFC: "+pr.getRfc_proveedor()+"\n";
									
									System.out.println("Domicilio:");
									c.setDomicilio_cliente(inputText.nextLine());
									provee=provee+"Domicilio: "+c.getDomicilio_cliente()+"\n";
									
									Proveedores.add(provee);
									System.out.println("");	
										
									edit=false;
										
									}
									catch(Exception InputOutStream) {
										inputText.nextLine();
										System.out.println("");
										System.out.println("Error: Opción inválida");
									}
								}
								
								System.out.println("");	
							}
						}else if(opc1==4) {
							if(Proveedores.isEmpty()) {
								System.out.println("No se ha registrado ningún proveedor.");
								System.out.println("");
							}else {
								for (int i=0; i<Proveedores.size();i++) {
									
									System.out.println("Id. de proveedor: "+i);
									System.out.println("-------------------");
									System.out.print(Proveedores.get(i));
									System.out.println("\n");
								}
								System.out.println("¿Qué proveedor desea eliminar?");
								int proveed=inputNum.nextInt();
								Almacenes.remove(proveed);
								System.out.println("");
								System.out.println("¡Almacen eliminado!");
								System.out.println("");
							}
						}else if(opc1==5) {
							flag4=false;
						}else {
							System.out.println("¡Seleccione una opción válida!");
							System.out.println("");
						}
					}
					break;	
					
				case 5:
					boolean flag5=true;
					while(flag5) {
						System.out.println("===========");
						System.out.println("Vendedores:");
						System.out.println("===========");
						System.out.println("");
						System.out.println("1.Registrar nuevo vendedor.");
						System.out.println("2.Ver listado de vendedores.");
						System.out.println("3.Editar vendedor.");
						System.out.println("4.Eliminar vendedor.");
						System.out.println("5.Menú anterior.");
						System.out.println("");
						System.out.println("Elige tu opción:");
						int opc1=inputNum.nextInt();
						System.out.println("");
						if(opc1==1) {
							
							System.out.println("Nombre:");
							v.setNombre(inputText.nextLine());
							corr="Nombre: "+v.getNombre()+"\n";
							
							System.out.println("Dirección:");
							v.setDireccion(inputText.nextLine());
							corr=corr+"Dirección: "+v.getDireccion()+"\n";
							
							System.out.println("Correo:");
							v.setCorreo(inputText.nextLine());
							corr=corr+"Correo: "+v.getCorreo()+"\n";
							
							System.out.println("Celular:");
							v.setCelular(inputText.nextLine());
							corr=corr+"Celular: "+v.getCelular()+"\n";
							
							System.out.println("Edad:");
							v.setEdad(inputNum.nextInt());
							corr=corr+"Edad: "+v.getEdad()+"\n";
							
							Vendedores.add(corr);
							System.out.println("");	
						}else if(opc1==2) {
							if(Vendedores.isEmpty()) {
								System.out.println("No se ha registrado ningún vendedor.");
								System.out.println("");
							}else {
								for (int i=0; i<Vendedores.size();i++) {
									
									System.out.println("Id. de vendedor: "+i);
									System.out.println("------------------");
									System.out.print(Vendedores.get(i));
									System.out.println("\n");
								}
								
							}
						}else if(opc1==3) {
							if(Vendedores.isEmpty()) {
								System.out.println("No se ha registrado ningún vendedor.");
								System.out.println("");
							}else{
								for (int i=0; i<Vendedores.size();i++) {
									
									System.out.println("Id. de vendedor: "+i);
									System.out.println("------------------");
									System.out.print(Vendedores.get(i));
									System.out.println("\n");
								}
								boolean edit=true;
								while(edit) {
									try {
									System.out.println("¿Qué vendedor desea modificar?");
									int x=inputNum.nextInt();
									
									System.out.println("");
										
									Vendedores.remove(x);
											
									System.out.println("Nombre:");
									v.setNombre(inputText.nextLine());
									corr="Nombre: "+v.getNombre()+"\n";
									
									System.out.println("Dirección:");
									v.setDireccion(inputText.nextLine());
									corr=corr+"Dirección: "+v.getDireccion()+"\n";
									
									System.out.println("Correo:");
									v.setCorreo(inputText.nextLine());
									corr=corr+"Correo: "+v.getCorreo()+"\n";
									
									System.out.println("Celular:");
									v.setCelular(inputText.nextLine());
									corr=corr+"Celular: "+v.getCelular()+"\n";
									
									System.out.println("Edad:");
									v.setEdad(inputNum.nextInt());
									corr=corr+"Edad: "+v.getEdad()+"\n";
									
									Vendedores.add(corr);
										
									edit=false;
										
									}
									catch(Exception InputOutStream) {
										inputText.nextLine();
										System.out.println("");
										System.out.println("Error: Opción inválida");
									}
								}
								
								System.out.println("");	
							}
						}else if(opc1==4) {
							if(Vendedores.isEmpty()) {
								System.out.println("No se ha registrado ningún vendedor.");
								System.out.println("");
							}else {
								for (int i=0; i<Vendedores.size();i++) {
									
									System.out.println("Id. de vendedor: "+i);
									System.out.println("------------------");
									System.out.print(Vendedores.get(i));
									System.out.println("\n");
								}
								System.out.println("¿Qué vendedor desea eliminar?");
								int vent=inputNum.nextInt();
								Clientes.remove(vent);
								System.out.println("");
								System.out.println("¡Vendedor eliminado!");
								System.out.println("");
							}
						}else if(opc1==5) {
							flag5=false;
						}else {
							System.out.println("¡Seleccione una opción válida!");
							System.out.println("");
						}
					}
					break;	
				case 6:
					
					break;
				case 7:
					System.out.println("¡Hasta luego, vuelva pronto!");
					bandera=false;
					break;
				default:
					System.out.println("¡Seleccione una opción válida!");
					System.out.println("");
					break;
				}
			}while(bandera);
			
		}


		
		
		
		
		
		
	}

}
