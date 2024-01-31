package music;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Nota {
	
	private String nota;

	
	public Nota() {
		this.nota=generarNota();
	}
	

	private int lastNum = 10;
	private int lastNum2 = 10;
	
	public String generarNota() {
		String note = "\nDo/C\n";
		Random rnd = new Random();
		int num = 0;

		do{
			num = rnd.nextInt(1,8);
		}while(num == lastNum || num == lastNum2);

		switch(num) {
		case 1:
			note = "\nDo/C\n";
			break;
		case 2:
			note = "\nRe/D\n";
			break;
		case 3:
			note = "\nMi/E\n";
			break;
		case 4:
			note = "\nFa/F\n";
			break;
		case 5:
			note = "\nSol/G\n";
			break;
		case 6:
			note = "\nLa/A\n";
			break;
		case 7:
			note = "\nSi/B\n";
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
	
	@Override
	public String toString() {
		return this.nota;
	}
}
