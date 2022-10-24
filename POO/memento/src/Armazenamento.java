package memento.src;

import java.util.ArrayList;
import java.util.List;

import memento.src.Ficha.Memento;

public class Armazenamento {
    private final Ficha fichaA;
    private final List<Memento> lista;


    public Armazenamento() {
        this.fichaA = new Ficha();
        this.lista = new ArrayList<>();
    }
    
    public void adicionar(Ficha ficha){
        fichaA.alterarValor(ficha);
        lista.add(fichaA.salvarEstado());

    }



    public void recuperar(int posicao){
        if(lista.isEmpty()){
            return;

        }
        fichaA.recuperarEstado(lista.get(posicao));
    }

    public void imprimir(){
        System.out.println(fichaA.toString());
    }
}
