package ex6;

import java.math.BigDecimal;
import java.util.Objects;

public final class Dinheiro {
    private final BigDecimal valor;
    private final Moeda moeda;

    public Dinheiro(BigDecimal valor, Moeda moeda) {
        if(valor.compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException("Valor não pode ser menor que 0");
        this.valor = valor;
        this.moeda = moeda;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Moeda getMoeda() {
        return moeda;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) return false;

        Dinheiro dinheiro = (Dinheiro) obj;
        if(this.valor == dinheiro.valor && this.moeda == dinheiro.moeda) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor, moeda);
    }
}
