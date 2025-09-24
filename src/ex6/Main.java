package ex6;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        try {
            Carrinho c1 = new Carrinho();

            Carrinho c2 = c1.addItem(new Produto("Arroz", new Dinheiro(BigDecimal.valueOf(10.50), Moeda.DOLAR)), 1);
            Carrinho c3 = c2.addItem(new Produto("Feijão", new Dinheiro(BigDecimal.valueOf(12.90), Moeda.REAL)), 2);
            Carrinho c4 = c3.addItem(new Produto("Massa Parafuso", new Dinheiro(BigDecimal.valueOf(7.20), Moeda.REAL)), 1);
            Carrinho c5 = c4.removeItem("Massa Parafuso");

            Carrinho c6 = c5.aplicarCupom(23);

            System.out.println("Desconto: " + BigDecimal.ONE.subtract(c6.getDesconto()).multiply(BigDecimal.valueOf(100)) + "%");
            System.out.println(c6.getItens());
            System.out.println(c6.getTotal());

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
