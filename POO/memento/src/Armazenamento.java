package memento.src;

import java.util.ArrayList;
import java.util.List;

public class Armazenamento {
    List<FichaMemento> lista = new ArrayList<FichaMemento>();

    public void add(FichaMemento memento){
        lista.add(memento);

    }
    public FichaMemento get(int posicao){
        return lista.get(posicao);
    }
}
