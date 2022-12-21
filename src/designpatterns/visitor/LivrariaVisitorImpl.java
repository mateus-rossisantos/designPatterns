package designpatterns.visitor;

public class LivrariaVisitorImpl implements LivrariaVisitor {
    @Override
    public int visit(Livro livro) {
        int custo = 0;
        if (livro.getPreco() > 100){
            System.out.println("livros acima de R$ 100,00 recebem voucher de R$ 25,00");
            int voucher = 25;
            custo = livro.getPreco() - 25;
        } else {
            custo = livro.getPreco();
        }
        System.out.println("Livro: "+ livro.getNome() + " custando R$ " + custo);
        return custo;
    }

    @Override
    public int visit(Revista revista) {
        if (revista.getFaixaEtaria() >= 18){
            System.out.println("Revista para maiores de idade, verifique o documento do cliente");
        }
        return revista.getPreco();
    }
}
