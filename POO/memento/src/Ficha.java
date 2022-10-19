package memento.src;

public class Ficha {

    private String email, nome, sobrenome, senha;
   
    public Ficha(String email, String nome, String sobrenome, String senha) {
        this.email = email;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
    }

    public void alterarValor(String email, String nome, String sobrenome, String senha){
        this.email = email;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
    }
  
  
    public FichaMemento salvarEstado() {
      var estado = new FichaMementoInterna();
      estado.setEmail(email);
      estado.setNome(nome);
      estado.setSobrenome(sobrenome);
      estado.setSenha(senha);
      return estado;
    }
  
    public void recuperarEstado(FichaMemento memento) {
      var estado = (FichaMementoInterna) memento;
      this.email = estado.getEmail();
      this.nome = estado.getNome();
      this.sobrenome = estado.getSobrenome();
      this.senha = estado.getSenha();
    }
  
    @Override
    public String toString() {
      return String.format("nome: %s sobrenome: %s email: %s senha: %s", nome, sobrenome, email, senha);
    }

    
    private static class FichaMementoInterna implements FichaMemento {
        private String email, nome, sobrenome, senha;
        
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSenha() {
            return senha;
        }
        public void setSenha(String senha) {
            this.senha = senha;
        }

        public String getSobrenome() {
            return sobrenome;
        }
        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }

    }
}