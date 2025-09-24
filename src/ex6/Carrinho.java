package ex6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Carrinho {
    private final List<ItemCarrinho> listaItens;
    private BigDecimal desconto;

    public Carrinho(List<ItemCarrinho> listaItens, BigDecimal desconto) {
        this.listaItens = listaItens;
        this.desconto = desconto;
    }

    public Carrinho() {
        this.listaItens = new ArrayList<>();
        this.desconto = BigDecimal.ONE;
    }

    public List<ItemCarrinho> getItens() {
        return this.listaItens;
    }

    public BigDecimal getDesconto() {
        return this.desconto;
    }

    public Carrinho addItem(Produto produto, int quantidade) {
        List<ItemCarrinho> novaLista = new ArrayList<>(this.listaItens);
        novaLista.add(new ItemCarrinho(produto, quantidade));
        return new Carrinho(novaLista, this.desconto);
    }

    public Carrinho removeItem(String nome) {
        List<ItemCarrinho> novaLista = this.listaItens.stream().filter(item -> item.getProduto().getNome() != nome).toList();
        return new Carrinho(novaLista, this.desconto);
    }

    public Carrinho aplicarCupom(int percento) {
        if(percento < 0) throw new IllegalArgumentException("Desconto não pode ser negativo");
        if(percento > 30) percento = 30;
        BigDecimal novoDesconto = (BigDecimal.valueOf(1)).subtract(BigDecimal.valueOf(percento /100.0));
        return new Carrinho(this.listaItens, novoDesconto);
    }

    public Map<Moeda, BigDecimal> getTotal() {
        Map<Moeda, BigDecimal> valores = new HashMap<>();

        for (ItemCarrinho item : this.listaItens) {
            Moeda moeda = item.getProduto().getPreco().getMoeda();
            BigDecimal valor = item.getProduto().getPreco().getValor().multiply(BigDecimal.valueOf(item.getQuantidade())).multiply(this.desconto);

            valores.put(moeda, valores.getOrDefault(moeda, BigDecimal.valueOf(0)).add(valor).setScale(2, RoundingMode.HALF_EVEN));
        }

        return valores;
    }
}
