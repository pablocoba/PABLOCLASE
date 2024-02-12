package music;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Nota {
	
	private String nota;
	private String cuerda;
	//TODO estoy intentando hacer que funcione el programa 6 insertando "Do" o "do" o "C" o "c"
	private String[] notas = new String[] {
			/*0*/"Do","C",
			/*2*/"Re","D",
			/*4*/"Mi","E",
			/*6*/"Fa","F",
			/*8*/"Sol","G",
			/*10*/"La","A",
			/*12*/"Si","B"
	};
	private String segunda;
	private String tercera;
	private String cuarta;
	private String quinta;
	private String sexta;
	private String septima;
	
	private String tonalidad;
	private int interval;
	
	public void quinta() {
		generarNota();
		String notaRaw = this.nota;
		char nota = notaRaw.charAt(notaRaw.length()-1);
		this.nota = Character.toString(nota);
		System.out.println("Cuál es la quinta de "+ this.nota + "?");
		String quinta = null;
		
		switch(nota) {
		case 'C':
			quinta = "G";
			break;
		case 'D':
			quinta = "A";
			break;
		case 'E':
			quinta = "B";
			break;
		case 'F':
			quinta = "C";
			break;
		case 'G':
			quinta = "D";
			break;
		case 'A':
			quinta = "E";
			break;
		case 'B':
			quinta = "F";
			break;
		default:
			System.out.println("Error.");
			break;
		}

		this.quinta = quinta;
	}
	public void tercera() {
		generarNota();
		String notaRaw = this.nota;
		char nota = notaRaw.charAt(notaRaw.length()-1);
		this.nota = Character.toString(nota);
		System.out.println("Cuál es la tercera de "+ this.nota + "?");
		String tercera = null;
		
		switch(nota) {
		case 'C':
			tercera = "E";
			break;
		case 'D':
			tercera = "F";
			break;
		case 'E':
			tercera = "G";
			break;
		case 'F':
			tercera = "A";
			break;
		case 'G':
			tercera = "B";
			break;
		case 'A':
			tercera = "C";
			break;
		case 'B':
			tercera = "D";
			break;
		default:
			System.out.println("Error.");
			break;
		}

		this.tercera = tercera;
	}
	public void intervalo() {
		Random rndNum = new Random();
		int interval = rndNum.nextInt(2,8);
		this.interval = interval;
		generarNota();
		String notaRaw = this.nota;
		char nota = notaRaw.charAt(notaRaw.length()-1);
		this.nota = Character.toString(nota);
		String newNota;
		for (int i = 1; i <= notas.length; i=i+2) {
			if(Character.toString(nota).equals(notas[i])) {
				newNota = notas[i-1];
			}
		}
		switch(interval) {
		case 2:
			System.out.println("Cuál es la segunda de "+ this.nota + "?");
			break;
		case 3:
			System.out.println("Cuál es la tercera de "+ this.nota + "?");
			break;
		case 4:
			System.out.println("Cuál es la cuarta de "+ this.nota + "?");
			break;
		case 5:
			System.out.println("Cuál es la quinta de "+ this.nota + "?");
			break;
		case 6:
			System.out.println("Cuál es la sexta de "+ this.nota + "?");
			break;
		case 7:
			System.out.println("Cuál es la septima de "+ this.nota + "?");
			break;
		}
		
		switch(nota) {
		case 'C':
			this.segunda = "D";
			this.tercera = "E";
			this.cuarta = "F";
			this.quinta = "G";
			this.sexta = "A";
			this.septima = "B";
			break;
		case 'D':
			this.segunda = "E";
			this.tercera = "F";
			this.cuarta = "G";
			this.quinta = "A";
			this.sexta = "B";
			this.septima = "C";
			break;
		case 'E':
			this.segunda = "F";
			this.tercera = "G";
			this.cuarta = "A";
			this.quinta = "B";
			this.sexta = "C";
			this.septima = "D";
			break;
		case 'F':
			this.segunda = "G";
			this.tercera = "A";
			this.cuarta = "B";
			this.quinta = "C";
			this.sexta = "D";
			this.septima = "E";
			break;
		case 'G':
			this.segunda = "A";
			this.tercera = "B";
			this.cuarta = "C";
			this.quinta = "D";
			this.sexta = "E";
			this.septima = "F";
			break;
		case 'A':
			this.segunda = "B";
			this.tercera = "C";
			this.cuarta = "D";
			this.quinta = "E";
			this.sexta = "F";
			this.septima = "G";
			break;
		case 'B':
			this.segunda = "C";
			this.tercera = "D";
			this.cuarta = "E";
			this.quinta = "F";
			this.sexta = "G";
			this.septima = "A";
			break;
		default:
			System.out.println("Error.");
			break;
		}

	}
	public Nota() {
		this.nota=generarNota();
	}
	

	private int lastNum = 10;
	private int lastNum2 = 10;
	private int lastNum3 = 10;
	private int lastNum4 = 10;
	
	public void generarTonalidad() {
		Random rndNum = new Random();
		int rnd = rndNum.nextInt(1,8);
		switch(rnd) {
		case 1:
			this.tonalidad = "C";
			break;
		case 2:
			this.tonalidad = "D";
			break;
		case 3:
			this.tonalidad = "E";
			break;
		case 4:
			this.tonalidad = "F";
			break;
		case 5:
			this.tonalidad = "G";
			break;
		case 6:
			this.tonalidad = "A";
			break;
		case 7:
			this.tonalidad = "B";
			break;
		default:
			this.tonalidad = "C";
			break;
		}
	}
	
	
	
	public String generarCuerda() {
		
		Random rnd = new Random();
		int last = 10;
		int num = 0;
		String cuerda = "E/6/Mi";

		do{
			num = rnd.nextInt(6);
		}while(num == lastNum3 || num == lastNum4);
		
		switch(num) {
		case 0:
			cuerda = "E/6/Mi";
			break;
		case 1:
			cuerda = "A/5/La";
			break;
		case 2:
			cuerda = "D/4/Re";
			break;
		case 3:
			cuerda = "G/3/Sol";
			break;
		case 4:
			cuerda = "B/2/Si";	
			break;
		case 5:
			cuerda = "e/1/mi";
			break;
		default:
			cuerda = "E/6/Mi";
			break;
		}
		lastNum4 = lastNum3;
		lastNum3 = num;
		this.cuerda = cuerda;
		return cuerda;
	}
	
	public String generarNotaBemol() {
		String note = "\nDo/C\n";
		Random rnd = new Random();
		int num = 0;
		char bsos = ' ';
		do{
			int rnd2 = rnd.nextInt(18);
			num = rnd.nextInt(1,8);
			bsos = generarBemol(rnd2);
		}while(num == lastNum || num == lastNum2);

		switch(num) {
		case 1:
			if(bsos == '#') {
				note = "Do#/C#";
			}
				else note = "Do/C";
			break;
		case 2:
			if(bsos == '#') {
				note = "Re#/D#";
			}
			else if(bsos == 'b') {
				note = "Reb/Db";
			}
			else note = "Re/D";
			break;
		case 3:
			if(bsos == 'b') {
				note = "Mib/Eb";
			}
			else note = "Mi/E";
			break;
		case 4:
			if(bsos == '#') {
				note = "Fa#/F#";
			}
			else note = "Fa/F";
			break;
		case 5:
			if(bsos == '#') {
				note = "Sol#/G#";
			}
			else if(bsos == 'b') {
				note = "Solb/Gb";
			}
			else note = "Sol/G";

			break;
		case 6:
			if(bsos == '#') {
				note = "La#/A#";
			}
			else if(bsos == 'b') {
				note = "Lab/Ab";
			}
			else note = "La/A";
			
			break;
		case 7:
			if(bsos == 'b') {
				note = "Sib/Bb";
			}
			else note = "Si/B";
			break;
		default:
			note = "Do/C";
			break;
		}
		lastNum2 = lastNum;
		lastNum = num;
		this.nota = note;
		return "\n"+note +"\n";
	}
	
	public String generarNota() {
		String note = "Do/C";
		Random rnd = new Random();
		int num = 0;

		do{
			num = rnd.nextInt(1,8);
		}while(num == lastNum || num == lastNum2);

		switch(num) {
		case 1:
			note = "Do/C";
			break;
		case 2:
			note = "Re/D";
			break;
		case 3:
			note = "Mi/E";
			break;
		case 4:
			note = "Fa/F";
			break;
		case 5:
			note = "Sol/G";
			break;
		case 6:
			note = "La/A";
			break;
		case 7:
			note = "Si/B";
			break;
		default:
			note = "Do/C";
			break;
		}
		lastNum2 = lastNum;
		lastNum = num;
		this.nota = note;
		return note + "\n";
	}
	
	public String getCuerda() {
		return this.cuerda;
	}
	public String getSegunda() {
		return this.segunda;
	}
	public String getTercera() {
		return this.tercera;
	}
	public String getCuarta() {
		return this.cuarta;
	}
	public String getQuinta() {
		return this.quinta;
	}
	public String getSexta() {
		return this.sexta;
	}
	public String getSeptima() {
		return this.septima;
	}
	public String getNota() {
		return this.nota;
	}
	public int getInterval() {
		return this.interval;
	}
	public char generarBemol(int rnd) {
		if(rnd == 0 ||rnd == 1 || rnd == 2) {
			return 'b';
		}
		else if(rnd== 17 || rnd == 16 || rnd == 15) {
			return '#';
		}
		else return ' ';
	}
	
	@Override
	public String toString() {
		return this.nota;
	}
}
