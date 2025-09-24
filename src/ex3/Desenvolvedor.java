package ex3;

import java.math.BigDecimal;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    @Override
    public BigDecimal calcularBonus() {
        return this.salario.multiply(BigDecimal.valueOf(1.1));
    }
}
