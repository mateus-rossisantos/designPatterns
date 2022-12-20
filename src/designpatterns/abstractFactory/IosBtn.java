package designpatterns.abstractFactory;

public class IosBtn implements Botao {
    @Override
    public void clicar() {
        System.out.println("Botão do Iphone");
    }
}
