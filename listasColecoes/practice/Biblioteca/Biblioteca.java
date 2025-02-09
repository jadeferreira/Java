package practice.Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void exibirLivros(){
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public void buscarLivroAutor(String autor){
        for (Livro livro : livros) {
            if(livro.getAutor().equals(autor)){
                System.out.println(livro);
            }
        }
    }

}
