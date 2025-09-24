package ex5;

import java.math.BigDecimal;

public class Pix extends FormaPagamento{
        private String cpf;

    public Pix(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean validarPagamento() {
        if(this.cpf.length() == 11) return true;
        return false;
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        try {
            System.out.println("Processando pagamento...");

            if(!validarPagamento()) throw new PagamentoInvalidoException("CPF invalido");

            System.out.printf("Pagamento realizado no valor de R$%.2f\n", valor);

        } catch (PagamentoInvalidoException e) {
            System.out.println(e);
        }
    }
}
