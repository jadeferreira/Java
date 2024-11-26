package atividadesM3;

public class ContaCorrente extends ContaBancaria{
        private double tarifa = 0.05;

    public double cobrarTarifaMensal(){
        tarifa *= 100;
        saldo = saldo - tarifa;
        System.out.println("Tarifa cobrada de " + tarifa + " reais!");
        return getSaldo();
    }
}
