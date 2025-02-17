/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.*/

package estruturas_de_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class For_exc3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, p1 = 2, p2 = 3, p3 = 5 ;
		double x, y, z;
		 
		System.out.printf("Insira o numero de casos de teste: ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
				
			System.out.printf("Atribua o %dº valor real X (peso 2): ", i+1);
			x = sc.nextDouble();
			
			System.out.printf("Atribua o %dº valor real Y (peso 3): ", i+1);
			y = sc.nextDouble();
			
			System.out.printf("Atribua o %dº valor real Z (peso 5): ", i+1);
			z = sc.nextDouble();
			
			
			double media = (x * p1 + y * p2 + z * p3) / (p1 + p2 + p3);
			
			System.out.printf("A media ponderada dos tres valores eh: %.1f\n\n", media);
		}
				
		
		sc.close();

	}

}
