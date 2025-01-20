/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/

package funcoes_matematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exc4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFunc;
		int horasTrab;
		double salarioHora;
		double salarioFinal;
		
		System.out.printf("Insira o ID do funcionario: ");
		numFunc = sc.nextInt();
		
		System.out.printf("Insira o numero de horas trabalhadas pelo funcionario: ");
		horasTrab = sc.nextInt();
		
		System.out.printf("Insira o valor recebido em R$ por hora desse funcionario: ");
		salarioHora = sc.nextDouble();
		
		salarioFinal = salarioHora * horasTrab;
		
		System.out.printf("O funcionario %d recebe R$ %.2f", numFunc, salarioFinal);
		
		
		sc.close();
	}

}
