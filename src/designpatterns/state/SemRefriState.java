package designpatterns.state;

public class SemRefriState implements State {
    MaquinaDeRefri maquinaDeRefri;
 
    public SemRefriState(MaquinaDeRefri maquinaDeRefri) {
        this.maquinaDeRefri = maquinaDeRefri;
    }
 
	public void inserirMoeda() {
		System.out.println("Máquina vazia, não insira moeda");
	}
 
	public void ejetarMoeda() {
		System.out.println("Sem moedas para ejetar");
	}
 
	public void escolher() {
		System.out.println("Desculpe, estoque vazio");
	}
 
	public void entregar() {
		System.out.println("Desculpe, estoque vazio");
	}
	
	public void encher() {
		maquinaDeRefri.setState(maquinaDeRefri.getSemMoedaState());
	}
 
	public String toString() {
		return "vazia";
	}
}
