package entidade;

public class Programador extends Pessoa implements Presidenciavel{

    public void programar(){

    }

    @Override
    public void canditarPresidente() {

        System.out.println("Candidatar a presidente");

    }
}
