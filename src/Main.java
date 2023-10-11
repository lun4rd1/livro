import com.sun.source.tree.WhileLoopTree;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<livro> listaLivro = new ArrayList<livro>();
        livro metodoLivro = new livro();

        System.out.println("Bem vindo ao sebo (:");

        Scanner leitor = new Scanner(System.in);

        String opcao;

        do {
            System.out.println("Escolha uma opção: 1 - Cadastrar livro / 2 - Listar Livro / 0 - Voltar");
            opcao = leitor.nextLine();

            switch (opcao) {

                case "1":

                    livro novoLivro = new livro();
                    Autor novoAutor = new Autor();

                    System.out.println("digite o titulo: ");
                    novoLivro.titulo = leitor.nextLine();

                    System.out.println("Digite o preco do livro: ");
                    novoLivro.preco = Float.valueOf(leitor.nextLine());

                    System.out.println("Digite a data de publicacao do livro: ");
                    novoLivro.datalancamento = LocalDate.parse(leitor.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                    Period idade = Period.between(novoLivro.datalancamento, LocalDate.now());

                    if (idade.getYears() >= 5) {
                        System.out.println("Livro aceito!");
                    } else {
                        System.out.println("Idade menor do que 5 anos, para cadastrar um livro, por favor, escolha um livro com 5 anos ou mais!");
                        break;
                    }


                    System.out.println("Digite o nome do autor; ");
                    novoAutor.nomeAutor = leitor.nextLine();

                    System.out.println("Digite o local de nascimento do autor: ");
                    novoAutor.LocalNasc = leitor.nextLine();

                    novoLivro.autor = novoAutor;

                    listaLivro.add(novoLivro);

                    System.out.println("Cadastro realizado com suceso: ");

                    break;

                case "2":

                    if (listaLivro.size() > 0) {

                        for (livro cadalivro : listaLivro) {
                            System.out.println("Titulo: " + cadalivro.titulo);
                            System.out.println("Preco: " + cadalivro.preco);
                            System.out.println("Data de lancamento: " + cadalivro.datalancamento);
                            System.out.println("Autor: " + cadalivro.autor.nomeAutor);
                            System.out.println("Local de nascimento: " + cadalivro.autor.LocalNasc);

                            System.out.println();
                            System.out.println("Aperte Enter para continuar");
                            leitor.nextLine();
                        }
                    } else {
                        System.out.println("Lista vazia");
                    }
                    break;

                case "0":

                    System.out.println("case 0");
                    break;

                default:
                    System.out.println("opcao invalida!");
                    break;

            }


        } while (!opcao.equals("0"));

    }
}
