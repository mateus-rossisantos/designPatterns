package designpatterns.abstractFactory;

public class AndroidFactory implements TelaFactory {

    @Override
    public Botao criarBotao() {
        return new AndroidBtn();
    }

    @Override
    public Menu criarMenu() {
        return new AndroidMenu();
    }
}
