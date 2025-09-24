package ex8;

import java.math.BigDecimal;


public class PAC implements CalculadoraFrete{

    @Override
    public BigDecimal calcular(Pedido pedido) {
        if(!CepValidation.validarCEP(pedido.getCep())) throw new CepInvalidoException("CEP Invalido");
        return pedido.getTotalFrete();
    }
}
