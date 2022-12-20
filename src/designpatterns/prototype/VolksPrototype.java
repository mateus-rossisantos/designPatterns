package designpatterns.prototype;

public abstract class VolksPrototype {
	
	protected double valorVenda;
	protected String motor;

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public abstract String infoCar();
	
	public abstract VolksPrototype clonar();

}
