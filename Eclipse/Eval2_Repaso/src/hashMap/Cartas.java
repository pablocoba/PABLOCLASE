package hashMap;

import java.util.Random;
public class Cartas implements Comparable<Cartas>{
	
	private String figura;
	private Integer valor;
	private String palo = "nada";
	private static int espadas = 12;
	private static int oros = 12;
	private static int bastos = 12;
	private static int copas = 12;
	
	public Cartas(String figura, Integer valor) {
		this.figura = figura;
		this.valor = valor;
		this.palo = "nada";
		Random rnd = new Random();
		
		int x = rnd.nextInt(4);
		if(palo.equals("nada")) {
			switch(x) {
			case 0:
				if(espadas > 0) {
					this.palo = "espadas";
					espadas-=1;
					break;
				}
			case 1:
				if(copas > 0) {
					this.palo = "copas";
					copas-=1;
					break;
				}
			case 2:
				if(bastos > 0) {
					this.palo = "bastos";
					bastos-=1;
					break;
				}
			case 3:
				if(oros > 0) {
					this.palo = "oros";
					oros-=1;
					break;
				}
			}
		}

	}

	public String getFigura() {
		return figura;
	}

	public void setFigura(String figura) {
		this.figura = figura;
	}

	public Integer getValor() {
		return valor;
	}

	public String getPalo()
	{
		return palo;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return figura + " de " + palo;
	}

	@Override
	public int compareTo(Cartas o) {
		
		if(this.getPalo().compareTo(o.getPalo())>0) {
			return 1;
		}
		else if(this.getPalo().compareTo(o.getPalo())<0) {
			return -1;
		}

		else return 0;
	}
	
}
