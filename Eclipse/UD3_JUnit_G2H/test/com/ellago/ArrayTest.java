package com.ellago;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/*
 * @author Daniel Barbero, Vincenzo Vitulli, Pablo Coba.
 */

class ArrayTest {

	@Test
	public void ArrayIntBuscar() {
		int[] arrayInt = {1,2,3,4,5};
		
		assertEquals(true, Array.buscarArrayInt(arrayInt, 5));
		assertEquals(false, Array.buscarArrayInt(arrayInt, 7));
		assertNotEquals(true, Array.buscarArrayInt(arrayInt, 10));
		assertNotEquals(false, Array.buscarArrayInt(arrayInt, 3));
		
	}
	
	@Test
	public void ArrayStringBuscar() {
		String[] arrayString = {"Dato5","Dato2","Dato3","Dato4",};
		
		assertEquals(true, Array.buscarArrayString(arrayString, "Dato5"));
		assertEquals(false, Array.buscarArrayString(arrayString, "Dato1"));
		assertNotEquals(true, Array.buscarArrayString(arrayString, "Dato20"));
		assertNotEquals(false, Array.buscarArrayString(arrayString, "Dato3"));
		
	}
	
	@Test
	public void ArrayIntLocalizarPosicion() {
		int[] arrayInt = new int[] {
				1,2,3,4,5,6,7,8,9,10
		};
		
		assertEquals(-1, Array.localizaPosInt(arrayInt, 11));
		assertEquals(-1, Array.localizaPosInt(arrayInt, -1));
		assertEquals(5, Array.localizaPosInt(arrayInt, 6));
		assertNotEquals(-1, Array.localizaPosInt(arrayInt, 6));
	}
	
	@Test
	public void ArrayStringLocalizarPosicion() {
		String[] arrayString = new String[] {
				"Dato0", "Dato1", "Dato2", "Dato3", "Dato4", "Dato5", "Dato6", "Dato7", "Dato8", "Dato9", "Dato"
		};
		
		assertEquals(5, Array.localizaPosString(arrayString, "Dato5"));
		assertEquals(-1, Array.localizaPosString(arrayString, "Dato10"));
		assertNotEquals(-1, Array.localizaPosString(arrayString, "Dato"));
		assertNotEquals(-1, Array.localizaPosString(arrayString, "Dato5"));
		assertNotEquals(5, Array.localizaPosString(arrayString, "Dato10"));


	}
	
	@Test
	public void ArrayIntVeces() {
		int[] arrayInt = new int[] {
				1,2,2,2,5,6,7,8,9,10
		};
		
		assertEquals(3,Array.vecesIntArray(arrayInt, 2));
		assertEquals(0,Array.vecesIntArray(arrayInt, 4));
		assertNotEquals(3,Array.vecesIntArray(arrayInt, 4));
		assertNotEquals(2,Array.vecesIntArray(arrayInt, 2));
	}
	
	@Test
	public void ArrayStringVeces() {
		String[] arrayString = new String[] {
				"Dato0", "Dato0", "Dato0", "Dato3", "Dato4", "Dato5", "Dato6", "Dato7", "Dato8", "Dato9", "Dato"
		};
		
		assertEquals(3,Array.vecesStringArray(arrayString, "Dato0"));
		assertEquals(0,Array.vecesStringArray(arrayString, "Dato2"));
		assertNotEquals(2,Array.vecesStringArray(arrayString, "Dato2"));
		assertNotEquals(2,Array.vecesStringArray(arrayString, "Dato0"));
	}
	
	@Test
	public void ArrayIntSustituir() {
		int[] arrayInt = new int[] {
				1,2,3,4,3,5,6,3,8,9,10
		};
		int[] arrayInt2 = new int[] {
				1,2,3,4,3,5,6,3,8,9,10
		};
		int[] arrayInt3 = new int[] {
				1,2,3,4,3,5,6,3,8,9,10
		};
		
		assertEquals(3, Array.sustituirIntArray(arrayInt, 3, 4));
		assertEquals(-1, Array.sustituirIntArray(arrayInt, 11, 4));
		assertNotEquals(2, Array.sustituirIntArray(arrayInt, 11, 4));
		assertNotEquals(-1, Array.sustituirIntArray(arrayInt2, 3, 4));
		assertNotEquals(2, Array.sustituirIntArray(arrayInt3, 3, 4));
		assertNotEquals(3, Array.sustituirIntArray(arrayInt, 2, 4));
		
	}
	
	@Test
	public void ArrayStringSustituir() {
		String[] arrayString = new String[] {
				"Dato0", "Dato0", "Dato0", "Dato3", "Dato4", 
				"Dato5", "Dato6", "Dato7", "Dato8", "Dato9", "Dato"
		};
		String[] arrayString2 = new String[] {
				"Dato0", "Dato0", "Dato0", "Dato3", "Dato4", 
				"Dato5", "Dato6", "Dato7", "Dato8", "Dato9", "Dato"
		};
		String[] arrayString3 = new String[] {
				"Dato0", "Dato0", "Dato0", "Dato3", "Dato4", 
				"Dato5", "Dato6", "Dato7", "Dato8", "Dato9", "Dato"
		};

		
		assertEquals(3, Array.sustituirStringArray(arrayString, "Dato0", "Dato1"));
		assertEquals(-1, Array.sustituirStringArray(arrayString, "Dato100", "Dato1"));
		assertNotEquals(2, Array.sustituirStringArray(arrayString, "Dato100", "Dato1"));
		assertNotEquals(-1, Array.sustituirStringArray(arrayString2, "Dato0", "Dato1"));
		assertNotEquals(2, Array.sustituirStringArray(arrayString3, "Dato0", "Dato1"));
		assertNotEquals(3, Array.sustituirStringArray(arrayString, "Dato6", "Dato1"));
		
	}
	
	@Test
	public void ArrayIntBuscarDicotomica() {
		int[] arrayInt = new int[] {
				1,2,3,4,3,5,6,3,8,9,10
		};
		
		assertEquals(2,Array.buscarInt(arrayInt, 3));
		assertEquals(-1,Array.buscarInt(arrayInt, 11));
		assertNotEquals(2,Array.buscarInt(arrayInt, 2));
		assertNotEquals(2,Array.buscarInt(arrayInt, 11));
		
	}
	
	@Test
	public void ArrayStringBuscarDicotomica() {
		String[] arrayString = new String[] {
				"Dato0", "Dato1", "Dato2", "Dato3", "Dato4", 
				"Dato5", "Dato6", "Dato7", "Dato8", "Dato9"
		};
		
		assertEquals(0,Array.buscarString(arrayString, "Dato0"));
		assertEquals(-1,Array.buscarString(arrayString, "Dato10"));
		assertNotEquals(1,Array.buscarString(arrayString, "Dato0"));
		assertNotEquals(1,Array.buscarString(arrayString, "Dato10"));
		assertNotEquals(11,Array.buscarString(arrayString, "Dato0"));
		
	}
	
	@Test
	public void ArrayIntLongitudTest() {
		assertEquals(5,Array.crearArrayInt(5).length);
		assertNotEquals(6,Array.crearArrayInt(5).length);
	}
	
	@Test
	public void ArrayIntContenidoTest() {
		int[] arrayInt = Array.crearArrayInt(10);
		
		boolean contenido = true;

			for (int i = 0; i < arrayInt.length; i++) {
				
				if(arrayInt[i]<0 | arrayInt[i]>10) {
					contenido = false;
				}

			}
		assertTrue(contenido);

	}
	@Test
	public void ArrayStringLongitudTest() {
		assertEquals(5,Array.crearArrayString(5).length);
		assertNotEquals(6,Array.crearArrayString(5).length);
	}
	
	@Test
	public void ArrayStringContenidoTest() {
		String[] arrayString = Array.crearArrayString(10);
		boolean contenido = true;
		int dig;

			for (int i = 0; i < arrayString.length; i++) {
				//para quitarle la restriccion del ascii es el -0
				dig = arrayString[i].charAt(4) - '0';
				if(dig<0 | dig>10) {
					contenido = false;
				}
				
			}
		
		
		assertTrue(contenido);
		

			
	}

	@Test
	public void ArrayIntUnir() {
		int[] arrayIntU = new int[] {
				1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10
		};
		int[] arrayInt = new int[] {
				1,2,3,4,5,6,7,8,9,10
		};
		int[] arrayInt2 = new int[] {
				1,2,2,2,5,6,7,8,9,10
		};
		int[] arrayInt3 = new int[] {
				1,2,2,2,5,6,7,8,9
		};
		assertArrayEquals(arrayIntU, Array.unirArraysInt(arrayInt, arrayInt));
		assertEquals(20, Array.unirArraysInt(arrayInt, arrayInt2).length);
		assertEquals(19, Array.unirArraysInt(arrayInt, arrayInt3).length);
		assertNotEquals(20, Array.unirArraysInt(arrayInt, arrayInt3).length);
		assertNotEquals(10, Array.unirArraysInt(arrayInt, arrayInt2).length);
		
		
	}
	
	@Test
	public void ArrayIntOrdenado() {

		int[] arrayInt = new int[] {
				2,1,3,6,5,7,4,8,10,9
		};
		boolean comprobar = true;
		Array.ordenarIntArray(arrayInt);
		for (int i = 0; i < arrayInt.length-1; i++) {
			if(arrayInt[i]>arrayInt[i+1]) {
				comprobar = false;
			}
		}
		assertTrue(comprobar);
		
	}
	@Test
	public void ArrayStringOrdenado() {

		String[] arrayString = new String[] {
				"Dato1", "Dato6", "Dato0", "Dato3", "Dato4", "Dato5", "Dato2", "Dato7", "Dato8", "Dato9"
		};
		boolean comprobar = true;
		Array.ordenarStringArray(arrayString);
		for (int i = 0; i < arrayString.length-1; i++) {
			if(arrayString[i].charAt(4)>arrayString[i+1].charAt(4)) {
				comprobar = false;
			}
		}
		assertTrue(comprobar);
		
	}
	
	@Test 
	public void ArrayPersonaCrear() {
		Persona[] persona = Array.crearArrayPersona(10);
		int digitosNombre = 0;
		boolean contenido = true;
		for (int i = 0; i < persona.length; i++) {
			
			int idx = persona[i].nombre.length();		
			//el substring coge 1 de más
			digitosNombre = Integer.parseInt(persona[i].nombre.substring(1, idx));
		}
		
		for (int i = 0; i < persona.length; i++) {
			
			if((persona[i].nombre.charAt(0)<64 | persona[i].nombre.charAt(0)>96) & (persona[i].edad<18 | persona[i].edad>95) & (digitosNombre < 0 | digitosNombre > 200)) {
				contenido = false;
			}
			else contenido = true;
		}
		assertTrue(contenido);
	}
	
	@Test
	public void ArrayPersonaOrdenar() {
		
		Persona p = new Persona("W123", 20);
		Persona c = new Persona("S321", 70);
		Persona l = new Persona("P987", 50);

		
		Persona[] persona = {
				p,c,l
		};
		Persona[] persona2 = {
				p,l,c
		};
		
		assertArrayEquals(persona2, Array.ordenarArrayPersona2(persona));
		
		
		
	}
	
	@Test
	public void MatrizIntLongitudTest() {
		int[][]matrizInt = Array.crearMatrizInt(9, 3);
		assertEquals(9,matrizInt.length);
		assertNotEquals(5, matrizInt.length);
		for (int i = 0; i < matrizInt.length; i++) {
			assertEquals(3,matrizInt[i].length);
			assertNotEquals(6,matrizInt[i].length);
		}
	}
	
	@Test
	public void MatrizIntContenidoTest() {
		int[][]matrizInt = Array.crearMatrizInt(9, 3);
		boolean contenido = true;
		
		for (int i = 0; i < matrizInt.length; i++) {
			for (int j = 0; j < matrizInt[i].length; j++) {
				if(matrizInt[i][j] < 20 | matrizInt[i][j] >120) {
					contenido = false;
				}
			}
		}

		assertTrue(contenido);
	}
	
	@Test
	public void MatrizStringLongitudTest() {
		String[][]matrizString = Array.crearMatrizString(9, 3);
		assertEquals(9,matrizString.length);
		assertNotEquals(5, matrizString.length);
		for (int i = 0; i < matrizString.length; i++) {
			assertEquals(3,matrizString[i].length);
			assertNotEquals(6,matrizString[i].length);
		}
	}
	
	@Test
	public void MatrizStringContenidoTest() {
		String[][]matrizString = Array.crearMatrizString(9, 3);
		boolean contenido = true;
		
		for (int i = 0; i < matrizString.length; i++) {
			for (int j = 0; j < matrizString[i].length; j++) {
				if(((int)matrizString[i][j].charAt(0) < 65 | (int)matrizString[i][j].charAt(0) > 90)  && (Integer.parseInt(matrizString[i][j].substring(1))<1 | Integer.parseInt(matrizString[i][j].substring(1))>101)) {
					contenido = false;
				}
			}
		}

		assertTrue(contenido);
	}
}
