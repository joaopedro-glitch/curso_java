/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”*/

package condicionais;

import java.util.Scanner;


public class Exc6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Digite um valor inteiro no intervalo [0,100]: ");
		num = sc.nextInt();
		
		if( 0 <= num && num <= 25) {
			System.out.printf("O numero esta no intervalo [0,25]");	
		}
		
		else if( 25 < num && num <= 50) {
			System.out.printf("O numero esta no intervalo (25,50]");	
		}
		
		else if( 50 < num && num <= 75) {
			System.out.printf("O numero esta no intervalo (50,75]");	
		}
		
		else if( 75 < num && num <= 100) {
			System.out.printf("O numero esta no intervalo (75,100]");	
		}
		
		else {
			System.out.println("Fora de intervalo");
		}
			
		sc.close();	
	}

}
