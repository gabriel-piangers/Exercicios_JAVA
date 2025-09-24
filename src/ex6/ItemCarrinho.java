package ex6;

public class ItemCarrinho {
    private Produto produto;
    private int quantidade;

    public ItemCarrinho(Produto produto, int quantidade) {
        if(quantidade <= 0) throw new IllegalArgumentException("Quantidade deve ser maior que 0");
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade <= 0) throw new IllegalArgumentException("Quantidade deve ser maior que 0");
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "produto: " + this.produto.getNome() + ", quantidade: " + this.quantidade;
    }
}
