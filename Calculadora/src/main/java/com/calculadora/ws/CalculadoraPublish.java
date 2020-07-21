package com.calculadora.ws;

import javax.xml.ws.Endpoint;

public class CalculadoraPublish {

	public static void main(String[] args) {
		
    Endpoint.publish("http://localhost:1515/WS/Calc", new CalculadoraImpl());
		
		

	}

}
