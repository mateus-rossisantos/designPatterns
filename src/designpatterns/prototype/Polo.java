package designpatterns.prototype;

public class Polo extends VolksPrototype {

	protected Polo(Polo tv) {
		this.motor = "1.3 TURBO";
		this.valorVenda = tv.getValorVenda();
	}
	
	public Polo() {}

	public String infoCar() {
		System.out.println("O CARRO POLO POSSUI MOTOR " + this.motor + " e custa " + getValorVenda());
		return null;
	}

	public VolksPrototype clonar() {
		return new Polo(this);
	}
}
