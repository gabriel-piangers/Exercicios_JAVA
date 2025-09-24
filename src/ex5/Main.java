package ex5;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("========== Cartao ============");
        CartaoCredito cartao = new CartaoCredito("2025-09-14");
        cartao.processarPagamento(BigDecimal.valueOf(100));

        System.out.println();
        System.out.println("========== Boleto ============");

        Boleto boleto = new Boleto("2025-10-01");
        boleto.pagar();
        boleto.processarPagamento(BigDecimal.valueOf(1250));

        System.out.println();
        System.out.println("========== Pix ============");

        Pix pix = new Pix("03663855000");
        pix.processarPagamento(BigDecimal.valueOf(10));
    }
}
