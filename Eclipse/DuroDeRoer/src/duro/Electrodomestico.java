package duro;

public class Electrodomestico {
	protected final static double precioBaseDef = 100; //€
	protected final static String colorDef= "blanco";
	protected final static char consumoEDef = 'F'; //de la A a la F
	protected final static double pesoDef = 5; //kg
	
	protected String color;
	protected char consumoE;
	
	protected double precioBase;
	protected double peso;
	
	public Electrodomestico(){
		this(precioBaseDef, pesoDef, consumoEDef, colorDef);
	}
	public Electrodomestico(double precioBase, double peso){
		this(precioBase, peso, consumoEDef, colorDef);
	}
	public Electrodomestico(double precioBase, double peso, char consumoE, String color){
		 this.precioBase=precioBase;
	     this.peso=peso;
	     comprobarConsumoEnergetico(consumoE);
	     comprobarColor(color);
	}
	
	public double getPrecioBase(){
		return precioBase;
	}
	public char getConsumoE() {
		return consumoE;
	}
	public double getPeso() {
		return peso;
	}
	public String getColor() {
		return color;
	}
	
	protected void comprobarConsumoEnergetico(char consumoE) {

		if(consumoE>=65 && consumoE<=70){
            this.consumoE=consumoE;
        }else{
            this.consumoE=consumoEDef;
        }
	}
	protected void comprobarColor(String color) {
		String colores[]= {"blanco","negro","rojo","azul","gris"};
		boolean comprobar = false;
		for(int i = 0; i<=colores.length && !comprobar;i++) {
			if(colores[i].equals(color)) {
				comprobar=true;
			}
		}
		if(comprobar==false) {
			this.color=colorDef;
		}
		else {
			this.color=color;
		}
	}
	
	public double precioFinal(){
        double plus=0;
        switch(consumoE){
            case 'A':
                plus+=100;
                break;
            case 'B':
                plus+=80;
                break;
            case 'C':
                plus+=60;
                break;
            case 'D':
                plus+=50;
                break;
            case 'E':
                plus+=30;
                break;
            case 'F':
                plus+=10;
                break;
        	}
         if(peso>=0 && peso<=19) {
        	 plus+=10;
         }
         if(peso>=20 && peso<=49) {
        	 plus+=50;
         }
         if(peso>=50 && peso<=79) {
        	 plus+=80;
         }
         if(peso>=80) {
        	 plus+=100;
         }
         
         return precioBase+plus;
	}

}
