package memento.src;

public class Ficha {

    private String nome, sobrenome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
   

    public Ficha(){

    }
    public Ficha(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void alterarValor(Ficha ficha){
        this.nome = ficha.nome;
        this.sobrenome = ficha.sobrenome;
    }
  
  
    public Memento salvarEstado() {
        Ficha a = new Ficha();

        a.nome = this.nome;
        a.sobrenome = this.sobrenome;
        var estado = new Memento(a);
        return estado;
    }
  
    public void recuperarEstado(Memento memento) {
        var estado = memento != null ? memento.recuperarFichaSalva() : null;
        alterarValor(estado);
      
    }
  
    @Override
    public String toString() {
        return String.format("nome: %s sobrenome: %s ", nome, sobrenome);
    }
    

    public static class Memento{
        private Ficha ficha;

        private Memento(Ficha fichaSalva){
            ficha = fichaSalva;
        }

        private Ficha recuperarFichaSalva(){
            return ficha;
        }
    }
}
