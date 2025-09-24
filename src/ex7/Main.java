package ex7;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("============== Produtos ===============");

            InMemoryRepository<Produto, Integer> produtos = new InMemoryRepository<>();
            produtos.salvar(new Produto(1, "Arroz"));
            produtos.salvar(new Produto(2, "Feijão"));
            produtos.salvar(new Produto(3, "Massa parafuso"));
            produtos.remover(3);
//            produtos.remover(3);

            System.out.println(produtos.listarTodos());
            System.out.println(produtos.buscarPorId(2));
            System.out.println(produtos.buscarPorId(5));
            System.out.println();

            System.out.println("============== Funcionarios ===============");

            InMemoryRepository<Funcionario, String> funcionarios = new InMemoryRepository<>();

            funcionarios.salvar(new Funcionario("03663855000", "Gabriel"));
            funcionarios.salvar(new Funcionario("15616512315", "Jonas"));
            funcionarios.salvar(new Funcionario("86181000418", "Joaquim"));
            funcionarios.remover("15616512315");

            System.out.println(funcionarios.buscarPorId("03663855000"));
            System.out.println(funcionarios.listarTodos());


        } catch (EntidadeNaoEncontradaException e) {
            System.out.println(e);
        }
    }
}
