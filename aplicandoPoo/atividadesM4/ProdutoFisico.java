package atividadesM4;

public class ProdutoFisico extends Produto implements Calculavel {

    public double calcularPrecoFinal(){
        System.out.println("Preço final com taxas do produto fisico: " + getPreco() * 1.1);
        return getPreco();
    }
}
