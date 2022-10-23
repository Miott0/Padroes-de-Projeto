package memento.src;

public class Ficha {

    private String email, nome, sobrenome, senha;
    public int quantidadeFichas = 0;
   
    public Ficha(String email, String nome, String sobrenome, String senha) {
        this.email = email;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
    }

    public int getQuantidaFichas() {
        return quantidadeFichas;
    }

    public void alterarValor(String email, String nome, String sobrenome, String senha){
        this.email = email;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
    }
  
  
    public FichaMemento salvarEstado() {
        var estado = new FichaMemento();
        estado.setEmail(email);
        estado.setNome(nome);
        estado.setSobrenome(sobrenome);
        estado.setSenha(senha);
        quantidadeFichas++;
        return estado;
    }
  
    public void recuperarEstado(FichaMemento memento) {
      var estado = memento;
      this.email = estado.getEmail();
      this.nome = estado.getNome();
      this.sobrenome = estado.getSobrenome();
      this.senha = estado.getSenha();
    }
  
    @Override
    public String toString() {
      return String.format("nome: %s sobrenome: %s email: %s senha: %s", nome, sobrenome, email, senha);
    }
}
