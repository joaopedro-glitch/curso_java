package curso_progamacao;

import java.util.Scanner;

public class Entrada2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();      // Conspme a quebra e linha pendente do nextInt
		s1 = sc.nextLine(); // nextLine lê a linha toda
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
