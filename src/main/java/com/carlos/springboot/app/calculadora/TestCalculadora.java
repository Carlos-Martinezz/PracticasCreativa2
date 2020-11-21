package com.carlos.springboot.app.calculadora;

import java.util.Scanner;

/**
 * @author Carlos Martínez
 * Clase con implementación final de los métodos
 */
public class TestCalculadora {

	public static void main(String[] args) {
		
		String opcionEscogida;
		Scanner datos = new Scanner(System.in);
		CalculadoraDigital calculadora = new CalculadoraDigital();
		
		String num1;
		String num2;
		int num1Final, num2Final;
		
		System.out.println("Seleccione el número de la operación que desea realizar: ");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		
		opcionEscogida = datos.nextLine();
		
		/**
		 * Validamos la opción escogida por el usuario (Debe ser numérica y estar entre las opcines 1 a 4)
		 */
		while ( !calculadora.validarOpcion(opcionEscogida) ) {
			System.out.println("Opción inválida");
			opcionEscogida = datos.nextLine();
		}
		
		/**
		 * Capturamos y validamos el primer número 
		 */
		System.err.println("Ingrese el primer número");
		num1 = datos.nextLine();
		while ( !calculadora.validarNumero(num1) ) {
			System.out.println("Debe ingresar un número");
			num1 = datos.nextLine();
		}
		
		/**
		 * Capturamos y validamos el segundo número 
		 */
		System.err.println("Ingrese el segundo número");
		num2 = datos.nextLine();
		while ( !calculadora.validarNumero(num2) ) {
			System.out.println("Debe ingresar un número");
			num2 = datos.nextLine();
		}
		
		/**
		 * Convertimos los números a enteros y se escoge la operación
		 */
		num1Final = Integer.parseInt(num1);
		num2Final = Integer.parseInt(num2);
		
		switch (Integer.parseInt(opcionEscogida)) {
			case 1:
				System.out.println("La suma es: " + calculadora.suma(num1Final, num2Final));
				break;
			case 2:
				System.out.println("La resta es: " + calculadora.resta(num1Final, num2Final));
				break;
			case 3:
				System.out.println("La multiplicación es: " + calculadora.multiplicacion(num1Final, num2Final));
				break;
			case 4:
				System.out.println("La división es: " + calculadora.division(num1Final, num2Final));
				break;
		}
		
	}
	

}
