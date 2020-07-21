package com.calculadora.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Calculadora {
    @WebMethod
	public double operacion(int opcion, int valor1, int valor2);
	
	
	
}
