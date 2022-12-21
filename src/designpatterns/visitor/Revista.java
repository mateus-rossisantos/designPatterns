package designpatterns.visitor;

public class Revista implements ItemLivraria {

    private int preco;
    private String nome;
    private int faixaEtaria;

    public Revista(int preco, String nome, int faixaEtaria) {
        this.preco = preco;
        this.nome = nome;
        this.faixaEtaria = faixaEtaria;
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

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    @Override
    public int checagemPreCompra(LivrariaVisitor visitor) {
        return visitor.visit(this);
    }
}
