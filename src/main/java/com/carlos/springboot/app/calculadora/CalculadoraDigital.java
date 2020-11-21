package com.carlos.springboot.app.calculadora;

/**
 * @author Carlos Martínez
 * Clase de implementación de la interface Calculadora
 */
public class CalculadoraDigital extends Calculadora {

	/**
	 * Implementamos la lógica de cada método
	 */
	@Override
	public int suma(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int resta(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int multiplicacion(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int division(int num1, int num2) {
		return num1 / num2;
	}
	
	/**
	 * Método validarOpcion(args)
	 * Con este método validamos que la opción escogida por el usuario sea numérica y-
	 * -que esté entre 1 y 4 (que son las únicas opcines válidas)
	 * 
	 * @return boolean
	 */ 
	public boolean validarOpcion(String cadena) {
		try {
			
			int numero = Integer.parseInt(cadena);
			if(numero < 5 && numero > 0) return true;
			else return false;
			
		} catch(Exception e) {
			return false;
		}
	}
	
	/**
	 * Método validarOpcion(args)
	 * Con este método validamos que los números para hacer las operaciones sean numéricos
	 * 
	 * @return boolean
	 */ 
	public boolean validarNumero(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch(Exception e) {
			return false;
		}
	}

}
