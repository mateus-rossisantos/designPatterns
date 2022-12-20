package designpatterns.state;

public class VendaState implements State {
    MaquinaDeRefri maquinaDeRefri;
 
    public VendaState(MaquinaDeRefri maquinaDeRefri) {
        this.maquinaDeRefri = maquinaDeRefri;
    }
       
	public void inserirMoeda() {
		System.out.println("Aguarde, já vamos entregar o refri");
	}
 
	public void ejetarMoeda() {
		System.out.println("Tarde demais, você já escolheu");
	}
 
	public void escolher() {
		System.out.println("Tarde demais, você já escolheu");
	}
 
	public void entregar() {
		if (maquinaDeRefri.getCount() > 0) {
			maquinaDeRefri.entregarRefri();
			maquinaDeRefri.setState(maquinaDeRefri.getSemMoedaState());
		} else {
			System.out.println("Maquina vazia");
			maquinaDeRefri.setState(maquinaDeRefri.getSemRefriState());
		}
	}
	
	public void encher() { }
 
	public String toString() {
		return "Entregando refri";
	}
}
