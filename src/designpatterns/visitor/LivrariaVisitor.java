package designpatterns.visitor;

public interface LivrariaVisitor {
    int visit(Livro livro);
    int visit(Revista revista);
}
