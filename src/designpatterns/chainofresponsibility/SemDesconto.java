package designpatterns.chainofresponsibility;

import java.math.BigDecimal;

public class SemDesconto implements Desconto {

    private Desconto proximo;

    @Override
    public BigDecimal calcular(Pedido pedido) {
        return BigDecimal.ZERO;
    }

    @Override
    public void setProximo(Desconto desconto) {
        this.proximo = proximo;
    }
}
