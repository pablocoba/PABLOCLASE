package com.ellago;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FarraysTest {
	
	int[] myIntArray = new int[] {4,5,7,9,4,1,8,2,7,0,7};
	
	int[] intArrayOrdenado = new int[] {0,1,2,4,4,5,7,7,7,8,9};
	
	String[] myStringArray = new String[] {"Labrador","Shiba","Beagle","Bulldog","Poodle","Shiba","Husky","Chihuahua","Golden Retriever","Shiba"};
	
	String[] stringArrayOrdenado = new String[] {"Beagle","Bulldog","Chihuahua","Golden Retriever","Husky","Labrador","Poodle","Shiba","Shiba","Shiba"};
	
	@Test
	void testBuscarArrayInt() {
		boolean buscarInt=Farrays.buscarArrayInt(myIntArray, 3);
		assertFalse(buscarInt);
	}
	
	@Test
	void testBuscarArrayString() {
		boolean buscarString=Farrays.buscarArrayString(myStringArray, "Husky");
		assertTrue(buscarString);
	}
	
	@Test
	void testLocalizaPosInt() {
		int primeraPosicionInt=Farrays.localizaPosInt(myIntArray, 4);
		assertEquals(primeraPosicionInt,0);
	}
	
	@Test
	void testLocalizaPosString() {
		int primeraPosicionString=Farrays.localizaPosString(myStringArray, "Shiba");
		assertEquals(primeraPosicionString,1);
	}

	@Test
	void testVecesIntArray() {
		int vecesInt=Farrays.vecesIntArray(myIntArray, 4);
		assertEquals(vecesInt,2);
	}
	
	@Test
	void testVecesStringArray() {
		int vecesString=Farrays.vecesStringArray(myStringArray, "Shiba");
		assertEquals(vecesString,3);
	}
	
	@Test
	void testSustituirIntArray() {
		int vecesIntSustituir =Farrays.sustituirIntArray(myIntArray, 7, 0);
		assertEquals(vecesIntSustituir,3);
	}
	
	@Test
	void testSustituirStringArray() {
		int vecesStringSustituir=Farrays.sustituirStringArray(myStringArray, "Shiba", "Akita");
		assertEquals(vecesStringSustituir,3);
	}
	
	@Test
	void testBusquedaDictomiaInt() {
		int posicionInt=Farrays.busquedaDictomicaInt(intArrayOrdenado, 4);
		assertEquals(posicionInt,3);
	}
	
	@Test
	void testBusquedaDictomiaString() {
		int posicionString=Farrays.busquedaDictomiaString(stringArrayOrdenado, "Shiba");
		assertEquals(posicionString,7);
		assertEquals(posicionString,8);
		assertEquals(posicionString,9);
	}
	
	
}
