package src;

public class ArrayLivro implements ColecaoLivros {
    private int max_livros = 500;
    private int totalLivros;
    private Livro[] livros; 


    public ArrayLivro(){
        this.livros = new Livro[max_livros];
        this.totalLivros = 0;
    }

    @Override
    public boolean addLivro(Livro livro) {
        if(totalLivros <(max_livros-1)){
            livros[totalLivros++] = livro;
            return true;
        }
        else{
            System.out.println("Lista Completa");
            return false;
        }
    }

    @Override
    public Iterador iterator(){
        return new IteradorArrayLivro(livros);
    }   
}
