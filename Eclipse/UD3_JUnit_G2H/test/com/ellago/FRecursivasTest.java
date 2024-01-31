package com.ellago;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FRecursivasTest {
	
	@Test
	public void factorialTest() {

				assertEquals(120,FRecursivas.factorial(5));
		
	}
	@Test
	public void fibonacciTest() {

				assertEquals(3,FRecursivas.fibonacci(5));
		
	}
	@Test
	public void potenciaTest() {

				assertEquals(25,FRecursivas.potencia(5,2));
		
	}
	@Test
	public void sumarDigTest() {

				assertEquals(6,FRecursivas.sumarDig(123));
		
	}

}
