package AulaJava;

import entidade.Carro;
import entidade.FuncionarioEmpresa;
import entidade.Usuario;

import java.util.Locale;
import java.util.Scanner;

public class estudosPOO {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        /*Carro bmw = new Carro();
        Carro corsa = new Carro();

        corsa.cor = "Vermelho";
        corsa.tamanhoDaRoda = 12;
        corsa.numeroPortas = 2;

        bmw.cor = "Azul";
        bmw.tamanhoDaRoda = 15;
        bmw.numeroPortas = 4;

        System.out.println("A bmw tem a cor " + bmw.cor);
        System.out.println("O corsa tem a cor " + corsa.cor);
        corsa.ligarMotor();*/

        /*FuncionarioEmpresa bruno = new FuncionarioEmpresa();

        double bonus = 80.0;
        double salarioComDesconto = bruno.SalarioFinal(80, "Bruno");

        System.out.println("Salario com desconto: R$" + salarioComDesconto);*/

//        Usuario usuario = new Usuario("bruno@email.com", "00000");
        Usuario usuario = new Usuario();

        usuario.logar("123");

        System.out.println(usuario);

        sc.close();
    }
}
