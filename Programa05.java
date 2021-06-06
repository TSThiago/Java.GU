package geek;
//Operador ternário

//Se precisar criar a função main() //programa java
//main e no teclado CTRL + barra de espaço 
public class Programa05 {
	
	public static void main(String[] args) {
		int valor = 3, numero;
		
		/*
		if (valor > 0) {
			numero = valor;
		}else {
			numero = 7;
		}
		*/
		
		//Operador ternário
		//Funciona se houver um if else (verdadeiro ou falso) 
		numero = (valor > 0) ? valor : 7;
		
		System.out.println(numero);			
	}
}
