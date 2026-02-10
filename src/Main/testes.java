package Main;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class testes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Random rd = new Random();

        int valor1, num1;

        for(int i = 1;i <= 5; i++){
            valor1 = rd.nextInt(3);
            System.out.println(valor1);

        System.out.println("Digite o número");
        num1 = sc.nextInt();

        if(num1 == valor1){
            System.out.printf("Reposta Correta número sorteado: %s", valor1);
        }else {
            System.out.printf("Errou!, número sorteado: %s", valor1);
        }

        }
    }
}
