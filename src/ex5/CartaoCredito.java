package ex5;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CartaoCredito extends FormaPagamento{
    private LocalDate vencimento; // AAAA/MM/DD

    public CartaoCredito(String vencimento) {
        this.vencimento = LocalDate.parse(vencimento);
    }

    @Override
    public boolean validarPagamento() {
        LocalDate agora = LocalDate.now();
        if(agora.isAfter(vencimento)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        try {
            System.out.println("Processando pagamento...");

            if(!validarPagamento()) throw new PagamentoInvalidoException("Cartão de credito vencido");

            System.out.printf("Pagamento realizado no valor de R$%.2f\n", valor);

        } catch (PagamentoInvalidoException e) {
            System.out.println(e);
        }
    }
}
