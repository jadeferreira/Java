package atividadesM4;

public class ConversorMoeda implements ConversaoFinanceira{
    double cotacaoDolar = 5.50;

    @Override
    public void convertorDolarParaReal(double valorDolar) {
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}
