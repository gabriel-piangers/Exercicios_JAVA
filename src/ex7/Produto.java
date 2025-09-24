package ex7;

public class Produto implements Identificavel<Integer>{
    private int id;
    private String nome;

    public Produto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public Integer getId(){
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
