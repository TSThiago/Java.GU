package geek;

//foreach
public class Programa10 {

	public static void main(String[] args) {
		String nome = "Geek University";
		
		//Para cada um dos caracteres da string, imprima o caractere 
		for (char letra : nome.toCharArray()) {
			//System.out.println(letra): um caractere por linha 
			//System.out.print(letra): todos carateres na mesma linha 
			System.out.println(letra);
			
		}
	}
}
