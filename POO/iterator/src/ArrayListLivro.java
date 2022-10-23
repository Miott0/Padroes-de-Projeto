package src;
import java.util.ArrayList;

public class ArrayListLivro implements ColecaoLivros {

    protected ArrayList<Livro> livros;

    public ArrayListLivro() {
		livros = new ArrayList<Livro>();
	}
    @Override
    public Iterador iterator() {
        return new IteradorArrayList(livros);
    }

    @Override
    public boolean addLivro(Livro livro) {
        return livros.add(livro);
    }
    
}
