package designpatterns.state;

public class SemMoedaState implements State {
    MaquinaDeRefri maquinaDeRefri;
 
    public SemMoedaState(MaquinaDeRefri maquinaDeRefri) {
        this.maquinaDeRefri = maquinaDeRefri;
    }
 
	public void inserirMoeda() {
		System.out.println("Você inseriu uma moeda");
		maquinaDeRefri.setState(maquinaDeRefri.getComMoedaState());
	}
 
	public void ejetarMoeda() {
		System.out.println("Você não inseriu uma moeda");
	}
 
	public void escolher() {
		System.out.println("Você escolheu, mas não colocou moeda");
	 }
 
	public void entregar() {
		System.out.println("Você precisa pagar primeiro");
	} 
	
	public void encher() { }
 
	public String toString() {
		return "esperando moeda";
	}
}
