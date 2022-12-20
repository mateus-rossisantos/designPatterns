package designpatterns.prototype;

public class Onix extends GMPrototype {

	protected Onix(Onix tv) {
		this.motor = "1.0 FLEX";
		this.valorVenda = tv.getValorVenda();
	}

	public Onix() {}

	public String infoCar() {
		System.out.println("O CARRO ONIX POSSUI MOTOR " + this.motor + " e custa " + getValorVenda());
		return null;
	}
	
	public GMPrototype clonar() {
		return new Onix(this);
	}
}
