package src;

public class IteradorVetorLivro implements Iterador {

    private Livro[] livros;
    protected int posicaoAtual = 0;

    public IteradorVetorLivro(Livro[] livros){
        this.livros = livros;
    }
    @Override
    public boolean hasNext() {
        return (posicaoAtual < livros.length && livros[posicaoAtual] != null);
    }
    @Override
    public Livro next() {
        return livros[posicaoAtual++];
    } 
}
