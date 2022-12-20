package designpatterns.state;

import java.util.Random;

public class ComMoedaState implements State {
	Random randomWinner = new Random(System.currentTimeMillis());
	MaquinaDeRefri maquinaDeRefri;
 
	public ComMoedaState(MaquinaDeRefri maquinaDeRefri) {
		this.maquinaDeRefri = maquinaDeRefri;
	}
  
	public void inserirMoeda() {
		System.out.println("Você não pode inserir outra moeda");
	}
 
	public void ejetarMoeda() {
		System.out.println("Moeda devolvida");
		maquinaDeRefri.setState(maquinaDeRefri.getSemMoedaState());
	}
 
	public void escolher() {
		System.out.println("Você escolheu o refri");
		maquinaDeRefri.setState(maquinaDeRefri.getVendaState());
	}

    public void entregar() {
        System.out.println("Refri entregue");
    }
    
    public void encher() { }
 
	public String toString() {
		return "Esperando para entregar.";
	}
}
