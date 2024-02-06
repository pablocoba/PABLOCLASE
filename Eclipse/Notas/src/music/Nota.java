package music;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Nota {
	
	private String nota;
	private String cuerda;
	
	public Nota() {
		this.nota=generarNota();
	}
	

	private int lastNum = 10;
	private int lastNum2 = 10;
	private int lastNum3 = 10;
	private int lastNum4 = 10;
	
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
				note = "\nDo#/C#\n";
			}
				else note = "\nDo/C\n";
			break;
		case 2:
			if(bsos == '#') {
				note = "\nRe#/D#\n";
			}
			else if(bsos == 'b') {
				note = "\nReb/Db\n";
			}
			else note = "\nRe/D\n";
			break;
		case 3:
			if(bsos == 'b') {
				note = "\nMib/Eb\n";
			}
			else note = "\nMi/E\n";
			break;
		case 4:
			if(bsos == '#') {
				note = "\nFa#/F#\n";
			}
			else note = "\nFa/F\n";
			break;
		case 5:
			if(bsos == '#') {
				note = "\nSol#/G#\n";
			}
			else if(bsos == 'b') {
				note = "\nSolb/Gb\n";
			}
			else note = "\nSol/G\n";

			break;
		case 6:
			if(bsos == '#') {
				note = "\nLa#/A#\n";
			}
			else if(bsos == 'b') {
				note = "\nLab/Ab\n";
			}
			else note = "\nLa/A\n";
			
			break;
		case 7:
			if(bsos == 'b') {
				note = "\nSib/Bb\n";
			}
			else note = "\nSi/B\n";
			break;
		default:
			note = "\nDo/C\n";
			break;
		}
		lastNum2 = lastNum;
		lastNum = num;
		this.nota = note;
		return note;
	}
	
	public String generarNota() {
		String note = "Do/C\n";
		Random rnd = new Random();
		int num = 0;

		do{
			num = rnd.nextInt(1,8);
		}while(num == lastNum || num == lastNum2);

		switch(num) {
		case 1:
			note = "Do/C\n";
			break;
		case 2:
			note = "Re/D\n";
			break;
		case 3:
			note = "Mi/E\n";
			break;
		case 4:
			note = "Fa/F\n";
			break;
		case 5:
			note = "Sol/G\n";
			break;
		case 6:
			note = "La/A\n";
			break;
		case 7:
			note = "Si/B\n";
			break;
		default:
			note = "Do/C\n";
			break;
		}
		lastNum2 = lastNum;
		lastNum = num;
		this.nota = note;
		return note;
	}
	
	public String getCuerda() {
		return this.cuerda;
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
