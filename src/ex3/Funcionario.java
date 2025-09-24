package ex3;

import java.math.BigDecimal;

public class Funcionario {
    protected String nome;
    protected BigDecimal salario;

    public BigDecimal calcularBonus() {
        return this.salario;
    }

    public Funcionario(String nome, BigDecimal salario) {
        if(salario.compareTo(BigDecimal.ZERO) == -1) {
            throw new IllegalArgumentException("Salario nao pode ser menor que 0");
        }
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }
}
