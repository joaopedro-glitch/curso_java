package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		// Primeiro o programa pega os dados de entrada do usuário
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax =sc.nextDouble();
		
		// Após isso será impresso o primeiro método toString calculando o netSalary() com base no grossSalary inserido
		System.out.println();
		System.out.println("Employee: " + employee);
		
		// Aqui o increase atualizara o grossSalary com a porcentagem inserida
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		// Então o programa irá imprimir os novos datos chamando o método netSalary() de novo, agora com o grossSalary atualizado
		System.out.println();
		System.out.println("Updated data: " + employee);
			
		sc.close();
	}

}
