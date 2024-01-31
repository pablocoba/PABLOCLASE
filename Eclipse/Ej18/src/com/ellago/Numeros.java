package com.ellago;

public class Numeros {

	
	
	public static void generarNum() {
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*200);
			System.out.println(i +": "+array[i]);
		}
		int temp = 0;
		int temp2 = 0;
//		int[] array = new int[] {
//				100,90,80,70,60,50,40,30,20,10
//		};
		System.out.println();
		for (int i = 0; i < array.length; i=i+2) {
			
			if(array[i]>=100) {

				for (int j = i; j < array.length; j++) {
					if(array[j] < 100) {
						temp = array[i];
						array[i]=array[j];
						array[j]=temp;
						break;
					}
				}
			}
			System.out.println(i +": "+array[i]);
			System.out.println(i+1 +": "+array[i+1]);

		}
		System.out.println();
		
		for (int i = 1; i < array.length-1; i=i+2) {
			if(array[i]<100) {
				
				temp = array[i];
				for (int j = i-1; j < array.length; j++) {
					if(array[j] >= 100) {
						array[i]=array[j];
						array[j]=temp;
						break;
					}
				
				}
			}
			System.out.println(i +": "+array[i]);
			System.out.println(i+1 +": "+array[i+1]);
		}
		System.out.println();
		
		
		for (int i = 0; i < array.length-1; i=i+2) {
			if((array[i] <100 & array[i+1] <100) || (array[i] >100 & array[i+1] >100)) {
				System.out.println(i +": "+array[i]);
				System.out.println(i+1 +": "+array[i+1]);
			}
			else {
				if(array[i]>array[i+1]) {
					temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;

				}
				else {

				}
				System.out.println(i +": "+array[i]);
				System.out.println(i+1 +": "+array[i+1]);
			}

		}
		


	}
//		HAY CASOS EN LOS QUE FALLA PORQUE SE LLEVA UN NÚMERO DEMASIADO ATRÁS!!!!
}
