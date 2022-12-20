package designpatterns.prototype;

public class Cruze extends GMPrototype {
	protected Cruze(Cruze carro) {
		this.motor = "1.4 TURBO";
		this.valorVenda = carro.getValorVenda();
	}

	public Cruze() {}

	public String infoCar() {
		System.out.println("O CARRO CRUZE POSSUI MOTOR " + this.motor + " e custa " + getValorVenda());
		return null;
	}

	public GMPrototype clonar() {
		return new Cruze(this) ;
	}
}
