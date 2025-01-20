/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/

package funcoes_matematicas;

import java.util.Locale;
import java.util.Scanner;


public class Exc3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		System.out.printf("Atribua um valor para A: ");
		a = sc.nextInt();
		
		System.out.printf("Atribua um valor para B: ");
		b = sc.nextInt();
		
		System.out.printf("Atribua um valor para C: ");
		c = sc.nextInt();
		
		System.out.printf("Atribua um valor para D: ");
		d = sc.nextInt();
		
		diferenca = a * b - c * d;
		
		System.out.printf("A diferenca dos produtos de A x B e C x D eh de: %d", diferenca);
		
		
		sc.close();
	}

}
