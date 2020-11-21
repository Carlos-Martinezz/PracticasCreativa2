package com.carlos.springboot.app.productos;

/**
 * @author Carlos Martínez
 * Instanciamos la clase Producto y llamamos la implementación de calcularEnvio(args)
 */
public class TestProducto {

	public static void main(String[] args) {
		
		Producto producto = new Producto();
		producto.calcularEnvio("Planes de Renderos, San Salvador", 2);
		System.out.println("");
		producto.calcularEnvio("Sensuntepeque, Cabañas", 5);

	}

}
