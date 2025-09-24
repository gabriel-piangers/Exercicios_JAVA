package ex7;

public class Funcionario implements Identificavel<String> {
    private String cpf;
    private String nome;

    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public String getId() {
        return this.cpf;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
