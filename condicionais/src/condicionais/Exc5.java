/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar*/

package condicionais;

import java.util.Scanner;
import java.util.Locale;

public class Exc5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String item = null;
		int cod, quant;
		double preco = 0, valorFinal;
		
		System.out.printf("Insira o codigo do item: ");
		cod = sc.nextInt();
		
		System.out.printf("Insira a quantidade do item: ");
		quant = sc.nextInt();
		
		switch (cod) {
		
		case 1:
			item = "Cachorro Quente";
			preco = 4.00;
			break;
		
		case 2:
			item = "X-Salada";
			preco = 4.50;
			break;
			
		case 3:
			item = "X-Bacon";
			preco = 5.00;
			break;
			
		case 4:
			item = "Torrada simples";
			preco = 2.00;
			break;
			
		case 5:
			item = "Refrigerante";
			preco = 1.50;
			break;
		}
		
		valorFinal = preco * quant;
		
		System.out.printf("Produto: %s\n", item);
		System.out.printf("Quantidade %d\n", quant);
		System.out.printf("Preco unitario: %.2f\n", preco);
		System.out.printf("Total: R$ %.2f", valorFinal);
		
		sc.close();

	}

}
