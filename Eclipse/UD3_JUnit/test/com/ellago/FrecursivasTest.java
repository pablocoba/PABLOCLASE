package com.ellago;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FrecursivasTest {

	@Test
	void testFactorial() {
		int factorial5=Frecursivas.factorial(5);
		assertEquals(factorial5,120);
	}
		
	@Test
	void testFibonacci() {
		int fibonacci7=Frecursivas.fibonacci(7);
		assertEquals(fibonacci7,13);
	}
	
	@Test
	void testPotencia() {
		int potencia=Frecursivas.potencia(7, 0);
		assertEquals(potencia,1);
	}
	
	@Test
	void testSumardig() {
		int sumardig=Frecursivas.sumardig(1234);
		assertEquals(sumardig,10);
	}

}
