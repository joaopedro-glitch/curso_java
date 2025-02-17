/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

package funcoes_matematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exc5 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1, num1, peca2, num2;
		double valor1, valor2, total;
		
		System.out.printf("Insira o codigo da peca 1: ");
		peca1 = sc.nextInt();
		
		System.out.printf("Insira o numero de pecas: ");
		num1 = sc.nextInt();
		
		System.out.printf("Inisira o valor unitario em R$ da peca 1: ");
		valor1 = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("Insira o codigo da peca 2: ");
		peca2 = sc.nextInt();
		
		System.out.printf("Insira o numero de pecas: ");
		num2 = sc.nextInt();
		
		System.out.printf("Inisira o valor unitario em R$ da peca 2: ");
		valor2 = sc.nextDouble();
		
		total = (valor1 * num1) + (valor2 * num2);
		
		System.out.println();
		System.out.printf("O valor total a ser pago eh de R$: %.2f", total);
		
		sc.close();

	}

}
