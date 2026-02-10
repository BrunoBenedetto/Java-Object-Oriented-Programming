package Main;

import java.util.Scanner;

public class senhaInv {
    public static void main(String[] args) {

        /* O meu objetivo é, solicitar o login, o usuário insere o login, depois disso vai inserir a senha;
         * a senha deve ser igual a 123, se não o loop que vou inserir vai fazer ele repetir no máximo até 3 vezes
         * caso acerte de primeira, login efetuado com sucesso, caso erre, tente novamente e a segunda vez for, login
         * efetuado*/

        Scanner sc = new Scanner(System.in);
        String senha, login;

        System.out.println("Login");
        login = sc.next();

        for (int x = 1; x <= 3; x++) {

            System.out.println("Senha: ");
            senha = sc.next();

            if (senha.equals("123")) {
                System.out.println("Login Efetuado com sucesso.");
                x = 4;
            } else {
                System.out.println("Senha inválida, tente novamente: ");
            }
        }
    }
}
