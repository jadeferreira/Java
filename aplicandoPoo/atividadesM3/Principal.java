package atividadesM3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    Carro car = new Carro();

    car.definirModelo("Corolla");
    car.definirPreco(50000, 60000, 80000);
    car.exibirInfo();
    System.out.println();

    Cachorro cachorro = new Cachorro();
    cachorro.emitirSom();

    Gato gato = new Gato();
    gato.emitirSom();
    System.out.println();

    ContaCorrente contaCor = new ContaCorrente();
    contaCor.setSaldo(500);
    contaCor.consultarSaldo();
    contaCor.deposito(100);
    contaCor.cobrarTarifaMensal();
    contaCor.consultarSaldo();
    contaCor.sacar(100);
    contaCor.consultarSaldo();
    System.out.println();

    VerificadorPrimo verif = new VerificadorPrimo();
    verif.verificarPrimo(7);

    GeradorPrimo ger = new GeradorPrimo();
    int proximoNum = ger.gerarProximoPrimo(7);
    System.out.println("O próximo primo após 7 é: " + proximoNum);

    NumerosPrimos numPrimo = new NumerosPrimos();
    numPrimo.listarPrimos(30);

    }
}
