package src;

import java.util.Iterator;
import java.util.LinkedList;

public class ListaEncadeadaLivros implements ColecaoLivros {
    protected LinkedList<Livro> livros = new LinkedList<>();

    @Override
    public Iterator<Livro> iterator() {
        return livros.iterator();
    }

    @Override
    public boolean addLivro(Livro livro) {
        return livros.add(livro);
    }
}
