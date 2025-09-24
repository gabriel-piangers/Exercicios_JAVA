package ex5;

class PagamentoInvalidoException extends Exception {
    public PagamentoInvalidoException(String mensagem) {
        super(mensagem);
    }
}