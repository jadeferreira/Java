package atividadesM4;

public class Livro extends Produto implements Calculavel {

    public double calcularPrecoFinal(){
        System.out.println("Preço final com desconto: " + getPreco() * 0.8);
        return getPreco();
    }

}
