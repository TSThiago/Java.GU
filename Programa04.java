package geek;

// If, else, else if 
public class Programa04 {

	public static void main(String[] args) {
		//Declarando e inicializando a vari�vel
		int numero = 2;
		
		/*se o n�mero � maior que 5, ent�o {
			//escreva ("Sim, o n�mero " + numero + " � maior que 5") 
		} sen�o se (numero == 5){ 
			//escreva ("N�o, o n�mero " + numero + " � igual a 5");
		} sen�o{
			//escreva ("N�o, o n�mero " + numero + " � menos que 5");
		}
		*/
 		if (numero > 5) {
 			System.out.println("Sim, o n�mero " + numero + " � maior que 5.");
 		}else if(numero == 5) {
 			System.out.println("N�o, o n�mero " + numero + " � igual a 5.");	
 			//verificando se o n�mero � par 
 		}else if(numero %2 == 0) {	
 			System.out.println("O n�mero " + numero + " � par.");
 		}else {
 			System.out.println("N�o, o n�mero " + numero + " � menos que 5.");
 		}

	}

}
