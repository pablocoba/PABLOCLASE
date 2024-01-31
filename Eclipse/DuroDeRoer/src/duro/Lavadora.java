package duro;

public class Lavadora extends Electrodomestico{

	private final static int cargaDef=5;
	private int carga;
	public int getCarga() {
		return carga;
	}
	public double precioFinal() {
		double plus=super.precioFinal();
		if(carga>30) {
			plus+=50;
		}
		return plus;
	}
	
	public Lavadora() {
		super(precioBaseDef,pesoDef,consumoEDef, colorDef);
	}
	public Lavadora(double precioBase, double peso) {
		super(precioBase,pesoDef,consumoEDef, colorDef);
		this.precioBase=precioBase;
		this.peso=peso;
	}
	public Lavadora(int carga, double precioBase, char consumoE, String color, double peso) {
		super(precioBaseDef, peso, consumoE, color);
		this.carga=carga;
	}

	
	
}
