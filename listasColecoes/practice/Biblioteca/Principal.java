package practice.Biblioteca;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Diário de Anne Frank", "Anne Frank", 1947);
        Livro livro2 = new Livro("A culpa é das estrelas", "John Green", 2012);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        System.out.println("Livros da biblioteca: ");
        biblioteca.exibirLivros();

        System.out.println("Qual livro gostaria de buscar pelo autor: ");
        biblioteca.buscarLivroAutor(sc.nextLine());

    }
}
