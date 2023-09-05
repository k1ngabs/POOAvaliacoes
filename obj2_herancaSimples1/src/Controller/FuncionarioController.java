package Controller;

import Model.Funcionario;
import Model.Desenvolvedor;
import Model.Gerente;

public class FuncionarioController {

    public static void main(String[] args) {

        Gerente g1 = new Gerente("Miguel", 3500.00);
        Gerente g2 = new Gerente("Cleber", 5000.00);

        Desenvolvedor d1 = new Desenvolvedor("Luigi", 5000.00);
        Desenvolvedor d2 =  new Desenvolvedor("Alessandro", 4750.00);

        System.out.println(g1 + "\n" + g2 + "\n" + d1 + "\n" + d2 + "\n");

    }
}
