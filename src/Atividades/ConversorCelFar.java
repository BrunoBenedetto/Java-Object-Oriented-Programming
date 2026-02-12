package Atividades;

/*Conversão de Temperatura (Celsius para Fahrenheit): Peça ao usuário uma
temperatura em Celsius e converta-a para Fahrenheit. A fórmula é F=Ctimes1.8+32 */

import java.util.Locale;
import java.util.Scanner;

public class ConversorCelFar {
    static void main() {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira a temperatura");
        double Celsius = sc.nextDouble();

        double Fahrenheit;
        Fahrenheit = (Celsius * 1.8) + 32;

        System.out.printf("Conversão para %sºF", Fahrenheit);

        sc.close();
    }
}
