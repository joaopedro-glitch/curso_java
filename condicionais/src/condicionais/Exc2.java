/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/

package condicionais;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.printf("Insira um numero inteiro: ");
		num = sc.nextInt();

		if(num % 2 == 0) {
			System.out.println("PAR");
		}
		
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}

}
