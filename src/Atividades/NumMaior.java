package Atividades;

/*Maior de Dois Números: Peça ao usuário dois números inteiros e exiba o maior entre
eles.*/

import java.util.Locale;
import java.util.Scanner;

public class NumMaior {
    static void main() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int num1, num2;

        System.out.println("Digite o primeiro número");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número");
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.printf("O primeiro número: %s, é maior", num1);
        } else if (num2 > num1) {
            System.out.printf("O segundo número: %s, é o maior", num2);
        }else
        System.out.println("Os números são iguais");

        sc.close();
    }
}
