package com.carlos.springboot.app.productos;

/**
 * @author Carlos Martínez
 * Clase con implementación de la interface IProducto y sus métodos
 */
public class Producto implements IProducto {

	@Override
	public void calcularEnvio(String direccion, int cantidad) {	
		System.out.println("Nombre del producto: ".concat(IProducto.NOMBRE_PRODUCTO));
		System.out.println("Categoría: ".concat(IProducto.CATEGORIA));
		System.out.println("Precio: " + IProducto.PRECIO);
		System.out.println("Cantidad: " + cantidad);
		
		System.out.println();
		
		System.out.println("Datos del envío:");
		System.out.println("Dirección: ".concat(direccion));
		System.out.println("Total: " + (IProducto.PRECIO * cantidad));
	}
	

}
