package curso_progamacao;

import java.util.Locale;  // Locale para variação e ponto em números fraccionados
import java.util.Scanner; // Importação de scanner em Java

public class Entrada {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // Coloca os números decimais com ponto
		Scanner sc = new Scanner(System.in); // Declara o scanner
		
		// Leitura de String
		String x;
		
		System.out.printf("Digite um nome: ");
		x = sc.next();
		
		System.out.printf("Voce digitou: %s \n\n", x);
		
		
		// Leitura de número inteiro
		int y;
		
		System.out.printf("Digite um numero inteiro: ");
		y = sc.nextInt();
		
		System.out.printf("Voce digitou: %d \n\n", y);
	
		
		// Entrada de número decimal
		float z;
		
		System.out.printf("Digite um numero decimal: ");
		z = sc.nextFloat();
		
		System.out.printf("Voce digitou: %.2f \n\n", z);
		
		// Entrada de caractere
		char w;
		
		System.out.printf("Digite um caractere: ");
		w = sc.next().charAt(0);
		
		System.out.printf("Voce digitou: %c \n\n", w );
		
		sc.close();
	}

}
