package designpatterns.abstractFactory;

public class IosFactory implements TelaFactory{
    @Override
    public Botao criarBotao() {
        return new IosBtn();
    }

    @Override
    public Menu criarMenu() {
        return new AndroidMenu();
    }
}
