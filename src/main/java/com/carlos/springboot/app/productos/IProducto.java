package com.carlos.springboot.app.productos;

/**
 * @author Carlos Martínez
 * Interfaz con atributos y metodo calcularEnvio(args)
 */
public interface IProducto {
	
	public static final String NOMBRE_PRODUCTO = "Laptop DELL";
	public static final String CATEGORIA = "Tecnología";
	public static final double PRECIO = 699.99;
	
	public void calcularEnvio(String ubicacion, int cantidad);
	
}
