package com.calculadora.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.calculadora.ws.Calculadora")
public class CalculadoraImpl implements Calculadora {

	public double operacion(int opcion, int valor1, int valor2) {
		
		double resultado = 0;
		
		switch (opcion) {
		case 1:
			resultado = valor1 + valor2;			
			break;
			
		case 2:
			resultado = valor1 - valor2;			
			break;
		
		case 3:
			resultado = valor1 * valor2;			
			break;
		
		case 4:
			resultado = valor1 / valor2;			
			break;
		
			
			

		default:
			break;
		}
		
		
		
		return resultado;
	}

}
