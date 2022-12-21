package designpatterns.visitor;

public class Livro implements ItemLivraria {

    private int preco;
    private String nome;

    public Livro(int preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int checagemPreCompra(LivrariaVisitor visitor) {
        return visitor.visit(this);
    }
}
