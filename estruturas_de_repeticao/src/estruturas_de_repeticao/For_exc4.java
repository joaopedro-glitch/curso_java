/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"*/

package estruturas_de_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class For_exc4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double x, y, divisao;
		
		System.out.printf("Insira o numero de casos de teste: ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			System.out.printf("Insira o primeiro numero para divisao %d: ", i+1);
			x = sc.nextDouble();
			
			System.out.printf("Insira o segundo numero para divisao %d: ", i+1);
			y = sc.nextDouble();
			
			divisao = x / y;
			
			if(y != 0 ) {
				System.out.printf("O resultado da divisao eh: %.1f\n\n", divisao);
			}
			else {
				System.out.println("Divisao impossivel\n");
			}
			
		}
		

		sc.close();

	}

}
