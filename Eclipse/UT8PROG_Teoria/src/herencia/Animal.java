package herencia;

public abstract class Animal {
		//Atributos

		public enum Sexo {
			MACHO, HEMBRA, HERMAFRODITA
		}
		private Sexo sexo;
		
		//Constructores
		public Animal () {
			sexo = Sexo.MACHO;
		}
		public Animal (Sexo s) {
			sexo = s;

		}
		
		//M�todos 
		public Sexo getSexo() {
			return sexo;
		}
		public String toString() {
			return "Sexo: " + this.sexo + "\n";
		}
		/**
		* Hace que el animal se eche a dormir.
		*/
		public void duerme() {
			System.out.println("Zzzzzzz");
		}
}
