package designpatterns.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CPU implements Componente{
    List<Componente> lista = new ArrayList<Componente>();
    int velocidade;

    public CPU(int vel){
        velocidade = vel;
    }
    public void adiciona(Componente cm){
        lista.add(cm);
    }
    public void executa(){

        Iterator<Componente> it = lista.iterator();

        while (it.hasNext()){
            it.next().executa();
        }

        System.out.println("cpu funcionando a "+velocidade +" Ghz");
    }


}
