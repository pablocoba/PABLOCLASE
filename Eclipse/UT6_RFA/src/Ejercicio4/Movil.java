package Ejercicio4;


//asignamos a movil la herencia de Terminal.
public class Movil extends Terminal {
	
	
	//creamos los atributos
	private String tarifa;

	public Movil(String numeroMovil, String tarifa) {
		
		super(numeroMovil);
			
		this.tarifa = tarifa;
		
	}

	public void llama(Movil receptor, int segundos) {
		
			this.tiemconv += segundos;
			receptor.tiemconv += segundos;
		
		
		
	}

	//calculamos el coste de las llamadas utilizando switch para hacer diferentes casos.
	
	public double calcularCostoLlamadas() {
		double tarificacion=0;
		switch (this.tarifa) {
			case "rata": tarificacion=(double)(this.tiemconv * 0.06);
						break;
			case "mono": tarificacion=(double)(this.tiemconv * 0.12);
						break;
			case "bisonte": tarificacion=(double)(this.tiemconv * 0.30);
						break;
			
		
		}
		return tarificacion;
	}

	@Override
	public String toString() {
		return String.format("Número de teléfono: " + super.getnumero() + ", " + " Tipo de tarifa: " + this.tarifa + ", "
				+ " Minutos hablados: " + super.getiemconv()+ " coste " + this.calcularCostoLlamadas() );

	}

	// hacemos getter y setter de Tarifa

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		
		this.tarifa = tarifa;
	}
	
//mostramos.

	public static void main(String[] args) {
		
		Movil m1 = new Movil("678 11 22 33", "rata");
		Movil m2 = new Movil("644 74 44 69", "mono");
		Movil m3 = new Movil("622 32 89 09", "bisonte");
		System.out.println(m1);
		System.out.println(m2);
		m1.llama(m2, 320);
		m1.llama(m3, 200);
		m2.llama(m3, 550);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

	}
}
