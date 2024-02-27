package recur;

public class Recursividad {
	
	public static double factorial(double num)
	{
		
		if(num == 0) {
			return 1;
		}
		return num*(factorial(num-1));
		

	}
	
	public static double fibonacci(double num) {
		
		if(num == 0) {
			return 0;
		}
		else if(num == 1) {
			return 1;
		}
		else {
			if(num > 0) {
				return fibonacci(num-1)+fibonacci(num-2);
			}
			else return 0;
		}
		
	}
	
	public static double potencia(double base, double exponente) {
		if(exponente == 0 || base == 1) {
			return 1;
		}
		else if(base == 0) {
			return 0;
		}
		else return base*potencia(base,exponente-1);
	}
	
	public static int sumarDig(int num) {
		if(num==0) {
			return 0;
		}
		else return num%10+(sumarDig(num/10));
	}
	
	public static void main(String[] args) {
		System.out.println(sumarDig(66666));
	}

}
