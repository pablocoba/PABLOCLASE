package duro;

public class Television extends Electrodomestico{

	private final static int resolucionDef = 20;
	private final static boolean sintonizadorDef = false;
	
	private int resolucion; //pulgadas
	private boolean sintonizador;
	
	Television(){
		super(precioBaseDef,pesoDef,consumoEDef, colorDef);
	}
	
	Television(double precioBase, double peso){
		super(precioBaseDef,pesoDef,consumoEDef, colorDef);
		this.precioBase=precioBase;
		this.peso=peso;
	}
	
	Television(double precioBase, double peso, char consumoE, String color, int resolucion, boolean sintonizador){
		super(precioBase,peso,consumoE, color);
		this.resolucion=resolucion;
		this.sintonizador=sintonizador;
	}
	
	public int getResolucion() {
		return resolucion;
	}
	public boolean getSintonizador() {
		return sintonizador;
	}
	
	public double precioFinal() {
		double plus=super.precioFinal();
		  

        if (resolucion>40){
            plus+=precioBase*0.3;
        }
        if (sintonizador){
            plus+=50;
        }
  
        return plus;
    }
		

}
	

