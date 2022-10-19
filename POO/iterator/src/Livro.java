package src;
public class Livro{
    private String titulo, autor, publicadora;
    private int ano;



    public Livro(){   
    }

    public Livro(String titulo,String autor,String publicadora, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.publicadora = publicadora;
        this.ano = ano;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno() {
        return ano;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setPublicadora(String publicadora) {
        this.publicadora = publicadora;
    }
    public String getPublicadora() {
        return publicadora;
    }
    
}
