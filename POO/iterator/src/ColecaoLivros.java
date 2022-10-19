package src;
import java.util.Iterator;

public interface ColecaoLivros {
    public Iterator<Livro> iterator();
    public boolean addLivro(Livro livro);
}
