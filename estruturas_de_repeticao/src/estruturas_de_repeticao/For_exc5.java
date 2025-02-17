/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.*/

package estruturas_de_repeticao;

import java.util.Scanner;

public class For_exc5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, fatorial = 1; // Multiplicação inicia o valor em 1
		
		System.out.printf("Insira um numero para calcular o fatorial: ");
		n = sc.nextInt();
		
		// Aqui também inicio i em 1 para não calcular a multiplicação por 0 que tornara todo fatorial 0
		// Também preciso calcular o loop até i <= n porque eliminamos a interação 0 ao iniciar em 1
		for(int i = 1; i <= n; i++) {
			
			fatorial *= i;
			
		}
		
		System.out.printf("O fatorial de %d eh %d \n", n, fatorial);
		
		
		sc.close();

	}

}
