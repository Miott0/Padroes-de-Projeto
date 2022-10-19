package src;
import java.util.Iterator;


public class IteradorLivro implements Iterator<Livro> {

    private Livro[] livros;
    protected int livroAtual = 0;

    public IteradorLivro(Livro[] livros){
        this.livros = livros;
    }



    @Override
    public boolean hasNext() {
        return (livroAtual < livros.length && livros[livroAtual] != null);
    }

    @Override
    public Livro next() {
        return livros[livroAtual++];
    }
    
}
