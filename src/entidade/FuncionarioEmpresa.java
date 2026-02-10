package entidade;

public class FuncionarioEmpresa {

    public double salario = 1000.89;


    //retorno vazio, não retorna nada
    public double SalarioFinal(double bonus, String nome){

        /*
        FGTS
        HORAS EXTRAS
         */

        return salario - 20 + bonus;
    }
}
