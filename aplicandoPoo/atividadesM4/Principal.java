package atividadesM4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ConversorMoeda conversor = new ConversorMoeda();
        conversor.convertorDolarParaReal(100);
        System.out.println();

        CalculadoraSalaRetangular calcRetangular = new CalculadoraSalaRetangular();
        calcRetangular.calcularArea(4,6);
        calcRetangular.calcularPerimetro(4,6);
        System.out.println();

        TabuadaMultiplicacao tabuadaMulti = new TabuadaMultiplicacao();
        tabuadaMulti.mostrarTabuada(2);

        ConversorTemperaturaPadrao conversorTemp = new ConversorTemperaturaPadrao();
        conversorTemp.celsiusParaFahrenheit(15);
        conversorTemp.fahrenheitParaCelsius(65);
        System.out.println();

        Livro livro = new Livro();
        livro.setAutor("Machado de Assis");
        livro.setNome("Nuvem Negra");
        livro.setPreco(100);
        livro.mostrarInfo();
        livro.calcularPrecoFinal();
        System.out.println();

        ProdutoFisico produto = new ProdutoFisico();
        produto.setAutor("Anne Frank");
        produto.setNome("Diário de Anne");
        produto.setPreco(100);
        produto.mostrarInfo();
        produto.calcularPrecoFinal();
        System.out.println();

        ProdutoVend produtoVend = new ProdutoVend();
        produtoVend.setNome("Computador");
        produtoVend.setPreco(500);
        produtoVend.calcPrecoTotal(2);
        System.out.println();

        ServicoVend servicoVend = new ServicoVend();
        servicoVend.setNome("Montar computador");
        servicoVend.setPreco(150);
        servicoVend.calcPrecoTotal(2);

    }
}
