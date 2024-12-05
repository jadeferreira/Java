package atividadeM2;

public class ProdutoPerecivel extends Produto{
    public String dataValidade;

    public ProdutoPerecivel(String nome, int quantidade, float preco, String dataValidade) {
        super(nome, quantidade, preco);
        this.dataValidade = dataValidade;

    }

    @Override
    public String toString() {
        return "Nome do produto: " + getNome() + "\nPreço: " + getPreco() + "\nQuantidade: " + getQuantidade() + "\nData de validade: " + this.dataValidade;
    }
}
