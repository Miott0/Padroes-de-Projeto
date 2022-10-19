package src;

import java.util.Iterator;
import java.util.LinkedList;

public class ListaEncadeada implements ColecaoLivros {
    LinkedList<Livro> livros = new LinkedList<Livro>();

    @Override
    public Iterator<Livro> iterator() {
        return livros.iterator();
    }

    @Override
    public boolean addLivro(Livro livro) {
        return livros.add(livro);
    }
}
