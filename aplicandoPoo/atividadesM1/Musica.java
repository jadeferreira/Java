package atividadesM1;

public class Musica {
    public String titulo;
    public String artista;
    public int anoLancamento;
    public double avaliacao;
    public int numAvaliacao;

    public void exibirFicha(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lancamento: " + anoLancamento);
        System.out.println("Avaliacoes: " + avaliacao);
        System.out.println("Numero de Avaliacoes: " + numAvaliacao);
    }

    public void avaliarMusica(double nota) {
        avaliacao += nota;
        numAvaliacao++;
    }

    public double calcMedia(){
        double media = avaliacao / numAvaliacao;
        return media;
    }

}
