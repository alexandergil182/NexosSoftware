package com.funciones.ws;

import javax.xml.ws.Endpoint;



public class FuncionesPublish {

	public static void main(String[] args) {
		
		
		Endpoint.publish("http://localhost:2525/WS/Func", new FuncionesImpl());

	}

}
