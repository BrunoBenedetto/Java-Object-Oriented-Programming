package Atividades;

/*Contagem Regressiva: Imprima números de 10 a 1 em ordem decrescente*/

import java.util.Locale;
import java.util.Scanner;

public class ContagemRegre {
    static void main() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
