package Main;

import java.util.Locale;
import java.util.Scanner;

public class descHomMul {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome, sexo;
        double descHomem, descMulher;
        double compras;

        System.out.println("Informe seu nome");
        nome = sc.next();

        System.out.println("Informe seu sexo");
        sexo = sc.next();

        System.out.println("Insira o valor das compras");
        compras = sc.nextDouble();

        descMulher = (compras / 100) * 13;
        descHomem = (compras / 100) * 5;

        if(sexo.equalsIgnoreCase("masculino")){
            System.out.printf("Desconto de 5%% aplicado, o valor total é de R$ %.2f", (compras - descHomem));
        }else{
            System.out.printf("Desconto de 13%% aplicado, o valor total é de R$ %.2f", (compras - descMulher));

        }
    }
}
