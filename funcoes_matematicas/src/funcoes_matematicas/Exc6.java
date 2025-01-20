/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/

package funcoes_matematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exc6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		double areaTriangulo;
		double areaCirculo;
		double areaTrapezio;
		double areaQuadrado;
		double areaRetangulo;
		double pi = 3.14159;
		
		System.out.printf("Atribua um valor para A: ");
		a = sc.nextDouble();
		
		System.out.printf("Atribua um valor para B: ");
		b = sc.nextDouble();
		
		System.out.printf("Atribua um valor para C: ");
		c = sc.nextDouble();
		
		areaTriangulo = a * c / 2;
		areaCirculo = pi * Math.pow(c, 2);
		areaTrapezio = (a+b) * c / 2;
		areaQuadrado = Math.pow(b, 2);
		areaRetangulo = a * b;
		
		System.out.println();
		System.out.printf("Area do triangulo: %.3f \n", areaTriangulo);
		System.out.printf("Area do circulo: %.3f \n", areaCirculo);
		System.out.printf("Area do trapezio: %.3f \n", areaTrapezio);
		System.out.printf("Area do quadrado: %.3f \n", areaQuadrado);
		System.out.printf("Area do retangulo: %.3f \n", areaRetangulo);
		

		sc.close();
	}

}
