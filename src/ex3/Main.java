package ex3;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Desenvolvedor("Gabriel", BigDecimal.valueOf(3200)));
        funcionarios.add(new Desenvolvedor("Pedro", BigDecimal.valueOf(5289.90)));
        funcionarios.add(new Desenvolvedor("Ana", BigDecimal.valueOf(1670.20)));
        funcionarios.add(new Gerente("Jorge", BigDecimal.valueOf(8540)));
        funcionarios.add(new Gerente("Clara", BigDecimal.valueOf(6789.10)));

        for(Funcionario funcionario : funcionarios) {
            System.out.println("Bonus de " + funcionario.getNome() + ": " + funcionario.calcularBonus());
        }
    }
}
