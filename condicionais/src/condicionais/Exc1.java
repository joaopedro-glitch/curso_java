/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/

package condicionais;

import java.util.Scanner;

public class Exc1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Insira um numero inteiro: ");
		num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("POSITIVO");
		}
		
		else {
			System.out.println("NEGATIVO");
		}
		
		
		sc.close();

	}

}
