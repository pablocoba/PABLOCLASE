package duro;

public class ElectrodomesticosApp {

	public static void main(String[] args) {
		Electrodomestico[] electrodomestico = new Electrodomestico[10];
		electrodomestico[0] = new Electrodomestico();
		electrodomestico[1] = new Electrodomestico(100, 2);
		electrodomestico[2] = new Television(250, 3, 'A', "negro", 43,false);
		electrodomestico[3] = new Electrodomestico(150, 1);
		electrodomestico[4] = new Electrodomestico(275, 4.5, 'B', "negro");
		electrodomestico[5] = new Electrodomestico(225, 0.70, 'A', "negro");
		electrodomestico[6] = new Lavadora(45, 12, 'D', "blanco", 40);
		electrodomestico[7] = new Electrodomestico(98, 1.5, 'C', "rojo");
		electrodomestico[8] = new Television(650, 3.2, 'A', "azul", 55, true);
		electrodomestico[9] = new Electrodomestico(575, 4.5, 'B', "negro");
		
		double sumaElectrodomesticos=0;
		double sumaTele=0;
		double sumaLavadoras=0;
		
		for(int i = 0; i<electrodomestico.length; i++) {
			if(electrodomestico[i] instanceof Electrodomestico) {
				sumaElectrodomesticos+=electrodomestico[i].precioFinal();
			}
			if(electrodomestico[i] instanceof Lavadora) {
				sumaLavadoras+=electrodomestico[i].precioFinal();
			}
			if(electrodomestico[i] instanceof Television) {
				sumaTele+=electrodomestico[i].precioFinal();
			}
		}
		
		System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTele);
		

		
	}
}

