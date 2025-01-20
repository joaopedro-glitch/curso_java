/*Ler um número inteiro N e calcular todos os seus divisores.*/

package estruturas_de_repeticao;

import java.util.Scanner;

public class For_exc6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.printf("Insira um numero inteiro para calcular seus divisores: ");
		n = sc.nextInt();
		
		System.out.println("Os divisores de " + n + " são:");
		
		for(int i = 1; i <= n; i++) {
			
			if(n % i ==0) {
				System.out.print(i + " ");
			}	
		}
			
		sc.close();
	}

}
