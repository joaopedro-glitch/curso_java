/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

package condicionais;

import java.util.Scanner;

public class Exc4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, tempoJogo;
		
		System.out.printf("Insira a hora de inicio do jogo: ");
		horaInicial = sc.nextInt();
		
		System.out.printf("Insira a hora de finalizacao do jogo: ");
		horaFinal = sc.nextInt();
		
		if(horaFinal <= horaInicial) {
			int temp;
			temp = horaFinal;
			horaFinal = 24 + temp;
		}
		
		tempoJogo = horaFinal - horaInicial;
		
		System.out.printf("O jogo durou %d hora(s) \n", tempoJogo);
		
		sc.close();
	}

}
