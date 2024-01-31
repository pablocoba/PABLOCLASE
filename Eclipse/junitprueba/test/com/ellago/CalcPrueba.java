package com.ellago;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcPrueba {

	@Test
	void sumar() {
		
		Calculadora casio = new Calculadora();
		double x = casio.sumar(13, 2);
		assertEquals(13,x);

	}
	
	@Test
	void restar() {
		
		Calculadora casio = new Calculadora();
		double x = casio.restar(13, 2);
		assertEquals(13,x);

	}

}
