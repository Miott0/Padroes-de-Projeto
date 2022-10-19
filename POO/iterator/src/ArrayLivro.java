package src;
import java.util.Iterator;

public class ArrayLivro implements ColecaoLivros {
    protected static int MAX_LIVROS = 500;
    private int totalLivros;
    protected Livro[] livros; 


    public ArrayLivro(){
        this.livros = new Livro[MAX_LIVROS];
        this.totalLivros = 0;
    }

    @Override
    public boolean addLivro(Livro livro) {
        if(totalLivros <(MAX_LIVROS-1)){
            livros[totalLivros++] = livro;
            return true;
        }
        else{
            System.out.println("Lista Completa");
            return false;
        }
        
    }

    public Livro[] getLivros(){
        return livros;
    }

    @Override
    public Iterator<Livro> iterator() {
        return new IteradorLivro(livros);
    }



    
}
