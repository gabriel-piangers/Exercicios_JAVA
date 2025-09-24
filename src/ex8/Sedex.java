package ex8;

import java.math.BigDecimal;

public class Sedex implements CalculadoraFrete{

    @Override
    public BigDecimal calcular(Pedido pedido) {
        if(!CepValidation.validarCEP(pedido.getCep())) throw new CepInvalidoException("CEP Invalido");
        return pedido.getTotalFrete().multiply(BigDecimal.valueOf(1.5));
    }
}
