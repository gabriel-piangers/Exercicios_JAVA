package ex8;

import java.math.BigDecimal;

public class Item {
    private BigDecimal preco;
    private BigDecimal frete;
    private String nome;

    public Item(String nome, BigDecimal preco, BigDecimal frete ) {
        this.preco = preco;
        this.frete = frete;
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getFrete() {
        return frete;
    }
}
