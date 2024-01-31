package com.ellago;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraPrueba {
	Calculadora casio = new Calculadora();
//	@Test
//	void sumar() {
//		double x = casio.sumar(1, 2);
//		assertEquals(13, x);
//	}
//	@Test
//	void restar() {
//		assertEquals(13, casio.restar(15, 2));
//	}
	
	@Test
	void test() {
		assertAll(
				() -> assertEquals(13, casio.restar(12, 3)),
				() -> assertEquals(13, casio.sumar(12, 3))
			);
	}

	

}
