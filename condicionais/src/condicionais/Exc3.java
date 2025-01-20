/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente*/

package condicionais;

import java.util.Scanner;

public class Exc3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.printf("Digite um valor para A: ");
		a = sc.nextInt();
		
		System.out.printf("Digite um valor para B: ");
		b = sc.nextInt();
		
		if(a % b == 0 || b % a == 0) {
			System.out.println("Sao multiplos");
		}
		
		else {
			System.out.println("Nao sao multiplos");
		}
		
		sc.close();
		
	}

}
