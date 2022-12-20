package designpatterns.state;

public class MaquinaDeRefri {
 
	State semRefriState;
	State semMoedaState;
	State comMoedaState;
	State vendaState;
 
	State state = semRefriState;
	int count = 0;
 
	public MaquinaDeRefri(int numRefris) {
		semRefriState = new SemRefriState(this);
		semMoedaState = new SemMoedaState(this);
		comMoedaState = new ComMoedaState(this);
		vendaState = new VendaState(this);

		this.count = numRefris;
 		if (numRefris > 0) {
			state = semMoedaState;
		} 
	}
 
	public void inserirMoeda() {
		state.inserirMoeda();
	}
 
	public void ejetarMoeda() {
		state.ejetarMoeda();
	}
 
	public void escolherRefri() {
		state.escolher();
		state.entregar();
	}

	void setState(State state) {
		this.state = state;
	}
 
	public void entregarRefri() {
		System.out.println("Entregando refrigerante");
		if (count > 0) {
			count = count - 1;
		} else {
			System.out.println("Máquina vazia");
		}
	}
 
	int getCount() {
		return count;
	}
 
	void encherMaquina(int count) {
		this.count += count;
		System.out.println("A máquina foi completada; O novo estoque e: " + this.count);
		state.encher();
	}

    public State getState() {
        return state;
    }

    public State getSemRefriState() {
        return semRefriState;
    }

    public State getSemMoedaState() {
        return semMoedaState;
    }

    public State getComMoedaState() {
        return comMoedaState;
    }

    public State getVendaState() {
        return vendaState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMáquina de Refri");
		result.append("\nEstoque: " + count + " refri");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("A Máquina está " + state + "\n");
		return result.toString();
	}
}
