package ex6;

public class Produto {
    private String nome;
    private Dinheiro preco;

    public Produto(String nome, Dinheiro preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Dinheiro getPreco() {
        return preco;
    }
}
