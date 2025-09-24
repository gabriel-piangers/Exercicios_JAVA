package ex8;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido("53819-35p", new PAC());
        p1.addItem(new Item("Arroz", BigDecimal.valueOf(9), BigDecimal.valueOf(8)));
        p1.addItem(new Item("Feijão", BigDecimal.valueOf(102.5), BigDecimal.valueOf(24)));
        p1.addItem(new Item("Massa parafuso", BigDecimal.valueOf(8.90), BigDecimal.valueOf(10)));

        System.out.println("PAC");
        System.out.println(p1.calcularFrete());

        System.out.println();

        System.out.println("Sedex");
        p1.setCalculadoraFrete(new Sedex());
        System.out.println(p1.calcularFrete());

        System.out.println();

        System.out.println("Retirar na loja");
        p1.setCalculadoraFrete(new RetirarNaLoja());
        System.out.println(p1.calcularFrete());

        System.out.println();

        // Criando a estratégia promocional dinamicamente
        CalculadoraFrete fretePromocional = pedido -> {
            BigDecimal valorMinimo = new BigDecimal("100.00");

            if (pedido.getTotalPreco().compareTo(valorMinimo) >= 0) {
                return BigDecimal.ZERO;
            } else {
                return new Sedex().calcular(pedido);
            }
        };

        System.out.println("Promoção com lambda");
        p1.setCalculadoraFrete(fretePromocional);
        System.out.println(p1.calcularFrete());
    }
}
