/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/

package funcoes_matematicas;

import java.util.Scanner;

public class Exc1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, z;
		
		System.out.printf("Atribua um numero inteiro para x: ");
		x = sc.nextInt();
		
		System.out.printf("Atribua um numero inteiro para y: ");
		y = sc.nextInt();
		
		z = x + y;
		
		System.out.printf("A soma de %d + %d é igual a: %d \n", x, y, z);
		
		sc.close();

	}

}
