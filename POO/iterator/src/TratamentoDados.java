package src;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;




public class TratamentoDados {

	public void lerDoArquivo(ColecaoLivros listaLivros) throws FileNotFoundException, IOException {
		FileReader arquivoTextoLeitura = null;
		BufferedReader leituraBufferizada;
		Livro livro = null;
		String listaDeCampos[];
		String linhaLidaDoArquivo;

		
		try {
			arquivoTextoLeitura = new FileReader("C:/Users/Rafael/Desktop/Biblioteca Codigos/POO/iterator/ArquivoLivros/livros.txt");
			leituraBufferizada = new BufferedReader(arquivoTextoLeitura);
			linhaLidaDoArquivo = leituraBufferizada.readLine();
			
			while (linhaLidaDoArquivo != null) {
				listaDeCampos = linhaLidaDoArquivo.split(",");
				livro = new Livro(listaDeCampos[0], listaDeCampos[1], listaDeCampos[2], Integer.parseInt(listaDeCampos[3]));
				listaLivros.addLivro(livro);
				linhaLidaDoArquivo = leituraBufferizada.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro de entrada e saída!");
			e.printStackTrace();
		} 
		
		try {
			arquivoTextoLeitura.close();
		} 
		catch (IOException e) {
			System.out.println("Erro de entrada e saída!");
			e.printStackTrace();
		} 
		catch (NullPointerException e) {
			System.out.println("Erro: Arquivo não encontrado!");
			e.printStackTrace();
		}
	}
}
