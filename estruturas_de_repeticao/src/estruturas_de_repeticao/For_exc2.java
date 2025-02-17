/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/

package estruturas_de_repeticao;

import java.util.Scanner;

public class For_exc2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, x;
        int dentro = 0, fora = 0;

        System.out.printf("Atribua um numero de valores a serem lidos: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Digite o %dº valor: ", i);
            x = sc.nextInt();

            if (10 <= x && x <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }

        sc.close();
        
        System.out.println();
        System.out.println(dentro + " in");
        System.out.println(fora + " out");
    }
}

