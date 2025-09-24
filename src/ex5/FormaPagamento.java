package ex5;

import java.math.BigDecimal;

public abstract class FormaPagamento {
    abstract boolean validarPagamento();

    abstract void processarPagamento(BigDecimal valor);
}
