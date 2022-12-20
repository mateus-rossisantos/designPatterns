package designpatterns.bridge;

public class ControleRemotoImpl implements ControleRemoto{
    protected Dispositivo dispositivo;

    public ControleRemotoImpl() {}

    public ControleRemotoImpl(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void channelDown() {
        System.out.println("Diminuir canal");
        dispositivo.setChannel(dispositivo.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("Aumentar canal");
        dispositivo.setChannel(dispositivo.getChannel() + 1);
    }

    @Override
    public void volumeDown() {
        System.out.println("Abaixar volume");
        dispositivo.setVolume(dispositivo.getVolume() - 5);
    }

    @Override
    public void volumeUp() {
        System.out.println("Aumentar volume");
        dispositivo.setVolume(dispositivo.getVolume() + 5);
    }

    @Override
    public void power() {
        System.out.println("Controle remoto: botão power");
        if (dispositivo.isEnabled()) {
            dispositivo.disable();
        } else {
            dispositivo.enable();
        }
    }
}
