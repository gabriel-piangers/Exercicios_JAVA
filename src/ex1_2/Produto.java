package ex1_2;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;
    private double desconto = 0;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.desconto = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.equals("")) {
            throw new IllegalArgumentException("Nome de produto inválido!");
        } else {
            this.nome = nome;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco < 0) {
            throw new IllegalArgumentException("preço não pode ser negativo");
        } else {
            this.preco = preco;
        }
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if(quantidadeEmEstoque < 0) {
            throw new IllegalArgumentException("quantidadeEmEstoque não pode ser negativo");
        } else {
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }
    }

    public void aplicarDesconto(double porcentagem) {
        if(porcentagem < 0) {
            throw new IllegalArgumentException("Desconto não pode ser um valor negativo!");
        } else if (porcentagem > 50) {
            throw new IllegalArgumentException("Desconto não pode ser maior que 50%");
        } else {
            this.desconto = porcentagem;
        }
    }

    public double getPrecoComDesconto() {
        return preco * (1 - desconto/100);
    }

    public static void main(String[] args) {
        try {
            Produto arroz = new Produto("Arroz", 8.99, 10 );
            Produto massa = new Produto("Massa parafuso", 6.89, 32 );

            System.out.println("Produto: " + arroz.getNome());
            System.out.println("Preço: " + arroz.getPreco());
            System.out.println("Quantidade em estoque: " + arroz.getQuantidadeEmEstoque());
            System.out.println();

            arroz.setNome("Arroz Parbolizado");
            arroz.setPreco(9.90);
            arroz.setQuantidadeEmEstoque(9);

            System.out.println("Produto: " + arroz.getNome());
            System.out.println("Preço: " + arroz.getPreco());
            System.out.println("Quantidade em estoque: " + arroz.getQuantidadeEmEstoque());
            System.out.println();

            massa.aplicarDesconto(40);
            System.out.println("preço da massa sem desconto: " + massa.getPreco());
            System.out.printf("Preço da massa com desconto: %.2f \n", massa.getPrecoComDesconto());

            massa.setPreco(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}

