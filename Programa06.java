package geek;

//Instru��o Switch
public class Programa06 {
	public static void main(String[] args) {
		int numero = 33;
		
		switch (numero) {
			case 1:
				System.out.println("O n�mero � 1");
				break;
			case 3:
				System.out.println("O n�mero � 3");
				break;
			case 5:
				System.out.println("O n�mero � 5");
				break;
			//Opcional, importante quando n�o h� nenhum dos casos 
			default:
				System.out.println("[Default] O n�mero � " + numero);
				break;
		}
	
}
}
