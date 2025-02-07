package practice.Biblioteca;

import java.util.ArrayList;

public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private int anoPublicacao;
    ArrayList<Livro> livros = new ArrayList<>();

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void exibirLivros(){
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public int compareTo(Livro outroLivro) {
        return Integer.compare(this.anoPublicacao, outroLivro.anoPublicacao);
    }

    @Override
    public String toString() {
        return "Livros: \nNome: " + titulo + "\nAutor: " + autor + "\nAno Publicacao: " + anoPublicacao;

    }
}
