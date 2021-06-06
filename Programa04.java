package geek;

// If, else, else if 
public class Programa04 {

	public static void main(String[] args) {
		//Declarando e inicializando a variável
		int numero = 2;
		
		/*se o número é maior que 5, então {
			//escreva ("Sim, o número " + numero + " é maior que 5") 
		} senão se (numero == 5){ 
			//escreva ("Não, o número " + numero + " é igual a 5");
		} senão{
			//escreva ("Não, o número " + numero + " é menos que 5");
		}
		*/
 		if (numero > 5) {
 			System.out.println("Sim, o número " + numero + " é maior que 5.");
 		}else if(numero == 5) {
 			System.out.println("Não, o número " + numero + " é igual a 5.");	
 			//verificando se o número é par 
 		}else if(numero %2 == 0) {	
 			System.out.println("O número " + numero + " é par.");
 		}else {
 			System.out.println("Não, o número " + numero + " é menos que 5.");
 		}

	}

}
