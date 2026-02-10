package Main;

import java.util.Locale;
import java.util.Scanner;
public class empCasa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorCasa, salario, prestAnual, prestMensal, limite30;
        int anosPag;

        System.out.println("Qual valor da casa?");
        valorCasa = sc.nextDouble();

        System.out.println("Informe seu salário");
        salario = sc.nextDouble();

        System.out.println("Em quantos anos deseja pagar?");
        anosPag = sc.nextInt();

        prestAnual = valorCasa / anosPag;
        prestMensal = prestAnual / 12;
        limite30 = (salario / 100) * 30;

        if(prestMensal <= limite30){
            System.out.printf("Empréstimo aprovado, a parcela ficará  R$%.3f", prestMensal);
        }else{
            System.out.printf("Valor da parcela: R$ %.2f , que excede os 30%% do salário, empréstimo negado!", prestMensal);
        }
    }
}
