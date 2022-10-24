package Teste;

public class Texto {
    private String texto;

    public void set(String texto) {
        this.texto = texto;
    }

    public String getText() {
        return texto;
    }

    public Memento salvar() {
        return new Memento(this.texto);
    }

    public void restaurar(Memento memento) {
        this.texto = memento != null ? memento.getTextoSalvo() : null;
    }

    public static class Memento {
        private final String texto;

        private Memento(String textToSave) {
            texto = textToSave;
        }

        private String getTextoSalvo() {
            return texto;
        }
    }
}
