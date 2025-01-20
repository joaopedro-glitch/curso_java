/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma)*/

package estruturas_de_repeticao;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.printf("Atribua uma valor para X: ");
		x = sc.nextInt();
		
		System.out.printf("Atribua uma valor para Y: ");
		y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			
			
			if(x > 0 && y > 0) {
				System.out.println("Q1");
			}
			
			else if(x < 0 && y > 0) {
				System.out.println("Q2");
			}
			
			else if(x < 0 && y < 0) {
				System.out.println("Q3");
			}
			
			else if(x > 0 && y < 0) {
				System.out.println("Q4");
			}
			
			System.out.println();
			
			System.out.printf("Atribua uma valor para X: ");
			x = sc.nextInt();
			
			System.out.printf("Atribua uma valor para Y: ");
			y = sc.nextInt();
			
		}
		
		System.out.println("Coordenada nula");
		
		
		sc.close();
	}

}
