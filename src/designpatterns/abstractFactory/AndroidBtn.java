package designpatterns.abstractFactory;

public class AndroidBtn implements Botao {
    @Override
    public void clicar() {
        System.out.println("Botão do Android");
    }
}
