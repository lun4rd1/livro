import java.time.LocalDate;
import java.util.ArrayList;

public class livro {

    public String titulo;

    public LocalDate datalancamento;

    public float preco;

    public Autor autor;

    private ArrayList<livro> listaLivro = new ArrayList<>();

    public void CadastrarLivro(livro livro) {
        listaLivro.add(livro);

        System.out.println("Cadastro realizado com sucesso!");

    }

    public ArrayList<livro> listaLivro() {
        return listaLivro;


    }


}
