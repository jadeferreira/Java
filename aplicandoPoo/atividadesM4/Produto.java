package atividadesM4;

public class Produto {
    private String nome;
    private String autor;
    private double preco;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + getNome());
        System.out.println("Autor: " + getAutor());
    }

}
