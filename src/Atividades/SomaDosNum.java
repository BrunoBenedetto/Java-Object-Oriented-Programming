package Atividades;

/*Soma dos Números de 1 a N: Peça ao usuário um número inteiro N e calcule a soma de
todos os números de 1 a N.*/

import java.util.Scanner;

public class SomaDosNum {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = sc.nextInt();

        System.out.printf("Número selecionado %s\n", num);

        int count = 0;

        for (int i = 1; i <= num; i++) {
            count = count + i;
        }
        System.out.println(count);
        sc.close();
    }
}
