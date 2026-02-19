package entidade;

public class Usuario {

    public String email;
    public String senha;


    /*Assinatura de um construtor ou de um metodo = nome + parametro e tipo*/

    public void logar(String telefone) {

        System.out.println("Logar com telefone");


    }

    public void logar(String email, String senha) {

        System.out.println("Logar com email e senha");
    }
}

