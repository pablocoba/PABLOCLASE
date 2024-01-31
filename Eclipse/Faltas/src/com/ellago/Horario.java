package com.ellago;

public class Horario {

	public static double horasTotales;
	public static double horasFaltasTotales;
	public static double porcentajeTotal;
	public static Asignaturas bases = new Asignaturas("Bases de datos", 6);
	public static Asignaturas fol = new Asignaturas("FOL", 3);
	public static Asignaturas programacion = new Asignaturas("Programacion", 8);
	public static Asignaturas entornos = new Asignaturas("Entornos", 2);
	public static Asignaturas marcas = new Asignaturas("Lenguaje de Marcas", 4);
	public static Asignaturas ingles = new Asignaturas("Ingles", 2);
	public static Asignaturas sistemas = new Asignaturas("Sistemas Informáticos", 5);
	
	private Asignaturas[] horasLunes= {
			bases,bases,programacion,programacion,sistemas,sistemas
	};
	private Asignaturas[] horasMartes= {
			programacion,programacion,marcas,marcas,bases,bases
	};
	private Asignaturas[] horasMiercoles= {
			entornos,entornos,programacion,programacion,ingles,fol
	};
	private Asignaturas[] horasJueves= {
			bases,bases,ingles,sistemas,programacion,programacion
	};
	private Asignaturas[] horasViernes= {
			marcas,marcas,fol,fol,sistemas,sistemas
	};
	
	public double getHorasTotales() {
		return horasTotales;
	}
	public double getHorasFaltasTotales() {
		return horasFaltasTotales;
	}
	
	public double getPorcentajeTotal() {
		return porcentajeTotal;
	}
	
	public void setHorasTotales(double horasTotales) {
		this.horasTotales=horasTotales;
	}
	public void setHorasFaltasTotales(double horasFaltasTotales) {
		this.horasFaltasTotales=horasFaltasTotales;
	}
	
	public void setPorcentajeTotal(double porcentajeTotal) {
		this.porcentajeTotal = porcentajeTotal;
		
	}
	
	public Horario() {
		
	}
	
	public void showHorario() {
		System.out.println("Lunes:\n");
		for (int i = 0; i < horasLunes.length; i++) {

			System.out.println(horasLunes[i].getNombre());
		}
		System.out.println("\nMartes:\n");
		for (int i = 0; i < horasMartes.length; i++) {

			System.out.println(horasMartes[i].getNombre());
		}
		System.out.println("\nMiercoles:\n");
		for (int i = 0; i < horasMiercoles.length; i++) {

			System.out.println(horasMiercoles[i].getNombre());
		}
		System.out.println("\nJueves:\n");
		for (int i = 0; i < horasJueves.length; i++) {

			System.out.println(horasJueves[i].getNombre());
		}
		System.out.println("\nViernes:\n");
		for (int i = 0; i < horasViernes.length; i++) {

			System.out.println(horasViernes[i].getNombre());
		}
	}
	
	public void setHorasFaltas(int bases, int programacion, int ingles, int entornos, int marcas, int sistemas, int fol) {
		
		this.bases.setHorasFaltas(bases);
		this.programacion.setHorasFaltas(programacion);
		this.ingles.setHorasFaltas(ingles);
		this.entornos.setHorasFaltas(entornos);
		this.marcas.setHorasFaltas(marcas);
		this.sistemas.setHorasFaltas(sistemas);
		this.fol.setHorasFaltas(fol);
		
	}
	
	public void festivosTotal() {

		int contadorBases = 0;
		int contadorSistemas = 0;
		int contadorIngles = 0;
		int contadorFol = 0;
		int contadorMarcas = 0;
		int contadorProgramacion = 0;
		int contadorEntornos = 0;
		
		for(int i = 0; i < 5; i++) {
			if(horasLunes[i] == sistemas | horasMartes[i] == sistemas | horasMiercoles[i] == sistemas | horasJueves[i] == sistemas | horasViernes[i] == sistemas) {
				contadorSistemas++;
			}
			if(horasLunes[i] == bases | horasMartes[i] == bases | horasMiercoles[i] == bases | horasJueves[i] == bases | horasViernes[i] == bases) {
				contadorBases++;
			}
			if(horasLunes[i] == ingles | horasMartes[i] == ingles | horasMiercoles[i] == ingles | horasJueves[i] == ingles | horasViernes[i] == ingles) {
				contadorIngles++;
			}
			if(horasLunes[i] == fol | horasMartes[i] == fol | horasMiercoles[i] == fol | horasJueves[i] == fol | horasViernes[i] == fol) {
				contadorFol++;
			}
			if(horasLunes[i] == programacion | horasMartes[i] == programacion | horasMiercoles[i] == programacion | horasJueves[i] == programacion | horasViernes[i] == programacion) {
				contadorProgramacion++;
			}
			if(horasLunes[i] == entornos | horasMartes[i] == entornos | horasMiercoles[i] == entornos | horasJueves[i] == entornos | horasViernes[i] == entornos) {
				contadorEntornos++;
			}
			if(horasLunes[i] == marcas | horasMartes[i] == marcas | horasMiercoles[i] == marcas | horasJueves[i] == marcas | horasViernes[i] == marcas) {
				contadorMarcas++;
			}
		}

		//L: 3
		//M: 3
		//X: 5
		//J: 5
		//V: 7
		
		bases.setHorasTotal(200);
		sistemas.setHorasTotal(170);
		programacion.setHorasTotal(270);
		ingles.setHorasTotal(64);
		fol.setHorasTotal(100);
		marcas.setHorasTotal(130);
		entornos.setHorasTotal(66);
		
//		bases.setHorasTotal(bases.getHorasTotal()- (3*2) - (3*2) - (2*5));
//		sistemas.setHorasTotal(sistemas.getHorasTotal()-(3*2) - 7 - (7*2));
//		programacion.setHorasTotal(programacion.getHorasTotal()- (3*2) - (3*2) - (5*2) - (5*2));
//		ingles.setHorasTotal(ingles.getHorasTotal()- 5 - 5);
//		fol.setHorasTotal(fol.getHorasTotal()- 5 - (2*7));
//		marcas.setHorasTotal(marcas.getHorasTotal()- (2*5) - (2*7));
//		entornos.setHorasTotal(entornos.getHorasTotal()- (2*5));
		

	}
	
	public static void calcularPorcentajesTodo() {
		bases.calcularPorcentajes();
		programacion.calcularPorcentajes();
		ingles.calcularPorcentajes();
		entornos.calcularPorcentajes();
		marcas.calcularPorcentajes();
		sistemas.calcularPorcentajes();
		fol.calcularPorcentajes();
		
		bases.setHorasAFaltar(((15-(int)bases.getPorcentajeHorasFaltas())*(int)bases.getHorasTotal())/100);
		programacion.setHorasAFaltar(((15-(int)programacion.getPorcentajeHorasFaltas())*(int)programacion.getHorasTotal())/100);
		ingles.setHorasAFaltar(((15-(int)ingles.getPorcentajeHorasFaltas())*(int)ingles.getHorasTotal())/100);
		entornos.setHorasAFaltar(((15-(int)entornos.getPorcentajeHorasFaltas())*(int)entornos.getHorasTotal())/100);
		marcas.setHorasAFaltar(((15-(int)marcas.getPorcentajeHorasFaltas())*(int)marcas.getHorasTotal())/100);
		sistemas.setHorasAFaltar(((15-(int)sistemas.getPorcentajeHorasFaltas())*(int)sistemas.getHorasTotal())/100);
		fol.setHorasAFaltar(((15-(int)fol.getPorcentajeHorasFaltas())*(int)fol.getHorasTotal())/100);
		
	}
	
	public void calcularHorasTotales() {
		setHorasTotales(bases.getHorasTotal()+sistemas.getHorasTotal()+programacion.getHorasTotal()+ingles.getHorasTotal()+fol.getHorasTotal()+marcas.getHorasTotal()+entornos.getHorasTotal());
		horasFaltasTotales=bases.getHorasFaltas()+sistemas.getHorasFaltas()+programacion.getHorasFaltas()+ingles.getHorasFaltas()+fol.getHorasFaltas()+marcas.getHorasFaltas()+entornos.getHorasFaltas();
		setPorcentajeTotal(porcentajeTotal = horasFaltasTotales/horasTotales*100);
	}
	
	public void showHorasTotales() {
		
		System.out.println("bases: "+Horario.bases.getHorasTotal());
		System.out.println("sistemas: "+Horario.sistemas.getHorasTotal());
		System.out.println("programacion: "+Horario.programacion.getHorasTotal());
		System.out.println("fol: "+Horario.fol.getHorasTotal());
		System.out.println("marcas: "+Horario.marcas.getHorasTotal());
		System.out.println("entornos: "+Horario.entornos.getHorasTotal());
		System.out.println("ingles: "+Horario.ingles.getHorasTotal());
		
	}
	
	public void showFaltasTot() {
		System.out.println("////////////////////////////////////\n");
		System.out.println("HORAS TOTALES");
		System.out.printf("\nTotal horas: %.0f \nTotal Faltas: %.0f\nPorcentaje faltas total: %.2f%%\n",horasTotales,horasFaltasTotales,getPorcentajeTotal());
		System.out.println("\n////////////////////////////////////\n");
	}
	
}

