package Atividades;

/*Tabuada de um Número: Peça ao usuário um número e exiba a tabuada desse número
(de 1 a 10). */

import java.util.Locale;
import java.util.Scanner;

public class Tabuada {
    static void main() {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da tabuada que deseja verificar");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("\n%s x %s = %s", num, i, (num * i));
        }
        sc.close();
    }
}

