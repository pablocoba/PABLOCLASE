package ellago;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		6.- Diseña un programa Java que cree un tipo enumerado para los meses del año. El programa debe realizar las siguientes operaciones:
			
			• Crear una variable m del tipo enumerado y asignarle el mes de marzo. Mostrar por pantalla su valor.*/
				
				enum meses{//creamos enumerado
					Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre
				}
				
				meses m = meses.Marzo; //asignamos a m marzo
				System.out.printf("%s",m);
			}
			
	}


