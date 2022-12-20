package designpatterns.chainofresponsibility;

import java.math.BigDecimal;
import java.util.List;

public class Pedido {
    private int id;
    private BigDecimal valor;
    private List<Item> items;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Pedido(BigDecimal valor, List<Item> items) {
        this.valor = valor;
        this.items = items;
    }
}
