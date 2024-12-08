package atividadeM3;

public class ContaBancaria {
    private int numConta;
    private double saldoConta;

    public ContaBancaria(int numConta, double saldoConta) {
        this.numConta = numConta;
        this.saldoConta = saldoConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
}
