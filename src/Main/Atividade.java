package Main;

import java.util.Locale;
import java.util.Scanner;

/*68) Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura
“para”. No final, mostre na tela:
a) Quantas mulheres foram cadastradas
b) Quantos homens pesam mais de 100Kg
c) A média de peso entre as mulheres
d) O maior peso entre os homens*/

//teste de commmit 1 2 3

// teste

public class Atividade {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntM = 0;
        int pesoH = 0;
        double mediaM = 0, soma = 0, maiorH = 0;

        for (int i = 0; i < 2; i++) {
            System.out.println("Informe seu sexo H/M:");
            String sexo = sc.next();

            System.out.println("Informe seu peso:");
            double peso = sc.nextDouble();

            if (sexo.equalsIgnoreCase("m")) {
                qntM++;
                soma = soma + peso;
                mediaM = (peso + peso) / qntM;
            }
            if (sexo.equalsIgnoreCase("h")) {
                if (peso > 100) {
                    pesoH ++;
                }
                if(peso < 999999){
                    maiorH = peso;
                }
            }
        }
        System.out.printf("\na) Quantas mulheres foram cadastradas: %s", qntM);
        System.out.printf("\nb) Quantos homens pesam mais de 100Kg: %s", pesoH);
        System.out.printf("\nc) A média de peso entre as mulheres: %s", mediaM);
        System.out.printf("\nd) O maior peso entre os homens: %s", maiorH);
    }
}