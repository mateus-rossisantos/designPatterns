package designpatterns.prototype;

public class Gol extends VolksPrototype {
		protected Gol(Gol tv) {
		this.motor = "1.0 FLEX";
		this.valorVenda = tv.getValorVenda();
	}
	
	public Gol() {}

	public String infoCar() {
		System.out.println("O CARRO GOL POSSUI MOTOR " + this.motor + " e custa " + getValorVenda());
		return null;
	}

	public VolksPrototype clonar() {
		return new Gol(this);
	}
}
