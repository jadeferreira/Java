package atividadesM3;

public class ContaBancaria {
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor) {
        saldo += valor;
        System.out.println("Você fez um deposito de " + valor + ". Saldo atual: " + saldo);
    }

    public void sacar(double valor) {
        if(valor > saldo) {
            System.out.println("Saldo Insuficiente");
        }else{
            System.out.println("Saque de valor: " + valor + " efetuado com sucesso!");
            saldo -= valor;
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}
