package atividadesM4;

public class ProdutoVend extends Item implements Vendavel {
    double desconto = 0.8;

    public double calcPrecoTotal(int quant){
        double precoTotal = (quant * getPreco()) * desconto;
        System.out.println("Produto: " + getNome());
        System.out.println("Quantidade de produto: " + quant);
        System.out.println("Valor do produto com desconto: " + precoTotal);
        return precoTotal;
    }

}
