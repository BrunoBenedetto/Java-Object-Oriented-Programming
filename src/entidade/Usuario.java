package entidade;

public class Usuario {

    public String email;
    public String senha;

    //Assinatura de um construtor = nome + parametro e tipo
    public Usuario(String email, String senha) {

        System.out.println("Autenticação por email e senha");



    }

    public Usuario(String telefone, int cep) {

        System.out.println("Autenticação por telefone");;

//        this.email = email;
//        this.senha = senha;
//
//        System.out.println(email);
//        System.out.println(senha);
    }

    public void compras() {


    }

}
