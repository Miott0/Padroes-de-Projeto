package src;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ColecaoLivros listaDeLivros;
		TratamentoDados date = new TratamentoDados();


        listaDeLivros = new ArrayListLivro();
		date.lerDoArquivo(listaDeLivros);
        System.out.println("Printing Livros ArrayList");
		System.out.println(
			"---------------------------------------------------------------------------------------------------------------");
		printLivros(listaDeLivros.iterator());

		
        listaDeLivros = new VetorLivro();
		date.lerDoArquivo(listaDeLivros);
        System.out.println("Printing Livros Vetor");
		System.out.println(
			"---------------------------------------------------------------------------------------------------------------");
		printLivros(listaDeLivros.iterator());


    }

    private static void printLivros(Iterador iterator) {
		System.out.printf("%25s | %25s | %24s | %25s |\n", "Titulo", "Autor", "Publicadora", "Ano Publicacao");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------");
		while (iterator.hasNext()) {
			Livro livro = iterator.next();
			System.out.printf("%25s | %25s | %24s | %25s |\n", livro.getTitulo(), livro.getAutor(),
					livro.getPublicadora(), livro.getAno());
		}
		System.out.println(
			"---------------------------------------------------------------------------------------------------------------");
		System.out.println();
	}
}
