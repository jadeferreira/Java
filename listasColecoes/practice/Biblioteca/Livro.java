package practice.Biblioteca;

public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
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
        return "\nNome: " + titulo + "\nAutor: " + autor + "\nAno Publicacao: " + anoPublicacao;

    }
}
