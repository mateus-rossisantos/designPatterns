package designpatterns.composite;

import java.awt.*;

public class Cache implements Componente {
    int memoria;

    public Cache (int vel){
        memoria = vel;
    }
    public   void adiciona(Componente cm){
    }
    public   void executa(){
        System.out.println("cache com "+memoria +" MB");
    }
}
