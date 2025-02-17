/*Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.

Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.


Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais*/

package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exc8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double renda, imposto = 0;
			
		System.out.printf("Insira a renda em R$: ");
		renda = sc.nextDouble();
		
	       if (renda <= 2000) {
	            System.out.println("Insento");
	            sc.close();
	            return;
	        } 
	       
	       else if (renda <= 3000) {
	            imposto = 0.08 * (renda - 2000);
	        } 
	       
	       else if (renda <= 4500) {
	            imposto = 0.08 * 1000 + 0.18 * (renda - 3000);
	        } 
	       
	       else {
	            imposto = 0.08 * 1000 + 0.18 * 1500 + 0.28 * (renda - 4500);
	        }
		
		System.out.printf("O imposto de renda a ser pago eh de: R$ %.2f \n", imposto);
		
		sc.close();

	}

}
