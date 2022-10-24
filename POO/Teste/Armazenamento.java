package Teste;
import java.util.Deque;
import java.util.LinkedList;

import Teste.Texto.Memento;

public class Armazenamento {
    private final Texto areaTexto;
    private final Deque<Memento> historicoEstado;

    public Armazenamento() {
        areaTexto = new Texto();
        historicoEstado = new LinkedList<>();
    }

    public void write(String text) {
        areaTexto.set(text);
        historicoEstado.offer(areaTexto.salvar());
    }

    public void desfazer() {
        if (historicoEstado.isEmpty()) {
            return;
        }
        historicoEstado.pollLast();
        areaTexto.restaurar(historicoEstado.peekLast());
    }

    public void printText() {
        System.out.println(areaTexto.getText());
    }
}
