/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.

Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159 */

package funcoes_matematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, pi, area;
		
		pi = 3.14159;
		
		System.out.printf("Insira o valor do raio do circulo: ");
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A area do circulo eh %.4f", area);
		
		sc.close();

	}

}
