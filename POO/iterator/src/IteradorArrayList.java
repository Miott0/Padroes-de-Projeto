package src;
import java.util.ArrayList;
import java.util.List;

public class IteradorArrayList implements Iterador{
    private List<Livro> livros = new ArrayList<>();
    public int posicaoAtual = 0;

    public IteradorArrayList(ArrayList<Livro> livros){
        this.livros= livros; 
    }

    @Override
    public boolean hasNext() {
        return posicaoAtual < livros.size();
    }

    @Override
    public Livro next() {
        if (!hasNext()) {
            return null;
        }
        Livro l = livros.get(posicaoAtual);
        posicaoAtual++;
        return l;
    }
}
