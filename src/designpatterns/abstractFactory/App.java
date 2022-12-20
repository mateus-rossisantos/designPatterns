package designpatterns.abstractFactory;

public class App {
    private Botao botao;
    private Menu menu;

    public App(TelaFactory factory) {
        botao = factory.criarBotao();
        menu = factory.criarMenu();
    }

    public void clicar(){
        botao.clicar();
        menu.clicar();
    }
}
