package com.funciones.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;



@WebService
public interface Funciones {
	
	@WebMethod
	public double operacion(int y2, int y1, int x2,int x1);
	

}
