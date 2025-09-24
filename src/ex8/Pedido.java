package ex8;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Pedido {
    private List<Item> itens = new ArrayList<>();
    private String cep;
    private CalculadoraFrete calculadoraFrete;

    public Pedido(String cep, CalculadoraFrete calculadoraFrete) {
        this.cep = cep;
        this.calculadoraFrete = calculadoraFrete;
    }

    public void setCalculadoraFrete(CalculadoraFrete calculadoraFrete) {
        this.calculadoraFrete = calculadoraFrete;
    }

    public CalculadoraFrete getCalculadoraFrete() {
        return calculadoraFrete;
    }

    public String getCep() {
        return cep;
    }

    public List<Item> getItens() {
        return this.itens;
    }

    public void addItem(Item item) {
        this.itens.add(item);
    }

    public void removeItem(Item item) {
        this.itens.remove(item);
    }

    public BigDecimal getTotalFrete() {
        BigDecimal total = BigDecimal.ZERO;

        for(Item item : this.itens) {
            total = total.add(item.getFrete());
        }

        return total;
    }

    public BigDecimal getTotalPreco() {
        BigDecimal total = BigDecimal.ZERO;

        for(Item item : this.itens) {
            total = total.add(item.getPreco());
        }

        return total;
    }

    public BigDecimal calcularFrete() throws CepInvalidoException {
        return calculadoraFrete.calcular(this);
    }

}
