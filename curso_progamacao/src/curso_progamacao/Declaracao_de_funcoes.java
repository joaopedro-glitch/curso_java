package curso_progamacao;

import java.util.Scanner;

public class Declaracao_de_funcoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
	}

	// Função realiza teste para detectar maior numero
	public static int max(int x, int y, int z) {
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		} 
		else if (y > z) {
			aux = y;
		} 
		else {
			aux = z;
		}
		
		return aux;
	}
	
	// Função imprime na tela o maior valor
	public static void showResult(int value) {
		
		System.out.println("Higher = " + value);
	}
}


