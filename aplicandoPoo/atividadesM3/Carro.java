package atividadesM3;

public class Carro {
    private String modelo;
    private double preco1;
    private double preco2;
    private double preco3;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPreco(double preco1, double preco2, double preco3) {
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;
    }

    public void exibirInfo(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Preço primeiro ano: " + this.preco1);
        System.out.println("Preço segundo ano: " + this.preco2);
        System.out.println("Preço terceiro ano: " + this.preco3);
        System.out.println("Maior preço: " + calcularMaiorPreco());
        System.out.println("Menor preço: " + calcularMenorPreco());
    }

    public double calcularMenorPreco(){
        double menorPreco = preco1;

        if(preco2 < menorPreco){
            menorPreco = preco2;
        }
        if(preco3 < menorPreco){
            menorPreco = preco3;
        }
        return menorPreco;
    }

    public double calcularMaiorPreco(){
        double maiorPreco = preco1;

        if(preco2 > maiorPreco){
            maiorPreco = preco2;
        }
        if(preco3 > maiorPreco){
            maiorPreco = preco3;
        }
        return maiorPreco;
    }
}

