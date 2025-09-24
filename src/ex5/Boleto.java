package ex5;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Boleto extends FormaPagamento {
    private boolean pago;
    private LocalDate vencimento;

    public Boleto(String vencimento) {
        this.vencimento = LocalDate.parse(vencimento);
        this.pago = false;
    }

    public void pagar() {
        if(pago) {
            System.out.println("O boleto já foi pago");
        } else if (this.vencimento.isBefore(LocalDate.now())){
            System.out.println("Boleto vencido");
        } else {
            pago = true;
            System.out.println("Boleto pago com sucesso");
        }
    }

    @Override
    public boolean validarPagamento() {
        if(this.pago) return true;
        return false;
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        try {
            System.out.println("Processando pagamento...");

            if(!validarPagamento()) throw new PagamentoInvalidoException("O boleto não foi pago.");

            System.out.printf("Pagamento realizado no valor de R$%.2f\n", valor);

        } catch (PagamentoInvalidoException e) {
            System.out.println(e);
        }
    }


}
